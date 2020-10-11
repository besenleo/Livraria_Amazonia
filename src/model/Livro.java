package model;

public class Livro {
    private String title;
    private String isbn;
    private Editora publisher;
    private Float price;

    public Livro(){}

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Editora getPublisher() {
        return publisher;
    }

    public void setPublisher(Editora publisher) {
        this.publisher = publisher;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }
}
