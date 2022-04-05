/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExercicioAula3.Exercicio3;

/**
 *
 * @author usuario
 */
public class Vendedor {
    
    String nome;
    double vlr_venda, perc_comissao;
    
    public double vlr_comissao(){
    
        return this.vlr_venda * (this.perc_comissao/100); 
    }
    
    public double irrf(){
        
     if(this.vlr_comissao()<=1700){
        
        return 0;
    }else if(this.vlr_comissao()<=1700){
        
        return this.vlr_comissao()*0.15;
        
    }else if(this.vlr_comissao()<=5000){
        
        return this.vlr_comissao()*0.2;   
    }else{
        
        return this.vlr_comissao()*0.275;
        }     
    }
    
   public double vlr_comissao_liquida(){
       
       
       return this.vlr_comissao()-this.irrf();
    }  
}
