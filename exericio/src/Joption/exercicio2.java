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
public class exercicio2 {
    
    public static void main(String[] args) {
        
        String pv1;
        String pv2;
        double primeiro;
        double segundo;
        double cont;
        
        pv1 = JOptionPane.showInputDialog("Insira o primeiro valor");
        primeiro = Double.parseDouble(pv1);
        
        pv2 = JOptionPane.showInputDialog("Insira o segundo valor");
        segundo = Double.parseDouble(pv2);
        
        cont = (primeiro * segundo);
        
        JOptionPane.showMessageDialog(null, "Ovalor da area é: "+cont);
    }  
}

/*alcular e mostrar o valor da área de um retângulo dado o valor dos dois lados (valores reais). A
área do retângulo é calculada pela fórmula
areaRetangulo = lado1 * lado2
*/