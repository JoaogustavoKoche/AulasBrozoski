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
public class TestExemplo {
    
    public static void main(String[] args){
        
        Departamento cod1 = new Departamento();
        Departamento cod2 = new Departamento(7913826, "Cleito");
         
                 
        cod1.setCodigo(183729);
        cod1.setNome("José");
        
       ArrayList<Departamento> dept = new ArrayList<>();
       
       dept.add(cod1);
       dept.add(cod2);
       
        System.out.println("Imprimindo o Departamento");
        for (int i = 0; i < dept.size(); i++){
            
            
            dept.get(i).imprimir();
        }  
    }
}