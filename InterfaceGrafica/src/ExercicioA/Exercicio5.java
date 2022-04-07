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
public class Exercicio5 {
    
    
    public static void main(String[] args) {
        
        double peso,altura,imc;
        
        peso = Double.parseDouble(JOptionPane.showInputDialog("Insira seu peso: "));
        altura = Double.parseDouble(JOptionPane.showInputDialog("Insira sua altura: "));
        
        imc = (peso / (altura * altura));
        
        if (imc > 25) {
            JOptionPane.showMessageDialog(null, "Você está acima do peso!");
        }else {
            JOptionPane.showMessageDialog(null, "Você está saudável!");
        }   
    }
}
