
package com.miapp.portfoliowebb.service;

import com.miapp.portfoliowebb.model.Acercade;
import java.util.List;


public interface IAcercadeService {
    
    public List<Acercade> getAcercade();
    
    public void saveAcercade (Acercade acer);
    
    public void deleteAcercade (Long id);
    
    public void modificarAcercade (Acercade acer); 
}
