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
public class Exercicio1 {
    
    public static void main(String[] args) {
        
        
        int Nascimento;
        int cont;
        
        Nascimento = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano em que nasceu: "));
        cont = 2012 - Nascimento;
        
        JOptionPane.showMessageDialog(null, "Você tinha "+cont+"em 2021");
    }         
}
