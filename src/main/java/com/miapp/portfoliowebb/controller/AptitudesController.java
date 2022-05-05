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
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AptitudesController {
     @Autowired 
    private IAptitudesService interAptitudes;
     
      @GetMapping ("/aptitudes/traer")
      @ResponseBody
     public List<Aptitudes> getAptitudes(){
         return interAptitudes.getAptitudes();
    }
    @PostMapping ("/aptitudes/crear")
    @ResponseBody
    public void createAptitudes(@RequestBody Aptitudes aptitud){
        interAptitudes.saveAptitudes(aptitud);
       
    }
    @DeleteMapping ("/aptitudes/borrar/{id}")
    public void deleteAptitudes(@PathVariable Long id){
        interAptitudes.deleteAptitudes(id);
       
    }
   @PostMapping ("/aptitudes/editar")
   
    public void modificarAptitudes(@RequestBody Aptitudes aptitud){
        interAptitudes.saveAptitudes(aptitud);
       
    }
}
