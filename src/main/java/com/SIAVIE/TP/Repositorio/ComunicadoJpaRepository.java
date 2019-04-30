/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.SIAVIE.TP.Repositorio;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.SIAVIE.TP.Entity.Comunicado;
import java.io.Serializable;
import org.springframework.stereotype.Repository;
/**
 *
 * @author Asus
 */
@Repository("ComunicadoJpaRepository")
public interface ComunicadoJpaRepository extends JpaRepository<Comunicado, Serializable> {
    @Override
    
    public abstract List<Comunicado> findAll();
}
