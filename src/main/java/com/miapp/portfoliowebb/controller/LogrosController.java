
package com.miapp.portfoliowebb.controller;

import com.miapp.portfoliowebb.model.Logros;
import com.miapp.portfoliowebb.service.ILogrosService;
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
public class LogrosController {

    @Autowired 
    private ILogrosService interLogros;
    
    @GetMapping ("/logros/traer")
    public List<Logros> getLogros(){
         return interLogros.getLogros();
    }
    @PostMapping ("/logros/crear")
    public String createLogros(@RequestBody Logros logro){
        interLogros.saveLogros(logro);
        return "El registro fue creado correctamente";
    }
    @DeleteMapping ("/logros/borrar/{id}")
    public String deleteLogros(@PathVariable Long id){
        interLogros.deleteLogros(id);
        return "El registro fue borrado correctamente";
    }
    @PutMapping ("/logros/editar/{id}")
    public Logros editLogros (@PathVariable Long id,
                                @RequestParam ("titulo") String nuevoTitulo,
                                @RequestParam ("institucion") String nuevoInstitucion,
                                @RequestParam ("lugar") String nuevoLugar,
                                @RequestParam ("Fecha") String nuevofecha,
                                @RequestParam ("imagen") String nuevoImagen)
    {
        Logros logro = interLogros.findLogros(id);
        return logro;
    }    
}
