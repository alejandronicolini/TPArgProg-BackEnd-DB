package com.appArgProg2.repository;

import com.appArgProg2.model.ExperienciaLaboral;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IExpLaboralRepository  extends JpaRepository<ExperienciaLaboral, Long>{
    
}
