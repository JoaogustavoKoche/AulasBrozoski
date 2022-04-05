
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

import model.Vendas;


public class VendasDao {
    
       
    
  public void create(Vendas v){
     Connection con = ConnectionFactory.getConnection();
     
        PreparedStatement stmt = null;
     try{
stmt = con.prepareStatement("INSERT INTO venda(n_notav,cod_mer,cod_cli,preco_venda,referencia,descricao)VALUES(?,?,?,?,?,?)");

        stmt.setInt(1, v.getN_notav());
        stmt.setInt(2, v.getCod_mer());
        stmt.setInt(3, v.getCod_cli());  
        stmt.setString(4, v.getPreco_venda());
        stmt.setString(5, v.getReferencia());
        stmt.setString(6, v.getDescricao());
        
        stmt.executeUpdate();
       
        
        JOptionPane.showMessageDialog(null,"salvo com sucesso!");  
     }catch(SQLException ex){
        System.out.println(ex);
     
     }finally{
        ConnectionFactory.closeConnection(con,stmt);
     }
    }
  
  
  public List<Vendas> read(){
        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Vendas> vendas =  new ArrayList<>();
        
        try{
            stmt = con.prepareStatement("SELECT * FROM venda");
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Vendas vende =  new Vendas();
                
                vende.setId_v(rs.getInt("id_v"));
                vende.setN_notav(rs.getInt("n_notav"));
                vende.setCod_mer(rs.getInt("cod_mer"));
                vende.setCod_cli(rs.getInt("cod_cli"));
                vende.setPreco_venda(rs.getString("preco_venda"));
                vende.setReferencia(rs.getString("referencia"));
                vende.setDescricao(rs.getString("descricao"));
                       
                vendas.add(vende);
            }
        } catch (SQLException ex) {
    Logger.getLogger(VendasDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
    return vendas;  
  }
  
  
      
 public List<Vendas> readForDesc(String desc){
        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Vendas> vendas =  new ArrayList<>();
        
        try{
            stmt = con.prepareStatement("SELECT * FROM venda WHERE "
                    + "descricao like ?");
            stmt.setString(1, "%"+desc+"%");
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Vendas vende =  new Vendas();
                
                vende.setId_v(rs.getInt("id_v"));
                vende.setN_notav(rs.getInt("n_notav"));
                vende.setCod_mer(rs.getInt("cod_mer"));
                vende.setCod_cli(rs.getInt("cod_cli"));
                vende.setPreco_venda(rs.getString("preco_venda"));
                vende.setReferencia(rs.getString("referencia"));
                vende.setDescricao(rs.getString("descricao"));
                
                vendas.add(vende);
            
            }
        } catch (SQLException ex) {
    Logger.getLogger(VendasDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
    
    return vendas;
    
    }    
 
 
 
 
   public void update(Vendas v){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try{
stmt =  con.prepareStatement("UPDATE venda set n_notav = ?,cod_mer=?,cod_cli=?,preco_venda=?,referencia=?,descricao=?"
        + "WHERE id_v = ?");
        
        stmt.setInt(1, v.getN_notav());
        stmt.setInt(2, v.getCod_mer());
        stmt.setInt(3, v.getCod_cli());  
        stmt.setString(4, v.getPreco_venda());
        stmt.setString(5, v.getReferencia());
        stmt.setString(6, v.getDescricao());
        stmt.setInt(7, v.getId_v());
             
        stmt.executeUpdate();
        
        JOptionPane.showMessageDialog(null, "Atualizado com sucesso");
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao atualizar"+ex);
        }finally{
            ConnectionFactory.closeConnection(con,stmt);
        }
    } 
    
    
     public void delete(Vendas v){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try{
            stmt = con.prepareStatement("DELETE FROM venda WHERE id_v = ?");
            stmt.setInt(1, v.getId_v());
            
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Excluido com sucesso");
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao excluir"+ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    
    }
    
    
    
    
}
