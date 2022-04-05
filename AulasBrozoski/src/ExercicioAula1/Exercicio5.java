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
public class Exercicio5 {
    
    
    public static void main(String[] args){



        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o número de mercadorias:");
        int num = ler.nextInt();

        int contador = 0;
        float valorTotal = 0;

        while (num > contador){

            System.out.println("");
            System.out.println("Digite o valor da mercadoria:");
            float valor = ler.nextFloat();

            valorTotal = valor + valorTotal;

            contador = contador + 1;

        }

        System.out.println("");
        System.out.println("O valor total do estoque é de R$"+valorTotal);
        System.out.println("");
        System.out.println("O valor médio do estoque é de R$"+valorTotal/num);

    }

}






//5- Uma loja está levantando o valor total de todas as mercadorias em estoque.
//Escreva um algoritmo que permita a entrada das seguintes informações: a) o
//número total de mercadorias no estoque; b) o valor de cada mercadoria. Ao final
//imprimir o valor total em estoque e a média de valor das mercadorias.
