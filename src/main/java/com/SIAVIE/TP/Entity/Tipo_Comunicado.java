/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.SIAVIE.TP.Entity;

import java.io.Serializable;
import javax.persistence.Table;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;

@Entity
@Table(name = "tipo_comunicado")
/**
 *
 * @author Asus
 */
public class Tipo_Comunicado implements Serializable {

    @Id
    @Column(name = "id_Tipo_Comunicado")
    @GeneratedValue
    private int id_Tipo_Comunicado;    
    
    @Column(name = "nombre_Tipo_Comunicado")
    private int nombre_Tipo_Comunicado;

    public int getId_Tipo_Comunicado() {
        return id_Tipo_Comunicado;
    }

    public void setId_Tipo_Comunicado(int id_Tipo_Comunicado) {
        this.id_Tipo_Comunicado = id_Tipo_Comunicado;
    }

    public int getNombre_Tipo_Comunicado() {
        return nombre_Tipo_Comunicado;
    }

    public void setNombre_Tipo_Comunicado(int nombre_Tipo_Comunicado) {
        this.nombre_Tipo_Comunicado = nombre_Tipo_Comunicado;
    }
    
}