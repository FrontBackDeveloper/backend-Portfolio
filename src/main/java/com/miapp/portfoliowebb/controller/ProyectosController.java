
package com.miapp.portfoliowebb.controller;


import com.miapp.portfoliowebb.model.Proyectos;
import com.miapp.portfoliowebb.service.IProyectosService;
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
public class ProyectosController {
    @Autowired 
    private IProyectosService interProyectos;
    
     @GetMapping ("/proyectos/traer")
     @ResponseBody
    public List<Proyectos> getProyectos(){
         return interProyectos.getProyectos();
    }
    @PostMapping ("/proyectos/crear")
      @ResponseBody
    public void createProyectos(@RequestBody Proyectos proyect){
        interProyectos.saveProyectos(proyect);
       
    }
    @DeleteMapping ("/proyectos/borrar/{id}")
    public void deleteProyectos(@PathVariable Long id){
        interProyectos.deleteProyectos(id);
      
    }
    @PutMapping ("/proyectos/editar")
     
    public void modificarProyectos(@RequestBody Proyectos proyect){
        interProyectos.saveProyectos(proyect);
       
    }
}
