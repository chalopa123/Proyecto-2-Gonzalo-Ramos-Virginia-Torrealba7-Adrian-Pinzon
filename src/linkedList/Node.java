/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedList;

/**
 * Represents a node in a linked list.
 *
 * @param <T> the type of data stored in the node
 */
public class Node<T> {

    /**
     * The data stored in the node.
     */
    T dato;
    /**
     * The next node in the linked list.
     */
    Node next;

    /**
     * Constructs a new Node object with the specified data.
     *
     * @param dato the data to be stored in the node
     */
    public Node(T dato) {
        this.dato = dato;
        this.next = null;
    }

    /**
     * Returns the data stored in the node.
     *
     * @return the data stored in the node
     */
    public T getDato() {
        return dato;
    }

    /**
     * Sets the data stored in the node.
     *
     * @param dato the data to be set
     */
    public void setDato(T dato) {
        this.dato = dato;
    }

    /**
     * Returns the next node in the linked list.
     *
     * @return the next node in the linked list
     */
    public Node getNext() {
        return next;
    }

    /**
     * Sets the next node in the linked list.
     *
     * @param next the next node to be set
     */
    public void setNext(Node next) {
        this.next = next;
    }
}
