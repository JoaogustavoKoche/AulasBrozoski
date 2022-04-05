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
public class UsaVendedor {
    
    public static void main(String[] args) {
        
        Vendedor Almeida = new Vendedor();
        
        Almeida.nome ="Jose Almeida";
        Almeida.vlr_venda = 50000;
        Almeida.perc_comissao = 10;
        
        System.out.println("Nome do Vendedor: "+Almeida.nome);
        System.out.println("Valor de vendas: "+Almeida.vlr_venda);
        System.out.println("Perc Comissao: "+ Almeida.perc_comissao);
        System.out.println("Valor da Comissao bruto: "+Almeida.vlr_comissao());
        System.out.println("Calor IRRF: "+Almeida.irrf());
        System.out.println("Valor Comissao liquida: "+Almeida.vlr_comissao_liquida());
    }    
}
