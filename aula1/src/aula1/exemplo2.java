/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula1;

/**
 *
 * @author usuario
 */
public class exemplo2 {

public static void main(String[] args) {
        
        int anoNasc = 1997;
        int anoAtual = 2015;
        int idade = anoAtual - anoNasc;
        if (idade < 18 && idade >=16) { 
          System.out.println("Idade permitidade acompanhada pelos pais");
            }
        if(idade < 16 ) {
          System.out.println("Idade nao permitida");
        }
        else {
          System.out.println("Idade permitida");
          
         }
        System.out.println("sua idade é " + idade);
        }
}


