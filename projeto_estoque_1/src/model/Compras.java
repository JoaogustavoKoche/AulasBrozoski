
package model;


public class Compras {
    
    Integer id_c;
    String n_notac;
    Integer cod_m;
    Integer cod_for;
    String preco_compra;
    String referencia;
    String descricao;

    public Integer getId_c() {
        return id_c;
    }

    public void setId_c(Integer id_c) {
        this.id_c = id_c;
    }
    
    
    public String getN_notac(){
        return n_notac;
    }
    public void setN_notac(String n_notac){
        this.n_notac = n_notac;
    }
    
    
    public Integer getCod_m(){
        return cod_m;
    }
    public void setCod_m(Integer cod_m){
        this.cod_m = cod_m;
    }
    
    
    public Integer getCod_for(){
        return cod_for;
    }
    public void setCod_for(Integer cod_for){
        this.cod_for = cod_for;
    }  
    
    
    public String getPreco_compra(){
        return preco_compra;
    }
    public void setPreco_compra(String preco_compra){
        this.preco_compra = preco_compra;
    }
    
    
    public String getReferencia(){
        return referencia;
    }
    public void setReferencia(String referencia){
        this.referencia = referencia;
    }
    
    
    public String getDescricao(){
        return descricao;
    }
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
     
}
