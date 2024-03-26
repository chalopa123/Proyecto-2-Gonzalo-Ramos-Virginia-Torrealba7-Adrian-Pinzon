/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TreeBinario;

import Structure.Nodo;

/**
 *
 * @author VirginiaT
 */

// Clase Tree

public class Tree {
    
   
    Nodo pRoot;

   
    public Tree() {
        this.pRoot = null;
    }

   
    public Nodo getpRoot() {
        return pRoot;
    }

   
    public void setpRoot(Nodo pRoot) {
        this.pRoot = pRoot;
    }

  
    public void insert(Nodo pRoot, Nodo aux) {
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

 
    public Nodo search(Nodo aux, int data) {
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

  
    public void inOrder(Nodo root) {
        if (root != null) {
            inOrder(root.getIzq());
            Clientes2 c = (Clientes2) root.getDato();
            inOrder(root.getDer());
        }
    }

    public void preOrder(Nodo root) {
        if (root != null) {
            ;
            preOrder(root.getIzq());
            preOrder(root.getDer());
        }
    }

   
    public void postOrder(Nodo root) {
        if (root != null) {
            postOrder(root.getIzq());
            postOrder(root.getDer());
            System.out.print(root.getDato() + ",");
        }
    }
    
}
