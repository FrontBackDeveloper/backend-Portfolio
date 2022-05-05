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
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FormacionController {
    
    @Autowired 
    private IFormacionService interFormacion;
    
    @GetMapping ("/formacion/traer")
    @ResponseBody
    public List<Formacion> getFormacion(){
         return interFormacion.getFormacion();
    }
    @PostMapping ("/formacion/crear")
    @ResponseBody
    public void createFormacion(@RequestBody Formacion edu){
        interFormacion.saveFormacion(edu);
      
    }
    @DeleteMapping ("/formacion/borrar/{id}")
    public void deleteFormacion(@PathVariable Long id){
        interFormacion.deleteFormacion(id);
      
    }
   
    @PutMapping ("/formacion/editar")
    public void modificarFormacion(@RequestBody Formacion edu) {
        interFormacion.saveFormacion(edu);
      
    }
}
