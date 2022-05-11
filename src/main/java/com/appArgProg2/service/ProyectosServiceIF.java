package com.appArgProg2.service;

import com.appArgProg2.model.Proyectos;
import java.util.List;

public interface ProyectosServiceIF {
    
    public List <Proyectos> listarRegistros();
    
    public void crearRegistro (Proyectos obj);
    
    public void actualizarRegistro (Proyectos obj);
    
    public void borrarRegistro (Long id);
    
    public Proyectos registroPorId (Long id);
    
}
