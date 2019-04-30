/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.SIAVIE.TP.Modelo;

/**
 *
 * @author Asus
 */
public class ComunicadoModel {
    private Integer idComunicado;
    private Integer idEstadoComunicado;
    private Integer idTipoComunicado;
    private String especificacionComunicado;
    private String titulo; 
    private byte imagen;

    public ComunicadoModel(Integer idComunicado,Integer idEstadoComunicado,Integer idTipoComunicado,String especificacionComunicado,String titulo,byte imagen){
        this.idComunicado=idComunicado;
        this.idEstadoComunicado=idEstadoComunicado;
        this.idTipoComunicado=idTipoComunicado;
        this.especificacionComunicado=especificacionComunicado;
        this.titulo=titulo;
        this.imagen=imagen;
    }
    
    public Integer getIdComunicado() {
        return idComunicado;
    }
    public void setIdComunicado(Integer idComunicado) {
        this.idComunicado = idComunicado;
    }
    public Integer getIdEstadoComunicado() {
        return idEstadoComunicado;
    }
    public void setIdEstadoComunicado(Integer idEstadoComunicado) {
        this.idEstadoComunicado = idEstadoComunicado;
    }
    public Integer getIdTipoComunicado() {
        return idTipoComunicado;
    }
    public void setIdTipoComunicado(Integer idTipoComunicado) {
        this.idTipoComunicado = idTipoComunicado;
    }

    public String getEspecificacionComunicado() {
        return especificacionComunicado;
    }
    public void setEspecificacionComunicado(String especificacionComunicado) {
        this.especificacionComunicado = especificacionComunicado;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

   public byte getImagen() {
        return imagen;
    }
    public void setImagen(byte imagen) {
        this.imagen = imagen;
    }
    public ComunicadoModel(){
        
    }
    
}
