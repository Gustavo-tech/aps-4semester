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
        } catch (SQLException e) {
            e.printStackTrace();
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
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deletePublisher(Publisher publisher) {
        try(Connection con = DriverManager.getConnection(URL, USER, PASS)) {
            String query = "DELETE FROM publishers WHERE publisher_id = ?";
            PreparedStatement pstm = con.prepareStatement(query);
            pstm.setInt(1, publisher.getId());
            pstm.executeUpdate();
            con.close();
        } catch(SQLException e) {
            e.printStackTrace();
        }
    }
}
