package model;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.ManyToMany;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import java.util.Set;
import java.util.HashSet;
import javax.persistence.FetchType;


@Entity
@Table(name = "authors")
public class Autor implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "author_id", unique=true)
    private Integer idAutor;
    
    @Column(name = "name")
    private String nome;
    
    @Column(name = "fname")
    private String fNome;
    
    @ManyToMany(mappedBy = "autores", targetEntity = Livro.class, cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
    Set<Livro> livros = new HashSet<>();
    
    
    
    public Autor(){}
    
    

    public Integer getIdAutor() {
        return idAutor;
    }

    public void setIdAutor(Integer idAutor) {
        this.idAutor = idAutor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getfNome() {
        return fNome;
    }

    public void setfNome(String fNome) {
        this.fNome = fNome;
    }
    
    public Set<Livro> getLivros() {
        return livros;
    }

    public void setLivros(Set<Livro> livros) {
        this.livros = livros;
    }
    
    @Override
    public String toString(){
        String valor = "";
        valor += this.nome;
        valor += " ";
        valor += this.fNome;
        return valor;
    }
    
    // Esse override soluciona o problema de comparação entre objetos do Set<Autor>
    @Override
    public int hashCode() {
        return getIdAutor().hashCode();
    }
    
    @Override
    public boolean equals(Object outro) {
        
        if(this == outro) {
            return true;
        }
        
        if(outro == null) {
            return false;
        }
        
	if( ! (outro instanceof Autor) ){
            return false;
        }
        
	Autor outroAutor = (Autor)outro;
        
        if(! (this.getIdAutor()== outroAutor.getIdAutor()) ){
            return false;
        }
        
	return true;
    }
}
