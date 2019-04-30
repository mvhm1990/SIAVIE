/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.SIAVIE.TP.Entity;
import javax.persistence.Table;
import javax.persistence.Entity;
 import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
    @Entity
    @Table (name="comunicado")
/**
 *
 * @author Asus
 */
public class Comunicado {
 @Id
   @Column(name = "Id_Comunicado")
   @GeneratedValue
   private int Id_Comunicado;
   @Column(name="Id_Estado_Comunicado")
   private int Id_Estado_Comunicado;
   @Column(name="Id_Tipo_Comunicado")
   private int Id_Tipo_Comunicado;
   @Column (name="Especificacion_Comunicado")
   private String Especificacion_Comunicado;
   @Column (name="Titulo")
   private String Titulo;
   @Column (name="Imagen")
   private byte Imagen;
    /**
     * @return the Especificacion_Comunicado
     */
    public String getEspecificacion_Comunicado() {
        return Especificacion_Comunicado;
    }

    public void setEspecificacion_Comunicado(String Especificacion_Comunicado) {
        this.Especificacion_Comunicado = Especificacion_Comunicado;
    }
  
   
    public int getId_Comunicado() {
        return Id_Comunicado;
    }
    public void setId_Comunicado(int Id_Comunicado) {
        this.Id_Comunicado = Id_Comunicado;
    }

   
    public int getId_Estado_Comunicado() {
        return Id_Estado_Comunicado;
    }

   
    public void setId_Estado_Comunicado(int Id_Estado_Comunicado) {
        this.Id_Estado_Comunicado = Id_Estado_Comunicado;
    }

    public int getId_Tipo_Comunicado() {
        return Id_Tipo_Comunicado;
    }

    public void setId_Tipo_Comunicado(int Id_Tipo_Comunicado) {
        this.Id_Tipo_Comunicado = Id_Tipo_Comunicado;
    }
    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public byte getImagen() {
        return Imagen;
    }

    public void setImagen(byte Imagen) {
        this.Imagen = Imagen;
    }
   public Comunicado(int Id_Comunicado, int Id_Estado_Comunicado, int Id_Tipo_Comunicado,String Especificacion_Comunicado,String Titulo,byte Imagen)
   {super();
   this.Id_Comunicado = Id_Comunicado;
   this.Id_Estado_Comunicado = Id_Estado_Comunicado;
   this.Id_Tipo_Comunicado=Id_Tipo_Comunicado;
   this.Especificacion_Comunicado= Especificacion_Comunicado;
   this.Titulo=Titulo;
   this.Imagen=Imagen;
   }
   public Comunicado(){}
   
   
}
