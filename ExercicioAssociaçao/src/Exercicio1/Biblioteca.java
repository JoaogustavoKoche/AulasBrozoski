/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio1;

/**
 *
 * @author Joao Gustavoo
 */
public class Biblioteca {
    
    private String nome;
    private int funcionarios;
    private int secoes;
    
    
    public Biblioteca(String nome, int funcionarios, int secoes){
        
        this.nome = nome;
        this.funcionarios = funcionarios;
        this.secoes = secoes; 
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(int funcionarios) {
        this.funcionarios = funcionarios;
    }

    public int getSecoes() {
        return secoes;
    }

    public void setSecoes(int secoes) {
        this.secoes = secoes;
    }
    
    
    
    
    
    
}
