package com.appArgProg2.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import javax.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity 
@Table (name = "proyectos")
public class Proyectos {
    
    @Id
    @Column(name = "id_proyecto")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_proyecto;

    @Column(name = "nombre", nullable = false)
    private String nombre;

    @Column(name = "descripcion")
    private String descripcion;
    
    @ManyToOne
    @JoinColumn(name = "id_per")
    @JsonIgnore
    private Persona personaProy;

    public Proyectos() {
    }

    public Proyectos(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public Proyectos(String nombre, String descripcion, Persona personaProy) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.personaProy = personaProy;
    }
    
    

    public Long getId_proyecto() {
        return id_proyecto;
    }

    public void setId_proyecto(Long id_proyecto) {
        this.id_proyecto = id_proyecto;
    }
    
    
    
    
}
