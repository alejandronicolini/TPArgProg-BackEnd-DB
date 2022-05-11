package com.appArgProg2.repository;

import com.appArgProg2.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPersonaRepository extends  JpaRepository<Persona, Long>{ //  <objeto a persistir, tipo de dato>
    
     //creo el metodo para hacer la consulta del login (lo use al inicio, previo a la implementacion de JWT)
    //public List <Persona> findByUsuarioAndPassword(String usuario, String password); //CorreoAndPassword son los campos de la tabla Persona. Debe escribise igual a como esta alli
    
    
    
}
