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
public class NewClass3 {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int soma;
        
        int a = entrada.nextInt();
        int b = entrada.nextInt();
        
        
        soma = a + b;
        System.out.println("A soma é"+soma);
    }
    
}
