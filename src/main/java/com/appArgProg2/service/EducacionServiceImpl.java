package com.appArgProg2.service;

import com.appArgProg2.model.Educacion;
import com.appArgProg2.repository.IEducacionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EducacionServiceImpl implements EducacionServiceIF {
    
    @Autowired
    public IEducacionRepository tablaRepo;

    @Override
    public List<Educacion> listarRegistros() {
        return  tablaRepo.findAll();
    }

    @Override
    public void crearRegistro(Educacion obj) {
        tablaRepo.save(obj);
    }

    @Override
    public void actualizarRegistro(Educacion obj) {
        tablaRepo.save(obj);
    }

    @Override
    public void borrarRegistro(Long id) {
        tablaRepo.deleteById(id);
    }

    @Override
    public Educacion registroPorId(Long id) {
        return tablaRepo.findById(id).orElse(null);
    }

  
    
    
    
}
