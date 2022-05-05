
package com.miapp.portfoliowebb.service;

import com.miapp.portfoliowebb.model.Persona;
import com.miapp.portfoliowebb.repository.PersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class PersonaService implements IPersonaService{
    @Autowired
    private PersonaRepository persoRepository;

    @Override
    public List<Persona> getPersonas() {
    List<Persona> listapersonas = persoRepository.findAll(); 
    return listapersonas;
    }

    @Override
    public void savePersona(Persona perso) {
        persoRepository.save(perso);
    }

    @Override
    public void deletePersona(Long id) {
       persoRepository.deleteById(id);
    }

     @Override
    public void modificarPersona(Persona perso) {
        persoRepository.save(perso);
    }
}
