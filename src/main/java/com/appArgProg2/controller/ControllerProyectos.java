package com.appArgProg2.controller;

import com.appArgProg2.model.Persona;
import com.appArgProg2.model.Proyectos;
import com.appArgProg2.service.PersonaServiceIF;
import com.appArgProg2.service.ProyectosServiceIF;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping ("/proyectos")
@CrossOrigin(origins = "http://localhost:4200",maxAge = 3600)
public class ControllerProyectos {
    
    @Autowired
    private ProyectosServiceIF proyectosService;
    
    @Autowired
    private PersonaServiceIF persoService;
    
    
    @GetMapping("/listado")
    @ResponseBody
    public List <Proyectos> listado(){
        return  proyectosService.listarRegistros();
    }
    
    @PostMapping("/new")
    public void agregar (@RequestBody Proyectos obj){
        long idPersona = 1;
        Persona objTemporal = persoService.registroPorId(idPersona);
        obj.setPersonaProy(objTemporal);
        
        proyectosService.crearRegistro(obj);
    }
    
    @PutMapping("/update/{id}")
    public void actualizar (@RequestBody Proyectos obj, @PathVariable("id") Long id){
        obj.setId_proyecto(id);
        proyectosService.actualizarRegistro(obj);
    }
    
    @DeleteMapping ("/delete/{id}")
    public void borrar (@PathVariable ("id") Long id){
        proyectosService.borrarRegistro(id);
    } 
    
    @GetMapping("/{id}")
    public Proyectos consultarPorId(@PathVariable("id") Long id){
        return  proyectosService.registroPorId(id);
    }
    
    
    
    
}
