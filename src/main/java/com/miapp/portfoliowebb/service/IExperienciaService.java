
package com.miapp.portfoliowebb.service;

import com.miapp.portfoliowebb.model.Experiencia;
import java.util.List;


public interface IExperienciaService {
    public List<Experiencia> getExperiencia();
    
    public void saveExperiencia (Experiencia exper);
    
    public void deleteExperiencia (Long id);
    
    public Experiencia findExperiencia (Long id); 
}
