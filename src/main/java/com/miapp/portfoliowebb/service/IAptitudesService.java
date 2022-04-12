
package com.miapp.portfoliowebb.service;

import com.miapp.portfoliowebb.model.Aptitudes;
import java.util.List;


public interface IAptitudesService {
   
    public List<Aptitudes> getAptitudes();
    
    public void saveAptitudes (Aptitudes aptitud);
    
    public void deleteAptitudes (Long id);
    
    public Aptitudes findAptitudes (Long id);    
}
