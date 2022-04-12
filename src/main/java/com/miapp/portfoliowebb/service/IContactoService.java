package com.miapp.portfoliowebb.service;

import com.miapp.portfoliowebb.model.Contacto;
import java.util.List;


public interface IContactoService {
    
    public List<Contacto> getContacto();
    
    public void saveContacto (Contacto cont);
    
    public void deleteContacto (Long id);
    
}
