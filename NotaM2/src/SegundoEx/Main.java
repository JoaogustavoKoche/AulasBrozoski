/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SegundoEx;

import java.util.Scanner;

/**
 *
 * @author Joao Gustavoo
 */
public class Main {
    
    public static void main(String[] args) {
        
      Main main = new Main();  
        
      main.ler(); 
    }
    
    
    public void ler(){
        
       Calculo test = new Calculo(); 
       Scanner lerr = new Scanner(System.in);
       
       
        System.out.println("Insira o primeiro lado");
        test.setLadoa(lerr.nextDouble());
        
        
        System.out.println("Insira o segundo lado");
        test.setLadob(lerr.nextDouble());
        
        System.out.println("Insira o terceiro lado");
        test.setLadoc(lerr.nextDouble());   
        
        
        System.out.println(test.calc());   
    }   
}
