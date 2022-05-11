package com.appArgProg2.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import javax.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Getter @Setter
@Entity 
@Table (name = "educacion")
public class Educacion {
    
    @Id
    @Column(name = "id_educacion")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_educacion;

    @Column(name = "institucion", nullable = false)
    private String institucion;

    @Column(name = "titulo", nullable = false)
    private String titulo;

    @Column(name = "fecha_inicio", nullable = false, length = 10)
    private int fecha_inicio;
    
    @Column(name = "fecha_fin", nullable = false, length = 10)
    private int fecha_fin;

    @Lob
    @Column(name = "img_logo", columnDefinition = "LONGTEXT") //o probar: columnDefinition="LONGTEXT" , o  MEDIUMTEXT "NVARCHAR(MAX)"
    private String img_logo;
        
    @ManyToOne
    @JoinColumn(name = "id_per")
    @JsonIgnore
    private Persona personaEducacion;
    

//    @ManyToOne (optional = false, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//    @JoinColumn(name = "id_per")
//    private Persona personaEducacion;
    
    
    //Constructores
    public Educacion() {
    }

    public Educacion(String institucion, String titulo, int fecha_inicio, int fecha_fin, String img_logo) {
        this.institucion = institucion;
        this.titulo = titulo;
        this.fecha_inicio = fecha_inicio;
        this.fecha_fin = fecha_fin;
        this.img_logo = img_logo;
    }

    public Educacion(String institucion, String titulo, int fecha_inicio, int fecha_fin, String img_logo, Persona personaEducacion) {
        this.institucion = institucion;
        this.titulo = titulo;
        this.fecha_inicio = fecha_inicio;
        this.fecha_fin = fecha_fin;
        this.img_logo = img_logo;
        this.personaEducacion = personaEducacion;
    }
    

    
    public Long getId_educacion() {
        return id_educacion;
    }

    public void setId_educacion(Long id_educacion) {
        this.id_educacion = id_educacion;
    }

	
    
}
