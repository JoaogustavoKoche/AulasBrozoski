/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package associacaos;

/**
 *
 * @author usuario
 */
public class Associacaos {
    
    
    public static void main(String[] args) {
        
        Contato contato = new Contato();
        
        contato.setNome("Chinelo");
        
       //Relacionamento 1 para 1 
        Endereco endereco = new Endereco();
        
        endereco.setNomeRua("Das Flores");
        endereco.setNumero("101");
        endereco.setComplemento("casa");
        endereco.setCidade("Mafra");
        endereco.setEstado("SC");
        endereco.setCep("89300-000");      
        
        contato.setEndereco(endereco);
        
      //um para muitos
        Telefone telefone = new Telefone();
        
        telefone.setTipo("Residencial");
        telefone.setDdd("47");
        telefone.setNumero("848498484");
        
        Telefone telefone2 = new Telefone();
        
        
        telefone2.setTipo("Empressarial");
        telefone2.setDdd("47");
        telefone2.setNumero("489128448");

        Telefone[] telefones = new Telefone[2];
        
        telefones[0] = telefone;
        telefones[1] = telefone2;
        
       
        contato.setTelefone(telefones);
        
      //saidas
        System.out.println(contato.getNome());
       
        if(contato != null && contato.getEndereco() != null){
            System.out.println(contato.getEndereco().getCidade());
        }  
        
        if(contato != null && contato.getTelefone() != null){
            
            for(Telefone t:contato.getTelefone()){
                
                System.out.println(t.getDdd()+" "+t.getNumero());
            }
        }  
    }   
}
