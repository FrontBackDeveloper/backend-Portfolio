
package com.miapp.portfoliowebb.service;

import com.miapp.portfoliowebb.model.Usuario;
import com.miapp.portfoliowebb.model.dto.UserDto;
import com.miapp.portfoliowebb.repository.AuthRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AuthService {
      @Autowired
    AuthRepository repository;
    
    @Autowired
    PasswordEncoder passwordEncoder;
    
     public boolean isUserEnabled(UserDto userDto) {
        boolean isUserEnabled = false;
        List<Usuario> usuarios = repository.findByEmailAndIsEnabledTrue(userDto.getEmail());
        if (!usuarios.isEmpty()) {
            Usuario usuario = usuarios.get(0);
            if (passwordEncoder.matches(userDto.getPassword(), usuario.getPassword()))
                isUserEnabled = true;
        }
        return isUserEnabled;
    }
    
    public void crearUsuario(Usuario usuario) throws Exception {
        List<Usuario> usuarios = repository.findByEmailAndIsEnabledTrue(usuario.getEmail());
        if (!usuarios.isEmpty())
            throw new Exception("El email ya fue registrado");
        else {
            usuario.setPassword(passwordEncoder.encode(usuario.getPassword()));
            usuario.setEnabled(true);
            repository.save(usuario);
        }
    }
}
