package com.appArgProg2.controller;

import com.appArgProg2.model.ExperienciaLaboral;
import com.appArgProg2.model.Persona;
import com.appArgProg2.service.ExpLaboralServiceIF;
import com.appArgProg2.service.PersonaServiceIF;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping ("/exp_laboral")
@CrossOrigin(origins = "http://localhost:4200",maxAge = 3600)
public class ControllerExpLaboral {
    
    @Autowired
    private ExpLaboralServiceIF expLabService;
    
    @Autowired
    private PersonaServiceIF persoService;
    
    
    @GetMapping("/listado")
    @ResponseBody
    public List <ExperienciaLaboral> listado(){
        return  expLabService.listarRegistros();
    }
    
    @PostMapping("/new")
    public void agregar (@RequestBody ExperienciaLaboral obj){
        long idPersona = 1;
        Persona objTemporal = persoService.registroPorId(idPersona);
        obj.setPersonaExpLab(objTemporal);
        
        expLabService.crearRegistro(obj);
    }
    
    @PutMapping("/update/{id}")
    public void actualizar (@RequestBody ExperienciaLaboral obj, @PathVariable("id") Long id){
        obj.setId_expLaboral(id);
        expLabService.actualizarRegistro(obj);
    }
    
    @DeleteMapping ("/delete/{id}")
    public void borrar (@PathVariable ("id") Long id){
        expLabService.borrarRegistro(id);
    } 
    
    @GetMapping("/{id}")
    public ExperienciaLaboral consultarPorId(@PathVariable("id") Long id){
        return  expLabService.registroPorId(id);
    }
    
    
}
