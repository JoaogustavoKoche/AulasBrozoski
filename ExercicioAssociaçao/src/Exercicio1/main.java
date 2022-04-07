/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio1;

/**
 *
 * @author Joao Gustavoo
 */
public class main {
    
    public static void main(String[] args) {
        
        Biblioteca biblioteca01 = new Biblioteca("Jose",2,2);
        Biblioteca biblioteca02 = new Biblioteca("ROBSO",5,5);
        
        Livro livro1 = new Livro("Vida do Jose","Jose",500,biblioteca01);
        Livro livro2 = new Livro("Vida do ROBSO","Robso",1000,biblioteca02);

        System.out.println(livro1.toString());
        System.out.println("--");
        System.out.println(livro2.toString());
    }
}
