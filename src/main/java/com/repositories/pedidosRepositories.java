package com.repositories;

import com.models.pedidos;
import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface pedidosRepositories extends MongoRepository <pedidos , String>{
   List <pedidos> findByUsername (String username);
    
}
