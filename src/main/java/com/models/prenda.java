
package com.models;

import org.springframework.data.annotation.Id;


public class prenda {
    @Id
    private String id;
    private String username;
    private String nombre;
    private String tipoPrenda;
    private String descripcion;
    private int cantidad;
    private int precio;
    private String img;
    
    public prenda(String id , String nombre, String tipoPrenda , String descripcion , int cantidad , int precio , String username , String img){
     
        this.id = id;
        this.nombre = nombre;
        this.tipoPrenda = tipoPrenda;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.precio = precio;
        this.username = username;
        this.img = img;

    }

    public String getId(){
        return id;
    
    }
    
    public void setId(){
        this.id = id;
    
    }
    
    /**
     * @return the vendedor
     */
    public String getUsuario() {
        return username;
    }

    /**
     * @param vendedor the vendedor to set
     */
    public void setUsuario(String username) {
        this.username = username;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
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
