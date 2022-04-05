/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula1;

import java.util.Scanner;


public class exemplo4 {
    
    
 
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int x;
        System.out.println("Digite um valor");
        x=Integer.parseInt(entrada.nextLine());
        if ((x>=1)&&(x<=10)){
               System.out.println("Pertence ao intervalo");
        }else{
            System.out.println("Nao Pertence ao Intervalo");
        }   
    }
}
