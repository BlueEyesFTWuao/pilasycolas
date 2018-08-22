/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import modelo.Base;

/**
 *
 * @author jose.bueno
 */
public abstract class Valor extends Base {
    
    private String nombres;
    
    public Valor (String nombres){
    
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    @Override
    public abstract Base copy();

  
}
