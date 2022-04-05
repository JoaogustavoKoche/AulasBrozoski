/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExercicioAula3.Exercicio5;

import javax.swing.JOptionPane;
import java.text.DecimalFormat;

        
/**
 *
 * @author usuario
 */
public class Turma {
    
    public static void main(String[] args){
        
        int num = 2;//numero alunos
        Aluno turma[] = new Aluno[num];
          
        for(int i=0; i<num; i++){
            //instancia os alunos
              
            turma[i] = new Aluno();
        }  
          
        for(int i=0; i<num; i++){ //solicita os valores
            turma[i].nome = JOptionPane.showInputDialog("Digite o nome do aluno: "+(i+1)+": ");
              
            turma[i].nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota 1 do aluno"+(i+1)+": "));
              
            turma[i].nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota 2 do aluno"+(i+1)+": "));
              
            turma[i].nota3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota 3 do aluno"+(i+1)+": "));
              
            turma[i].trabalho = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota do trabalho do aluno"+(i+1)+": "));    
        }   
  
        
          
        for (int i = 0; i < num; i++){
              
            System.out.println("Aluno: "+turma[i].nome+" - Media: "+turma[i].CalcularMedia());
            System.out.println("Aluno: "+turma[i].nome+" esta"+turma[i].Aprovado());
              
              
            DecimalFormat df = new DecimalFormat("##.##");
              
            double soma = 0;
            double media = 0;
              
                      
            soma  = turma[i].CalcularMedia();
            media = soma/num;
              
            System.out.println("Media Geral; "+df.format(media));
        }   
    }
}
