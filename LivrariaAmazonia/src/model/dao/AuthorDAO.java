package model.dao;

import connection.DatabaseConstants;
import model.bean.Author;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class AuthorDAO {
    private static final String URL = DatabaseConstants.URL;
    private static final String USER = DatabaseConstants.USER;
    private static final String PASS = DatabaseConstants.PASS;
    
    // Obtem todos os autores do banco
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
        }
        return authors;
    }
    
    // Obtem todos os autores do banco com o nome especificado
    public static List<Author> getAuthorsStr(String aName) {
        List<Author> authors = new ArrayList<Author>();
        try(Connection con = DriverManager.getConnection(URL, USER, PASS)) {
            String query = "SELECT * FROM authors WHERE name LIKE '%" + aName + "%'";
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
        }
        return authors;
    }
    
    // Obtem todos os autores do banco com o nome/id/sobrenome especificado
    public static List<Author> getAuthorsGeneral(String data) {
        List<Author> authors = new ArrayList<Author>();
        try(Connection con = DriverManager.getConnection(URL, USER, PASS)) {
            String query = "SELECT * FROM authors WHERE author_id = ? "
                    + "OR name = ? "
                    + "OR fname = ?;";
            PreparedStatement pstm = con.prepareStatement(query);
            pstm.setString(2, "%"+data+"%");
            pstm.setString(3, "%"+data+"%");
            try {
                pstm.setInt(1, Integer.parseInt(data));
            } catch (NumberFormatException e) {
                pstm.setInt(1, -1);
            }
            ResultSet rs = pstm.executeQuery();
            
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
        }
        return authors;
    }
    
    // Obtem um autor do banco com determinado id
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
            return null;
        }
    }
    
    // Obtem o id do autor de acordo com o nome e sobrenome
    public static Integer getAuthorId(String name, String fname) {
        try (Connection con = DriverManager.getConnection(URL, USER, PASS)) {
            String query = "SELECT author_id FROM authors WHERE name = ? AND fname = ?";
            PreparedStatement pstm = con.prepareStatement(query);
            pstm.setString(1, name);
            pstm.setString(2, fname);
            ResultSet rs = pstm.executeQuery();
            
            rs.next();
            Integer id = rs.getInt("author_id");
            
            return id;
        } catch(SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
    
    // Obtem o nome de um autor do banco com determinado isbn
    public static String getAuthorName(String isbn) {
        try (Connection con = DriverManager.getConnection(URL, USER, PASS)) {
            String query = "SELECT CONCAT (name,\" \",fname) FROM authors \n" +
                           "INNER JOIN booksauthors\n" +
                           "ON booksauthors.author_id = authors.author_id\n" +
                           "WHERE isbn= ? ;";
            PreparedStatement pstm = con.prepareStatement(query);
            pstm.setString(1, isbn);
            ResultSet rs = pstm.executeQuery();
            
            rs.next();
            String name = rs.getString("CONCAT (name,\" \",fname)");
            
            return name;
        } catch(SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
    
    // Adiciona um autor ao banco
    public static void addAuthor(Author author) {        
        try(Connection conn = DriverManager.getConnection(URL, USER, PASS)) {
          String query = "INSERT INTO authors (name, fname) VALUES (?, ?)";
          PreparedStatement pstm = conn.prepareStatement(query);
          pstm.setString(1, author.getName());
          pstm.setString(2, author.getFName());
          pstm.executeUpdate();
          conn.close();
        } catch(SQLException e) {
            e.printStackTrace();
        } 
    }
    
    // Atualiza um autor no banco de dados
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
        } 
    }

    // Delete um autor no banco de dados que tenha o id especificado
    public static void deleteAuthor(Integer id) {
      try (Connection conn = DriverManager.getConnection(URL, USER, PASS)) {
        String query = "DELETE FROM authors WHERE author_id = ?";
        BookAuthorDAO.deleteBookAuthor(id);
        PreparedStatement pstm = conn.prepareStatement(query);
        pstm.setInt(1, id);
        pstm.executeUpdate();
        conn.close();
      } catch (SQLException e) {
        e.printStackTrace();
      }
    }

    // Deleta um autor no banco de dados que tenha o id igual ao do autor especificado
    public static void deleteAuthor(Author author) {
      try (Connection conn = DriverManager.getConnection(URL, USER, PASS)) {
        
        String query = "DELETE FROM authors WHERE author_id = ?";
        BookAuthorDAO.deleteBookAuthor(author.getId());
        PreparedStatement pstm = conn.prepareStatement(query);
        pstm.setInt(1, author.getId());
        pstm.executeUpdate();
        conn.close();
      } catch (SQLException e) {
        e.printStackTrace();
      }
    }
}
