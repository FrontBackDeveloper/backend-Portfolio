
package com.miapp.portfoliowebb.service;

import com.miapp.portfoliowebb.model.RedesSociales;
import java.util.List;


public interface IRedesSocialesService {
    
    public List<RedesSociales> getRedesSociales();
    
    public void saveRedesSociales (RedesSociales red);
    
    public void deleteRedesSociales (Long id);
    
    public RedesSociales findRedesSociales (Long id);    
}
