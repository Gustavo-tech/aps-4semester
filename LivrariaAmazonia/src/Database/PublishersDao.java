package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import Model.*;

public class PublishersDao {

    private static final String URL = DatabaseConstants.URL;
    private static final String USER = DatabaseConstants.USER;
    private static final String PASS = DatabaseConstants.PASS;

    public void addPublisher(Publisher publisher) {
        try (Connection con = DriverManager.getConnection(URL, USER, PASS)) {
            String query = "INSERT INTO publishers (name, url) values (?, ?)";
            PreparedStatement pstm = con.prepareStatement(query);
            pstm.setString(1, publisher.getName());
            pstm.setString(2, publisher.getUrl());
            pstm.execute();
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updatePublisher(Publisher publisher) {
        try (Connection con = DriverManager.getConnection(URL, USER, PASS)) {
            String query = "UPDATE publishers set name = ?, url = ?";
            PreparedStatement pstm = con.prepareStatement(query);
            pstm.setString(1, publisher.getName());
            pstm.setString(2, publisher.getUrl());
            pstm.execute();
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void delPublisher(Publisher publisher) {
        try(Connection con = DriverManager.getConnection(URL, USER, PASS)) {
            String query = "DELETE FROM publishers WHERE publisher_id = ?";
            PreparedStatement pstm = con.prepareStatement(query);
            pstm.setInt(1, publisher.getId());
            pstm.execute();
            con.close();
        } catch(SQLException e) {
            e.printStackTrace();
        }
    }
}
