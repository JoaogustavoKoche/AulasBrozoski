/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicioassociação;



/**
 *
 * @author usuario
 */
public class Biblioteca{
       
    private String nome;
    private int funcionarios;
    private int alas;      
  
    
    public Biblioteca(String nome, int funcionarios, int alas){
        
        
        this.nome = nome;
        this.funcionarios = funcionarios;
        this.alas = alas;
    }

    public Biblioteca(){
        
        
    }

    public Biblioteca(String joseteca) {
        
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

    public int getAlas() {
        return alas;
    }

    public void setAlas(int alas) {
        this.alas = alas;
    }

  
}
