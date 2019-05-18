/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.SIAVIE.TP.Servicios.impl;

import com.SIAVIE.TP.Entity.Comunicado;
import com.SIAVIE.TP.Repositorio.ComunicadoJpaRepository;
import com.SIAVIE.TP.Servicios.ComunicadoService;
import java.util.List;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;




@Service("ComunicadoServiceImpl")
public class ComunicadoServiceImpl implements ComunicadoService {

    @Autowired
    @Qualifier("ComunicadoJpaRepository")
    private ComunicadoJpaRepository comunicadoJpaRepository;

    @Override
    public List<Comunicado> listarComunicados() {
        List<Comunicado> listacomunicados ;
        listacomunicados = comunicadoJpaRepository.findAll();
        return listacomunicados;
    }

    @Override
    public Comunicado obtenerEncabezado(String encabezado) {
        return comunicadoJpaRepository.findByEncabezado(encabezado);
    }

    @Override
    public List<Comunicado> obtenerListaPorFecha(String fecha_Creacion) {
        return comunicadoJpaRepository.findAllByFecha_Creacion(fecha_Creacion);
    }

}
