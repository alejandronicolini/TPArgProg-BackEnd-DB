package com.appArgProg2.controller;

import com.appArgProg2.model.InfoPersonal;
import com.appArgProg2.model.Persona;
import com.appArgProg2.service.InfoPersonalServiceIF;
import com.appArgProg2.service.PersonaServiceIF;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping ("/info_personal")
@CrossOrigin(origins = "http://localhost:4200",maxAge = 3600)
public class ControllerInfoPersonal {
    
    @Autowired
    private InfoPersonalServiceIF infoPersonalService;
    
    @Autowired
    private PersonaServiceIF persoService;
    
//    @GetMapping("/listado")
//    @ResponseBody
//    public List <InfoPersonal> listado(){
//        return  infoPersonalService.listarRegistros();
//    }
    
    @PostMapping("/new")
    public void agregar (@RequestBody InfoPersonal obj){
        long idPersona = 1;
        Persona objTemporal = persoService.registroPorId(idPersona);
        obj.setPersonaInfo(objTemporal);
        
        infoPersonalService.crearRegistro(obj);
    }
    
    @PutMapping("/update/{id}")
    public void actualizar (@RequestBody InfoPersonal obj, @PathVariable("id") Long id){
        obj.setId_infoPersonal(id);
        infoPersonalService.actualizarRegistro(obj);
    }
    
//    @DeleteMapping ("/delete/{id}")
//    public void borrar (@PathVariable ("id") Long id){
//        infoPersonalService.borrarRegistro(id);
//    } 
    
    @GetMapping("/{id}")
    public InfoPersonal consultarPorId(@PathVariable("id") Long id){
        return  infoPersonalService.registroPorId(id);
    }



    
}
