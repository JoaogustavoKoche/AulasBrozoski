/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExercicioAula4.Exercicio2;

import java.awt.Color;
import java.util.ArrayList;

/**
 *
 * @author usuario
 */
public class Aula4_2 {
    
    public static void main(String[] args) {
        
        Fruta fruta1 = new Fruta();  //instanciando objeto
        
        Fruta fruta2 = new Fruta("Banana", 0.30, Color.YELLOW, 9);
        
        fruta1.setNome("Laranja");
        fruta1.setPesoAproximado(0.50);
        fruta1.setCorPredominante(Color.ORANGE);
        fruta1.setTamanhoAproximado(6);
        
        //Criar e instanciar o objeto salada de frutas do tipo ArraysList
        
        ArrayList<Fruta> saladaDeFrutas = new ArrayList<>();
        
        //preencher objeto
        
        saladaDeFrutas.add(fruta1);
        saladaDeFrutas.add(fruta2);
        saladaDeFrutas.add((new Fruta("Maça", 0.45, Color.RED,5)));
        
        System.out.println("Imprimindo o ArraysList");
        for (int i = 0; i < saladaDeFrutas.size(); i++){
            
            
            saladaDeFrutas.get(i).imprimir();
        }             
    }   
}
