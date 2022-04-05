/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicioaula5.Exercicio3;

/**
 *
 * @author usuario
 */
public class Filme {
    
    private String titulo;
    private String diretor;
    private String genero;
    private int orcamento;
    private int bilheteria;
    private double valorIngresso;
    
    public Filme(){
        
        this.bilheteria = 0;
        this.diretor = "";
        this.genero = "";
        this.orcamento = 0;
        this.titulo = "";
        this.valorIngresso = 0;
    }
    
    public Filme(String diretor, String titulo){
        
        this.diretor = diretor;
        this.titulo = titulo;
    }

    public Filme(String titulo, double valorIngresso){
        
        this.titulo = titulo;
        this.valorIngresso = valorIngresso;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getOrcamento() {
        return orcamento;
    }

    public void setOrcamento(int orcamento) {
        this.orcamento = orcamento;
    }

    public int getBilheteria() {
        return bilheteria;
    }

    public void setBilheteria(int bilheteria) {
        this.bilheteria = bilheteria;
    }

    public double getValorIngresso() {
        return valorIngresso;
    }

    public void setValorIngresso(double valorIngresso) {
        this.valorIngresso = valorIngresso;
    }
    
    public void imprimir(){
        
        System.out.println("Titulo "+this.titulo);
        System.out.println("Bilheteria "+this.diretor);
        System.out.println("Valor Ingresso "+this.valorIngresso);   
    }
}
