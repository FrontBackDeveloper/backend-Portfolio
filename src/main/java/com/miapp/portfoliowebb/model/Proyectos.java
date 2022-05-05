
package com.miapp.portfoliowebb.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity

public class Proyectos {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;
    private String titulo;
    private String tipo;
    private String creado;
    private String herramientas;
    private String estado;
    private String imagen;
     private String url;

    public Proyectos() {
    }

    public Proyectos(long id, String titulo, String tipo, String creado,
                     String herramientas, String estado, String imagen, String url) {
        this.id = id;
        this.titulo = titulo;
        this.tipo = tipo;
        this.creado = creado;
        this.herramientas = herramientas;
        this.estado = estado;
        this.imagen = imagen;
        this.imagen = url;
    }
    
    
}
