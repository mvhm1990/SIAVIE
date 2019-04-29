package com.SIAVIE.TP.Repositorio;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.SIAVIE.TP.Entity.Pais;
import java.io.Serializable;

@Repository("PaisJpaRepository")
public interface PaisJpaRepository extends JpaRepository<Pais, Serializable>{
    @Override
    public abstract List<Pais> findAll();
}
