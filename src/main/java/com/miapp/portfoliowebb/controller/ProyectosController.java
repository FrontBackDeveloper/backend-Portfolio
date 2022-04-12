
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
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProyectosController {
    @Autowired 
    private IProyectosService interProyectos;
    
     @GetMapping ("/proyectos/traer")
    public List<Proyectos> getProyectos(){
         return interProyectos.getProyectos();
    }
    @PostMapping ("/proyectos/crear")
    public String createProyectos(@RequestBody Proyectos proyect){
        interProyectos.saveProyectos(proyect);
        return "El registro fue creado correctamente";
    }
    @DeleteMapping ("/proyectos/borrar/{id}")
    public String deleteProyectos(@PathVariable Long id){
        interProyectos.deleteProyectos(id);
        return "El registro fue borrado correctamente";
    }
    @PutMapping ("/proyectos/editar/{id}")
    public Proyectos editProyectos (@PathVariable Long id,
                                @RequestParam ("titulo") String nuevoTitulo,
                                @RequestParam ("tipo") String nuevoTipo,
                                @RequestParam ("creado") String nuevoCreado,
                                @RequestParam ("herramientas") String nuevoHerramientas,
                                @RequestParam ("estado") String nuevoEstado,
                                @RequestParam ("imagen") String nuevoImagen)
    {
        Proyectos proyect = interProyectos.findProyectos(id);
        return proyect;
    }
}
