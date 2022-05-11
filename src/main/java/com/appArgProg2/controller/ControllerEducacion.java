package com.appArgProg2.controller;

import com.appArgProg2.model.Educacion;
import com.appArgProg2.model.Persona;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.appArgProg2.service.EducacionServiceIF;
import com.appArgProg2.service.PersonaServiceIF;


@RestController
@RequestMapping ("/educacion")
@CrossOrigin(origins = "http://localhost:4200",maxAge = 3600)
public class ControllerEducacion {
    
    @Autowired
    private EducacionServiceIF educaService;
    
    @Autowired
    private PersonaServiceIF persoService;
    
    
    @GetMapping("/listado")
    @ResponseBody
    public List <Educacion> listado(){
        return  educaService.listarRegistros();
    }
    
    //@PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/new")
    public void agregar (@RequestBody Educacion obj){
        //Persona objTemporal = new Persona();
        long idPersona = 1;
        Persona objTemporal = persoService.registroPorId(idPersona); //llamo a la persona de la tabla Persona
        obj.setPersonaEducacion(objTemporal); //le seteo la persona el objeto que viene del FronEnd con 
                
        educaService.crearRegistro(obj);
    }
    
    //@PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/update/{id}")
    public void actualizar (@RequestBody Educacion obj, @PathVariable("id") Long id){
        obj.setId_educacion(id);
        educaService.actualizarRegistro(obj);
    }
    
    //@PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping ("/delete/{id}")
    public void borrar (@PathVariable ("id") Long id){
        educaService.borrarRegistro(id);
    } 
    
    @GetMapping("/{id}")
    public Educacion consultarPorId(@PathVariable("id") Long id){
        return  educaService.registroPorId(id);
    }
    
    
    
}
