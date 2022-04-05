/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicioaula5.Exercicio1;

import ExercicioAula4.Exercicio3.Funcionarios;
import java.util.ArrayList;

/**
 *
 * @author usuario
 */
public class Test {
    
    public static void main(String[] args) {
        
        
        Cliente cliente1 = new Cliente();
        
        cliente1.setNome("Jose");
        cliente1.setCpf(46816414);
        cliente1.setIdade(45);
        
        ArrayList<Cliente> teste = new ArrayList<>();
        
        teste.add(cliente1);
       
        System.out.println("Imprimindo");
        for (int i = 0; i < teste.size(); i++){
            
            teste.get(i).imprimir();
        }
    }
}
