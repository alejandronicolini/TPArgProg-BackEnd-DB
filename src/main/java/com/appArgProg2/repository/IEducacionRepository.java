package com.appArgProg2.repository;

import com.appArgProg2.model.Educacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEducacionRepository extends  JpaRepository<Educacion, Long>{

    
    
}
