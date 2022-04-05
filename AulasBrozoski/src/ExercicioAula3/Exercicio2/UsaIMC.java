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
public class UsaIMC {
    
    
    public static void main(String[] args) {
        
        IMC roberto = new IMC();
       
        roberto.altura = 1.84;
        roberto.peso = 89;
        
        System.out.println("IMC Calculado :"+roberto.ValorIMC());
        System.out.println(roberto.resultado());

        IMC maria = new IMC();
        
        maria.altura = 1.60;
        maria.peso = 60;
        
        System.out.println("IMC Calculado :"+maria.ValorIMC());
        System.out.println(maria.resultado());
    } 
}
