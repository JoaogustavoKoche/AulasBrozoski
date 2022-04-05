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
public class exercicio3 {
    
    public static void main(String[] args) {
        
        String a;
        String l;
        double altura;
        double largura;
        double cont1;
        
        a = JOptionPane.showInputDialog("Insira a altura");
        altura = Double.parseDouble(a);
       
        l =  JOptionPane.showInputDialog("Insira a largura");
        largura = Double.parseDouble(l);
        
        cont1 = (altura * 2) + (largura * 2);
        
        JOptionPane.showMessageDialog(null, "O valor do perimetro é: "+cont1);
    }
}

/*Calcular e mostrar o valor do perímetro de um retângulo dado o valor dos dois lados (valores reais).
O perímetro do retângulo é calculado pela fórmula
perimetroRetangulo = 2*lado1 + 2*lado2*/