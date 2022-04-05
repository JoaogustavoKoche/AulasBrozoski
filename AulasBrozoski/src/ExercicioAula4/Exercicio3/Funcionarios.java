/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExercicioAula4.Exercicio3;

/**
 *
 * @author usuario
 */
public class Funcionarios {
    
    private int matricula;
    private String nome;
    private int dept;
    
    public Funcionarios(){
    
        this.matricula = 0;
        this.nome = "";
        this.dept = 0;
    }
    
    public Funcionarios(int matricula, String nome, int dept){
        
        this.matricula = matricula;
        this.nome = nome;
        this.dept = dept;    
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDept() {
        return dept;
    }

    public void setDept(int dept) {
        this.dept = dept;
    }
    
    public void imprimir(){
        System.out.println("Matricula: "+this.matricula);
        System.out.println("Nome: "+this.nome);
        System.out.println("Departamento: "+this.dept);   
    }
}
