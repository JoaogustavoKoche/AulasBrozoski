/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExercicioAula3.Exercicio5;

/**
 *
 * @author usuario
 */
public class Aluno {
    
    String nome;
    double nota1, nota2, nota3, trabalho;
    
    public double CalcularMedia(){
        
        return(((nota1 + nota2 + nota3) / 3) * 0.7)+(trabalho * .3);   
    }
    
    public String Aprovado(){
        
        if(this.CalcularMedia()>=6)
            return "Aprovado";
        
        else
            return "Reprovado";    
    }
}
