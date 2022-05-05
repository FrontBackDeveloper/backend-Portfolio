
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

public class Logros {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;
    private String titulo;
    private String institucion;
    private String lugar;
    private String fecha;
    private String imagen;
     private String url;

    public Logros() {
    }

    public Logros(long id, String titulo, String institucion, String lugar, String fecha, String imagen, String url) {
        this.id = id;
        this.titulo = titulo;
        this.institucion = institucion;
        this.lugar = lugar;
        this.fecha = fecha;
        this.imagen = imagen;
         this.imagen = url;
    }
    
    
}
