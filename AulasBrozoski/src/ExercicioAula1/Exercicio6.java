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
public class Exercicio6 {
    
    public static void main(String[] args) {
        
        
        Scanner ler = new Scanner(System.in);
        
        String nome;
        String sexo;
        float alt;
        int idade;
        
        System.out.println("Digite seu nome");
        
        nome = ler.next();
        
        System.out.println("Escolha seu sexo M/F");
        
        sexo = ler.next();
        
        System.out.println("Digite sua altura");
        
        alt = ler.nextFloat();
        
        System.out.println("Digite sua idade");
        
        idade = ler.nextInt();
        
        if((sexo == "M") && (alt > 1.70) && (idade <= 20)){ 
            
            System.out.println("Seu peso ideal é 58");
            
      }else if((sexo == "M") && (alt > 1.70) &&  (idade >= 21)){
          
            System.out.println("Seu peso ideal é 53"); 
            
      }else if((sexo == "M") && (alt > 1.70) &&  (idade >= 40)){
          
            System.out.println("Seu peso ideal é 45");
         
      }else if((sexo == "M") && (alt <= 1.70) &&  (idade <= 40)){
          
            System.out.println("Seu peso ideal é 50");
              
      }else if((sexo == "M") && (alt <= 1.70) &&  (idade > 40)){
          
            System.out.println("Seu peso ideal é 58");
            
      }else if((sexo == "F") && (alt > 1.50)){
          
            System.out.println("Seu peso ideal é 44,7");
                
      }else if((sexo == "F") && (alt <= 1.50) &&  (idade >= 35)){
          
            System.out.println("Seu peso ideal é 45");
            
      }else if((sexo == "F") && (alt <= 1.50) &&  (idade > 35)){
          
            System.out.println("Seu peso ideal é 49");
            
      }else if((sexo == "M") && (alt > 1.70) &&  (idade <= 39)){
          
            System.out.println("Seu peso ideal é 53");
      }   
   }
}
//6 -Faça um algoritmo que leia o nome, o sexo, a altura e a idade de uma pessoa.
//Calcule e mostre nome e o seu peso ideal de acordo com as seguintes
//características da pessoa: