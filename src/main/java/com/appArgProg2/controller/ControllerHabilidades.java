package com.appArgProg2.controller;

import com.appArgProg2.model.Habilidades;
import com.appArgProg2.model.Persona;
import com.appArgProg2.service.HabilidadesServiceIF;
import com.appArgProg2.service.PersonaServiceIF;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping ("/habilidades")
@CrossOrigin(origins = "http://localhost:4200",maxAge = 3600)
public class ControllerHabilidades {
    
    @Autowired
    private HabilidadesServiceIF habilidadesService;
    
    @Autowired
    private PersonaServiceIF persoService;
    
    
    @GetMapping("/listado")
    @ResponseBody
    public List <Habilidades> listado(){
        return  habilidadesService.listarRegistros();
    }
    
    @PostMapping("/new")
    public void agregar (@RequestBody Habilidades obj){
        long idPersona = 1;
        Persona objTemporal = persoService.registroPorId(idPersona);
        obj.setPersonaHabilidad(objTemporal);
        
        habilidadesService.crearRegistro(obj);
    }
    
    @PutMapping("/update/{id}")
    public void actualizar (@RequestBody Habilidades obj, @PathVariable("id") Long id){
        obj.setId_habilidad(id);
        habilidadesService.actualizarRegistro(obj);
    }
    
    @DeleteMapping ("/delete/{id}")
    public void borrar (@PathVariable ("id") Long id){
        habilidadesService.borrarRegistro(id);
    } 
    
    @GetMapping("/{id}")
    public Habilidades consultarPorId(@PathVariable("id") Long id){
        return  habilidadesService.registroPorId(id);
    }
    
}
