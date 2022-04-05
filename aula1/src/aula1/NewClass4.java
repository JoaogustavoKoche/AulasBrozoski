/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula1;

import java.util.Scanner;

public class NewClass4 {
    
        static int somatoria(int a , int b, int c){
            return a + b +c;
        }

        
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
                
             int a = entrada.nextInt();
             int b = entrada.nextInt();
             int c = entrada.nextInt();
             
             int soma = somatoria(a,b,c);
             
             System.out.println(soma);   
    }  
}
