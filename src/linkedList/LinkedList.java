/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedList;

import reservation.Reservation;
import user.User;

/**
 * Represents a linked list data structure.
 *
 * @param <T> the type of elements stored in the linked list
 */
public class LinkedList<T> {

    /**
     * The head node of the linked list.
     */
    Node head;
    /**
     * The tail node of the linked list.
     */
    Node tail;

    // <editor-fold defaultstate="collapsed" desc="Constructor">   
    /**
     * Constructs an empty LinkedList.
     */
    public LinkedList() {
        this.head = null;
        this.tail = null;
    }
    // </editor-fold>  

    // <editor-fold defaultstate="collapsed" desc="Tail">   
    /**
     * Returns the tail node of the linked list.
     *
     * @return the tail node of the linked list
     */
    public Node getTail() {
        return tail;
    }

    /**
     * Sets the tail node of the linked list.
     *
     * @param tail the tail node to be set
     */
    public void setTail(Node tail) {
        this.tail = tail;
    }
    // </editor-fold> 

    // <editor-fold defaultstate="collapsed" desc="Head">   
    /**
     * Returns the head node of the linked list.
     *
     * @return the head node of the linked list
     */
    public Node getHead() {
        return head;
    }

    /**
     * Sets the head node of the linked list.
     *
     * @param head the head node to be set
     */
    public void setHead(Node head) {
        this.head = head;
    }
    // </editor-fold> 

    // <editor-fold defaultstate="collapsed" desc="Basic functions">   
    /**
     * Checks if the linked list is empty.
     *
     * @return true if the linked list is empty, false otherwise
     */
    public boolean isEmpty() {
        return head == null;
    }

    /**
     * Returns the size of the linked list.
     *
     * @return the number of elements in the linked list
     */
    public int size() {
        Node aux = head;
        int i = 0;
        while (aux != null) {
            i++;
            aux = aux.getNext();
        }
        return i;
    }
    // </editor-fold> 

    // <editor-fold defaultstate="collapsed" desc="Advance functions">   
    /**
     * Rotates the elements in the linked list in a clockwise direction.
     *
     * @return a new LinkedList with the elements rotated
     */
    public LinkedList rotate() {
        Node aux = head;
        LinkedList volteada = new LinkedList();
        while (aux != null) {
            volteada.addFirst(aux.getDato());
            aux = aux.getNext();
        }

        return volteada;
    }

    /**
     * Sorts the elements in the linked list in ascending order based on the DNI
     * of the User in each Reservation.
     */
    public void sort() {
        Node pivot = head;
        Node siguiente;
        Node antes;
        siguiente = pivot.getNext();
        antes = null;
        boolean iteraccion = false;
        while (siguiente != null) {
            Reservation r = (Reservation) pivot.getDato();
            Reservation a = (Reservation) siguiente.getDato();
            if (antes == null) {
                if ((int) r.getDni() > (int) a.getDni()) {
                    pivot.setNext(siguiente.getNext());
                    antes = siguiente;
                    antes.setNext(pivot);
                    siguiente = pivot.getNext();
                    head = antes;
                    iteraccion = true;
                } else {
                    antes = pivot;
                    pivot = antes.getNext();
                    siguiente = pivot.getNext();
                }
            } else {
                if ((int) r.getDni() > (int) a.getDni()) {
                    pivot.setNext(siguiente.getNext());
                    siguiente.setNext(pivot);
                    antes.setNext(siguiente);
                    antes = siguiente;
                    siguiente = pivot.getNext();
                    iteraccion = true;
                } else {
                    antes = pivot;
                    pivot = antes.getNext();
                    siguiente = pivot.getNext();
                }
            }
        }
        if (iteraccion == true) {
            sort();
        }
    }

    /**
     * Performs merge sort on the linked list.
     *
     * @param node the head node of the linked list to be sorted
     * @return the head node of the sorted linked list
     */
    public Node mergeSort(Node node) {
        if (node == null || node.getNext() == null) {
            return node;
        }
        Node middle = getMiddle(node);
        Node nextOfMiddle = middle.getNext();
        middle.setNext(null);
        Node left = mergeSort(node);
        Node right = mergeSort(nextOfMiddle);
        Node sortedList = merge(left, right);
        return sortedList;
    }

    /**
     * Returns the middle node of a given linked list.
     *
     * @param node the head node of the linked list
     * @return the middle node of the linked list
     */
    private Node getMiddle(Node node) {
        if (node == null) {
            return node;
        }
        Node slow = node;
        Node fast = node;
        while (fast.getNext() != null && fast.getNext().getNext() != null) {
            slow = slow.getNext();
            fast = fast.getNext().getNext();
        }
        return slow;
    }

