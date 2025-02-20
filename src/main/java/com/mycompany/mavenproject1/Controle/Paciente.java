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
public class Paciente extends DataObject {
    
    private String nomeP;
    private String cpfP;
    private Date dataNscP; 
    private String telP;
    private int citiP;
    private String CitiSP;
    
    private String emailP;
     
    private String obsP;
    private String alergP;
    private String precaoAltaP;
    private String diabeteP;
    private String precaoBaixaP;
    
    
    public String getNome() {
        return nomeP;
    }

    public void setNome(String nomeP) {
        this.nomeP = nomeP;
    }

    public String getCpf() {
        return cpfP;
    }

    public void setCpf(String cpfP) {
        this.cpfP = cpfP;
    }

    public Date getDataNscP() {
        return dataNscP;
    }

    public void setDataNscP(Date dataNscP) {
        this.dataNscP = dataNscP;
    }

    public String getTel() {
        return telP;
    }

    public void setTel(String telP) {
        this.telP = telP;
    }

    public int getCidade() {
        return citiP;
    }
    public String getCidadeStr() {
        switch (citiP) {
            case 0:
                return "Palmas";
            case 1:
                return "Clevelandia";
            case 2:
                return "Cor Dumingo Soars";
            case 3:
                return "Manguerinha";
            default:
                return "--";
        }
    }
    public void setCidadeStr(String citiP){
        this.CitiSP = citiP;
    }
    
    public void setCidade(int citiP) {
        this.citiP = citiP;
    }

    public String getEmail() {
        return emailP;
    }

    public void setEmail(String emailP) {
        this.emailP = emailP;
    }

    public String getObs() {
        return obsP;
    }

    public void setObs(String obsP) {
        this.obsP = obsP;
    }

    public String getAlerg() {
        return alergP;
    }

    public void setAlerg(String alergP) {
        this.alergP = alergP;
    }

    public String getPrecaoAlti() {
        return precaoAltaP;
    }

    public void setPrecaoAlti(String precaoAltaP) {
        this.precaoAltaP = precaoAltaP;
    }

    public String getDiabe() {
        return diabeteP;
    }

    public void setDiabe(String diabeteP) {
        this.diabeteP = diabeteP;
    }

    public String getPrecaoBaixa() {
        return precaoBaixaP;
    }

    public void setPrecaoBaixa(String precaoBaixaP) {
        this.precaoBaixaP = precaoBaixaP;
    }

    @Override
    public String toString() {
        return "\nnome=" + nomeP + 
                "\nCPF=" + cpfP + 
                "\nidade=" + dataNscP + 
                "\ntele=" + telP + 
                "\ncidade=" + citiP + 
                "\nEmails=" + emailP + 
                "\nObs=" + obsP + 
                "\nalerg=" + alergP + 
                "\nprecaoAlti=" + precaoAltaP + 
                "\nDiabe=" + diabeteP + 
                "\nprecaoBaixa=" + precaoBaixaP + '}';
    }
     
     
       
}
