/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicioaula5.Exercicio1;

/**
 *
 * @author usuario
 */
public class Cliente {
     
    private String nome;
    private int cpf;
    private int idade;
    
    public Cliente(){
        
        this.nome = "Indefinido";
        this.cpf = 999999999;
        this.idade = 0;   
    }
        
    public Cliente(String nome, int cpf, int idade){
        
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }  
    
    
    public void imprimir(){
        
        System.out.println("Codigo: "+this.nome);
        System.out.println("Nome: "+this.cpf);    
        System.out.println("Nome: "+this.idade);  
    }  
}
