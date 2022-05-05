
package com.miapp.portfoliowebb.service;

import com.miapp.portfoliowebb.model.Formacion;
import com.miapp.portfoliowebb.repository.FormacionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FormacionService implements IFormacionService {
    @Autowired
    private FormacionRepository eduRepository;
    
    @Override
    public List<Formacion> getFormacion() {
    List<Formacion> listaformacion = eduRepository.findAll(); 
    return listaformacion;
    }

    @Override
    public void saveFormacion(Formacion edu) {
        eduRepository.save(edu);
    }

    @Override
    public void deleteFormacion(Long id) {
       eduRepository.deleteById(id);
    }

   @Override
    public void modificarFormacion(Formacion edu) {
        eduRepository.save(edu);
    }

  
}
