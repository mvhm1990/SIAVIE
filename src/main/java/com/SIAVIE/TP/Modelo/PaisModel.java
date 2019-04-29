package com.SIAVIE.TP.Modelo;

public class PaisModel {

    private int id_Pais;
    private String Nombre_Pais;

    public PaisModel(int id_Pais, String Nombre_Pais) {
        this.id_Pais = id_Pais;
        this.Nombre_Pais = Nombre_Pais;
    }

    public int getId_Pais() {
        return id_Pais;
    }

    public void setId_Pais(int id_Pais) {
        this.id_Pais = id_Pais;
    }

    public String getNombre_Pais() {
        return Nombre_Pais;
    }

    public void setNombre_Pais(String Nombre_Pais) {
        this.Nombre_Pais = Nombre_Pais;
    }

    public PaisModel() {
    }
}
