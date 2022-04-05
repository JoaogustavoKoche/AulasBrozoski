/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExercicioAula1;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Exercicio4 {
    
    
    public static void main(String[] args){


        Scanner ler = new Scanner(System.in);
        
        System.out.println("Informe seu nome: ");
        String nome = ler.next();
        
        System.out.println("Informe sua idade: ");
        int idade = ler.nextInt();
        
        if (idade < 16 && idade > 0){
            
            System.out.println(nome+", você tem "+idade+" anos, não é obrigado a votar!");
            
        } else{
            if (idade >= 18 && idade <=65){
                
                System.out.println(nome+", você tem "+idade+" anos, é OBRIGATÓRIO o voto!");
                
            } else{
                if (idade < 18 && idade >= 16 || idade > 65){
                    
                    System.out.println(nome+", você tem "+idade+" anos, tem o direito de votar, mas NÃO é obrigatório!");
                    
                } else{
                    if(idade < 0 || idade > 130){
                    
                    System.out.println("Digite uma idade válida!");
                    
                   }
               }
           }       
       }    
   }
}
        
        
   

