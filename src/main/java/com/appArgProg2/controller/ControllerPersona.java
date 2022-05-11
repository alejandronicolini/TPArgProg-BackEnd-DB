package com.appArgProg2.controller;

import com.appArgProg2.model.Persona;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.appArgProg2.service.PersonaServiceIF;


@RestController
@RequestMapping("/personas")
@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
public class ControllerPersona {

    @Autowired
    private PersonaServiceIF persoService;

    
//Distintas versiones de Metodo Get
/*    
    @GetMapping("/listado")
    @ResponseBody
    public List<Persona> listado() {
        List<Persona> listaClientes = new ArrayList<>();
        Iterable<Persona> customersAll = persoService.listarRegistros();
        for (Persona customer : customersAll) {
            listaClientes.add(customer);
        }
        return listaClientes;
    }*/
/*
    @GetMapping("/listado")
    @ResponseBody
    public ResponseEntity <List <Persona>> listado(){
        List <Persona> listaPersonas = new ArrayList<>();
        Iterable<Persona> personasAll = persoService.listarRegistros();
        for (Persona persona : personasAll) {
            listaPersonas.add(persona);
        }
        return new ResponseEntity<List<Persona>>(listaPersonas, HttpStatus.OK);
    }*/
/*    
     @GetMapping("/listado")
    @ResponseBody
    public ResponseEntity <List <Persona>> listado(){
        List <Persona> obj = persoService.listarRegistros();
        return new ResponseEntity <List<Persona>> (obj, HttpStatus.OK);
    }*/
    
    @GetMapping("/listado")
    @ResponseBody
    public List<Persona> listado() {
        return persoService.listarRegistros();
    } 
    
    @PostMapping("/new")
    public void agregar(@RequestBody Persona obj) { //el @RequestBody transforma el .json en objeto "obj"
        persoService.crearRegistro(obj);
    }

    @PutMapping("/update/{id}")
    public void actualizar(@RequestBody Persona obj, @PathVariable("id") Long id) {
        obj.setId_persona(id); //fundamental esta instruccion
        persoService.actualizarRegistro(obj);
    }

    @DeleteMapping("/delete/{id}")
    public void borrar(@PathVariable("id") Long id) {
        persoService.borrarRegistro(id);
    }

    @GetMapping("/{id}")
    public Persona consultarPorId(@PathVariable("id") Long id) {
        return persoService.registroPorId(id);
    }
    
    
    //Metodo Login usado al inicio del proyecto, luego se implemento el JWT (clase AuthController)
    /*
    @PostMapping ("/login")
    public Persona login (@RequestBody Persona objUsuario){
        List <Persona> listausuario = persoService.buscarUsuario_Password(objUsuario.getUsuario(), objUsuario.getPassword());

        if (!listausuario.isEmpty()) {
            return listausuario.get(0);
        }
        return null;
    }
    */
    

}
