/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1.Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author Matheus
 */
public class DBconex {
    
    private Connection con = null;
    private static DBconex instancia;
    
    private DBconex(){
    }
    
    public static DBconex getInstancia(){
        if (instancia == null){
            instancia = new DBconex();
        }
        return instancia;
    }
    
    
    public Connection getConexao() throws SQLException{
        if (this.con == null){
            String url = "jdbc:mysql://localhost:3306/bdmedic";
            String usuario = "root";
            String senha = "root";
            
            this.con = DriverManager.getConnection(url, usuario, senha);
        }
             
        return this.con;    
        
    }
}
