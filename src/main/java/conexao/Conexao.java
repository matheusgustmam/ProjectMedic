/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Matheus
 */
/*public class Conexao {
    
    private static final String url = "jdbc:mysql://localhost:3306/teste";
    private static final String user = "root";
    private static final String senha = "root";
    
    private static Connection conn;
    
    public static Connection getConexao() throws SQLException{
        
    
        try{
            if(conn==null){
           
               conn = DriverManager.getConnection(url, user, senha);
               return conn; 
               
            }else{
                return conn;
            }
        } catch(SQLException e){
                e.printStackTrace();
                return null;
        }
           
    }
}
*/