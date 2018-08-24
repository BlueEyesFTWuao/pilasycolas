/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import Datos.Nombre;
import javax.swing.JOptionPane;
import modelo.Pila;
import modelo.operacionesPila;

/**
 *
 * @author joseb
 */
public class MainPila {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pila<Nombre> pilaNombres=new Pila<>();
        pilaNombres.apilar(new Nombre("David"));
        pilaNombres.apilar(new Nombre("Maria"));
        pilaNombres.apilar(new Nombre("Paola"));
        pilaNombres.apilar(new Nombre("Natalia"));
        
        Pila<Nombre> pilaDuplicada= operacionesPila.duplicarPila(pilaNombres);
         Pila<Nombre> pilaInvertida= operacionesPila.invertir(pilaNombres);
        
       
        Pila<Nombre> pilaNombres2=new Pila<>();
        pilaNombres.apilar(new Nombre("Jose"));
        pilaNombres.apilar(new Nombre("Margarita"));
        pilaNombres.apilar(new Nombre("Antonio"));
        pilaNombres.apilar(new Nombre("Laura"));
         
        
         Pila<Nombre> pilaCon= operacionesPila.concatenar(pilaNombres,pilaNombres2);
        JOptionPane.showMessageDialog(null,"Pila original:"+ pilaNombres.toString()+"\n"+"Pila Duplicada: "+pilaDuplicada.toString()+"\n"+"Pila Invertida: "+pilaInvertida.toString()+"\n"+"Pila Concatenada: "+pilaCon.toString());
    }
    
}
