
package com.models;

import org.springframework.data.annotation.Id;
import java.util.Date;

public class pedidos {
    @Id
    private String vendedor;
    private Date fechaPedido;
    private int valor;
    private Date fechaEntrega;
    private String nombrePrenda;
    private String talla;
     
    
    public pedidos (Date fechaPedido , String vendedor , int valor , Date fechaEntrega , String nombrePrenda , String talla) {
        
       
        this.fechaPedido = fechaPedido;
        this.vendedor = vendedor;
        this.valor = valor;
        this.fechaEntrega = fechaEntrega;
        this.nombrePrenda = nombrePrenda;
        this.talla = talla;
        
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
     * @return the vendedor
     */
    public String getVendedor() {
        return vendedor;
    }

    /**
     * @param vendedor the vendedor to set
     */
    public void setVendedor(String vendedor) {
        this.vendedor = vendedor;
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
