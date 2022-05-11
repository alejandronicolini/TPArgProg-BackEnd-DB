package com.appArgProg2.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import javax.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity 
@Table (name = "habilidades")
public class Habilidades {
    
    @Id
    @Column(name = "id_habilidad")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_habilidad;

    @Column(name = "habilidad", nullable = false)
    private String habilidad;

    @Column(name = "conocimiento", nullable = false)
    private String conocimiento;
    
    @Lob
    @Column(name = "img_logo", columnDefinition = "LONGTEXT")
    private String img_logo;
    
    @ManyToOne
    @JoinColumn(name = "id_per")
    @JsonIgnore
    private Persona personaHabilidad;
    

    public Habilidades() {
    }

    public Habilidades(String habilidad, String conocimiento) {
        this.habilidad = habilidad;
        this.conocimiento = conocimiento;
    }

    public Habilidades(String habilidad, String conocimiento, String img_logo, Persona personaHabilidad) {
        this.habilidad = habilidad;
        this.conocimiento = conocimiento;
        this.img_logo = img_logo;
        this.personaHabilidad = personaHabilidad;
    }
    
    
    public Long getId_habilidad() {
        return id_habilidad;
    }

    public void setId_habilidad(Long id_habilidad) {
        this.id_habilidad = id_habilidad;
    }
    
    
    
    
}
