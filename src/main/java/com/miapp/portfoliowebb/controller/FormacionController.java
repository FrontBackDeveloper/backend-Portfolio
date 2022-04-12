package com.miapp.portfoliowebb.controller;

import com.miapp.portfoliowebb.model.Formacion;
import com.miapp.portfoliowebb.service.IFormacionService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FormacionController {
    
    @Autowired 
    private IFormacionService interFormacion;
    
    @GetMapping ("/formacion/traer")
    public List<Formacion> getFormacion(){
         return interFormacion.getFormacion();
    }
    @PostMapping ("/formacion/crear")
    public String createFormacion(@RequestBody Formacion edu){
        interFormacion.saveFormacion(edu);
        return "El registro fue creado correctamente";
    }
    @DeleteMapping ("/formacion/borrar/{id}")
    public String deleteFormacion(@PathVariable Long id){
        interFormacion.deleteFormacion(id);
        return "El registro fue borrado correctamente";
    }
    @PutMapping ("/formacion/editar/{id}")
    public Formacion editFormacion (@PathVariable Long id,
                                @RequestParam ("titulo") String nuevoTitulo,
                                @RequestParam ("institucion") String nuevoInstitucion,
                                @RequestParam ("lugar") String nuevoLugar,
                                @RequestParam ("Fecha") String nuevoFecha,
                                @RequestParam ("imagen") String nuevoImagen)
    {
        Formacion edu = interFormacion.findFormacion(id);
        return edu;
    }
}
