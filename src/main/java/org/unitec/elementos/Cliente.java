/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.unitec.elementos;

import org.springframework.data.annotation.Id;

public class Cliente {
    @Id
    private Long id;
    private String nombre;
    private Orden orden;
    private Localizacion localizacion;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Orden getOrden() {
        return orden;
    }

    public void setOrnde(Orden orden) {
        this.orden = orden;
    }

    public Localizacion getLocalizacion() {
        return localizacion;
    }

    public void setLocalizacion(Localizacion localizacion) {
        this.localizacion = localizacion;
    }

    public Cliente() {
    }

    public Cliente(Long id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public Cliente(Long id, String nombre, Orden orden, Localizacion localizacion) {
        this.id = id;
        this.nombre = nombre;
        this.orden = orden;
        this.localizacion = localizacion;
    }

    @Override
    public String toString() {
        return "Cliente{" + "id=" + id + ", nombre=" + nombre + ", ornde=" + orden + ", localizacion=" + localizacion + '}';
    }
    
}
