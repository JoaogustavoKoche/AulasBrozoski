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
public class exercicio5 {
    
    public static void main(String[] args) {
        
        String p;
        String a;
        double peso;
        double altura;
        double cont;
                   
        a = JOptionPane.showInputDialog("Insira sua altura");
        altura = Double.parseDouble(a);
        
        p = JOptionPane.showInputDialog("Insira seu peso");
        peso = Double.parseDouble(p);
         
        cont = peso / (altura * altura);
        
        if(cont > 25){
        
        JOptionPane.showMessageDialog(null, "Voce esta acima do peso");
    }else{
            
         JOptionPane.showMessageDialog(null, "Voce esta saudavel");
        }
    }
}
