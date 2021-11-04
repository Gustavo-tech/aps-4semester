package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import Model.*;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class AuthorsDao {
    private static final String URL = DatabaseConstants.URL;
    private static final String USER = DatabaseConstants.USER;
    private static final String PASS = DatabaseConstants.PASS;
    
    public static List<Author> getAuthors() {
        List<Author> authors = new ArrayList<Author>();
        try(Connection con = DriverManager.getConnection(URL, USER, PASS)) {
            String query = "SELECT * FROM authors";
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            
            while(rs.next()) {
                Integer id = rs.getInt("author_id");
                String name = rs.getString("name");
                String fname = rs.getString("fname");
                Author author = new Author(id, name, fname);
                authors.add(author);
            }
            
            con.close();
        } catch(SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Um erro ocorreu ao buscar os autores",
                    "Erro", JOptionPane.ERROR_MESSAGE);
        }
        return authors;
    }
    
    public static List<Author> getAuthorsStr(String aName) {
        List<Author> authors = new ArrayList<Author>();
        try(Connection con = DriverManager.getConnection(URL, USER, PASS)) {
            String query = "SELECT * FROM authors WHERE name LIKE '%?%'";
            PreparedStatement pstm = con.prepareStatement(query);
            pstm.setString(1, aName);
            ResultSet rs = pstm.executeQuery(query);
            
            while(rs.next()) {
                Integer id = rs.getInt("author_id");
                String name = rs.getString("name");
                String fname = rs.getString("fname");
                Author author = new Author(id, name, fname);
                authors.add(author);
            }
            
            con.close();
        } catch(SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Um erro ocorreu ao buscar os autores",
                    "Erro", JOptionPane.ERROR_MESSAGE);
        }
        return authors;
    }
    
    public static Author getAuthor(Integer id) {
        try (Connection con = DriverManager.getConnection(URL, USER, PASS)) {
            String query = "SELECT * FROM authors WHERE author_id = ?";
            PreparedStatement pstm = con.prepareStatement(query);
            pstm.setInt(1, id);
            ResultSet rs = pstm.executeQuery();
            
            rs.next();
            String name = rs.getString("name");
            String fname = rs.getString("fname");
            
            return new Author(id, name, fname);
        } catch(SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Um erro ocorreu ao buscar esse autor",
                    "Erro", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }

    public static void addAuthor(Author author) {        
        try(Connection conn = DriverManager.getConnection(URL, USER, PASS)) {
          String query = "INSERT INTO authors (name, fname) VALUES (?, ?)";
          PreparedStatement pstm = conn.prepareStatement(query);
          pstm.setString(1, author.getName());
          pstm.setString(2, author.getFName());
          pstm.executeUpdate();
          conn.close();
        } catch(SQLException e) {
            JOptionPane.showMessageDialog(null, "Um erro ocorreu ao salvar este autor",
                    "Erro", JOptionPane.ERROR_MESSAGE);
          e.printStackTrace();
        } 
    }

    public static void updateAuthor(Author author) {
        try(Connection conn = DriverManager.getConnection(URL, USER, PASS)) {
          String query = "UPDATE authors SET name = ?, fname = ? WHERE author_id = ?";
          PreparedStatement pstm = conn.prepareStatement(query);
          pstm.setString(1, author.getName());
          pstm.setString(2, author.getFName());
          pstm.setInt(3, author.getId());
          pstm.executeUpdate();
          conn.close();
        } catch(SQLException e) {
          e.printStackTrace();
          JOptionPane.showMessageDialog(null, "Um erro ocorreu ao atualizar este autor",
                    "Erro", JOptionPane.ERROR_MESSAGE);
        } 
    }

    public static void deleteAuthor(Integer id) {
      try (Connection conn = DriverManager.getConnection(URL, USER, PASS)) {
        String query = "DELETE FROM authors WHERE author_id = ?";
        PreparedStatement pstm = conn.prepareStatement(query);
        pstm.setInt(1, id);
        pstm.executeUpdate();
        conn.close();
      } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Um erro ocorreu ao deletar este autor",
                    "Erro", JOptionPane.ERROR_MESSAGE);
      }
    }

    public static void deleteAuthor(Author author) {
      try (Connection conn = DriverManager.getConnection(URL, USER, PASS)) {
        String query = "DELETE FROM authors WHERE author_id = ?";
        PreparedStatement pstm = conn.prepareStatement(query);
        pstm.setInt(1, author.getId());
        pstm.executeUpdate();
        conn.close();
      } catch (SQLException e) {
          JOptionPane.showMessageDialog(null, "Um erro ocorreu ao deletar este autor",
                    "Erro", JOptionPane.ERROR_MESSAGE);
        e.printStackTrace();
      }
    }
}
