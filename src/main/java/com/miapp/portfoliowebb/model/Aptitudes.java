
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
public class Aptitudes {
     @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;
    private String titulo;
    private String nivel;
   

    public Aptitudes() {
    }

    public Aptitudes(long id, String titulo, String nivel) {
        this.id = id;
        this.titulo = titulo;
        this.nivel = nivel;
       
    }
   
}
