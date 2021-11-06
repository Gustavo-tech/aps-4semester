package model.dao;

import connection.DatabaseConstants;
import model.Publisher;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class PublisherDAO {

    private static final String URL = DatabaseConstants.URL;
    private static final String USER = DatabaseConstants.USER;
    private static final String PASS = DatabaseConstants.PASS;
    
    public static List<Publisher> getPublishers() {
        List<Publisher> publishers = new ArrayList<Publisher>();
        
        try (Connection con = DriverManager.getConnection(URL, USER, PASS)) {
            String query = "SELECT * FROM publishers";
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            
            while(rs.next()) {
                Integer id = rs.getInt("publisher_id");
                String name = rs.getString("name");
                String url = rs.getString("url");
                
                Publisher publisher = new Publisher(id, name, url);
                publishers.add(publisher);
            }
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return publishers;
    }

    public static Publisher getPublisher(Integer id) {
        try (Connection con = DriverManager.getConnection(URL, USER, PASS)) {
            String query = "SELECT * FROM publishers WHERE publisher_id = ?";
            PreparedStatement pstm = con.prepareStatement(query);
            pstm.setInt(1, id);
            ResultSet rs = pstm.executeQuery();
            
            rs.next();
            String name = rs.getString("name");
            String url = rs.getString("url");
            
            return new Publisher(id, name, url);
        } catch(SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static List<Publisher> getPublisherStr(String name) {
        List<Publisher> publishers = new ArrayList<Publisher>();

        try (Connection con = DriverManager.getConnection(URL, USER, PASS)) {
            String query = "SELECT * FROM publishers WHERE name LIKE '%" + name + "%'";
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            
            while(rs.next()) {
                Integer id = rs.getInt("publisher_id");
                String pName = rs.getString("name");
                String url = rs.getString("url");
                
                Publisher publisher = new Publisher(id, pName, url);
                publishers.add(publisher);
            }
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return publishers;
    }

    public static void addPublisher(Publisher publisher) {
        try (Connection con = DriverManager.getConnection(URL, USER, PASS)) {
            String query = "INSERT INTO publishers (name, url) values (?, ?)";
            PreparedStatement pstm = con.prepareStatement(query);
            pstm.setString(1, publisher.getName());
            pstm.setString(2, publisher.getUrl());
            pstm.executeUpdate();
            con.close();
            JOptionPane.showMessageDialog(null, "Editora adicionada com sucesso!",
                    "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Ocorreu um erro ao adicionar esta editora",
                    "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void updatePublisher(Publisher publisher) {
        try (Connection con = DriverManager.getConnection(URL, USER, PASS)) {
            String query = "UPDATE publishers set name = ?, url = ?";
            PreparedStatement pstm = con.prepareStatement(query);
            pstm.setString(1, publisher.getName());
            pstm.setString(2, publisher.getUrl());
            pstm.executeUpdate();
            con.close();
            JOptionPane.showMessageDialog(null, "Editora atualizada com sucesso!",
                    "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Ocorreu um erro ao atualizar esta editora",
                    "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void deletePublisher(Publisher publisher) {
        try(Connection con = DriverManager.getConnection(URL, USER, PASS)) {
            String query = "DELETE FROM publishers WHERE publisher_id = ?";
            PreparedStatement pstm = con.prepareStatement(query);
            pstm.setInt(1, publisher.getId());
            pstm.executeUpdate();
            con.close();
            JOptionPane.showMessageDialog(null, "Editora deletada com sucesso!",
                    "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        } catch(SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Ocorreu um erro ao deletar esta editora",
                    "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
}
