package controller;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.bean.*;
import model.dao.*;
import model.view.*;
import view.*;

public class ControllerView {
    
    // exibe (id, nome, url) na tabela de editora na tabela
    public static void readTablePublisher() {
        DefaultTableModel modelo = (DefaultTableModel) ViewPublisher.tablePublisher.getModel();
        modelo.setNumRows(0);
        PublisherDAO pdao = new PublisherDAO();
        
        for (Publisher publisher: pdao.getPublishers()) {
                modelo.addRow(new Object[] {
                    publisher.getId(),
                    publisher.getName(),
                    publisher.getUrl()
                });
        }
    }
    
    // exibe (preço, título, autor, editora e isbn) de todos os livros cadastrados na tabela
    public static void readTableGeneral() {
        DefaultTableModel modelo = (DefaultTableModel) ViewGeneral.tableGeneral.getModel();
        modelo.setNumRows(0);
        ViewModelsDAO vmdao = new ViewModelsDAO();
        
        for (SearchViewModel search: vmdao.getSearchViewModels()) {
                modelo.addRow(new Object[] {
                    search.getPrice(),
                    search.getTitle(),
                    search.getAuthor(),
                    search.getPublisher(),
                    search.getIsbn()
                });
        }
    }
    
    // exibe (preço, título, autor, editora e isbn) dos livros da busca por título na tabela
    public static void readTableTitle(String title) {
        DefaultTableModel modelo = (DefaultTableModel) ViewGeneral.tableGeneral.getModel();
        modelo.setNumRows(0);
        ViewModelsDAO vmdao = new ViewModelsDAO();
        
        for (SearchViewModel search: vmdao.getSearchByTitle(title)) {
                modelo.addRow(new Object[] {
                    search.getPrice(),
                    search.getTitle(),
                    search.getAuthor(),
                    search.getPublisher(),
                    search.getIsbn()
                });
        }
        
        if (modelo.getRowCount() == 0) {
            JOptionPane.showInternalMessageDialog(null, "Livro não encontrado.", "Aviso", JOptionPane.WARNING_MESSAGE );
            ViewGeneral.buttonClean.setEnabled(false);
        }
    }
    
    // exibe (preço, título, autor, editora e isbn) dos livros da busca por autor na tabela
    public static void readTableAuthor(String author) {
        DefaultTableModel modelo = (DefaultTableModel) ViewGeneral.tableGeneral.getModel();
        modelo.setNumRows(0);
        ViewModelsDAO vmdao = new ViewModelsDAO();
        
        for (SearchViewModel search: vmdao.getSearchByAuthor(author)) {
                modelo.addRow(new Object[] {
                    search.getPrice(),
                    search.getTitle(),
                    search.getAuthor(),
                    search.getPublisher(),
                    search.getIsbn()
                });
        }
        
        if (modelo.getRowCount() == 0) {
            JOptionPane.showInternalMessageDialog(null, "Autor(a) não encontrado.", "Aviso", JOptionPane.WARNING_MESSAGE );
            ViewGeneral.buttonClean.setEnabled(false);
        }
    }
    
    // exibe (preço, título, autor, editora e isbn) dos livros da busca por editora na tabela
    public static void readTablePublisher(String publisher) {
        DefaultTableModel modelo = (DefaultTableModel) ViewGeneral.tableGeneral.getModel();
        modelo.setNumRows(0);
        ViewModelsDAO vmdao = new ViewModelsDAO();
        
        for (SearchViewModel search: vmdao.getSearchByPublisher(publisher)) {
                modelo.addRow(new Object[] {
                    search.getPrice(),
                    search.getTitle(),
                    search.getAuthor(),
                    search.getPublisher(),
                    search.getIsbn()
                });
        }
        
        if (modelo.getRowCount() == 0) {
            JOptionPane.showInternalMessageDialog(null, "Editora não encontrada.", "Aviso", JOptionPane.WARNING_MESSAGE );
            ViewGeneral.buttonClean.setEnabled(false);
        }
    }
    
