/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExercicioAula3;

/**
 *
 * @author usuario
 */
public class UsaAluno {
    
    public static void main(String[] args) {
        
        Aluno chinelo = new Aluno();
        
 
        chinelo.n1 = 7 ;
        chinelo.n2 = 6 ;
        chinelo.n3 = 7 ;
        chinelo.n4 = 8 ;
        
        System.out.println("Media: " +chinelo.media());
        
        
        if(chinelo.aprovado())
            
            System.out.println("Aprovado");
        else
            System.out.println("Reprovado");
    }
    
}
