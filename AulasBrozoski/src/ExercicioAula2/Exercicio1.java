/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExercicioAula2;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Exercicio1 {
    
    public static void main(String[] args) {
        
        
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Insira os gastos com as despesas");
        
        int desp = ler.nextInt();
        
        int gorj = (desp * 10 / 100);
        
        int total = (desp - gorj);
        
        System.out.println("O valor da gorjeta é "+gorj);
        
        System.out.println("O valor total com a gorjeta é "+total);
           
        
    }
}

//Todo restaurante, embora por lei não possa obrigar o cliente a pagar,
//cobra 10% de comissão para o garçom. Crie um algoritmo em Java que leia o valor
//gasto com despesas realizadas em um restaurante e imprima o valor da gorjeta e
//o valor total com a gorjeta.