/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicioassociação;

import java.util.ArrayList;

/**
 *
 * @author usuario
 */

public class Cadastro{
    
    
    public static void main(String[] args) {
        
        Biblioteca biblioteca1 = new Biblioteca("Jose");
        
        System.out.println(biblioteca1);
        
        
        Livro book1 = new Livro();
        
        book1.setNomelivro("Vida do jose");
        book1.setPaginas(9999);
        book1.setTemas("Terror");
         
        
        ArrayList<Livro> cafe = new ArrayList<>();
        
        cafe.add(book1);
        
        
        System.out.println("Imprimindo o ArraysList");
        for (int i = 0; i < cafe.size(); i++){
            
            
            cafe.get(i).imprimir();
        }             
   
    }
}
    
    