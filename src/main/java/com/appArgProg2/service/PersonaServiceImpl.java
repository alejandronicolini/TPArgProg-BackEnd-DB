package com.appArgProg2.service;

import com.appArgProg2.model.Persona;
import com.appArgProg2.repository.IPersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaServiceImpl implements  PersonaServiceIF{
     
    @Autowired      //inyectar la dependencia JpaRepositorio con: @Autowired
    public IPersonaRepository tablaRepo;    //al instanciar la clase IPersonaRepository, puedo usar los metodos de JpaRepository
   
    //Implementacion de los metodos de la Interfase "PersonaServiceIF"
    @Override
    public List<Persona> listarRegistros() {
        return tablaRepo.findAll();
    }

    @Override
    public void crearRegistro(Persona obj) {
        tablaRepo.save(obj);
    }
    
    @Override
    public void actualizarRegistro(Persona obj) {
        tablaRepo.save(obj);
    }
    
    @Override
    public void borrarRegistro(Long id) {
        tablaRepo.deleteById(id);
    }

    @Override
    public Persona registroPorId(Long id) {
        return tablaRepo.findById(id).orElse(null);
    }

    /*(lo use al inicio, previo a la implementacion de JWT)
    @Override
    public List<Persona> buscarUsuario_Password(String usuario, String password) {
        return tablaRepo.findByUsuarioAndPassword(usuario, password);
    }
*/

    
    
}
