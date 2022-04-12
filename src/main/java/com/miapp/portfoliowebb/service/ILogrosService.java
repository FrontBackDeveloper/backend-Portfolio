
package com.miapp.portfoliowebb.service;

import com.miapp.portfoliowebb.model.Logros;
import java.util.List;


public interface ILogrosService {
   
    public List<Logros> getLogros();
    
    public void saveLogros (Logros logro);
    
    public void deleteLogros (Long id);
    
    public Logros findLogros (Long id); 
}
