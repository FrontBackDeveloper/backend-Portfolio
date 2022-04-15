
package com.miapp.portfoliowebb.controller;

import com.miapp.portfoliowebb.model.Usuario;
import com.miapp.portfoliowebb.model.dto.UserDto;
import com.miapp.portfoliowebb.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {
     @Autowired
    AuthService service;
     
      @PostMapping("/login")
    public boolean login(@RequestBody UserDto userDto) {
        return service.isUserEnabled(userDto);
    } 
    
    @PostMapping("/register")
    public void register(@RequestBody Usuario usuario) throws Exception {
        service.crearUsuario(usuario);
    }
}
