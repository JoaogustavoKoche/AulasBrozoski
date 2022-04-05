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
public class Aluno {
    
    double n1, n2, n3, n4;
    
    
    public double media(){
        
        
        return(n1+n2+n3+n4)/4;
    }
    
    public boolean aprovado(){
        
        if(media()>=7)
            
            return true;
            
        else
            
            return false;
        
    
    }
}
