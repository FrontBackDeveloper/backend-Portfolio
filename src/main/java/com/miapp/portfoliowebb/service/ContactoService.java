package com.miapp.portfoliowebb.service;

import com.miapp.portfoliowebb.model.Contacto;
import com.miapp.portfoliowebb.repository.ContactoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContactoService implements IContactoService{
    
    @Autowired
    private ContactoRepository contRepository;

    @Override
    public List<Contacto> getContacto() {
        List<Contacto> listacontacto = contRepository.findAll(); 
    return listacontacto;
    }

    @Override
    public void saveContacto(Contacto cont) {
         contRepository.save(cont);
    }

    @Override
    public void deleteContacto(Long id) {
        contRepository.deleteById(id);
    }
    
}
