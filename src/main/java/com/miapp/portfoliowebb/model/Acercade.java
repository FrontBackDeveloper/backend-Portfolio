
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

public class Acercade {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    private Long id;
    private String descripcion;

    public Acercade() {
    }

    public Acercade(Long id, String descripcion) {
        this.id = id;
        this.descripcion = descripcion;
    }
    
}
