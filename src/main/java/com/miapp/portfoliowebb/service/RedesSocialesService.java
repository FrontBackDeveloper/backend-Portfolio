
package com.miapp.portfoliowebb.service;

import com.miapp.portfoliowebb.model.RedesSociales;
import com.miapp.portfoliowebb.repository.RedesSocialesRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RedesSocialesService implements IRedesSocialesService{
    
     @Autowired
    private RedesSocialesRepository redRepository;

    @Override
    public List<RedesSociales> getRedesSociales() {
        List<RedesSociales> listaredessociales = redRepository.findAll(); 
    return listaredessociales;
    }

    @Override
    public void saveRedesSociales(RedesSociales red) {
        redRepository.save(red);
    }

    @Override
    public void deleteRedesSociales(Long id) {
          redRepository.deleteById(id);
    }

   @Override
    public void modificarRedesSociales(RedesSociales red) {
        redRepository.save(red);
    }
     
     
}
