
package com.miapp.portfoliowebb.service;

import com.miapp.portfoliowebb.model.Experiencia;
import com.miapp.portfoliowebb.repository.ExperienciaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExperienciaService implements IExperienciaService{
     @Autowired
    private ExperienciaRepository experRepository;

    @Override
    public List<Experiencia> getExperiencia() {
         List<Experiencia> listaexperiencia = experRepository.findAll(); 
    return listaexperiencia;
    }

    @Override
    public void saveExperiencia(Experiencia exper) {
         experRepository.save(exper);
    }

    @Override
    public void deleteExperiencia(Long id) {
         experRepository.deleteById(id);
    }

    @Override
    public void modificarExperiencia(Experiencia exper) {
         experRepository.save(exper);
    }
     
     
}
