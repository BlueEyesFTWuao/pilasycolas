/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author jose.bueno
 */
public class operacionesPila <T extends Base> {
    public static <T extends Base> Pila <T> duplicarPila(Pila<T> pilaOriginal){
        
       Pila<T> Pila2=new Pila<>();
       Pila<T> pilaDuplicada=new Pila<>();
       
       while (!pilaOriginal.estaVacia()){
       Pila2.apilar(pilaOriginal.desapilar());
       }
       
       
       while (!Pila2.estaVacia()){
       T e= Pila2.desapilar();
       T c=(T) e.copy();
       pilaOriginal.apilar(e);
       pilaDuplicada.apilar(c);
       
       }
            
            
        return pilaDuplicada;
    
    }
    
     public static <T extends Base> Pila <T> invertir(Pila<T> pilaOriginal){
     Pila<T> pilaCopia= duplicarPila(pilaOriginal);
     Pila<T> PilaInvertida=new Pila<>();
     
     while (!pilaCopia.estaVacia()){
     PilaInvertida.apilar(pilaCopia.desapilar());
     }
     return PilaInvertida;
     }
    
    
           
}
