/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1.Controle;

import java.util.Date;
/**
 *
 * @author Aluno
 */
public class Consulta extends DataObject {
    
    private Paciente pacienteConsult;
    private Medic medicConsult;
    private String escpConsult;
    private Date dtConsult;
    private Date hrConsult;
    private String obsConsult;
    
    public Paciente getPaciente(){
        return pacienteConsult;
    }
    
    public void setPaciente(Paciente pacienteConsult){
        this.pacienteConsult = pacienteConsult;
    }
    
    public Medic getMedic(){
        return medicConsult;
    }
    
    public void setMedic(Medic medicConsult){
        this.medicConsult = medicConsult;
    }
    
    public String getEscp(){
        return escpConsult;
    }
    
    public void setEscp(String escpConsult){
        this.escpConsult = escpConsult;
    }
    
    public Date getDtConsult(){
        return dtConsult;
    }
    
    public void setDtConsult(Date dtConsult){
        this.dtConsult = dtConsult;
    }
    
    public Date getHrConsult(){
        return hrConsult;
    }
    
    public void setHrConsult(Date hrConsult){
        this.hrConsult = hrConsult;
    }
    
    public String getObsConsult(){
        return obsConsult;
    }
    
    public void setObsConsult(String obsConsult){
        this.obsConsult = obsConsult;
    }
    
}
