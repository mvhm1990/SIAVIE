package com.SIAVIE.TP.Repositorio;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.SIAVIE.TP.Entity.Tipo_Documento;
import java.io.Serializable;

@Repository("TipoDocumentoJpaRepository")
public interface TipoDocumentoJpaRepository extends JpaRepository<Tipo_Documento, Serializable> {
    @Override
    public abstract List<Tipo_Documento> findAll();
}
