
package com.models;

import org.springframework.data.annotation.Id;


public class prenda {
    @Id
    private String vendedor;
    private String nombre;
    private String tipoPrenda;
    private String descripcion;
    private int cantidad;
    private int precio;
    
    private String img;
    
    public prenda(String nombre, String tipoPrenda , String descripcion , int cantidad , int precio , String vendedor , String img){
     
        this.nombre = nombre;
        this.tipoPrenda = tipoPrenda;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.precio = precio;
        this.vendedor = vendedor;
        this.img = img;

    }


    
    public String getNombre(){
        return nombre;
     }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
     }

    /**
     * @return the tipoPrenda
     */
    public String getTipoPrenda() {
        return tipoPrenda;
    }

    /**
     * @param tipoPrenda the tipoPrenda to set
     */
    public void setTipoPrenda(String tipoPrenda) {
        this.tipoPrenda = tipoPrenda;
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * @return the cantidad
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * @param cantidad the cantidad to set
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * @return the precio
     */
    public int getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(int precio) {
        this.precio = precio;
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
     * @return the img
     */
    public String getImg() {
        return img;
    }

    /**
     * @param img the img to set
     */
    public void setImg(String img) {
        this.img = img;
    }
    
}
