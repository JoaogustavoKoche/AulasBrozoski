/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExercicioAula4.Exercicio2;

import java.awt.Color;

/**
 *
 * @author usuario
 */
public class Fruta {
    
    private String nome;
    private double pesoAproximado;
    private Color corPredominante;
    private int tamanhoAproximado;
    
    //Construtor
    
    public Fruta(){
        
        this.nome = "";
        this.pesoAproximado = 0;
        this.corPredominante = Color.WHITE;
        this.tamanhoAproximado = 0; 
    }
    
    public Fruta(String nome, double pesoAproximado, Color corPredominante, int tamanhoAproximado){
        
        this.nome = nome;
        this.pesoAproximado = pesoAproximado;
        this.corPredominante = corPredominante;
        this.tamanhoAproximado = tamanhoAproximado;        
    }
    
    public String getNome(){
        return nome;   
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }

    public double getPesoAproximado() {
        return pesoAproximado;
    }

    public void setPesoAproximado(double pesoAproximado) {
        this.pesoAproximado = pesoAproximado;
    }

    public Color getCorPredominante() {
        return corPredominante;
    }

    public void setCorPredominante(Color corPredominante) {
        this.corPredominante = corPredominante;
    }

    public int getTamanhoAproximado() {
        return tamanhoAproximado;
    }

    public void setTamanhoAproximado(int tamanhoAproximado) {
        this.tamanhoAproximado = tamanhoAproximado;
    }
    
    public void imprimir(){
        System.out.println("Nome: "+this.nome);
        System.out.println("Peso aproximado: "+this.pesoAproximado);
        System.out.println("Cor predominante "+nomeDaCor(this.corPredominante));
        System.out.println("Tamanho aproximado");    
    }  
    
    public String nomeDaCor(Color cor){
        
        String nomeCor = "";
        if (cor == Color.BLACK){
            
            nomeCor = "Preto";
        }
        if (cor == Color.BLUE){
            
            nomeCor = "Azul";
        }
        if (cor == Color.RED){
            
            nomeCor = "vermelho";
        }
        if (cor == Color.YELLOW){
            
            nomeCor = "Amarelo";
        }
        if (cor == Color.WHITE){
            
            nomeCor = "Branco";
        } 
        if (cor == Color.ORANGE){
            
            nomeCor = "Laranja";
        } 
        return nomeCor;
    }
}
