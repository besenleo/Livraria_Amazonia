package model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.CascadeType;
import javax.persistence.OneToMany;
import model.Livro;
import java.util.List;

@Entity
@Table(name = "publishers")
public class Editora implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "publisher_id", unique=true)
    private Integer idEditora;
    
    @Column(name = "name")
    private String nome;
    
    @Column(name = "url")
    private String url;
    
    @OneToMany(mappedBy = "editora", targetEntity = Livro.class, cascade = CascadeType.ALL)
    private List<Livro> livros;

    
    public Editora(){}


    public Integer getIdEditora() {
        return idEditora;
    }

    public void setIdEditora(Integer idEditora) {
        this.idEditora = idEditora;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
   
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
    
    public List<Livro> getLivros() {
        return livros;
    }

    public void setLivros(List<Livro> livros) {
        this.livros = livros;
    }
    
    @Override
    public String toString(){
        return this.getNome();
    }
    
    @Override
    public boolean equals(Object outro) {
        
        if(this == outro) {
            return true;
        }
        
        if(outro == null) {
            return false;
        }
        
	if( ! (outro instanceof Editora) ){
            return false;
        }
        
	Editora outroEditora = (Editora)outro;
        
        if(! (this.getIdEditora()== outroEditora.getIdEditora()) ){
            return false;
        }
        
	return true;
    }
}
