
package com.repositories;

import com.models.prenda;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface listadoRepositories extends MongoRepository <prenda , String> {
    
}
