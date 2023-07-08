/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.marilyn.repaso.service;

import com.marilyn.repaso.model.Persona;
import com.marilyn.repaso.repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

/**
 *
 * @author HP
 */
@Service
public class PersonaServiceImpl extends GenericServiceImpl<Persona, Long> 
    implements GenericService<Persona, Long> {

    @Autowired
    PersonaRepository personaRepository;

    @Override
    public CrudRepository<Persona, Long> getDao() {
        return personaRepository;
    }


    
}

