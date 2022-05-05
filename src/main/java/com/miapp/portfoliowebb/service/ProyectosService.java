
package com.miapp.portfoliowebb.service;

import com.miapp.portfoliowebb.model.Proyectos;
import com.miapp.portfoliowebb.repository.ProyectosRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProyectosService implements IProyectosService{

     @Autowired
    private ProyectosRepository proyectRepository;
     
    @Override
    public List<Proyectos> getProyectos() {
         List<Proyectos> listaproyectos = proyectRepository.findAll(); 
    return listaproyectos;
    }

    @Override
    public void saveProyectos(Proyectos proyect) {
          proyectRepository.save(proyect);
    }

    @Override
    public void deleteProyectos(Long id) {
        proyectRepository.deleteById(id);
    }

    @Override
    public void modificarProyectos(Proyectos proyect) {
          proyectRepository.save(proyect);
    }
    
}
