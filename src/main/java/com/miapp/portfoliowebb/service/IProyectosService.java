
package com.miapp.portfoliowebb.service;

import com.miapp.portfoliowebb.model.Proyectos;
import java.util.List;


public interface IProyectosService {
    public List<Proyectos> getProyectos();
    
    public void saveProyectos (Proyectos edu);
    
    public void deleteProyectos (Long id);
    
    public Proyectos findProyectos (Long id); 
}
