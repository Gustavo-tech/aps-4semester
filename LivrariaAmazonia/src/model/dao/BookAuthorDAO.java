package model.dao;

import connection.DatabaseConstants;
import model.Author;
import model.BookAuthor;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class BookAuthorDAO {
    private static final String URL = DatabaseConstants.URL;
    private static final String USER = DatabaseConstants.USER;
    private static final String PASS = DatabaseConstants.PASS;
    
    public static List<BookAuthor> getBookAuthors() {
        List<BookAuthor> bookAuthors = new ArrayList<BookAuthor>();
        try(Connection con = DriverManager.getConnection(URL, USER, PASS)) {
            String query = "SELECT * FROM booksauthors";
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            
            while(rs.next()) {
                String isbn = rs.getString("isbn");
                Integer authorId = rs.getInt("author_id");
                Integer seqNo = rs.getInt("seq_no");
                
                BookAuthor ba = new BookAuthor(isbn, authorId, seqNo);
                bookAuthors.add(ba);
            }
            
            con.close();
        } catch(SQLException e) {
            e.printStackTrace();
        }
        return bookAuthors;
    }
    
    public static BookAuthor getBookAuthor(String isbn) {
        try (Connection con = DriverManager.getConnection(URL, USER, PASS)) {
            String query = "SELECT * FROM booksauthors WHERE isbn = ?";
            PreparedStatement pstm = con.prepareStatement(query);
            pstm.setString(1, isbn);
            ResultSet rs = pstm.executeQuery();
            
            rs.next();
            Integer authorId = rs.getInt("author_id");
            Integer seqNo = rs.getInt("seq_no");
            
            return new BookAuthor(isbn, authorId, seqNo);
        } catch(SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void addBookAuthor(BookAuthor bookAuthor) {        
        try(Connection conn = DriverManager.getConnection(URL, USER, PASS)) {
          String query = "INSERT INTO booksauthors VALUES (?, ?, ?)";
          PreparedStatement pstm = conn.prepareStatement(query);
          pstm.setString(1, bookAuthor.getIsbn());
          pstm.setInt(2, bookAuthor.getAuthorId());
          pstm.setInt(3, bookAuthor.getSeqNo());
          pstm.executeUpdate();
          conn.close();
        } catch(SQLException e) {
          e.printStackTrace();
        } 
    }

    public static void updateBookAuthor(BookAuthor bookAuthor) {
        try(Connection conn = DriverManager.getConnection(URL, USER, PASS)) {
          String query = "UPDATE booksauthors SET isbn = ?, author_id = ?, seq_no = ?";
          PreparedStatement pstm = conn.prepareStatement(query);
          pstm.setString(1, bookAuthor.getIsbn());
          pstm.setInt(2, bookAuthor.getAuthorId());
          pstm.setInt(3, bookAuthor.getSeqNo());
          pstm.executeUpdate();
          conn.close();
        } catch(SQLException e) {
          e.printStackTrace();
        } 
    }

    public static void deleteBookAuthor(String isbn) {
      try (Connection conn = DriverManager.getConnection(URL, USER, PASS)) {
        String query = "DELETE FROM booksauthors WHERE isbn = ?";
        PreparedStatement pstm = conn.prepareStatement(query);
        pstm.setString(1, isbn);
        pstm.executeUpdate();
        conn.close();
      } catch (SQLException e) {
        e.printStackTrace();
      }
    }
}
