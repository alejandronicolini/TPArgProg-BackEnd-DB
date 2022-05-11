package com.appArgProg2.service;

import com.appArgProg2.model.InfoPersonal;
import com.appArgProg2.repository.IInfoPersonalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class InfoPersonalServiceImpl  implements InfoPersonalServiceIF{

    @Autowired
    public IInfoPersonalRepository tablaRepo;
    
    
    @Override
    public void crearRegistro(InfoPersonal obj) {
        tablaRepo.save(obj);
    }

    @Override
    public void actualizarRegistro(InfoPersonal obj) {
        tablaRepo.save(obj);
        
    }

    @Override
    public void borrarRegistro(Long id) {
        tablaRepo.deleteById(id);
    }

    @Override
    public InfoPersonal registroPorId(Long id) {
        return tablaRepo.findById(id).orElse(null);
    }
    
}
