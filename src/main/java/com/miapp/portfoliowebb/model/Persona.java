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
    private String titulo;
    private String fotoperfil;
    private String ciudad;
    private String pais;
    private String email;
    private String telefono;
    private String hobby;
    private String descripcion;
    
    public Persona() {
    }

    public Persona(Long id, String nombrecompleto, int edad, String puesto, String titulo,
                    String fotoperfil, String ciudad, String pais, String email,
                    String telefono, String hobby, String descripcion) {
        this.id = id;
        this.nombrecompleto = nombrecompleto;
        this.edad = edad;
        this.puesto = puesto;
        this.titulo = titulo;
        this.fotoperfil = fotoperfil;
        this.ciudad = ciudad;
        this.pais = pais;
        this.email = email;
        this.telefono = telefono;
        this.hobby = hobby;
        this.descripcion = descripcion;
    }

    
    

}    
