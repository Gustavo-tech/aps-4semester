package model;

public class Book {
    private String title;
    private String isbn;
    private Integer publisherId;
    private Double price;

    // construtor
    public Book(String title, String isbn, Integer publisherId, Double price) {
        this.title = title;
        this.isbn = isbn;
        this.publisherId = publisherId;
        this.price = price;
    }

    // construtor
    public Book() {
        
    }

    // getter do título
    public String getTitle() {
        return title;
    }

    // setter do título
    public void setTitle(String title) {
        this.title = title;
    }

    // getter do ISBN
    public String getIsbn() {
        return isbn;
    }

    // setter do ISBN
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    // getter do id da editora
    public int getPublisherId() {
        return publisherId;
    }

    // setter do id da editora
    public void setPublisherId(Integer publisherId) {
        this.publisherId = publisherId;
    }

    // getter de preço
    public double getPrice() {
        return price;
    }

    // setter de preço
    public void setPrice(Double price) {
        this.price = price;
    }
}
