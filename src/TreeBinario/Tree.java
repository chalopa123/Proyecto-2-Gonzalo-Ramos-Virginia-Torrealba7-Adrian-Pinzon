/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TreeBinario;

import Classes.Clientes2;

/**
 *
 * @author VirginiaT
 */

// Clase Tree

/**
 * 
 * @author VirginiaT
 * 
 * La clase Tree representa un árbol binario de búsqueda, que permite insertar nodos, búsqueda de nodos
 * y realizar sus respectivos recorridos ingresando a través de su nodo Raíz .
 *
 * Entre sus recorridos están Pre-Orden, In-Orden y Post-Orden.
 */

public class Tree {
    
   
    Nodo2 pRoot;

   
    public Tree() {
        this.pRoot = null;
    }

   
    public Nodo2 getpRoot() {
        return pRoot;
    }

   
    public void setpRoot(Nodo2 pRoot) {
        this.pRoot = pRoot;
    }

  
    public void insert(Nodo2 pRoot, Nodo2 aux) {
        if (this.pRoot == null) {
            this.pRoot = aux;
            
        } else {
            Clientes2 c = (Clientes2) aux.getDato();
            Clientes2 c2 = (Clientes2) pRoot.getDato();
            if (c.getDni() < c2.getDni()) {
                if (pRoot.getIzq() == null) {
                    pRoot.setIzq(aux);
                } else {
                    insert(pRoot.getIzq(), aux);
                }
            } else if (c.getDni() > c2.getDni()) {
                if (pRoot.getDer() == null) {
                    pRoot.setDer(aux);
                } else {
                    insert(pRoot.getDer(), aux);
                }
            } else {
                System.out.println("El elemento ya se encuentra en el Árbol");
            }
        }

    }

 
    public Nodo2 search(Nodo2 aux, int data) {
        if (aux == null) {
            return null;
        }

        if ((int) aux.getDato() == data) {
            return aux;
        } else if (data < (int) aux.getDato()) {
            return search(aux.getIzq(), data);
        } else {
            return search(aux.getDer(), data);
        }

    }

  
    public void inOrder(Nodo2 root) {
        if (root != null) {
            inOrder(root.getIzq());
            Clientes2 c = (Clientes2) root.getDato();
            inOrder(root.getDer());
        }
    }

    public void preOrder(Nodo2 root) {
        if (root != null) {
            ;
            preOrder(root.getIzq());
            preOrder(root.getDer());
        }
    }

   
    public void postOrder(Nodo2 root) {
        if (root != null) {
            postOrder(root.getIzq());
            postOrder(root.getDer());
            System.out.print(root.getDato() + ",");
        }
    }
    
}
