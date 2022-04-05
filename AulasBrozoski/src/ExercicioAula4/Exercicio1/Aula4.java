/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExercicioAula4.Exercicio1;

import javax.swing.JOptionPane;

/**
 *
 * @author usuario
 */
public class Aula4 {
    
    public static void main(String[] args) {

        Pessoa multidao[] = new Pessoa[10];

        for (int i = 0; i < 10; i++){

            multidao[i] = new Pessoa();

        }

        //multidao[1].nome = "Clebin";

        for (int i = 0; i < 10; i++){

            multidao[i].nome = JOptionPane.showInputDialog("Nome: "+(i+1));

        //System.out.println(multidao[1].nome);

        }

        for (int i = 0; i < 10; i++){

            JOptionPane.showMessageDialog(null, multidao[i].nome);

        }

    }

}
