package model.dao;

import connection.DatabaseConstants;
import model.bean.Book;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.bean.Publisher;

public class BookDAO {
    private static final String URL = DatabaseConstants.URL;
    private static final String USER = DatabaseConstants.USER;
    private static final String PASS = DatabaseConstants.PASS;
    
    // Obtem todos os livros
    public static List<Book> getBooks() {
        List<Book> books = new ArrayList<Book>();
        try(Connection con = DriverManager.getConnection(URL, USER, PASS)) {
            String query = "SELECT * FROM books";
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            
            while(rs.next()) {
                String title = rs.getString("title");
                String isbn = rs.getString("isbn");
                Integer publisherId = rs.getInt("publisher_id");
                Double price = rs.getDouble("price");
                
                Book book = new Book(title, isbn, publisherId, price);
                books.add(book);
            }
            
            con.close();
        } catch(SQLException e) {
            e.printStackTrace();
        }
        
        return books;
    }
    
    // Obtem todos os livros com determinado titulo
    public static List<Book> getBooksStr(String bName) {
        List<Book> books = new ArrayList<Book>();
        try(Connection con = DriverManager.getConnection(URL, USER, PASS)) {
            String query = "SELECT * FROM books WHERE title LIKE '%" + bName + "%'";
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            
            while(rs.next()) {
                String title = rs.getString("title");
                String isbn = rs.getString("isbn");
                Integer publisherId = rs.getInt("publisher_id");
                Double price = rs.getDouble("price");
                
                Book book = new Book(title, isbn, publisherId, price);
                books.add(book);
            }
            
            con.close();
        } catch(SQLException e) {
            e.printStackTrace();
        }
        
        return books;
    }
    
    // Obtem todos os livros com determinada editora
    public static List<Book> getBooksWithPublisher(Publisher p) {
        List<Book> books = new ArrayList<Book>();
        try(Connection con = DriverManager.getConnection(URL, USER, PASS)) {
            String query = "SELECT * FROM books WHERE publisher_id = ?";
            PreparedStatement pstm = con.prepareStatement(query);
            pstm.setInt(1, p.getId());
            
            ResultSet rs = pstm.executeQuery(query);
            while(rs.next()) {
                String title = rs.getString("title");
                String isbn = rs.getString("isbn");
                Integer publisherId = rs.getInt("publisher_id");
                Double price = rs.getDouble("price");
                
                Book book = new Book(title, isbn, publisherId, price);
                books.add(book);
            }
            
            con.close();
        } catch(SQLException e) {
            e.printStackTrace();
        }
        
        return books;
    }
    
    // Obtem determinado livro de acordo com a ISBN
    public static Book getBook(String isbn) {
        try (Connection con = DriverManager.getConnection(URL, USER, PASS)) {
            String query = "SELECT * FROM books WHERE isbn = ?";
            PreparedStatement pstm = con.prepareStatement(query);
            pstm.setString(1, isbn);
            ResultSet rs = pstm.executeQuery();
            
            rs.next();
            String title = rs.getString("title");
            Integer publisherId = rs.getInt("publisher_id");
            Double price = rs.getDouble("price");
            
            return new Book(title, isbn, publisherId, price);
        } catch(SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    // Adiciona um livro novo
    public static void addBook(Book book) {
        try(Connection con = DriverManager.getConnection(URL, USER, PASS)) {
            String query = "INSERT INTO books VALUES (?, ?, ?, ?)";
            PreparedStatement pstm = con.prepareStatement(query);
            pstm.setString(1, book.getTitle());
            pstm.setString(2, book.getIsbn());
            pstm.setInt(3, book.getPublisherId());
            pstm.setDouble(4, book.getPrice());
            pstm.executeUpdate();
            con.close();
        } catch(SQLException e) {
            e.printStackTrace();
        }
    }
    
    // Atualiza um livro
    public static void updateBook(Book book) {
        try(Connection con = DriverManager.getConnection(URL, USER, PASS)) {
            String query = "UPDATE books SET title = ?, isbn = ?, publisher_id = ?, "
                    + "price = ?";
            PreparedStatement pstm = con.prepareStatement(query);
            pstm.setString(1, book.getTitle());
            pstm.setString(2, book.getIsbn());
            pstm.setInt(3, book.getPublisherId());
            pstm.setDouble(4, book.getPrice());
            pstm.executeUpdate();
            con.close();
        } catch(SQLException e) {
            e.printStackTrace();
        }
    }
    
    // Deleta um livro
    public static void deleteBook(Book book) {
        try(Connection con = DriverManager.getConnection(URL, USER, PASS)) {
            String query = "DELETE FROM books WHERE isbn = ?";
            BookAuthorDAO.deleteBookAuthor(book.getIsbn());
            PreparedStatement pstm = con.prepareStatement(query);
            pstm.setString(1, book.getIsbn());
            pstm.executeUpdate();
            con.close();
        } catch(SQLException e) {
            e.printStackTrace();
        }
    }
    
    // Deleta todos os livros que tenha determinada editora
    public static void deleteBook(Publisher publisher) {
       List<Book> books = getBooksWithPublisher(publisher);
        
        for(Book b: books) {
            deleteBook(b);
        }
    }
}
