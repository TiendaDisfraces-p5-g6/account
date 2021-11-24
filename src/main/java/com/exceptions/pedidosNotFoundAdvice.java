package com.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
@ResponseBody
public class pedidosNotFoundAdvice {
    @ResponseBody
    @ExceptionHandler(pedidosException.class)    
    @ResponseStatus(HttpStatus.NOT_FOUND)        
    String EntityNotFoundAdvice (pedidosException  ex){
        return ex.getMessage();
    }
}
