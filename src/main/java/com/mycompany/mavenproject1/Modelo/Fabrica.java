/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.mavenproject1.Modelo;


import java.util.List;
import com.mycompany.mavenproject1.Controle.DataObject;

/**
 *
 * @author Matheus
 */
public interface Fabrica<K extends DataObject> {
    
    public boolean salvar(K obj);
    public boolean excluir(K obj);
    public List<K> listar();
    public K getEntidade(Integer obj);
}
