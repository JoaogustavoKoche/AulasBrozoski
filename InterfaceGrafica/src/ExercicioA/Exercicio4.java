/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExercicioA;

import javax.swing.JOptionPane;

/**
 *
 * @author Joao Gustavoo
 */
public class Exercicio4 {
    
    
    public static void main(String[] args) {
        
        double valor;
        
        valor = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
        
        if (valor < 0) {
            JOptionPane.showMessageDialog(null, "O valor inserido é menor que 0");
        }else if (valor > 0) {
            JOptionPane.showMessageDialog(null, "O valor inserido é maior que 0");
        }else {
            JOptionPane.showMessageDialog(null, "O valor inserido é igual a 0");
        } 
    }
}
