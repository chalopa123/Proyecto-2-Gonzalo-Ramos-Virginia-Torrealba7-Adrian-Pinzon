/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Structure;

/**
 *
 * @author eduardopinzon
 * @param <T>
 */
public class Node <T> {

    T dato;
    Node next;
    
    public Node (T dato){
        this.dato = dato;
        this.next = null;
    }

    public T getDato() {
        return dato;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    
}
