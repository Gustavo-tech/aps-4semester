import model.dao.AuthorDAO;
import model.Author;
import java.util.List;

public class Teste {
    public static void main(String[] args) {
        List<Author> autores = AuthorDAO.getAuthors();
        System.out.println(autores.toString());
        
        
    }
}
