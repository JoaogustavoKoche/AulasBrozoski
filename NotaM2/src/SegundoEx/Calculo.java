/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SegundoEx;

/**
 *
 * @author Joao Gustavoo
 */
public class Calculo {
    
    
    private double ladoa;
    private double ladob;
    private double ladoc;
    
    
    
    public String calc(){
        
        if(ladoa == ladob && ladob == ladoc && ladoa == ladoc){
             
         return  "Triângulo Equilátero"; 
         
        }else if(ladoa != ladob && ladob != ladoc && ladoa != ladoc){
             
          return "Triângulo Escaleno";
              
        }else if(ladoa == ladob || ladob == ladoc || ladoa == ladoc){
            
          return "Triângulo Isósceles";   
        }
        return null;   
    }
    
    

    public double getLadoa() {
        return ladoa;
    }

    public void setLadoa(double ladoa) {
        this.ladoa = ladoa;
    }

    public double getLadob() {
        return ladob;
    }

    public void setLadob(double ladob) {
        this.ladob = ladob;
    }

    public double getLadoc() {
        return ladoc;
    }

    public void setLadoc(double ladoc) {
        this.ladoc = ladoc;
    } 
}
