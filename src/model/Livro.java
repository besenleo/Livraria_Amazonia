package model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.ManyToMany;
import javax.persistence.JoinColumn;
import javax.persistence.Table;
import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;
import javax.persistence.CascadeType;
import javax.persistence.FetchType;
import javax.persistence.JoinTable;
import model.Autor;


@Entity
@Table(name = "books")
public class Livro implements Serializable{
    
    @Id
    @Column(name = "isbn")
    private String isbn;
    
    @Column(name = "title")
    private String titulo;
    
    @Column(name = "price")
    private Float preco;
    
    @ManyToOne
    @JoinColumn(name="publisher_id")
    private Editora editora;
    
    @ManyToMany(targetEntity = Autor.class, cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
    @JoinTable(
        name = "booksauthors", 
        joinColumns = { @JoinColumn(name = "isbn") }, 
        inverseJoinColumns = { @JoinColumn(name = "author_id") }
    )
    private Set<Autor> autores = new HashSet<>();


    public Livro(){}

    
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Editora getEditora() {
        return editora;
    }

    public void setEditora(Editora editora) {
        this.editora = editora;
    }

    public Float getPreco() {
        return preco;
    }

    public void setPreco(Float preco) {
        this.preco = preco;
    }
    
    public Set<Autor> getAutores() {
        return autores;
    }

    public void setAutores(Set<Autor> autores) {
        this.autores = autores;
    }
    
    // Itera pelo o HashSet e devolve o nome dos autores
    public String nomeAutores(){
        String nomes = "";
        Iterator<Autor> it = this.autores.iterator();
        while(it.hasNext()){
            Autor autor = (Autor)it.next();
            nomes += autor.toString() + "; ";
        }
        return nomes;
    }
    
    @Override
    public String toString(){
        return this.getTitulo();
    }
    
}
