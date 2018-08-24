/*
 * To change this license header, c
hoose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import modelo.Base;

/**
 *
 * @author joseb
 */
public class Nombre extends Base
{
    private String nombre;

    public Nombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return nombre ;
    }
    
    
    
    @Override
    public Base copy() {
        return new Nombre(nombre);
    }
    
}
