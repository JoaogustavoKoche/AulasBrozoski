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
public class Aluno {
    
    private String nome;
    private String telefone;
    private double cpf;
    
    
    public Aluno(String nome, String telefone, double cpf){
        
        this.nome = nome;
        this.telefone = telefone;
        this.cpf = cpf;   
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public double getCpf() {
        return cpf;
    }

    public void setCpf(double cpf) {
        this.cpf = cpf;
    } 
}
