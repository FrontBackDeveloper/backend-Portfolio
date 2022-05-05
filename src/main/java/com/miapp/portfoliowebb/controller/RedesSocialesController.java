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
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RedesSocialesController {
     @Autowired 
    private IRedesSocialesService interRedesSociales;
     
      @GetMapping ("/redessociales/traer")
      @ResponseBody
    public List<RedesSociales> getRedesSociales(){
         return interRedesSociales.getRedesSociales();
    }
    @PostMapping ("/redessociales/crear")
    @ResponseBody
    public void createRedesSociales(@RequestBody RedesSociales red){
        interRedesSociales.saveRedesSociales(red);
       
    }
    @DeleteMapping ("/redessociales/borrar/{id}")
    public void deleteRedesSociales(@PathVariable Long id){
        interRedesSociales.deleteRedesSociales(id);
       
    }
    @PutMapping ("/redessociales/crear")
    @ResponseBody
    public void modificarRedesSociales(@RequestBody RedesSociales red){
        interRedesSociales.saveRedesSociales(red);
       
    }
}
