package com.appArgProg2.model;

import java.util.List;
import javax.persistence.*;
import lombok.Getter;
import lombok.Setter;


//@JsonIdentityInfo(generator=ObjectIdGenerators.UUIDGenerator.class, property="@id")
@Setter @Getter
@Entity
@Table(name = "persona") //nombre de la tabla en la BD
public class Persona {
    
    @Id
    @Column(name = "id_persona")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_persona;

    @Column(name = "nombre", nullable = false)
    private String nombre;

    @Column(name = "apellido", nullable = false)
    private String apellido;
    
    @Column(name = "email", nullable = false)
    private String email;
    
    /*
    @Column(name = "usuario", nullable = false)
    private String usuario;
    
    @Column (name = "password", nullable = false)
    private String password;
    */

    
    @OneToMany(mappedBy = "personaEducacion", cascade=CascadeType.ALL)
    private List<Educacion> educacionLista; // "personaeducacion" es el atributo de la clase Educacion
    
    @OneToMany(mappedBy = "personaExpLab", cascade = CascadeType.ALL)
    private List<ExperienciaLaboral> expLaboralLista;

    @OneToMany(mappedBy = "personaHabilidad", cascade = CascadeType.ALL)
    private List<Habilidades> habilidadesLista;

    @OneToMany(mappedBy = "personaProy", cascade = CascadeType.ALL)
    private List<Proyectos> proyectosLista;
    
    @OneToOne (mappedBy = "personaInfo", cascade = CascadeType.ALL)
    private  InfoPersonal infoPer;

    //Constructores
    public Persona() {
    }

    public Persona(String nombre, String apellido, String email, List<Educacion> educacionLista, List<ExperienciaLaboral> expLaboralLista, List<Habilidades> habilidadesLista, List<Proyectos> proyectosLista, InfoPersonal infoPer) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.educacionLista = educacionLista;
        this.expLaboralLista = expLaboralLista;
        this.habilidadesLista = habilidadesLista;
        this.proyectosLista = proyectosLista;
        this.infoPer = infoPer;
    }

    
    //Getters y Setters uso Lombok
   
     public Long getId_persona() {
        return id_persona;
    }

    public void setId_persona(Long idPersona) {
        this.id_persona = idPersona;
    }

    //Metodos
//    public void addExpLaboral(ExperienciaLaboral objExpLaboral) {
//        if (expLaboralLista == null) {
//            expLaboralLista = new ArrayList<>();
//        }
//        this.expLaboralLista.add(objExpLaboral);
//        objExpLaboral.setPersonaExpLab(this);
//    }
//
//    public void removeExpLaboral(ExperienciaLaboral objExpLaboral) {
//        this.expLaboralLista.remove(objExpLaboral);
//        objExpLaboral.setPersonaExpLab(null);
//    }

//    public void addEducacion(Educacion objEducacion) {
//        if (educacionLista == null) {
//            educacionLista = new ArrayList<>(); //instancio la lista si no existe
//        }
//        this.educacionLista.add(objEducacion); //agrego objEducacion a la lista
//        objEducacion.setPersonaEduc(this); //seteo a la Persona en la clase Educacion
//    }
//
//    public void removeEducacion(Educacion objEducacion) {
//        this.educacionLista.remove(objEducacion);
//        objEducacion.setPersonaEduc(null);
//    }

//    public void addProyecto(Proyectos objProyecto) {
//        if (proyectosLista == null) {
//            proyectosLista = new ArrayList<>();
//        }
//        this.proyectosLista.add(objProyecto);
//        objProyecto.setPersonaProy(this);
//    }
//
//    public void removeProyecto(Proyectos objProyecto) {
//        this.proyectosLista.remove(objProyecto);
//        objProyecto.setPersonaProy(null);
//    }
//
//    public void addHablidad(Habilidades objHabilidad) {
//        if (habilidadesLista == null) {
//            habilidadesLista = new ArrayList<>();
//        }
//        this.habilidadesLista.add(objHabilidad);
//        objHabilidad.setPersonaHab(this);
//    }
//
//    public void removeHablidad(Habilidades objHabilidad) {
//        this.habilidadesLista.remove(objHabilidad);
//        objHabilidad.setPersonaHab(null);
//    }

   

    
}
