package Model;

public class Book {
    private String title;
    private String isbn;
    private int publisherId;
    private double price;

    public Book(String title, String isbn, int publisherId, double price) {
        this.title = title;
        this.isbn = isbn;
        this.publisherId = publisherId;
        this.price = price;
    }

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

    public int getpublisherId() {
        return publisherId;
    }

    public void setpublisherId(int publisherId) {
        this.publisherId = publisherId;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    
    
}
