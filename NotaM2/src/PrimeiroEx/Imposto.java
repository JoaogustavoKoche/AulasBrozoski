/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PrimeiroEx;

import java.util.Scanner;

/**
 *
 * @author Joao Gustavoo
 */
public class Imposto {
    
    
    private String nome;
    private String cpf;
    private String endereco;
    private double salario;
   
    
    public void calc(){
        
      Scanner ler = new Scanner(System.in);
      Imposto imposto = new Imposto();
      
     int n = 10;    
     int i; 
     

      String a[] = new String[n];
      String c[] = new String[n];
      String e[] = new String[n];
      String s[] = new String [n];
      
      
        for (i=0; i<n; i++) {
          
            System.out.println("Digite os funcionarios");
            System.out.println("");
        
            System.out.println("Digite o nome: ");    
            imposto.setNome(ler.nextLine());

            a[i] = imposto.getNome();

            System.out.println("Digite o CPF: ");
            imposto.setCpf(ler.nextLine());

            c[i] = imposto.getCpf();

            System.out.println("Digite o endereço: ");
            imposto.setEndereco(ler.nextLine());

            e[i] = imposto.getEndereco();

            System.out.println("Digite o salario");
            imposto.setSalario(Double.parseDouble(ler.nextLine()));

            s[i] = Double.toString(imposto.getSalario());
            
            s[i] = imposto.CalcImposto();    
        }   
        
     
        for(i = 0; i < n; i++){
            
            System.out.println(""); 
            System.out.println("Nome: "+a[i]);
            System.out.println("CPF: "+c[i]);
            System.out.println("Endereço: "+e[i]);
            System.out.println("Desconto: "+s[i]);
            System.out.println("");
        }      
    }
    
    
   public String CalcImposto(){
       
       
        if(salario <= 1900){
            
                 
            return "Salario com desconto: " + "Desconto INSS: "+ (salario - (salario * 8 / 100))+ " Zero IR";      
         
        }else if(salario >= 1901 && salario <= 2700){
                
            
            return "Salario com desconto: " + "Desconto INSS: " +(salario - (salario * 10 / 100))+ " Desconto IR: " +(salario - (salario * 7.5 / 100));     
         
        }else if(salario >= 2701 && salario <= 4900){
            
            
            return "Salario com desconto: " + "Desconto INSS: " +(salario - (salario * 11 / 100))+ " Desconto IR: " +(salario - (salario * 15 / 100));   
            
        }else if(salario >= 4901 && salario <= 6200){
            
            
            return "Salario com desconto: " + "Desconto INSS: " +(salario - (salario * 12 / 100))+ " Desconto IR: " +(salario - (salario * 22 / 100));    
            
        }else if(salario >= 6201){
            
            
            return "Salario com desconto: " + "Desconto INSS: " +(salario - (salario * 12 / 100))+ " Desconto IR: " +(salario - (salario * 27.5 / 100));    
            
        }     
        
        return "Erro tente novamente";
    } 
    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }    
}
