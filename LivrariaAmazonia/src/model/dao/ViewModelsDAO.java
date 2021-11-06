
package model.dao;

import connection.DatabaseConstants;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import view.model.SearchViewModel;

public class ViewModelsDAO {
    private static final String URL = DatabaseConstants.URL;
    private static final String USER = DatabaseConstants.USER;
    private static final String PASS = DatabaseConstants.PASS;
    
    // Método que retorna os dados referente a tela de busca
    public static List<SearchViewModel> getSearchViewModels() {
        List<SearchViewModel> searchViewModels = new ArrayList<SearchViewModel>();
        
        try (Connection con = DriverManager.getConnection(URL, USER, PASS)) {
            String query = "select price, title, a.name as author, " +
                "p.name as publisher, b.isbn from books b\n" +
                "inner join publishers p on p.publisher_id = b.publisher_id\n" +
                "inner join booksauthors ba on ba.isbn = b.isbn\n" +
                "inner join authors a on ba.author_id = a.author_id;";
            
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
}
