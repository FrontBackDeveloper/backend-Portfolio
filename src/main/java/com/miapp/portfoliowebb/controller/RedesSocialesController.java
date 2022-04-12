package com.miapp.portfoliowebb.controller;

import com.miapp.portfoliowebb.model.RedesSociales;
import com.miapp.portfoliowebb.service.IRedesSocialesService;
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
public class RedesSocialesController {
     @Autowired 
    private IRedesSocialesService interRedesSociales;
     
      @GetMapping ("/redessociales/traer")
    public List<RedesSociales> getRedesSociales(){
         return interRedesSociales.getRedesSociales();
    }
    @PostMapping ("/redessociales/crear")
    public String createRedesSociales(@RequestBody RedesSociales red){
        interRedesSociales.saveRedesSociales(red);
        return "El registro fue creado correctamente";
    }
    @DeleteMapping ("/redessociales/borrar/{id}")
    public String deleteRedesSociales(@PathVariable Long id){
        interRedesSociales.deleteRedesSociales(id);
        return "El registro fue borrado correctamente";
    }
    @PutMapping ("/redessociales/editar/{id}")
    public RedesSociales editRedesSociales (@PathVariable Long id,
                                @RequestParam ("nombre") String nuevoNombreo,
                                @RequestParam ("url") String nuevoUrl)
    {
        RedesSociales red = interRedesSociales.findRedesSociales(id);
        return red;
    }
}
