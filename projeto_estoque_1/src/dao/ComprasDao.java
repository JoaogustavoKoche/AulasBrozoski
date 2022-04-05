
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
import model.Compras;


public class ComprasDao {
    
     public void create(Compras p){
     Connection con = ConnectionFactory.getConnection();
     
        PreparedStatement stmt = null;
     try{
stmt = con.prepareStatement("INSERT INTO compra(cod_for, cod_m, descricao, n_notac, preco_compra, referencia)VALUES(?,?,?,?,?,?)");

        stmt.setInt(1,p.getCod_for());
        stmt.setInt(2,p.getCod_m());
        stmt.setString(3,p.getDescricao());
        stmt.setString(4,p.getN_notac());
        stmt.setString(5,p.getPreco_compra());
        stmt.setString(6,p.getReferencia());
        
        stmt.executeUpdate();
        
        JOptionPane.showMessageDialog(null,"Salvo com sucesso!");  
     }catch(SQLException ex){
         System.out.println(ex);
     
     }finally{
         ConnectionFactory.closeConnection(con,stmt);
     }
    }
    
     
     public List<Compras> read(){
        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Compras> compras =  new ArrayList<>();
        
        try{
            stmt = con.prepareStatement("SELECT * FROM compra");
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Compras compra =  new Compras();
                
                compra.setId_c(rs.getInt("id_c"));
                compra.setCod_for(rs.getInt("cod_for"));
                compra.setCod_m(rs.getInt("cod_m"));
                compra.setDescricao(rs.getString("descricao"));
                compra.setN_notac(rs.getString("n_notac"));
                compra.setPreco_compra(rs.getString("preco_compra"));
                compra.setReferencia(rs.getString("referencia"));
                  
                compras.add(compra);
            
            }
        } catch (SQLException ex) {
    Logger.getLogger(ComprasDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
    
    return compras;
    
    }
     
      
     public List<Compras> readForDesc(String desc){
        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Compras> compras =  new ArrayList<>();
        
        try{
            stmt = con.prepareStatement("SELECT * FROM compra WHERE "
                    + "descricao like ?");
            stmt.setString(1, "%"+desc+"%");
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Compras compra =  new Compras();
                
                compra.setId_c(rs.getInt("id_c"));
                compra.setCod_for(rs.getInt("cod_for"));
                compra.setCod_m(rs.getInt("cod_m"));
                compra.setDescricao(rs.getString("descricao"));
                compra.setN_notac(rs.getString("n_notac"));
                compra.setPreco_compra(rs.getString("preco_compra"));
                compra.setReferencia(rs.getString("referencia"));
                  
                compras.add(compra);
            
            }
        } catch (SQLException ex) {
    Logger.getLogger(ClientesDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
    
    return compras;
    
    } 
     
     
     
     
     
     public void update(Compras p){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try{
stmt =  con.prepareStatement("UPDATE compra set cod_for = ?,cod_m=?,descricao=?,n_notac=?,preco_compra=?,referencia=?"
        + "WHERE id_c = ?");
        
        stmt.setInt(1,p.getCod_for());
        stmt.setInt(2,p.getCod_m());
        stmt.setString(3,p.getDescricao());
        stmt.setString(4,p.getN_notac());
        stmt.setString(5,p.getPreco_compra());
        stmt.setString(6,p.getReferencia());
        stmt.setInt(7,p.getId_c());
        
        stmt.executeUpdate();
        
        JOptionPane.showMessageDialog(null, "Atualizado com sucesso");
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao atualizar"+ex);
        }finally{
            ConnectionFactory.closeConnection(con,stmt);
        }
    }
    
    public void delete(Compras p){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try{
            stmt = con.prepareStatement("DELETE FROM compra WHERE id_c = ?");
            stmt.setLong(1, p.getId_c());
            
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Excluido com sucesso");
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao excluir"+ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    
    }
    
     
     

}

