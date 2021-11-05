/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author TR0NZ0D
 */

import Database.BuscaGenerica;
import Model.Author;
import java.util.List;

public class Tests {
    
    
    public static void main(String[] args) {
        String lAutor;
        BuscaGenerica search = new BuscaGenerica("Gabriel");
        
        List<Author> autor = search.searchAuthors();
        
        for (Author a: autor) {
            lAutor = a.getName();
            System.out.println(lAutor);
        }        
    }
}
