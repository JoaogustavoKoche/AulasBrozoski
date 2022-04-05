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
public class Livro {
    
    private String nomelivro;
    private String temas;
    private int paginas;
    
    public Livro(String temas, int paginas, String nomelivro){
        
        this.nomelivro = nomelivro;
        this.temas = temas;
        this.paginas = paginas;
    }

    public Livro(){
        
        
    }
    
    
    public String getNomelivro() {
        return nomelivro;
    }

    public void setNomelivro(String nomelivro) {
        this.nomelivro = nomelivro;
    }

    public String getTemas() {
        return temas;
    }

    public void setTemas(String temas) {
        this.temas = temas;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }
    
    public void imprimir(){
        
        System.out.println("Nome Do livro: "+this.nomelivro);
        System.out.println("Tema: "+this.temas);   
        System.out.println("Paginas: "+this.paginas);  
    }    
}

