/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1.Modelo;

import com.mycompany.mavenproject1.Controle.Medic;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;



/**
 *
 * @author Matheus
 */
public class MedicFabric implements Fabrica<Medic> {

    
    @Override
    public boolean salvar(Medic obj){
        if(obj.getId()> 0) {
            return atualizar(obj); 
        }else {
            return inserir(obj);
        }
    }
    
    private boolean inserir(Medic obj){
        try{
            Connection con = DBconex.getInstancia().getConexao();
            
            String sql = "INSERT INTO medicos (NomeDR,Especialidade) VALUES(?,?)";
            
            PreparedStatement pstm = con.prepareCall(sql);
            pstm.setString(1, obj.getNomeDr());
            pstm.setString(2, obj.getEspecialidade() );
            
            pstm.execute();
            
            return true;
        } catch (SQLException ex){
            ex.printStackTrace();
        }
        
        return false;   
    }
    
    private boolean atualizar(Medic obj){
        try{
            Connection con = DBconex.getInstancia().getConexao();
            
            String sql = "UPDATE medicos SET NomeDR=?, Especialidade=? WHERE id=?";
            
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setString(1, obj.getNomeDr());
            pstm.setString(2, obj.getEspecialidade());
            
            pstm.setInt(3, obj.getId());
            
            pstm.execute();
            
            return true;
        }catch (SQLException ex){
            ex.printStackTrace();
        }
        return false;
    }
    
    @Override
    public boolean excluir(Medic obj){
        try{
            Connection con = DBconex.getInstancia().getConexao();
            
            String sql = "DELETE FROM medicos WHERE idmedicos=?";
            
            PreparedStatement pstm = con.prepareStatement(sql);
            
            pstm.setInt(1, obj.getId());
            
            pstm.execute();
            
            return true;
        }catch (SQLException ex){
            ex.printStackTrace();
        }
        return false;
    }
    
    @Override
    public List<Medic> listar(){
        try{
            List<Medic> ls = new ArrayList<>();
            
            Connection con = DBconex.getInstancia().getConexao();
            
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM medicos");
            
            while (rs.next()){
                Medic obj = new Medic();
                
                obj.setNomeDr(rs.getString("NomeDR"));
                obj.setEspecialidade(rs.getString("Especialidade"));
                
                obj.setId(rs.getInt("idmedicos"));
                
                ls.add(obj);
            }
            
            return ls;
        }catch (SQLException ex){
            ex.printStackTrace();
            return null;
        }
    }
    
   
    @Override
    public Medic getEntidade(Integer id){
        try{
            Medic medico = new Medic();
            
            Connection con = DBconex.getInstancia().getConexao();
            
            String sql = "SELECT * FROM medicos WHERE idmedicos=?";
            
            PreparedStatement pstm = con.prepareStatement(sql);
            
            pstm.setInt(1, id);
            
            ResultSet rs =pstm.executeQuery();
            
            if(rs.next()){
                medico.setNomeDr(rs.getString("NomeDR"));
                medico.setEspecialidade(rs.getString("Especialidade"));
                medico.setId(rs.getInt("idmedicos"));
            }
            rs.close();
            return medico;
            
        }catch (SQLException ex){
            ex.printStackTrace();
            return null;
        }
    }

    @Override
    public List<Medic> getListEntidades(String obj) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
}