    /**
     * Merges two sorted linked lists into a single sorted linked list.
     *
     * @param left the head node of the first sorted linked list
     * @param right the head node of the second sorted linked list
     * @return the head node of the merged sorted linked list
     */
    private Node merge(Node left, Node right) {
        Node sortedList = null;
        if (left == null) {
            return right;
        }
        if (right == null) {
            return left;
        }
        Reservation r = (Reservation) left.getDato();
        Reservation a = (Reservation) left.getDato();
        if (r.getUser().getDni() <= a.getUser().getDni()) {
            sortedList = left;
            sortedList.setNext(merge(left.getNext(), right));
        } else {
            sortedList = right;
            sortedList.setNext(merge(left, right.getNext()));
        }
        return sortedList;
    }
    // </editor-fold> 

    // <editor-fold defaultstate="collapsed" desc="Add">   
    /**
     * Adds an element to the beginning of the linked list.
     *
     * @param dato the element to be added
     */
    public void addFirst(T dato) {
        Node aux = new Node(dato);
        if (isEmpty()) {
            setHead(aux);
            setTail(aux);

        } else {
            aux.setNext(head);
            setHead(aux);

        }
    }

    /**
     * Adds an element to the end of the linked list.
     *
     * @param dato the element to be added
     */
    public void addLast(T dato) {
        Node aux = new Node(dato);
        if (isEmpty()) {
            setHead(aux);
            setTail(aux);

        } else {
            getTail().setNext(aux);
            setTail(aux);

        }

    }

    /**
     * Adds an element at the specified index in the linked list.
     *
     * @param index the index at which the element should be added
     * @param dato the element to be added
     */
    public void addInIndex(int index, T dato) {
        Node aux = new Node(dato);

        if (isEmpty()) {
            setHead(aux);
        } else {
            if (index > size()) {
                // JOptionPane.showMessageDialog(null, "Esta fuera del tamaño de la lista");
            } else {
                Node pivot = getHead();
                int count = 0;
                while (count < (index - 1) && pivot.getNext() != null) {
                    pivot = pivot.getNext();
                    count++;
                }
                aux.setNext(pivot.getNext());
                pivot.setNext(aux);
            }
        }
    }
    // </editor-fold> 

    // <editor-fold defaultstate="collapsed" desc="Delete">  
    /**
     * Deletes the first element from the linked list.
     */
    public void deleteFirst() {
        if (!isEmpty()) {
            Node pivot = getHead();
            setHead(pivot.getNext());
            pivot.setNext(null);
        } else {
            // JOptionPane.showMessageDialog(null, "Esta vacia");
        }
    }

    /**
     * Deletes a specific reservation from the linked list.
     *
     * @param d the reservation to be deleted
     */
    public void deleteReserv(Reservation d) {

        if (!isEmpty()) {

            Node pivot = getHead();

            Reservation r = (Reservation) pivot.getDato();
            if (r == d) {
                setHead(null);
            } else {
                while (pivot.getNext() != null) {
                    r = (Reservation) pivot.getNext().getDato();
                    if (r == d) {
                        pivot.setNext(pivot.getNext().getNext());
                        return;
                    }
                    pivot = pivot.getNext();
                }
            }

        } else {
            // JOptionPane.showMessageDialog(null, "La lista esta vacia");
        }
    }

    /**
     * Deletes a user with the given name and last name from the linked list.
     *
     * @param name the name of the user
     * @param last_name the last name of the user
     */
    public void deleteUser(String name, String last_name) {
        name = name.toLowerCase();
        last_name = last_name.toLowerCase();
        if (!isEmpty()) {

            Node pivot = getHead();

            User r = (User) pivot.getDato();
            r.show();
            if (r.getName().toLowerCase().equals(name) && r.getLast_name().toLowerCase().equals(last_name)) {
                setHead(null);
            } else {
                while (pivot.getNext() != null) {
                    r = (User) pivot.getNext().getDato();
                    r.show();
                    if (r.getName().toLowerCase().equals(name) && r.getLast_name().toLowerCase().equals(last_name)) {
                        pivot.setNext(pivot.getNext().getNext());
                        return;
                    }
                    pivot = pivot.getNext();
                }
            }

        } else {
            // JOptionPane.showMessageDialog(null, "La lista esta vacia");
        }
    }

    /**
     * Deletes the last element from the linked list.
     */
    public void deleteLast() {

        if (!isEmpty()) {
            Node pivot = getHead();

            if (size() == 1) {
                setHead(null);

            } else {
                while (pivot.getNext() != null && pivot.getNext().getNext() != null) {
                    pivot = pivot.getNext();
                }
                Node last = pivot.getNext();
                pivot.setNext(null);
                setTail(pivot);
            }

        } else {
            // JOptionPane.showMessageDialog(null, "La lista esta vacia");
        }
    }

