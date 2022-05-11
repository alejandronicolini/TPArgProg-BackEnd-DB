package com.appArgProg2.service;

import com.appArgProg2.model.Habilidades;
import com.appArgProg2.repository.IHabilidadesRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HabilidadesServiceImpl implements HabilidadesServiceIF{
    
    @Autowired
    public IHabilidadesRepository tablaRepo;

    @Override
    public List<Habilidades> listarRegistros() {
        return tablaRepo.findAll();
    }

    @Override
    public void crearRegistro(Habilidades obj) {
        tablaRepo.save(obj);
    }

    @Override
    public void actualizarRegistro(Habilidades obj) {
        tablaRepo.save(obj);
    }

    @Override
    public void borrarRegistro(Long id) {
        tablaRepo.deleteById(id);
    }

    @Override
    public Habilidades registroPorId(Long id) {
        return tablaRepo.findById(id).orElse(null);
    }
    
}
