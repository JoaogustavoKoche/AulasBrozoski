/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicioaula5.Exercicio3;

import java.util.ArrayList;

/**
 *
 * @author usuario
 */
public class Cinema {
    
    public static void main(String[] args) {
        
        Filme filme1 = new Filme();
        
        filme1.setDiretor("Jose");
        filme1.setTitulo("JoseBot");
        filme1.setValorIngresso(15);
        
        
        Filme filme2 = new Filme();
        
        filme2.setDiretor("Estralone");
        filme2.setTitulo("Pedra");
        filme2.setValorIngresso(10);
        
          
        ArrayList<Filme> teste = new ArrayList<>();
        
        teste.add(filme1);
        teste.add(filme2);
        
        System.out.println("Imprimindo");
        for (int i = 0; i < teste.size(); i++){
            
            teste.get(i).imprimir();
        }
    }   
}
