
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

public class Experiencia {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;
    private String puesto;
    private String lugar;
    private String desde;
    private String hasta;
    private String imagen;

    public Experiencia() {
    }

    public Experiencia(long id, String puesto, String lugar, String desde, String hasta, String imagen) {
        this.id = id;
        this.puesto = puesto;
        this.lugar = lugar;
        this.desde = desde;
        this.hasta = hasta;
        this.imagen = imagen;
    }
    
    
}
