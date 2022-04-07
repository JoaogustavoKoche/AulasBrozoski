
package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class TestaConexao {
    public static void main(String s[]){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con;
            con = DriverManager.getConnection
        ("jdbc:mysql://localhost:3306/dbprodutos","root","admin");
            PreparedStatement sta = con.prepareStatement
        ("Select * from produto");
            ResultSet res = sta.executeQuery();
            while(res.next()){
                System.out.println(res.getString("descricao"));
            }
            
        }catch(Exception e){
            System.out.println("erro de conexao \n\\n"  +e);
        }
    }
}
