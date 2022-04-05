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
import model.Fornecedores;


public class FornecedoresDao {
    
     public void create(Fornecedores p){
     Connection con = ConnectionFactory.getConnection();
     
        PreparedStatement stmt = null;
     try{
stmt = con.prepareStatement("INSERT INTO fornecedor(nome_for,cnpj,cpf,telefone,rua,estado,cidade,num,inscricao)VALUES(?,?,?,?,?,?,?,?,?)");

        stmt.setString(1, p.getNome_for());
        stmt.setString(2, p.getCnpj());
        stmt.setString(3, p.getCpf());
        stmt.setString(4, p.getTelefone());
        stmt.setString(5, p.getRua());
        stmt.setString(6, p.getEstado());
        stmt.setString(7, p.getCidade());
        stmt.setString(8, p.getNum());
        stmt.setString(9, p.getInscricao());
        
        stmt.executeUpdate();
        
        JOptionPane.showMessageDialog(null,"salvo com sucesso!");  
     }catch(SQLException ex){
         System.out.println(ex);
     
     }finally{
         ConnectionFactory.closeConnection(con,stmt);
     }
    }
    
     
     
     public List<Fornecedores> read(){
        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Fornecedores> fornecedores =  new ArrayList<>();
        
        try{
            stmt = con.prepareStatement("SELECT * FROM fornecedor");
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Fornecedores fornecedor =  new Fornecedores();
                
                fornecedor.setCod_forn(rs.getLong("cod_forn"));
                fornecedor.setNome_for(rs.getString("nome_for"));
                fornecedor.setCnpj(rs.getString("cnpj"));
                fornecedor.setCpf(rs.getString("cpf"));
                fornecedor.setTelefone(rs.getString("telefone"));
                fornecedor.setRua(rs.getString("rua"));
                fornecedor.setEstado(rs.getString("estado"));
                fornecedor.setCidade(rs.getString("cidade"));
                fornecedor.setNum(rs.getString("num"));
                fornecedor.setInscricao(rs.getString("inscricao"));
                  
                fornecedores.add(fornecedor);
            
            }
        } catch (SQLException ex) {
    Logger.getLogger(FornecedoresDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
    
    return fornecedores;
    
    }
     
      
     public List<Fornecedores> readForDesc(String nome){
        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Fornecedores> fornecedores =  new ArrayList<>();
        
        try{
            stmt = con.prepareStatement("SELECT * FROM fornecedor WHERE "
                    + "nome_for like ?");
            stmt.setString(1, "%"+nome+"%");
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Fornecedores fornecedor =  new Fornecedores();
                
                fornecedor.setCod_forn(rs.getLong("cod_forn"));
                fornecedor.setNome_for(rs.getString("nome_for"));
                fornecedor.setCnpj(rs.getString("cnpj"));
                fornecedor.setCpf(rs.getString("cpf"));
                fornecedor.setTelefone(rs.getString("telefone"));
                fornecedor.setRua(rs.getString("rua"));
                fornecedor.setEstado(rs.getString("estado"));
                fornecedor.setCidade(rs.getString("cidade"));
                fornecedor.setNum(rs.getString("num"));
                
                fornecedores.add(fornecedor);
            
            }
        } catch (SQLException ex) {
    Logger.getLogger(ClientesDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
    
    return fornecedores;
    
    } 
     
     
     
     
     
     public void update(Fornecedores p){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try{
stmt =  con.prepareStatement("UPDATE fornecedor set nome_for = ?,cnpj=?,cpf=?,telefone=?,rua=?,estado=?,cidade=?,num=?,inscricao=?"
        + "WHERE cod_forn = ?");
        
        stmt.setString(1, p.getNome_for());
        stmt.setString(2, p.getCnpj());
        stmt.setString(3, p.getCpf());
        stmt.setString(4, p.getTelefone());
        stmt.setString(5, p.getRua());
        stmt.setString(6, p.getEstado());
        stmt.setString(7, p.getCidade());
        stmt.setString(8, p.getNum());
        stmt.setString(9, p.getInscricao());
        stmt.setLong(10, p.getCod_forn());
       
        
        stmt.executeUpdate();
        
        JOptionPane.showMessageDialog(null, "Atualizado com sucesso");
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao atualizar"+ex);
        }finally{
            ConnectionFactory.closeConnection(con,stmt);
        }
    }
    
    public void delete(Fornecedores p){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try{
            stmt = con.prepareStatement("DELETE FROM fornecedor WHERE cod_forn = ?");
            stmt.setLong(1, p.getCod_forn());
            
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Excluido com sucesso");
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao excluir"+ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    
    }
    
     
      
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
    
    
    
    

