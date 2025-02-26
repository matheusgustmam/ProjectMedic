/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1.Modelo;


import com.mycompany.mavenproject1.Controle.Consulta;
import com.mycompany.mavenproject1.Controle.Medic;
import com.mycompany.mavenproject1.Controle.Paciente;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Time;
import java.text.ParseException;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author Matheus
 */
public class ConsultaFabric implements Fabrica<Consulta> {
    
     public boolean salvar(Consulta obj){
        if(obj.getId()> 0) {
            return atulizar(obj); 
        }else {
            return inserir(obj);
        }
    }
     
    private boolean inserir(Consulta obj){
        try{
            Connection con = DBconex.getInstancia().getConexao();
            
            String sql = "INSERT INTO consulta (Paciente,Dr,Especialidade,dataConsulta,"
                    + "horaConsulta,"
                    + "obsConsulta,"
                    + "id_medico) VALUES(?,?,?,?,?,?,?)";
            
            PreparedStatement psp = con.prepareCall(sql);
            psp.setString(1, obj.getPacienteConsult());
            psp.setString(2, obj.getMedicConsult());
            psp.setString(3, obj.getEscp());
            psp.setDate(4, new Date(obj.getDtConsult().getTime()));
            psp.setString(5, obj.getHrConsult());
            psp.setString(6,obj.getObsConsult());
            psp.setInt(7, obj.getId_medico());
            
            psp.execute();
            
            return true;
        } catch (SQLException ex){
            ex.printStackTrace();
        }catch(Exception e){
            System.out.println("Não foi possível Marca Consulta: "+ e);
        }
        
        return false;   
    } 
     
    private boolean atulizar(Consulta obj){
        try{
            Connection con =DBconex.getInstancia().getConexao();
            
            String sql = "UPADETE consulta SET Paciente=?,"
                    + "Dr=? ,"
                    + "Especialidade=? ,"
                    + "dataConsulta=?, "
                    + "horaConsulta=?, "
                    + "obsConsulta=? "
                    + ""
                    +"WHERE id=?";
            
            PreparedStatement psp = con.prepareStatement(sql);
            psp.setString(1, obj.getPacienteConsult());
            psp.setString(2, obj.getMedicConsult());
            psp.setString(3, obj.getEscp());
            psp.setDate(4, new Date(obj.getDtConsult().getTime()));
            psp.setString(5, obj.getHrConsult());
            psp.setString(6, obj.getObsConsult());
            
            psp.setInt(7, obj.getId());
            
            return true;
        }catch (SQLException ex) {
            ex.printStackTrace();
        }
        
        return false;
}
     public boolean excluir(Consulta obj){
        try{
            Connection con = DBconex.getInstancia().getConexao();
            
            String sql ="DELETE FROM consulta WHERE idConsulta=?";
            
            PreparedStatement psp = con.prepareStatement(sql);
            
            psp.setInt(1, obj.getId());
            
            psp.execute();
            
            return true;
        }catch (SQLException ex){
            ex.printStackTrace();
        }
        
        return false;
    }
     
     public List<Consulta> listar(){
        try{
            List<Consulta> ls = new ArrayList<>();
            
            Connection con = DBconex.getInstancia().getConexao();
            
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM consulta INNER JOIN medicos ON idmedicos = id_medico ");
            
            while(rs.next()) {
                Consulta obj = new Consulta();
                
                obj.setPacienteConsult(rs.getString("Paciente"));
                
                obj.setEscp(rs.getString("Especialidade"));
                obj.setDtConsult(rs.getDate("dataConsulta"));
                obj.setHrConsult(rs.getString("horaConsulta"));
                obj.setObsConsult(rs.getString("obsConsulta"));
                obj.setId_medico(rs.getInt("id_medico"));
                
                Medic medico = new Medic();
                medico.setNomeDr(rs.getString("NomeDr"));
                //Paciente paciente = new Paciente();
                //paciente.setNome(rs.getString("Nome"));
                
                obj.setMedico(medico);
                //obj.setPaciente(paciente);
                
                obj.setId(rs.getInt("idConsulta"));
                
                ls.add(obj);
            }
            
            return ls;
        }catch(SQLException ex){
            ex.printStackTrace();
            return null;
        }
    }
     
    /* public List<Consulta> readForDesc(String PesqName){
        try{
            List<Consulta> ls = new ArrayList<>();
            
            Connection con = DBconex.getInstancia().getConexao();
            
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM consulta WHERE Paciente LIKE ?");
            st.setString(1, "%"+PesqName"%");
            
            while(rs.next()) {
                Consulta obj = new Consulta();
                
                obj.setPacienteConsult(rs.getString("Paciente"));
                obj.setMedicConsult(rs.getString("Dr"));
                obj.setEscp(rs.getString("Especialidade"));
                obj.setDtConsult(rs.getDate("dataConsulta"));
                obj.setHrConsult(rs.getString("horaConsulta"));
                obj.setObsConsult(rs.getString("obsConsulta"));
                
                obj.setId(rs.getInt("idConsulta"));
                
                ls.add(obj);
            }
            
            return ls;
        }catch(SQLException ex){
            ex.printStackTrace();
            return null;
        }
    }*/

    @Override
    public Consulta getEntidade(Integer obj) {
        return null;
    }

    @Override
    public List<Consulta> getListEntidades(String obj) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}