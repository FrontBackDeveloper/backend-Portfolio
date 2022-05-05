
package com.miapp.portfoliowebb.service;

import com.miapp.portfoliowebb.model.Persona;
import java.util.List;


public interface IPersonaService {
    
    public List<Persona> getPersonas();
    
    public void savePersona (Persona perso);
    
    public void deletePersona (Long id);
    
    public void modificarPersona (Persona perso);   
    
}
