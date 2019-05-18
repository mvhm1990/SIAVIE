/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.SIAVIE.TP.apis;

import com.SIAVIE.TP.Entity.Comunicado;
import com.SIAVIE.TP.Servicios.impl.ComunicadoServiceImpl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("/apis")
public class ApiComunicado {

    @Autowired
    @Qualifier("ComunicadoServiceImpl")
    ComunicadoServiceImpl ComunicadoServiceImpl;

//    @PostMapping("/listar")
//    public List<Comunicado> listar(@RequestBody Comunicado comunicado) {
//       return  ComunicadoServiceImpl.obtenerListaPorFecha(comunicado.getFecha_Creacion());
//    }
}
