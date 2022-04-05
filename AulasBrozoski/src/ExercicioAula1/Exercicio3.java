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
public class Exercicio3 {

    public static void main(String[] args){
        
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = ler.next();

        System.out.println("");
        System.out.println("Digite sua idade: ");
        int idade = ler.nextInt();

        System.out.println(nome);

        if (idade >= 17 && idade <= 20){

            System.out.println("Você pode escolher entre os seguros 1 - 2 - 3.");

        } if (idade >= 21 && idade <= 24) {

            System.out.println("Você pode escolher entre os seguros 2 - 3 - 4.");

        } if (idade >=25 && idade <=34){

            System.out.println("Você pode escolher entre os seguros 3 - 4 - 5.");

        } if (idade >=35 && idade <= 64){

            System.out.println("Você pode escolher entre os seguros 4 - 5 - 6.");

        } if (idade >=65 && idade <= 70){

            System.out.println("Você pode escolher entre os seguros 7 - 8 - 9.");
        } else {

            System.out.println("Digite uma idade válida!");
        }
    }
}