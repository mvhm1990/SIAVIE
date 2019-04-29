package com.SIAVIE.TP.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pais")
public class Pais {

    @Id
    @Column(name = "id_Pais") 
    @GeneratedValue
    private int Id_Pais;
    @Column(name = "nombre_Pais")
    private String Nombre_Pais;

    public int getId_Pais() {
        return Id_Pais;
    }

    public void setId_Pais(int Id_Pais) {
        this.Id_Pais = Id_Pais;
    }

    public String getNombre_Pais() {
        return Nombre_Pais;
    }

    public void setNombre_Pais(String Nombre_Pais) {
        this.Nombre_Pais = Nombre_Pais;
    }

    public Pais(int Id_Pais, String Nombre_Pais) {
        this.Id_Pais = Id_Pais;
        this.Nombre_Pais = Nombre_Pais;
    }
     public Pais(){}
}
