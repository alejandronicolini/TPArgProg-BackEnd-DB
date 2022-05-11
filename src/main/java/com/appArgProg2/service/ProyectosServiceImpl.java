package com.appArgProg2.service;

import com.appArgProg2.model.Proyectos;
import com.appArgProg2.repository.IProyectosRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProyectosServiceImpl implements ProyectosServiceIF{

    @Autowired
    public IProyectosRepository tablaRepo;

    @Override
    public List<Proyectos> listarRegistros() {
        return  tablaRepo.findAll();
    }

    @Override
    public void crearRegistro(Proyectos obj) {
        tablaRepo.save(obj);
    }

    @Override
    public void actualizarRegistro(Proyectos obj) {
        tablaRepo.save(obj);
    }

    @Override
    public void borrarRegistro(Long id) {
        tablaRepo.deleteById(id);
    }

    @Override
    public Proyectos registroPorId(Long id) {
        return tablaRepo.findById(id).orElse(null);
    }
  
    
}
