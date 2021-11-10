
package model.dao;

import model.view.SearchViewModel;
import connection.DatabaseConstants;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ViewModelsDAO {
    private static final String URL = DatabaseConstants.URL;
    private static final String USER = DatabaseConstants.USER;
    private static final String PASS = DatabaseConstants.PASS;
    
    // Método que retorna os dados referente a tela de busca
    public static List<SearchViewModel> getSearchViewModels() {
        List<SearchViewModel> searchViewModels = new ArrayList<SearchViewModel>();
        
        try (Connection con = DriverManager.getConnection(URL, USER, PASS)) {
            String query = "SELECT books.price, books.title, CONCAT (authors.name,\" \",authors.fname) AS author, publishers.name AS publisher, books.isbn\n" +
                            "FROM books INNER JOIN publishers INNER JOIN booksauthors INNER JOIN authors\n" +
                            "ON publishers.publisher_id = books.publisher_id\n" +
                            "AND booksauthors.isbn = books.isbn\n" +
                            "AND booksauthors.author_id = authors.author_id\n";

            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            
            while(rs.next()) {
                Double price = rs.getDouble("price");
                String title = rs.getString("title");
                String author = rs.getString("author");
                String publisher = rs.getString("publisher");
                String isbn = rs.getString("isbn");
                
                SearchViewModel vm = new SearchViewModel(price, title, author, publisher, isbn);
                searchViewModels.add(vm);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return searchViewModels;
    }
    
    // Método que retorna os dados referente a tela de busca de acordo com o titulo buscado
    public static List<SearchViewModel> getSearchByTitle(String bookTitle) {
        List<SearchViewModel> searchViewModels = new ArrayList<SearchViewModel>();
        
        try (Connection con = DriverManager.getConnection(URL, USER, PASS)) {
            String query = "SELECT books.price, books.title, CONCAT (authors.name,\" \",authors.fname) AS author, publishers.name AS publisher, books.isbn\n" +
                            "FROM books INNER JOIN publishers INNER JOIN booksauthors INNER JOIN authors\n" +
                            "ON publishers.publisher_id = books.publisher_id\n" +
                            "AND booksauthors.isbn = books.isbn\n" +
                            "AND booksauthors.author_id = authors.author_id\n" +
                            "WHERE books.title LIKE ? ;";
            PreparedStatement stmt = con.prepareStatement(query);
            stmt.setString(1, "%"+bookTitle+"%");
            
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next()) {
                Double price = rs.getDouble("price");
                String title = rs.getString("title");
                String author = rs.getString("author");
                String publisher = rs.getString("publisher");
                String isbn = rs.getString("isbn");
                
                SearchViewModel vm = new SearchViewModel(price, title, author, publisher, isbn);
                searchViewModels.add(vm);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return searchViewModels;
    }
    
    // Método que retorna os dados referente a tela de busca de acordo com o autor buscado
    public static List<SearchViewModel> getSearchByAuthor(String authorName) {
        List<SearchViewModel> searchViewModels = new ArrayList<SearchViewModel>();
        
        try (Connection con = DriverManager.getConnection(URL, USER, PASS)) {
            String query = "SELECT books.price, books.title, CONCAT (authors.name,\" \",authors.fname) AS author, publishers.name AS publisher, books.isbn\n" +
                            "FROM books INNER JOIN publishers INNER JOIN booksauthors INNER JOIN authors\n" +
                            "ON publishers.publisher_id = books.publisher_id\n" +
                            "AND booksauthors.isbn = books.isbn\n" +
                            "AND booksauthors.author_id = authors.author_id\n" +
                            "WHERE authors.name LIKE ? \n" +
                            "OR authors.fname LIKE ? ;";
            PreparedStatement stmt = con.prepareStatement(query);
            stmt.setString(1, authorName+"%");
            stmt.setString(2, authorName+"%");
            
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next()) {
                Double price = rs.getDouble("price");
                String title = rs.getString("title");
                String author = rs.getString("author");
                String publisher = rs.getString("publisher");
                String isbn = rs.getString("isbn");
                
                SearchViewModel vm = new SearchViewModel(price, title, author, publisher, isbn);
                searchViewModels.add(vm);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return searchViewModels;
    }
    
    // Método que retorna os dados referente a tela de busca de acordo com a editora buscada
    public static List<SearchViewModel> getSearchByPublisher(String publisherName) {
        List<SearchViewModel> searchViewModels = new ArrayList<SearchViewModel>();
        
        try (Connection con = DriverManager.getConnection(URL, USER, PASS)) {
            String query = "SELECT books.price, books.title, CONCAT (authors.name,\" \",authors.fname) AS author, publishers.name AS publisher, books.isbn\n" +
                            "FROM books INNER JOIN publishers INNER JOIN booksauthors INNER JOIN authors\n" +
                            "ON publishers.publisher_id = books.publisher_id\n" +
                            "AND booksauthors.isbn = books.isbn\n" +
                            "AND booksauthors.author_id = authors.author_id\n" +
                            "WHERE publishers.name LIKE ? ;";
            PreparedStatement stmt = con.prepareStatement(query);
            stmt.setString(1, "%"+publisherName+"%");
            
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next()) {
                Double price = rs.getDouble("price");
                String title = rs.getString("title");
                String author = rs.getString("author");
                String publisher = rs.getString("publisher");
                String isbn = rs.getString("isbn");
                
                SearchViewModel vm = new SearchViewModel(price, title, author, publisher, isbn);
                searchViewModels.add(vm);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return searchViewModels;
    }
    
    // Método que retorna os dados referente a tela de busca de acordo com o isbn buscado
    public static List<SearchViewModel> getSearchByIsbn(String bookIsbn) {
        List<SearchViewModel> searchViewModels = new ArrayList<SearchViewModel>();
        
        try (Connection con = DriverManager.getConnection(URL, USER, PASS)) {
            String query = "SELECT books.price, books.title, CONCAT (authors.name,\" \",authors.fname) AS author, publishers.name AS publisher, books.isbn\n" +
                            "FROM books INNER JOIN publishers INNER JOIN booksauthors INNER JOIN authors\n" +
                            "ON publishers.publisher_id = books.publisher_id\n" +
                            "AND booksauthors.isbn = books.isbn\n" +
                            "AND booksauthors.author_id = authors.author_id\n" +
                            "WHERE books.isbn LIKE ? ;";
            PreparedStatement stmt = con.prepareStatement(query);
            stmt.setString(1, bookIsbn);
            
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next()) {
                Double price = rs.getDouble("price");
                String title = rs.getString("title");
                String author = rs.getString("author");
                String publisher = rs.getString("publisher");
                String isbn = rs.getString("isbn");
                
                SearchViewModel vm = new SearchViewModel(price, title, author, publisher, isbn);
                searchViewModels.add(vm);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return searchViewModels;
    }
}
