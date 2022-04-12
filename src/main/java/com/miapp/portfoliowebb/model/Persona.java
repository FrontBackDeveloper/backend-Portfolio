package com.miapp.portfoliowebb.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity

public class Persona {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String nombrecompleto;
    private int edad;
    private String puesto;
    private String titulosecundario;
    private String fotoperfil;
    private String ciudad;
    private String pais;
    private String email;
    private String telefono;
    private String hobby;
    
    public Persona() {
    }

    public Persona(Long id, String nombrecompleto, int edad, String puesto, String titulosecundario, String fotoperfil, String ciudad, String pais, String email, String telefono, String hobby) {
        this.id = id;
        this.nombrecompleto = nombrecompleto;
        this.edad = edad;
        this.puesto = puesto;
        this.titulosecundario = titulosecundario;
        this.fotoperfil = fotoperfil;
        this.ciudad = ciudad;
        this.pais = pais;
        this.email = email;
        this.telefono = telefono;
        this.hobby = hobby;
    }

    
    

}    
