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
public class Exercicio3 {
    
    public static void main(String[] args) {
       
        double lado1;
        double lado2;
        double perimetro;
                 
        lado1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do primeiro lado do retângulo:"));
        lado2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do segundo lado do retângulo:"));
        
        perimetro = (lado1 * 2) + (lado2 * 2);
        
        JOptionPane.showMessageDialog(null, "O Perímetro do retângulo é "+perimetro+".");    
    }  
}
