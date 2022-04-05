/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExercicioAula3.Exercicio4;

/**
 *
 * @author usuario
 */
public class UsaProdutos {
    
    public static void main(String[] args) {
        
        Produtos limao = new Produtos();
    
        limao.nome = "Limao";
        limao.ValorOriginal = 2;
        limao.PercAumento = 50;
        limao.Calcular();
        limao.Mostrar();  
    }
}