    /**
     * Deletes the element at the specified index from the linked list.
     *
     * @param index the index of the element to be deleted
     */
    public void deleteInIndex(int index) {
        if (!isEmpty()) {
            Node pivot = getHead();
            if (index > size()) {
                // JOptionPane.showMessageDialog(null, "Esta fuera del tamaño");
            } else {
                int count = 0;
                while (count < (index - 1) && pivot.getNext() != null) {
                    pivot = pivot.getNext();
                    count++;
                }
            }
            Node aux = pivot.getNext();
            pivot.setNext(aux.getNext());
            aux.setNext(null);
        }
    }
    // </editor-fold> 

    // <editor-fold defaultstate="collapsed" desc="Show">   
    /**
     * Displays the elements of the linked list.
     */
    public void show() {
        Node aux = head;
        while (aux != null) {
            User r = (User) aux.getDato();
            r.show();
            aux = aux.next;
        }
    }
    // </editor-fold> 

    // <editor-fold defaultstate="collapsed" desc="Extra functions">
    /**
     * Searches for the node containing the provided name and last name in the
     * list.
     *
     * @param data The name of the user.
     * @param data2 The last name of the user.
     * @return The node if it exists, null otherwise.
     */
    public T getDato(String data, String data2) {
        // Es para obtener el valor del nodo que buscamos, despues de usar el search, igualmente se usa parametos especificos para el tipo de dato.
        data = data.toLowerCase();
        data2 = data2.toLowerCase();
        Node aux = head;
        while (aux != null) {
            User u = (User) aux.getDato();
            if (u.getName().toLowerCase().equals(data) && u.getLast_name().toLowerCase().equals(data2)) {
                return (T) aux.getDato();
            }

            aux = aux.getNext();
        }
        return null;
    }

    /**
     * Returns the data stored in the node at the given position.
     *
     * @param d The position.
     * @return The node. Null if the position is not valid.
     */
    public T getValuePosition(int d) {
        Node aux = head;
        int i = 0;
        while (aux != null) {
            if (i == d) {
                return (T) aux.getDato();
            }
            i++;
            aux = aux.getNext();
        }
        return null;
    }

    /**
     * Searches for the position of the node containing the given data in the
     * list.
     *
     * @param dato The data to search for.
     * @return The position of the node if found, or -1 if the node doesn't
     * exist in the list.
     */
    public int getPosicion(T dato) {
        Node aux = head;
        int i = 0;
        while (aux != null) {
            if ((int) aux.getDato() == (int) dato) {
                return i;
            }
            i++;
            aux = aux.getNext();
        }
        return -1;
    }

    /**
     * Searches for the node with the given name and last name.
     *
     * @param data The name of the person.
     * @param data2 The last name of the person.
     * @return True if the node exists, false otherwise.
     */
    public boolean search(T data, T data2) {
        Node aux = head;
        while (aux != null) {
            User u = (User) aux.getDato();
            if (u.getName() == data && u.getLast_name() == data2) {
                return true;
            }
            aux = aux.getNext();
        }
        return false;
    }

    /**
     * Creates a copy of the linked list.
     *
     * @return A new LinkedList object that is a copy of the original list.
     */
    public LinkedList copyList() {
        LinkedList n = new LinkedList();
        Node aux = head;
        while (aux != null) {
            n.addLast(aux.getDato());
            aux = aux.getNext();

        }
        return n;

    }

    /**
     * Returns the node before the given node.
     *
     * @param t The node.
     * @return The node before the given node.
     */
    public Node before(Node t) {
        Node aux = head;
        while (aux.getNext() != t) {
            aux = aux.getNext();
        }
        return aux;
    }

    /**
     * Searches for a reservation using binary search algorithm.
     *
     * @param dni The DNI (identification number) to search for.
     * @param aux The linked list to search within.
     * @return The reservation if found, null otherwise.
     */
    public Reservation seachBina(T dni, LinkedList aux) {
        Node middle = getMiddle(aux.getHead());
        Reservation r = (Reservation) middle.getDato();
        Reservation lastReserv = (Reservation) aux.tail.getDato();
        Reservation firstReserv = (Reservation) aux.head.getDato();

        if (middle == aux.getHead() && aux.getTail() == middle && r.getDni() != (int) dni) {
            return null;
        }
        if (r.getDni() < (int) dni) {
            aux.setHead(middle.getNext());
            return seachBina(dni, aux);
        } else if (r.getDni() > (int) dni) {
            aux.setTail(aux.before(middle));
            aux.getTail().setNext(null);
            return seachBina(dni, aux);
        } else if (r.getDni() == (int) dni) {
            return (Reservation) middle.getDato();
        } else {
            return null;
        }
    }

    /**
     * Searches for a node containing the given data in the list.
     *
     * @param data The data to search for.
     * @return The node if found, or null if the node doesn't exist in the list.
     */
    public T search2(T data) {
        Node aux = head;
        while (aux != null) {
            String[] numeros = (String[]) aux.getDato();
            if ((int) data == Integer.parseInt(numeros[1])) {
                return (T) aux.getDato();
            }
            aux = aux.getNext();
        }
        return null;
    }
    // </editor-fold> 
}
