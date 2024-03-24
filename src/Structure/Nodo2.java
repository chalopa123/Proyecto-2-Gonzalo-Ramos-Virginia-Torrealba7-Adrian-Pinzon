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
    
    
    Nodo2 left;
    
    
    Nodo2 right;

   
    public Nodo2(T dato) {
        this.dato = dato;
        this.right = null;
        this.left = null;
    }

  
    public T getDato() {
        return dato;
    }

    
    public void setDato(T dato) {
        this.dato = dato;
    }

    
    public Nodo2 getLeft() {
        return left;
    }

    
    public void setLeft(Nodo2 left) {
        this.left = left;
    }

    
    public Nodo2 getRight() {
        return right;
    }

    
    public void setRight(Nodo2 right) {
        this.right = right;
    }

    
    public boolean isLeaf() {
        return (this.left == null && this.right == null);
    }
    
}
