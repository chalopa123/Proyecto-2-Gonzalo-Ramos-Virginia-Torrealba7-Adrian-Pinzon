/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Structure;

/**
 *
 * @author VirginiaT
 */

// Estructura Nodo_2
// Complementar Nodo Principal

public class Nodo2 <T> {
    
    T dato;
    
    
    Nodo2 izq;
    
    
    Nodo2 der;

   
    public Nodo2(T dato) {
        this.dato = dato;
        this.der = null;
        this.izq = null;
    }

  
    public T getDato() {
        return dato;
    }

    
    public void setDato(T dato) {
        this.dato = dato;
    }

    
    public Nodo2 getIzq() {
        return izq;
    }

    
    public void setIzq(Nodo2 izq) {
        this.izq = izq;
    }

    
    public Nodo2 getDer() {
        return der;
    }

    
    public void setDer(Nodo2 der) {
        this.der = der;
    }

    
    public boolean isLeaf() {
        return (this.izq == null && this.der == null);
    }
    
}
