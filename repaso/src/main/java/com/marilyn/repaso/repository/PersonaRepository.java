/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.marilyn.repaso.repository;

import com.marilyn.repaso.model.Persona;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author HP
 */
public interface PersonaRepository extends MongoRepository<Persona, Long>{
    
}
