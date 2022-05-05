
package com.miapp.portfoliowebb.service;

import com.miapp.portfoliowebb.model.Aptitudes;
import com.miapp.portfoliowebb.repository.AptitudesRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AptitudesService implements IAptitudesService{

    @Autowired
    private AptitudesRepository aptiRepository;
    
    @Override
    public List<Aptitudes> getAptitudes() {
         List<Aptitudes> listaaptitudes = aptiRepository.findAll(); 
    return listaaptitudes;
    }

    @Override
    public void saveAptitudes(Aptitudes aptitud) {
        aptiRepository.save(aptitud);
    }

    @Override
    public void deleteAptitudes(Long id) {
        aptiRepository.deleteById(id);
    }

    @Override
    public void modificarAptitudes(Aptitudes aptitud) {
        aptiRepository.save(aptitud);
    }
    
    
}
