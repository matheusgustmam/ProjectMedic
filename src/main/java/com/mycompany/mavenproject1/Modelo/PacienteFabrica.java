/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1.Modelo;

import com.mycompany.mavenproject1.Controle.Paciente;
import java.sql.Connection;
import java.sql.Date;
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
public class PacienteFabrica implements Fabrica<Paciente> {
    
    @Override
    public boolean salvar(Paciente obj){
        if (obj.getId() > 0){
            return atulizar(obj);
        }else{
            return inserir(obj);
        }
    }
    
    private boolean inserir(Paciente obj){
        try{
            Connection con = DBconex.getInstancia().getConexao();
            
            String sql = "INSERT INTO paciente (Nome,Cpf,Nasc,Email,Telefone,"
                    + "Cidade,"
                    + "Obs,"
                    + "Alergia,"
                    + "Diabetes,"
                    + "PrecaoAlta,"
                    + "PrecaoBaixa)"
                    +"VALUES(?,?,?,?,?,?,?,?,?,?,?)";
                    
            PreparedStatement psp = con.prepareStatement(sql);
            psp.setString(1, obj.getNome());
            psp.setString(2, obj.getCpf());
            psp.setDate(3, new Date(obj.getDataNscP().getTime()));
            psp.setString(4, obj.getEmail());
            psp.setString(5, obj.getTel());
            psp.setString(6, obj.getCidadeStr());
            psp.setString(7, obj.getObs());
            psp.setString(8, obj.getAlerg());
            psp.setString(9, obj.getDiabe());
            psp.setString(10, obj.getPrecaoAlti());
            psp.setString(11, obj.getPrecaoBaixa());
            
            System.out.println("Paciente ------------> "+obj.toString());
            
            psp.execute();
            
            return true;
        }catch (SQLException ex){
            ex.printStackTrace();
            System.out.println("Não foi possível cadastrar usuário: "+ ex);
            ex.printStackTrace();
        }catch(Exception e){
            System.out.println("Não foi possível cadastrar usuário: "+ e);
        }
        
        return false;
    }
    
    private boolean atulizar(Paciente obj){
        try{
            Connection con =DBconex.getInstancia().getConexao();
            
            String sql = "UPADETE paciente SET Nome=?,"
                    + "Cpf=?,"
                    + "Nasc=?,"
                    + "Email=?,"
                    + "Telefone=?,"
                    + "Cidade=?,"
                    + "Obs=?,"
                    + "Alergia=?,"
                    + "Diabetes=?,"
                    + "PrecaoAlta=?,"
                    + "PrecaoBaixa=? "
                    +"WHERE id=?";
            
            PreparedStatement psp = con.prepareStatement(sql);
            psp.setString(1, obj.getNome());
            psp.setString(2, obj.getCpf());
            psp.setDate(3, new Date(obj.getDataNscP().getTime()));
            psp.setString(4, obj.getEmail());
            psp.setString(5, obj.getTel());
            psp.setString(6, obj.getCidadeStr());
            psp.setString(7, obj.getObs());
            psp.setString(8, obj.getAlerg());
            psp.setString(9, obj.getDiabe());
            psp.setString(10, obj.getPrecaoAlti());
            psp.setString(11, obj.getPrecaoBaixa());
            
            psp.setInt(12, obj.getId());
            
            return true;
        }catch (SQLException ex) {
            ex.printStackTrace();
        }
        
        return false;
    }
    
    @Override
    public boolean excluir(Paciente obj){
        try{
            Connection con = DBconex.getInstancia().getConexao();
            
            String sql ="DELETE FROM paciente WHERE idpaciente=?";
            
            PreparedStatement psp = con.prepareStatement(sql);
            
            psp.setInt(1, obj.getId());
            
            psp.execute();
            
            return true;
        }catch (SQLException ex){
            ex.printStackTrace();
        }
        
        return false;
    }
    
    @Override
    public List<Paciente> listar(){
        try{
            List<Paciente> ls = new ArrayList<>();
            
            Connection con = DBconex.getInstancia().getConexao();
            
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM paciente");
            
            while(rs.next()) {
                Paciente obj = new Paciente();
                
                obj.setNome(rs.getString("Nome"));
                obj.setCpf(rs.getString("Cpf"));
                obj.setDataNscP(rs.getDate("Nasc"));
                obj.setEmail(rs.getString("Email"));
                obj.setTel(rs.getString("Telefone"));
                obj.setCidadeStr(rs.getString("Cidade"));
                obj.setObs(rs.getString("Obs"));
                obj.setAlerg(rs.getString("Alergia"));
                obj.setDiabe(rs.getString("Diabetes"));
                obj.setPrecaoAlti(rs.getString("PrecaoAlta"));
                obj.setPrecaoBaixa(rs.getString("PrecaoBaixa"));
                
                obj.setId(rs.getInt("idpaciente"));
                
                ls.add(obj);
            }
            
            return ls;
        }catch(SQLException ex){
            ex.printStackTrace();
            return null;
        }
    }

    @Override
    public Paciente getEntidade(Integer obj) {
       return null;
    }
}
