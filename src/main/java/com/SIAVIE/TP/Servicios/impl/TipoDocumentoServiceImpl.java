package com.SIAVIE.TP.Servicios.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import com.SIAVIE.TP.Entity.Tipo_Documento;
import com.SIAVIE.TP.Repositorio.TipoDocumentoJpaRepository;
import com.SIAVIE.TP.Servicios.TipoDocumentoService;
import java.util.ArrayList;

@Service("TipoDocumentoServiceImpl")
public class TipoDocumentoServiceImpl implements TipoDocumentoService {

    @Autowired
    @Qualifier("TipoDocumentoJpaRepository")
    private TipoDocumentoJpaRepository tipodocumentoJpaRepository;

    @Override
    public List<Tipo_Documento> listaTipoDocumento() {
        List<Tipo_Documento> app = new ArrayList<>();
        app = tipodocumentoJpaRepository.findAll();
        return app;
    }

}
