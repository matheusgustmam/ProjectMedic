/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1.Controle;

/**
 *
 * @author Matheus
 */
public class Medic extends DataObject {

    //private int codigo;
    private String NomeDr;
    private String Especialidade;
     
    /*public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }*/

    public String getNomeDr() {
        return NomeDr;
    }

    public void setNomeDr(String NomeDr) {
        this.NomeDr = NomeDr;
    }

    public String getEspecialidade() {
        return Especialidade;
    }

    public void setEspecialidade(String Especialidade) {
        this.Especialidade = Especialidade;
    }
    
    public String toStirng(){
        return getNomeDr();
    }
    
}
