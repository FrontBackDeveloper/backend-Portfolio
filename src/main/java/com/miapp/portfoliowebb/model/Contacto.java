
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

public class Contacto {
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;
    private String nombre;
    private String email;
    private String telefono;
     private String mensaje;

    public Contacto() {
    }

    public Contacto(long id, String nombre, String email, String telefono, String apellido) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.telefono = telefono;
        this.mensaje = mensaje;
    }
       
}
