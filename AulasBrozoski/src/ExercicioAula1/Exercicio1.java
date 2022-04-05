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
public class Exercicio1 {
    
    
     public static void main(String[] args) {

        System.out.println("Digite o peso total:");
        System.out.println("");
        float p;
        float e;
        float multa;

        Scanner ler = new Scanner(System.in);
        p = ler.nextFloat();

        if (p > 50) {

            e = p - 50;
            multa = e * 4;

            System.out.println("");
            System.out.println("Teve excesso de KG "+e+", multa de R$ "+multa);

        }else{

            System.out.println("");
            System.out.println("Sem excesso, sem multa!");

        }
   }
}
    