    // exibe (preço, título, autor, editora e isbn) dos livros da busca por isbn na tabela na tabela
    public static void readTableIsbn(String isbn) {
        DefaultTableModel modelo = (DefaultTableModel) ViewGeneral.tableGeneral.getModel();
        modelo.setNumRows(0);
        ViewModelsDAO vmdao = new ViewModelsDAO();
        
        for (SearchViewModel search: vmdao.getSearchByIsbn(isbn)) {
                modelo.addRow(new Object[] {
                    search.getPrice(),
                    search.getTitle(),
                    search.getAuthor(),
                    search.getPublisher(),
                    search.getIsbn()
                });
        }
        
        if (modelo.getRowCount() == 0) {
            JOptionPane.showInternalMessageDialog(null, "ISBN não encontrado.", "Aviso", JOptionPane.WARNING_MESSAGE );
            ViewGeneral.buttonClean.setEnabled(false);
        }
    }
    
    // para trazer os dados de editora para a tabela
    public static void readTableAuthor() {
        DefaultTableModel modelo = (DefaultTableModel) ViewAuthor.tableAuthor.getModel();
        modelo.setNumRows(0);
        AuthorDAO pdao = new AuthorDAO();
        
        for (Author author: pdao.getAuthors()) {
                modelo.addRow(new Object[] {
                    author.getId(),
                    author.getName(),
                    author.getFName()
                });
        }
    }
    
    // para trazer os dados de livros para a tabela
    public static void readTableBook() {
        DefaultTableModel modelo = (DefaultTableModel) ViewBook.tableBook.getModel();
        modelo.setNumRows(0);
        BookDAO pdao = new BookDAO();
        
        for (Book book: pdao.getBooks()) {
                modelo.addRow(new Object[] {
                    book.getPrice(),
                    book.getTitle(),
                    book.getPublisherId(),
                    book.getIsbn()
                });
        }
    }
    
    // coloca os autores no "comboBoxAuthor" na tela de edição de livro
    public static void updateEditComboAuthor() {
        AuthorDAO dao = new AuthorDAO();
        ViewEditBook.comboBoxAuthor.removeAllItems();
        ViewEditBook.comboBoxAuthor.addItem("Selecione um autor(a)");
        for (Author author: dao.getAuthors()) {
            ViewEditBook.comboBoxAuthor.addItem(author.toString());
        }
    }
    
    // coloca os autores no "comboBoxPublisher" na tela de edição de livro
    public static void updateEditComboPublisher() {
        PublisherDAO dao = new PublisherDAO();
        ViewEditBook.comboBoxPublisher.removeAllItems();
        ViewEditBook.comboBoxPublisher.addItem("Selecione uma editora");
        for (Publisher publisher: dao.getPublishers()) {
            ViewEditBook.comboBoxPublisher.addItem(publisher.toString());
        }
    }
    
    // tira vírgula do double e ajusta para o bd
    public static Double setToDouble(String value) {
        value = value.replace(".","");
        value = value.replace(',', '.');
        Double valueDouble = Double.parseDouble(value);
        
        return valueDouble;
    }
    
    // coloca os autores no "comboBoxAuthor" na tela de adição de livro
    public static void updateAddComboAuthor() {
        AuthorDAO dao = new AuthorDAO();
        ViewAddBook.comboBoxAuthor.removeAllItems();
        ViewAddBook.comboBoxAuthor.addItem("Selecione um autor(a)");
        for (Author author: dao.getAuthors()) {
            ViewAddBook.comboBoxAuthor.addItem(author.toString());
        }
    }
    
    // coloca os autores no "comboBoxPublisher" na tela de adição de livro
    public static void updateAddComboPublisher() {
        PublisherDAO dao = new PublisherDAO();
        ViewAddBook.comboBoxPublisher.removeAllItems();
        ViewAddBook.comboBoxPublisher.addItem("Selecione uma editora");
        for (Publisher publisher: dao.getPublishers()) {
            ViewAddBook.comboBoxPublisher.addItem(publisher.toString());
        }
    }
    
    // separa a string de nome+sobrenome do autor
    public static String splitAuthor(String toSplit, Integer position) {
        String [] splitted = toSplit.split(" ");
        return splitted[position];
    }
    
}
