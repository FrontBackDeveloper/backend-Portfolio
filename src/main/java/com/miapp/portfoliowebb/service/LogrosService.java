
package com.miapp.portfoliowebb.service;

import com.miapp.portfoliowebb.model.Logros;
import com.miapp.portfoliowebb.repository.LogrosRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LogrosService implements ILogrosService{
    
     @Autowired
    private LogrosRepository logRepository;

    @Override
    public List<Logros> getLogros() {
        List<Logros> listaformacion = logRepository.findAll(); 
    return listaformacion;
    }

    @Override
    public void saveLogros(Logros logro) {
         logRepository.save(logro);
    }

    @Override
    public void deleteLogros(Long id) {
         logRepository.deleteById(id);
    }

   @Override
    public void modificarLogros(Logros logro) {
         logRepository.save(logro);
    }
    
}
