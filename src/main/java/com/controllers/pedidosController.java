
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
    private final pedidosRepositories listaRepositories;
    
    public pedidosController (pedidosRepositories listaRepositorios){
        this.listaRepositories = listaRepositorios;
    
    }
    
    @GetMapping("/getPedidos")
    List <pedidos> getPedidos(){
        List <pedidos> pedidos = listaRepositories.findAll();
        return pedidos;
   }
    
    
    @PostMapping("/setPedidos")
    pedidos setPedidos(@RequestBody pedidos pedido){
        return listaRepositories.save(pedido);
    }
}
