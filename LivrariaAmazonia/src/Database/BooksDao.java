package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import Model.*;

public class BooksDao {
    private static final String URL = DatabaseConstants.URL;
    private static final String USER = DatabaseConstants.USER;
    private static final String PASS = DatabaseConstants.PASS;

    public void addBook(Book book) {
        try(Connection con = DriverManager.getConnection(URL, USER, PASS)) {
            String query = "INSERT INTO books VALUES (?, ?, ?, ?)";
            PreparedStatement pstm = con.prepareStatement(query);
            pstm.setString(1, book.getTitle());
            pstm.setString(2, book.getIsbn());
            pstm.setInt(3, book.getpublisherId());
            pstm.setDouble(4, book.getPrice());
            pstm.execute();
            con.close();
        } catch(SQLException e) {
            e.printStackTrace();
        }
    }

    public void updateBook(Book book) {
        try(Connection con = DriverManager.getConnection(URL, USER, PASS)) {
            String query = "UPDATE books SET title = ?, isbn = ?, publisher_id = ?, "
                    + "price = ?";
            PreparedStatement pstm = con.prepareStatement(query);
            pstm.setString(1, book.getTitle());
            pstm.setString(2, book.getIsbn());
            pstm.setInt(3, book.getpublisherId());
            pstm.setDouble(4, book.getPrice());
            pstm.execute();
            con.close();
        } catch(SQLException e) {
            e.printStackTrace();
        }
    }

    public void delBook(Book book) {
        try(Connection con = DriverManager.getConnection(URL, USER, PASS)) {
            String query = "DELETE FROM books WHERE isbn = ?";
            PreparedStatement pstm = con.prepareStatement(query);
            pstm.setString(1, book.getIsbn());
            pstm.execute();
            con.close();
        } catch(SQLException e) {
            e.printStackTrace();
        }
    }
    
}
