package com.appArgProg2.repository;

import com.appArgProg2.model.Habilidades;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IHabilidadesRepository  extends  JpaRepository<Habilidades, Long>{
    
}
