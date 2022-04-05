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

public class ClientesDao {
    
    
    
     public void create(Clientes p){
     Connection con = ConnectionFactory.getConnection();
     
        PreparedStatement stmt = null;
     try{
stmt = con.prepareStatement("INSERT INTO cliente(nome_cli, cpf, telefone, rua, estado, cidade, num)VALUES(?,?,?,?,?,?,?)");

        stmt.setString(1,p.getNome_cli());
        stmt.setString(2,p.getCpf());
        stmt.setString(3,p.getTelefone());
        stmt.setString(4,p.getRua());
        stmt.setString(5,p.getEstado());
        stmt.setString(6,p.getCidade());
        stmt.setString(7,p.getNum());
        
        stmt.executeUpdate();
        
        JOptionPane.showMessageDialog(null,"salvo com sucesso!");  
     }catch(SQLException ex){
         System.out.println(ex);
     
     }finally{
         ConnectionFactory.closeConnection(con,stmt);
     }
    }
    
     
     public List<Clientes> read(){
        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Clientes> clientes =  new ArrayList<>();
        
        try{
            stmt = con.prepareStatement("SELECT * FROM cliente");
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Clientes cliente =  new Clientes();
                
                cliente.setCod_cli(rs.getLong("cod_cli"));
                cliente.setNome_cli(rs.getString("nome_cli"));
                cliente.setCpf(rs.getString("cpf"));
                cliente.setTelefone(rs.getString("telefone"));
                cliente.setRua(rs.getString("rua"));
                cliente.setEstado(rs.getString("estado"));
                cliente.setCidade(rs.getString("cidade"));
                cliente.setNum(rs.getString("num"));
                  
                clientes.add(cliente);
            
            }
        } catch (SQLException ex) {
    Logger.getLogger(ClientesDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
    
    return clientes;
    
    }
     
      
     public List<Clientes> readForDesc(String nome){
        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Clientes> clientes =  new ArrayList<>();
        
        try{
            stmt = con.prepareStatement("SELECT * FROM cliente WHERE "
                    + "nome_cli like ?");
            stmt.setString(1, "%"+nome+"%");
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Clientes cliente =  new Clientes();
                
                cliente.setCod_cli(rs.getLong("cod_cli"));
                cliente.setNome_cli(rs.getString("nome_cli"));
                cliente.setCpf(rs.getString("cpf"));
                cliente.setTelefone(rs.getString("telefone"));
                cliente.setRua(rs.getString("rua"));
                cliente.setEstado(rs.getString("estado"));
                cliente.setCidade(rs.getString("cidade"));
                cliente.setNum(rs.getString("num"));
                
                clientes.add(cliente);
            
            }
        } catch (SQLException ex) {
    Logger.getLogger(ClientesDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
    
    return clientes;
    
    } 
     
     
     
     
     
     public void update(Clientes p){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try{
stmt =  con.prepareStatement("UPDATE cliente set nome_cli = ?,cpf=?,telefone=?,rua=?,estado=?,cidade=?,num=?"
        + "WHERE cod_cli = ?");
        
        stmt.setString(1,p.getNome_cli());
        stmt.setString(2,p.getCpf());
        stmt.setString(3,p.getTelefone());
        stmt.setString(4,p.getRua());
        stmt.setString(5,p.getEstado());
        stmt.setString(6,p.getCidade());
        stmt.setString(7,p.getNum());
        stmt.setLong(8,p.getCod_cli());
        
        stmt.executeUpdate();
        
        JOptionPane.showMessageDialog(null, "Atualizado com sucesso");
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao atualizar"+ex);
        }finally{
            ConnectionFactory.closeConnection(con,stmt);
        }
    }
    
    public void delete(Clientes p){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try{
            stmt = con.prepareStatement("DELETE FROM cliente WHERE cod_cli = ?");
            stmt.setLong(1, p.getCod_cli());
            
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Excluido com sucesso");
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao excluir"+ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    
    }
    
     
     

}
    
    
           
