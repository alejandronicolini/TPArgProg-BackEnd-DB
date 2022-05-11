package com.appArgProg2.service;

import com.appArgProg2.model.Persona;
import java.util.List;


public interface PersonaServiceIF {
    
    //declaro los metodos a implementar en la clase PersonaServiceImpl
    
    public List <Persona> listarRegistros();
    
    public void crearRegistro (Persona obj);
    
    public void actualizarRegistro (Persona obj);
    
    public void borrarRegistro (Long id);
    
    public Persona registroPorId (Long id);
     
    //public List <Persona> buscarUsuario_Password(String usuario, String password); //(lo use al inicio, previo a la implementacion de JWT)
    
}
