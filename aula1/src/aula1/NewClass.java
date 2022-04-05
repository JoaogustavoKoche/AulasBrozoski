/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula1;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class NewClass {
    
    public static void main(String[] args) { 
           
    Scanner entrada = new Scanner(System.in);
    int x =Integer.parseInt(entrada.nextLine());
    switch(x){
        case 1:
            System.out.println("Um");
            break;  
        case 2:
            System.out.println("Dois");
            break;
            default:
                System.out.println("Desconhecido");
                break;
                  
         }         
     }    
}
   
 

