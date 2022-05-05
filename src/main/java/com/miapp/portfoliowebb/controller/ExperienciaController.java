
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
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExperienciaController {
     @Autowired 
    private IExperienciaService interExperiencia;
     
    @GetMapping ("/experiencia/traer")
    @ResponseBody
    public List<Experiencia> getExperiencia(){
         return interExperiencia.getExperiencia();
    }
    @PostMapping ("/experiencia/crear")
      @ResponseBody
    public void createExperiencia(@RequestBody Experiencia exper){
        interExperiencia.saveExperiencia(exper); 
    }
    @DeleteMapping ("/experiencia/borrar/{id}")
    public void deleteExperiencia(@PathVariable Long id){
        interExperiencia.deleteExperiencia(id);
      
    }
    @PutMapping ("/experiencia/editar")
      @ResponseBody
    public void modificarExperiencia(@RequestBody Experiencia exper){
        interExperiencia.saveExperiencia(exper); 
    }
}
