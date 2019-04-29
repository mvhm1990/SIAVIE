package com.SIAVIE.TP.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tipo_documento")
public class Tipo_Documento {

    @Id
    @Column(name = "id_Tipo_Documento")
    @GeneratedValue
    private int Id_Tipo_Documento;
    @Column(name = "nombre_Tipo_Documento")
    private String Nombre_Tipo_Documento;

    public int getId_Tipo_Documento() {
        return Id_Tipo_Documento;
    }

    public void setId_Tipo_Documento(int Id_Tipo_Documento) {
        this.Id_Tipo_Documento = Id_Tipo_Documento;
    }

    public String getNombre_Tipo_Documento() {
        return Nombre_Tipo_Documento;
    }

    public void setNombre_Tipo_Documento(String Nombre_Tipo_Documento) {
        this.Nombre_Tipo_Documento = Nombre_Tipo_Documento;
    }

    public Tipo_Documento(int Id_Tipo_Documento, String Nombre_Tipo_Documento) {
        this.Id_Tipo_Documento = Id_Tipo_Documento;
        this.Nombre_Tipo_Documento = Nombre_Tipo_Documento;
    }
    public Tipo_Documento(){}
}
