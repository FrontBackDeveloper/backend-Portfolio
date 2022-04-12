package com.miapp.portfoliowebb.controller;

import com.miapp.portfoliowebb.model.Aptitudes;
import com.miapp.portfoliowebb.service.IAptitudesService;
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
public class AptitudesController {
     @Autowired 
    private IAptitudesService interAptitudes;
     
      @GetMapping ("/aptitudes/traer")
     public List<Aptitudes> getAptitudes(){
         return interAptitudes.getAptitudes();
    }
    @PostMapping ("/aptitudes/crear")
    public String createAptitudes(@RequestBody Aptitudes aptitud){
        interAptitudes.saveAptitudes(aptitud);
        return "El registro fue creado correctamente";
    }
    @DeleteMapping ("/aptitudes/borrar/{id}")
    public String deleteAptitudes(@PathVariable Long id){
        interAptitudes.deleteAptitudes(id);
        return "El registro fue borrado correctamente";
    }
    @PutMapping ("/Aptitudes/editar/{id}")
    public Aptitudes editAptitudes (@PathVariable Long id,
                                @RequestParam ("titulo") String nuevoTitulo,
                                @RequestParam ("tipo") String nuevoTipo,
                                @RequestParam ("nivel") String nuevoNivel
                                )
    {
        Aptitudes aptitud = interAptitudes.findAptitudes(id);
        return aptitud;
    }
}
