package model;

public class Livro {
    private String titulo;
    private String isbn;
    private Integer idEditora;
    private Float preco;

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

    public Integer getidEditora() {
        return idEditora;
    }

    public void setIdEditora(Integer nomeEditora) {
        this.idEditora = nomeEditora;
    }
    
    public Float getPreco() {
        return preco;
    }

    public void setPreco(Float preco) {
        this.preco = preco;
    }
    
    
}
