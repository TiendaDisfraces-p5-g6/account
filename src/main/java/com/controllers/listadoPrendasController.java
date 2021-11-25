
package com.controllers;

import java.util.List;
import com.models.prenda;
import com.repositories.listadoRepositories;
import com.exceptions.listadoPrendasEcxeption;
import org.springframework.web.bind.annotation.*;
import java.util.Date;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@RestController
public class listadoPrendasController {
    private final listadoRepositories ListadoRepositories;
    
    public listadoPrendasController (listadoRepositories ListadoRepositories){
        this.ListadoRepositories = ListadoRepositories;
    
    }
    
    /*message to test server*/
    @GetMapping("/")
    String messageRoot(){
        return  "Bienvenido";
    }
    
    /*method with endponit to get all prendas*/ 
    @GetMapping("/getPrendas")
    List <prenda> getPrendas(){
        List <prenda> prendas  =  ListadoRepositories.findAll();
        return prendas;
    }
    
    /*method with endpoint to make prendas*/
    @PostMapping("/setPrendas")
    prenda newPrenda(@RequestBody prenda Prenda){
         return ListadoRepositories.save(Prenda);
    }
    

    
}
