/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExercicioAssociação2;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Associacao_Curso {
     
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Entre com o nome do curso: ");
        String nome = scan.nextLine();
        
        System.out.println("Entre com o horario do curso: ");
        String horario = scan.nextLine();
        
        System.out.println("Entre com o professor: ");
        String Professor = scan.nextLine();
        
        System.out.println("Entre com o departamento do curso: ");
        String departamento = scan.nextLine();
        
        System.out.println("Entre com o email do curso");
        String email = scan.nextLine();
        
        Curso curso = new Curso();
        curso.setNome(nome);
        curso.setHorario(horario);
        
        Professor professor = new Professor();
        professor.setNome(nome);
        professor.setDepartamento(departamento);
        professor.setEmail(email);
        
        curso.setProfessor(professor);
        
        
        Aluno[] alunos = new Aluno[5];
        
        for(int i = 0; i < 5; i ++){
            scan.nextLine();
            System.out.println("Entre com o nome do Aluno: "+(i+1));
            String nomeAluno = scan.nextLine();
            
            System.out.println("Entre com a matricula do aluno:");
            String matAluno = scan.nextLine();
            
            double[] notas = new double[4];
            
            for(int j = 0 ; j < 4; j++){
                
                System.out.println("Entre com a note: "+(j+1));
                notas[j] = scan.nextDouble();
            }
            
            Aluno aluno = new Aluno();
            aluno.setNome(nomeAluno);
            aluno.setMatricula(matAluno);
            aluno.setNotas(notas);
            
            alunos[i] = aluno;   
        }
        
        curso.setAlunos(alunos);
        System.out.println(curso.obterInfo());
    }  
}
