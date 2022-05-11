package com.appArgProg2.service;

import com.appArgProg2.model.ExperienciaLaboral;
import com.appArgProg2.repository.IExpLaboralRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExpLaboralServiceImpl  implements  ExpLaboralServiceIF{

    @Autowired
    public IExpLaboralRepository  tablaRepo;
    
    @Override
    public List<ExperienciaLaboral> listarRegistros() {
        return tablaRepo.findAll();
    }

    @Override
    public void crearRegistro(ExperienciaLaboral obj) {
        tablaRepo.save(obj);
    }

    @Override
    public void actualizarRegistro(ExperienciaLaboral obj) {
        tablaRepo.save(obj);
    }

    @Override
    public void borrarRegistro(Long id) {
        tablaRepo.deleteById(id);
    }

    @Override
    public ExperienciaLaboral registroPorId(Long id) {
        return tablaRepo.findById(id).orElse(null);
    }
    
}
