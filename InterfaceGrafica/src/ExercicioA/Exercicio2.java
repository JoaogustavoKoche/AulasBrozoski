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
public class Exercicio2 {
    
    public static void main(String[] args) {
        
        int lado1,lado2;
        double area;
        
        lado1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do primeiro lado do retângulo: "));
        lado2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do segundo lado do retângulo: "));
        
        area = (lado1 * lado2);
        
        JOptionPane.showMessageDialog(null, "A área do retângulo é "+area+".");        
    }   
}
