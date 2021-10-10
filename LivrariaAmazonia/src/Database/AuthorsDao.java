package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import Model.*;

public class AuthorsDao {
    private static final String URL = DatabaseConstants.URL;
    private static final String USER = DatabaseConstants.USER;
    private static final String PASS = DatabaseConstants.PASS;

    public void addAuthor(Author author) {
        try(Connection conn = DriverManager.getConnection(URL, USER, PASS)) {
          String query = "INSERT INTO authors (name, fname) VALUES (?, ?)";
          PreparedStatement pstm = conn.prepareStatement(query);
          pstm.setString(1, author.getName());
          pstm.setString(2, author.getFName());
          pstm.executeQuery();
          conn.close();
        } catch(SQLException e) {
          e.printStackTrace();
        } 
    }

    public void updateAuthor(Author author) {
        try(Connection conn = DriverManager.getConnection(URL, USER, PASS)) {
          String query = "INSERT INTO authors (name, fname) VALUES (?, ?)";
          PreparedStatement pstm = conn.prepareStatement(query);
          pstm.setString(1, author.getName());
          pstm.setString(2, author.getFName());
          pstm.executeQuery();
          conn.close();
        } catch(SQLException e) {
          e.printStackTrace();
        } 
    }

    public void deleteAuthor(Integer id) {
      try (Connection conn = DriverManager.getConnection(URL, USER, PASS)) {
        String query = "DELETE FROM authors WHERE author_id = ?";
        PreparedStatement pstm = conn.prepareStatement(query);
        pstm.setInt(1, id);
        pstm.executeQuery();
        conn.close();
      } catch (SQLException e) {
        e.printStackTrace();
      }
    }

    public void deleteAuthor(Author author) {
      try (Connection conn = DriverManager.getConnection(URL, USER, PASS)) {
        String query = "DELETE FROM authors WHERE name = ? AND fname = ?";
        PreparedStatement pstm = conn.prepareStatement(query);
        pstm.setString(1, author.getName());
        pstm.setString(2, author.getFName());
        pstm.executeQuery();
        conn.close();
      } catch (SQLException e) {
        e.printStackTrace();
      }
    }
}
