package com.appArgProg2.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import javax.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity 
@Table (name = "info_personal")
public class InfoPersonal {
    
    @Id
    @Column(name = "id_infopersonal")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_infoPersonal;

    @Column(name = "fechaNacimiento", nullable = false)
    private String fechaNacimiento;
    
    @Column(name = "edad", nullable = false)
    private int edad;
    
    @Column(name = "domicilio", nullable = false)
    private String domicilio;
    
    @Column(name = "telefono", nullable = false)
    private String telefono;
    
    @Column(name = "puesto_actual", nullable = false)
    private String puesto_actual;
    
    @Column(name = "acerca_de", nullable = false)
    private String acerca_de;
    
    @Column(name = "twitter", nullable = false)
    private String twitter;
    
    @Column(name = "facebook", nullable = false)
    private String facebook;
    
    @Column(name = "linkedin", nullable = false)
    private String linkedin;
    
    @Column(name = "github", nullable = false)
    private String github;
    
    @Column(name = "instagram", nullable = false)
    private String instagram;
    
    @Column(name = "blog", nullable = false)
    private String blog;
    
    @OneToOne
    @JoinColumn(name = "id_per")
    @JsonIgnore
    private Persona personaInfo;

    public InfoPersonal() {
    }
    
    public InfoPersonal(String fechaNacimiento, int edad, String domicilio, String telefono, String puesto_actual, String acerca_de, String twitter, String facebook, String linkedin, String github, String instagram, String blog) {
        this.fechaNacimiento = fechaNacimiento;
        this.edad = edad;
        this.domicilio = domicilio;
        this.telefono = telefono;
        this.puesto_actual = puesto_actual;
        this.acerca_de = acerca_de;
        this.twitter = twitter;
        this.facebook = facebook;
        this.linkedin = linkedin;
        this.github = github;
        this.instagram = instagram;
        this.blog = blog;
    }

    public InfoPersonal(String fechaNacimiento, int edad, String domicilio, String telefono, String puesto_actual, String acerca_de, String twitter, String facebook, String linkedin, String github, String instagram, String blog, Persona personaInfo) {
        this.fechaNacimiento = fechaNacimiento;
        this.edad = edad;
        this.domicilio = domicilio;
        this.telefono = telefono;
        this.puesto_actual = puesto_actual;
        this.acerca_de = acerca_de;
        this.twitter = twitter;
        this.facebook = facebook;
        this.linkedin = linkedin;
        this.github = github;
        this.instagram = instagram;
        this.blog = blog;
        this.personaInfo = personaInfo;
    }
    
    

    public Long getId_infoPersonal() {
        return id_infoPersonal;
    }

    public void setId_infoPersonal(Long id_infoPersonal) {
        this.id_infoPersonal = id_infoPersonal;
    }
    
    
}
