
package com.miapp.portfoliowebb.controller;


import com.miapp.portfoliowebb.model.Experiencia;
import com.miapp.portfoliowebb.service.IExperienciaService;
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
public class ExperienciaController {
     @Autowired 
    private IExperienciaService interExperiencia;
     
       @GetMapping ("/experiencia/traer")
    public List<Experiencia> getExperiencia(){
         return interExperiencia.getExperiencia();
    }
    @PostMapping ("/experiencia/crear")
    public String createExperiencia(@RequestBody Experiencia exper){
        interExperiencia.saveExperiencia(exper);
        return "El registro fue creado correctamente";
    }
    @DeleteMapping ("/experiencia/borrar/{id}")
    public String deleteExperiencia(@PathVariable Long id){
        interExperiencia.deleteExperiencia(id);
        return "El registro fue borrado correctamente";
    }
    @PutMapping ("/experiencia/editar/{id}")
    public Experiencia editExperiencia (@PathVariable Long id,
                                @RequestParam ("puesto") String nuevoPuesto,
                                @RequestParam ("lugar") String nuevoLugar,
                                @RequestParam ("desde") String nuevoDesde,
                                @RequestParam ("hasta") String nuevoHasta,
                                @RequestParam ("imagen") String nuevoImagen)
    {
        Experiencia exper = interExperiencia.findExperiencia(id);
        return exper;
    }
}
