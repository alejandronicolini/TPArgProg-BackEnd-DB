package com.appArgProg2.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import javax.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
@Table(name = "experiencia_laboral")
public class ExperienciaLaboral {
    
     @Id
    @Column(name = "id_expLaboral")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_expLaboral;

    @Column(name = "puesto", nullable = false)
    private String puesto;

    @Column(name = "empresa", nullable = false)
    private String empresa;

    @Column(name = "fecha_inicio", nullable = false, length = 10)
    private int fecha_inicio;
    
    @Column(name = "fecha_fin", nullable = false, length = 10)
    private int fecha_fin;
    
    @Lob
    @Column(name = "img_logo", columnDefinition = "LONGTEXT")
    private String img_logo;

    @ManyToOne
    @JoinColumn(name = "id_per")
    @JsonIgnore
    private Persona personaExpLab;
    
    
    public ExperienciaLaboral() {
    }

    public ExperienciaLaboral(String puesto, String empresa, int fecha_inicio, int fecha_fin, String img_logo) {
        this.puesto = puesto;
        this.empresa = empresa;
        this.fecha_inicio = fecha_inicio;
        this.fecha_fin = fecha_fin;
        this.img_logo = img_logo;
    }

    public ExperienciaLaboral(String puesto, String empresa, int fecha_inicio, int fecha_fin, String img_logo, Persona personaExpLab) {
        this.puesto = puesto;
        this.empresa = empresa;
        this.fecha_inicio = fecha_inicio;
        this.fecha_fin = fecha_fin;
        this.img_logo = img_logo;
        this.personaExpLab = personaExpLab;
    }
    
    

    public Long getId_expLaboral() {
        return id_expLaboral;
    }

    public void setId_expLaboral(Long id_expLaboral) {
        this.id_expLaboral = id_expLaboral;
    }
    
    
    
    
    
}
