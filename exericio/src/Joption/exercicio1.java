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
public class exercicio1 {
    
    
    public static void main(String[] args) {
        
        String i;
        int ano;
        int cont;
        
        i = JOptionPane.showInputDialog("Insira seu ano de nascimento");
        ano = Integer.parseInt(i);
       
        cont = (2012 - ano);
        
        JOptionPane.showMessageDialog(null, "Seu ano em 2012 era: "+cont);   
    }  
}


/*Leia o ano de nascimento de uma pessoa e calcule quantos anos ela tem no ano de 2012.
idade = 2012 - anoDeNascimento*/