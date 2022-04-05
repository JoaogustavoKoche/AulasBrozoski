/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExercicioAula4.Exercicio3;

import java.util.ArrayList;

/**
 *
 * @author usuario
 */
public class TestExemplo2 {
    
        public static void main(String[] args) {
        
        Funcionarios cod1 = new Funcionarios();
        Funcionarios cod2 = new Funcionarios(7913826, "Cleito", 86484);
         
                 
        cod1.setMatricula(183729);
        cod1.setNome("José");
        cod1.setDept(48161);
        
       ArrayList<Funcionarios> dept = new ArrayList<>();
       
       dept.add(cod1);
       dept.add(cod2);
       dept.add(cod2);
       
        System.out.println("Imprimindo o Departamento");
        for (int i = 0; i < dept.size(); i++){
            
            
            dept.get(i).imprimir();
        }  
    }
}
    

