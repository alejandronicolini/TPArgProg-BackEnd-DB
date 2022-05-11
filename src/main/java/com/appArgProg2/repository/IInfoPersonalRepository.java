package com.appArgProg2.repository;

import com.appArgProg2.model.InfoPersonal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IInfoPersonalRepository  extends JpaRepository<InfoPersonal, Long>{
    
}
