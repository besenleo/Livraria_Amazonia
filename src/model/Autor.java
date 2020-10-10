package model;


public class Autor {
    private Integer idAutor;
    private String nome;
    private String fnome;
    
    public Autor(){}

    public Integer getId() {
        return idAutor;
    }

    public void setId(Integer idAutor) {
        this.idAutor = idAutor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFnome() {
        return fnome;
    }

    public void setFnome(String fnome) {
        this.fnome = fnome;
    }
}
