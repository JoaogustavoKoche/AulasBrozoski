/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExercicioAula4.Exercicio3;

import javax.swing.JOptionPane;

/**
 *
 * @author Joao Gustavoo
 */
public class Departamentos {
    
   public static void main(String[] args) {
        Departamento departamento[] = new Departamento[2];

        Funcionarios funcionarios[] = new Funcionarios[10];

        for (int i = 0; i < departamento.length; i++) {
            departamento[i] = new Departamento();
        }
        for (int i = 0; i < departamento.length; i++) {
            departamento[i].setCodigo(Integer.parseInt(JOptionPane.showInputDialog("Insira o código: ")));
            departamento[i].setNome(JOptionPane.showInputDialog("Insira o nome: "));
        }

        for (int i = 0; i < departamento.length; i++) {
            departamento[i].imprimir();
        }
        for (int i = 0; i < funcionarios.length; i++) {
            funcionarios[i] = new Funcionarios();
        }
        for (int i = 0; i < funcionarios.length; i++) {
            funcionarios[i].setMatricula(Integer.parseInt(JOptionPane.showInputDialog("Insira o código: ")));
            funcionarios[i].setNome(JOptionPane.showInputDialog("Insira o nome: "));
        }

        for (int i = 0; i < funcionarios.length; i++) {
            funcionarios[i].imprimir();
        }
    }
}

