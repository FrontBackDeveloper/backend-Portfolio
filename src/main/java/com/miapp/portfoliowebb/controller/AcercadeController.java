
package com.miapp.portfoliowebb.controller;


import com.miapp.portfoliowebb.model.Acercade;
import com.miapp.portfoliowebb.service.IAcercadeService;
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
public class AcercadeController {
     @Autowired 
    private IAcercadeService interAcercade;
     
     @GetMapping ("/acercade/traer")
    public List<Acercade> getAcercade(){
         return interAcercade.getAcercade();
    }
    @PostMapping ("/acercade/crear")
    public String createAcercade(@RequestBody Acercade acer){
        interAcercade.saveAcercade(acer);
        return "El registro fue creado correctamente";
    }
    @DeleteMapping ("/acercade/borrar/{id}")
    public String deleteAcercade(@PathVariable Long id){
        interAcercade.deleteAcercade(id);
        return "El registro fue borrado correctamente";
    }
    @PutMapping ("/Acercade/editar/{id}")
    public Acercade editAcercade (@PathVariable Long id,
                                @RequestParam ("descripcion") String nuevoTitulo)
    {
        Acercade acer = interAcercade.findAcercade(id);
        return acer;
    }
}
