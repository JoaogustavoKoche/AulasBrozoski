/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TerceiroEX;

import java.util.Scanner;

/**
 *
 * @author Joao Gustavoo
 */
public class Categoria {
    
    private double peso;
    private String nome;
    private int qtd;
    
    
    public void ler(){

        Categoria categoria = new Categoria();
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite quantos Lutadores vao ser digitados: ");
       
        qtd = ler.nextInt();
         
        String a[] = new String[qtd];
        String s[] = new String[qtd];
        int i = 0;
        
             
        for(i = 0; i < qtd; i++){ 
           
                
           System.out.println("Insira o nome");
           categoria.setNome(ler.nextLine());   
           
           a[i] = categoria.getNome();
               
           System.out.println("Insira o peso"); 
           categoria.setPeso(Double.parseDouble(ler.nextLine()));  
           
           s[i] = Double.toString(categoria.getPeso()); 
           
           s[i] = categoria.verifica();                 
        }     
        
            
        for(i = 0; i < qtd; i++){
             
            System.out.println("Nome");
            System.out.println(a[i]);
            System.out.println("Categoria");
            System.out.println(s[i]);
        }  
    } 
    

    public String verifica(){
        
        if(peso <= 56.7){
            
           return "Peso Mosca";
            
        }else if(peso > 56.7 && peso <+ 61.2){
            
            return "Peso Galo";
            
        }else if(peso > 61.2 && peso <= 65.7){
            
            return "Peso Pena";
            
        }else if(peso > 65.7 && peso <= 70.3){
            
            return "Peso Leve";
            
        }else if(peso > 70.3 && peso <= 77.1){
            
            return "Peso Meio-Medio";
            
        }else if(peso > 71.1 && peso <= 83.9){
            
            return "Peso Medio";
            
        }else if(peso > 83.9 && peso <= 92.9){
            
            return "Peso Meio-Pesado";
            
        }else if(peso > 92.9 && peso <= 120.2){
            
            return "Peso Pesado";
            
        }else if(peso > 120.2){
            
            return "Peso Superpesado";
        }
        return "Erro tente novamente";        
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }  

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }  
}
