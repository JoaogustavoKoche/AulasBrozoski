/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExercicioAula3.Exercicio4;

import javax.swing.JOptionPane;

/**
 *
 * @author usuario
 */
public class Produtos {
    
    String nome;
    double ValorOriginal;
    double PercAumento;
    double ValorAumento;
    
    
    public double Calcular(){
        
        ValorAumento = ValorOriginal+(ValorOriginal * (PercAumento/100));
        
        return ValorAumento;
    }
    
    public void Mostrar(){
        
        JOptionPane.showMessageDialog(null,"Valor do produto "+nome+" é de: "+ValorAumento);
    }
}
