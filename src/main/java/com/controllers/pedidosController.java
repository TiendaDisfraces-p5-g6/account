
package com.controllers;

import java.util.List;
import com.models.pedidos;
import com.repositories.pedidosRepositories;
import com.exceptions.pedidosException;
import org.springframework.web.bind.annotation.*;
import java.util.Date;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@RestController
public class pedidosController {
    private final pedidosRepositories pedidosRepositories;
    
    public pedidosController (pedidosRepositories pedidosRepositories){
        this.pedidosRepositories = pedidosRepositories;
    
    }
    
    @GetMapping("/getPedidos/{username}")
    List <pedidos> getPedidos(@PathVariable String username){
         List <pedidos> pedidosUsuario = 
                pedidosRepositories.findByUsername(username);
         
        return pedidosUsuario;
   }
    
    
    @PostMapping("/setPedidos")
    pedidos setPedidos(@RequestBody pedidos pedido){
        return pedidosRepositories.save(pedido);
    }
}
