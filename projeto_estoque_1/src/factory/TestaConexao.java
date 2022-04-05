package factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class TestaConexao {
    public static void main(String s[]){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con;
            con = DriverManager.getConnection
        ("jdbc:mysql://localhost:3306/projeto","root","admin");
            PreparedStatement sta = con.prepareStatement
        ("Select * from cliente");
            ResultSet res = sta.executeQuery();
            while(res.next()){
                System.out.println(res.getString("nome_cli"));
            }
            
        }catch(Exception e){
            System.out.println("erro de conexao \n\\n"  +e);
        }
    }
}
