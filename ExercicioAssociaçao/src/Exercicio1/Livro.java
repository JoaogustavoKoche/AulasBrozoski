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
public class Livro {
 
    private String nome;
    private String autor;
    private int paginas;
    private Biblioteca biblioteca;
    
    
    
    public Livro(String nome, String autor, int paginas, Biblioteca biblioteca){
        
        this.nome = nome;
        this.autor = autor;
        this.paginas = paginas;
        this.biblioteca = biblioteca;  
    }
    
    public String toString(){
        
        return "nome= " + nome + ", autor= " + autor + ", paginas= " + paginas + ", biblioteca=" + biblioteca.getNome();
    }
    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public Biblioteca getBiblioteca() {
        return biblioteca;
    }

    public void setBiblioteca(Biblioteca biblioteca) {
        this.biblioteca = biblioteca;
    } 
}
