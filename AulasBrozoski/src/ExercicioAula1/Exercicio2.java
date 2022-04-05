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
public class Exercicio2 {
    

    public static void main(String[] args){

        System.out.println("");
        System.out.println("Digite 4 números: ");

        Scanner ler = new Scanner(System.in);

        int a = ler.nextInt();
        int b = ler.nextInt();
        int c = ler.nextInt();
        int d = ler.nextInt();

        int ra = a * a;
        int rb = b * b;
        int rc = c * c;
        int rd = d * d;

        if (rc >= 100){

            System.out.println("");
            System.out.println("Valor de C é: "+rc);

        } else {

            System.out.println("");
            System.out.println("Valor de A: "+ra );
            System.out.println("Valor de B: "+rb );
            System.out.println("Valor de C: "+rc );
            System.out.println("Valor de D: "+rd );

        }
    }
}
    

