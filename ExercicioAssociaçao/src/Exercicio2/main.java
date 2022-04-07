package Exercicio2;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Joao Gustavoo
 */
public class main {
    public static void main(String[] args) {
        
        Curso curso = new Curso(3);
        curso.setNome("EDF");
        curso.setDuracao(5);
        curso.setProfessor("Jose");
        
        Aluno aluno1 = new Aluno("Jose","89498184894",419844849);
        Aluno aluno2 = new Aluno("Carlo","5241544498",874748747);
       

        curso.matricular(aluno1);
        curso.matricular(aluno2);
        
        System.out.println("Imprimindo");
        curso.listarAlunos();
        
        
    }
}
