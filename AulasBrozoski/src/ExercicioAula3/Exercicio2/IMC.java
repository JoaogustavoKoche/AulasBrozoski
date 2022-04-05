/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExercicioAula3.Exercicio2;

/**
 *
 * @author usuario
 */
public class IMC {
    
    
    double peso, altura;
    
    public double ValorIMC(){
        
        return peso/(Math.pow(altura,2));
    }

    public String resultado(){
        
        if(this.ValorIMC()<20){
            
            return "Abaixo do Normal";   
            
        }else if(this.ValorIMC()<25){
            
            return "Normal";
            
        }else if(this.ValorIMC()<30){
            
            return "Obesidade leve";
        }else if(this.ValorIMC()<40){
            
            return "Obesidade Moderada";
            
        }else{
            
            return "Obesidade Morbidada";
        } 
    }
}
