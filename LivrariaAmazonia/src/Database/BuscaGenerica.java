/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import Model.Author;
import Model.Book;
import Model.Publisher;
import java.util.List;

/**
 *
 * @author TR0NZ0D
 */

/*
    BuscaGenerica("Termo").searchPublishers() -> [Editoras]
    BuscaGenerica("Termo").searchBooks() -> [Livros]
    BuscaGenerica("Termo").searchBook() -> Livro
    BuscaGenerica("Termo").searchAuthors() -> [Autores]
*/
public class BuscaGenerica {
    private final String tBusca;
    
    public BuscaGenerica(String termo_busca) {
        this.tBusca = termo_busca;
    }
    
    public List<Publisher> searchPublishers() {
        return PublishersDao.getPublisherStr(this.tBusca);
    }
    
    public List<Book> searchBooks() {
        return BooksDao.getBooksStr(this.tBusca);
    }
    
    public Book searchBook() {
        return BooksDao.getBook(this.tBusca);
    }
    
    public List<Author> searchAuthors() {
        return AuthorsDao.getAuthorsStr(this.tBusca);
    }
    
}
