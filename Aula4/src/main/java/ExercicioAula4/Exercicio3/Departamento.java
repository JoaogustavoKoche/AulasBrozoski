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
public class Departamento {
    
    private int codigo;
    private String nome;
    
    
    public Departamento(){
    
        this.codigo = 0;
        this.nome = "";
    }
    
    public Departamento(int codigo, String nome){
        
        this.codigo = codigo;
        this.nome = nome;  
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void imprimir(){
        System.out.println("Codigo: "+this.codigo);
        System.out.println("Nome: "+this.nome);    
    }  

    void imprime() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
