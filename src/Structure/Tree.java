/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Structure;

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
            User u = (User) aux.getDato();
            User p = (User) pRoot.getDato();
            if (u.getDni() < p.getDni()) {
                if (pRoot.getLeft() == null) {
                    pRoot.setLeft(aux);
                } else {
                    insert(pRoot.getLeft(), aux);
                }
            } else if (u.getDni() > p.getDni()) {
                if (pRoot.getRight() == null) {
                    pRoot.setRight(aux);
                } else {
                    insert(pRoot.getRight(), aux);
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
            return search(aux.getLeft(), data);
        } else {
            return search(aux.getRight(), data);
        }

    }

  
    public void inOrder(Nodo root) {
        if (root != null) {
            inOrder(root.getLeft());
            User u = (User) root.getDato();
            inOrder(root.getRight());
        }
    }

    public void preOrder(Nodo root) {
        if (root != null) {
            ;
            preOrder(root.getLeft());
            preOrder(root.getRight());
        }
    }

   
    public void postOrder(Nodo root) {
        if (root != null) {
            postOrder(root.getLeft());
            postOrder(root.getRight());
            System.out.print(root.getDato() + ",");
        }
    }
    
}
