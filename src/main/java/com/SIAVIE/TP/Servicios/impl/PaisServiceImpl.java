package com.SIAVIE.TP.Servicios.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import com.SIAVIE.TP.Entity.Pais;
import com.SIAVIE.TP.Repositorio.PaisJpaRepository;
import com.SIAVIE.TP.Servicios.PaisService;
import java.util.ArrayList;

@Service("PaisServiceImpl")
public class PaisServiceImpl implements PaisService {
    
    @Autowired
    @Qualifier("PaisJpaRepository")
    private PaisJpaRepository paisJpaRepository;    

    @Override
    public List<Pais> listaPaises() {
        List<Pais> app = new ArrayList<>();
        app = paisJpaRepository.findAll();
        return app;
    }
}
