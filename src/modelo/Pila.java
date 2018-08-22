/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.LinkedList;

/**
 *
 * @author jose.bueno
 */
public class Pila <T extends Base> {
    LinkedList<T> pila;
    
    public Pila() {
   pila=new LinkedList<>();
}
    
    
   public void apilar (T element){
       
       pila.addFirst(element);

}
   
   public T desapilar (){
        return pila.removeFirst();
   
   }
   
   public boolean estaVacia(){
        return pila.isEmpty();
   
   }
   
   public String toString(){
       String cad = "[";
       
       for (T e : pila){
       cad += "  " + e.toString();
       }
        return cad + "]";
   
   }

}
