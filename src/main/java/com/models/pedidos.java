
package com.models;

import org.springframework.data.annotation.Id;
import java.util.Date;

public class pedidos {
    @Id
    private String id;
    private Date fechaPedido;
    private String username;
    private int valor;
    private Date fechaEntrega;
    private String nombrePrenda;
    private String talla;
     
    
    public pedidos (String id , Date fechaPedido ,String username , int valor , Date fechaEntrega , String nombrePrenda , String talla) {
        
        this.id = id; 
        this.fechaPedido = fechaPedido;
        this.username = username;
        this.valor = valor;
        this.fechaEntrega = fechaEntrega;
        this.nombrePrenda = nombrePrenda;
        this.talla = talla;
        
     }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the fechaPedido
     */
    public Date getFechaPedido() {
        return fechaPedido;
    }

    /**
     * @param fechaPedido the fechaPedido to set
     */
    public void setFechaPedido(Date fechaPedido) {
        this.fechaPedido = fechaPedido;
    }

    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return the valor
     */
    public int getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(int valor) {
        this.valor = valor;
    }

    /**
     * @return the fechaEntrega
     */
    public Date getFechaEntrega() {
        return fechaEntrega;
    }

    /**
     * @param fechaEntrega the fechaEntrega to set
     */
    public void setFechaEntrega(Date fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    /**
     * @return the nombrePrenda
     */
    public String getNombrePrenda() {
        return nombrePrenda;
    }

    /**
     * @param nombrePrenda the nombrePrenda to set
     */
    public void setNombrePrenda(String nombrePrenda) {
        this.nombrePrenda = nombrePrenda;
    }

    /**
     * @return the talla
     */
    public String getTalla() {
        return talla;
    }

    /**
     * @param talla the talla to set
     */
    public void setTalla(String talla) {
        this.talla = talla;
    }

    

    
    
    
    
}
