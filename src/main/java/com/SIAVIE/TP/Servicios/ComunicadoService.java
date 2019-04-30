/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.SIAVIE.TP.Servicios;
import com.SIAVIE.TP.Entity.Comunicado;
import java.util.List;
/**
 *
 * @author Asus
 */
public interface ComunicadoService {
    public abstract List<Comunicado> listarComunicados();
}
