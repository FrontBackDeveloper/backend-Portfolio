
package com.miapp.portfoliowebb.service;

import com.miapp.portfoliowebb.model.Acercade;
import com.miapp.portfoliowebb.repository.AcercadeRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AcercadeService implements IAcercadeService{
    @Autowired
    private AcercadeRepository acerRepository;
    
    @Override
    public List<Acercade> getAcercade() {
         List<Acercade> listaacercade = acerRepository.findAll(); 
    return listaacercade;
    }

    @Override
    public void saveAcercade(Acercade acer) {
         acerRepository.save(acer);
    }

    @Override
    public void deleteAcercade(Long id) {
         acerRepository.deleteById(id);
    }

   @Override
    public void modificarAcercade(Acercade acer) {
         acerRepository.save(acer);
    }
    
}
