package com.miapp.portfoliowebb.controller;


import com.miapp.portfoliowebb.model.Contacto;
import com.miapp.portfoliowebb.service.IContactoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContactoController {
    @Autowired 
    private IContactoService interContacto;
     
    @GetMapping ("/contacto/traer")
    @ResponseBody
    public List<Contacto> getContacto(){
         return interContacto.getContacto();
    }
    @PostMapping ("/contacto/crear")
    @ResponseBody
    public void createContacto(@RequestBody Contacto cont){
        interContacto.saveContacto(cont);
      
    }
    @DeleteMapping ("/contacto/borrar/{id}")
    public void deleteContacto(@PathVariable Long id){
        interContacto.deleteContacto(id);
       
    }
   
         
}
