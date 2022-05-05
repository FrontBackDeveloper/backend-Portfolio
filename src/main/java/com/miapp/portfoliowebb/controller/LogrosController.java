
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
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LogrosController {

    @Autowired 
    private ILogrosService interLogros;
    
    @GetMapping ("/logros/traer")
    @ResponseBody
    public List<Logros> getLogros(){
         return interLogros.getLogros();
    }
    @PostMapping ("/logros/crear")
     @ResponseBody
    public void createLogros(@RequestBody Logros logro){
        interLogros.saveLogros(logro);
       
    }
    @DeleteMapping ("/logros/borrar/{id}")
    public void deleteLogros(@PathVariable Long id){
        interLogros.deleteLogros(id);
       
    }
     @PutMapping ("/logros/editar")
     @ResponseBody
    public void modificarLogros(@RequestBody Logros logro){
        interLogros.saveLogros(logro);
    }
}
