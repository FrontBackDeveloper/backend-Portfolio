
package com.miapp.portfoliowebb.service;

import com.miapp.portfoliowebb.model.Formacion;
import java.util.List;


public interface IFormacionService {
    
    public List<Formacion> getFormacion();
    
    public void saveFormacion (Formacion edu);
    
    public void deleteFormacion (Long id);
    
    public void modificarFormacion (Formacion edu); 
}
