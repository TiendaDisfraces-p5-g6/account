
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
    
    /*method with endponit to found all pedidos of an user*/
    @GetMapping("/getPedidos/{username}")
    List <pedidos> getPedidos(@PathVariable String username){
         List <pedidos> pedidosUsuario = 
                pedidosRepositories.findByUsername(username);
        return pedidosUsuario;
   }
    
    /*method with endponit to make pedidos*/
    @PostMapping("/setPedidos")
    pedidos setPedidos(@RequestBody pedidos pedido){
        return pedidosRepositories.save(pedido);
    }
    
    /*method with endponit to delete pedidos by id*/
    @DeleteMapping("/delPedido/{id}")
    String deletePedidos(@PathVariable String id){
        pedidosRepositories.deleteById(id);
        return "pedido eliminado con exito";
    }
    
}
