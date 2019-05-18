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
@Table(name = "estado_comunicado")
/**
 *
 * @author Asus
 */
public class Estado_Comunicado implements Serializable {

    @Id
    @Column(name = "id_Estado_Comunicado")
    @GeneratedValue
    private int id_Estado_Comunicado;

    @Column(name = "nombre_Estado_Comunicado")
    private int nombre_Estado_Comunicado;

    public int getId_Estado_Comunicado() {
        return id_Estado_Comunicado;
    }

    public void setId_Estado_Comunicado(int id_Estado_Comunicado) {
        this.id_Estado_Comunicado = id_Estado_Comunicado;
    }

    public int getNombre_Estado_Comunicado() {
        return nombre_Estado_Comunicado;
    }

    public void setNombre_Estado_Comunicado(int nombre_Estado_Comunicado) {
        this.nombre_Estado_Comunicado = nombre_Estado_Comunicado;
    }

}
