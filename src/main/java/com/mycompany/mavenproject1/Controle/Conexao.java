/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1.Controle;

/**
 *
 * @author Matheus
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    
    public static Connection getConnection() {
        try {
            String url = "jdbc:mysql://localhost:3306/bdmedic";
            String usuario = "root";
            String senha = "root";
            Connection con = DriverManager.getConnection(url,usuario, senha);

            return con;
        } catch (SQLException e) {e.printStackTrace();
            return null;
        }

    }
/*public static void main(String[] args){ 
 
    Connection con = getConnection();
}*/
}