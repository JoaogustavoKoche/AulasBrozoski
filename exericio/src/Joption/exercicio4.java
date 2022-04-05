/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Joption;

import javax.swing.JOptionPane;

/**
 *
 * @author usuario
 */
public class exercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String pri;
        int num;
        
       pri = JOptionPane.showInputDialog("Insira o numero");
       num = Integer.parseInt(pri);
       
       
       if(num < 0){
           
           JOptionPane.showMessageDialog(null, " O nome é menor que zero");
       }if(num > 0){
           
           JOptionPane.showMessageDialog(null, " O numero é maior que zero");
           
       }else{
           
           JOptionPane.showMessageDialog(null, " O numero é zero");
       }
       

    }
    
}
/*Ler um número inteiro e determine se ele é maior ou igual ou menor do que zero
*/