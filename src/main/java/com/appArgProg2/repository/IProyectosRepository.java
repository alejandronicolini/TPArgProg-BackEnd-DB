package com.appArgProg2.repository;

import com.appArgProg2.model.Proyectos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProyectosRepository  extends  JpaRepository<Proyectos, Long>{
    
}
