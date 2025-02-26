/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1.Controle;


import java.sql.Time;
import java.util.Date;
/**
 *
 * @author Aluno
 */
public class Consulta extends DataObject {
    
    private String pacienteConsult;
    private String medicConsult;
    private Integer id_medico;
    private String escpConsult;
    private Date dtConsult;
    private String hrConsult;
    private String obsConsult;
    private Medic medico; 
    private Paciente paciente;
    
    public String getPacienteConsult(){
        return pacienteConsult;
    }
    
    public void setPacienteConsult(String pacienteConsult){
        this.pacienteConsult = pacienteConsult;
    }
    
    public String getMedicConsult(){
        return medicConsult;
    }
    
    public void setMedicConsult(String medicConsult){
        this.medicConsult = medicConsult;
    }
    
    public String getEscp(){
        return getEscpConsult();
    }
    
    public void setEscp(String escpConsult){
        this.setEscpConsult(escpConsult);
    }
    
    public Date getDtConsult(){
        return dtConsult;
    }
    
    public void setDtConsult(Date dtConsult){
        this.dtConsult = dtConsult;
    }
    
    public String getHrConsult(){
        return hrConsult;
    }
    
    public void setHrConsult(String hrConsult){
        this.hrConsult = hrConsult;
    }
    
    public String getObsConsult(){
        return obsConsult;
    }
    
    public void setObsConsult(String obsConsult){
        this.obsConsult = obsConsult;
    }

    public Integer getId_medico() {
        return id_medico;
    }

    public void setId_medico(Integer id_medico) {
        this.id_medico = id_medico;
    }

    public String getEscpConsult() {
        return escpConsult;
    }

    public void setEscpConsult(String escpConsult) {
        this.escpConsult = escpConsult;
    }

    public Medic getMedico() {
        return medico;
    }

    public void setMedico(Medic medico) {
        this.medico = medico;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
    
}
