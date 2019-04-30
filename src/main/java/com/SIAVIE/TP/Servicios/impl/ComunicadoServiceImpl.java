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



/**
 *
 * @author Asus
 */
@Service("ComunicadoServiceImpl")
public class ComunicadoServiceImpl implements ComunicadoService {

    @Autowired
    @Qualifier("ComunicadoJpaRepository")
    private ComunicadoJpaRepository comunicadoJpaRepository;

    @Override
    public List<Comunicado> listarComunicados() {
        List<Comunicado> app = new ArrayList<>();
        app = comunicadoJpaRepository.findAll();
        return app;
    }

}
