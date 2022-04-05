
package dao;

import factory.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Clientes;
import model.Mercadorias;


public class MercadoriasDao {   
    
     public void create(Mercadorias p){
     Connection con = ConnectionFactory.getConnection();
     
        PreparedStatement stmt = null;
     try{
stmt = con.prepareStatement("INSERT INTO mercadoria(descricao,medida,quantidade,preco_venda,preco_compra,referencia)VALUES(?,?,?,?,?,?)");

        stmt.setString(1,p.getDescricao());
        stmt.setString(2,p.getMedida());
        stmt.setString(3,p.getQuantidade());
        stmt.setString(4,p.getPreco_venda());
        stmt.setString(5,p.getPreco_compra());
        stmt.setString(6,p.getReferencia());
      
        
        stmt.executeUpdate();
        
        JOptionPane.showMessageDialog(null,"salvo com sucesso!");  
     }catch(SQLException ex){
         System.out.println(ex);
     
     }finally{
         ConnectionFactory.closeConnection(con,stmt);
     }
    }
    
    
    
    public List<Mercadorias> read(){
        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Mercadorias> mercadorias =  new ArrayList<>();
        
        try{
            stmt = con.prepareStatement("SELECT * FROM mercadoria");
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Mercadorias mercadoria =  new Mercadorias();
                
                mercadoria.setCod(rs.getLong("cod"));
                mercadoria.setDescricao(rs.getString("descricao"));
                mercadoria.setMedida(rs.getString("medida"));
                mercadoria.setQuantidade(rs.getString("quantidade"));
                mercadoria.setPreco_venda(rs.getString("preco_venda"));
                mercadoria.setPreco_compra(rs.getString("preco_compra"));
                mercadoria.setReferencia(rs.getString("referencia"));
                  
                mercadorias.add(mercadoria);
            
            }
        } catch (SQLException ex) {
    Logger.getLogger(ClientesDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
    
    return mercadorias;
    
    }
    
    
    
    
     public List<Mercadorias> readForDesc(String nome){
        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Mercadorias> mercadorias =  new ArrayList<>();
        
        try{
            stmt = con.prepareStatement("SELECT * FROM  mercadoria WHERE "
                    + "descricao like ?");
            stmt.setString(1, "%"+nome+"%");
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Mercadorias mercadoria =  new Mercadorias();
              
                mercadoria.setCod(rs.getLong("cod"));
                mercadoria.setDescricao(rs.getString("descricao"));
                mercadoria.setMedida(rs.getString("medida"));
                mercadoria.setQuantidade(rs.getString("quantidade"));
                mercadoria.setPreco_venda(rs.getString("preco_venda"));
                mercadoria.setPreco_compra(rs.getString("preco_compra"));
                mercadoria.setReferencia(rs.getString("referencia"));
                
                mercadorias.add(mercadoria);
            
            }
        } catch (SQLException ex) {
    Logger.getLogger(ClientesDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
    
    return mercadorias;
    
    } 
          
      public void update(Mercadorias p){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try{
stmt =  con.prepareStatement("UPDATE mercadoria set descricao = ?,medida=?,quantidade=?,preco_venda=?,preco_compra=?,referencia=?"
        + "WHERE cod = ?");
        
        stmt.setString(1,p.getDescricao());
        stmt.setString(2,p.getMedida());
        stmt.setString(3,p.getQuantidade());
        stmt.setString(4,p.getPreco_venda());
        stmt.setString(5,p.getPreco_compra());
        stmt.setString(6,p.getReferencia());
        stmt.setLong(7,p.getCod());
      
        
        stmt.executeUpdate();
        
        JOptionPane.showMessageDialog(null, "Atualizado com sucesso");
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao atualizar"+ex);
        }finally{
            ConnectionFactory.closeConnection(con,stmt);
        }
    }
    
    public void delete(Mercadorias p){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try{
            stmt = con.prepareStatement("DELETE FROM mercadoria WHERE cod = ?");
            stmt.setLong(1, p.getCod());
            
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Excluido com sucesso");
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao excluir"+ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    
    }
     
   
}
