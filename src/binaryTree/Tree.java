/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binaryTree;

import gui.ShowHistorialGUI;
import user.User;

/**
 * The Tree class represents a binary tree. It provides methods for inserting
 * nodes, searching for nodes, and performing various tree traversal operations.
 *
 * The class contains a reference to the root node of the tree and supports
 * operations such as inserting a new node, searching for a node with a specific
 * value, and performing in-order, pre-order, and post-order traversals of the
 * tree.
 *
 * @author VirginiaT
 */
public class Tree {

    /**
     * The root node of the binary tree.
     */
    Node pRoot;

    /**
     * Constructs an empty binary tree.
     */
    public Tree() {
        this.pRoot = null;
    }

    /**
     * Returns the root node of the binary tree.
     *
     * @return the root node of the binary tree
     */
    public Node getpRoot() {
        return pRoot;
    }

    /**
     * Sets the root node of the binary tree.
     *
     * @param pRoot the root node of the binary tree to set
     */
    public void setpRoot(Node pRoot) {
        this.pRoot = pRoot;
    }

    /**
     * Inserts a new node into the binary tree.
     *
     * @param pRoot the root node of the binary tree
     * @param aux the node to be inserted
     */
    public void insert(Node pRoot, Node aux) {
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

    /**
     * Searches for a node with the specified data in the binary tree.
     *
     * @param aux the current node being checked
     * @param data the data to search for
     * @return the node with the specified data, or null if not found
     */
    public Node search(Node aux, int data) {
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

    /**
     * Performs an in-order traversal of the binary tree.
     *
     * @param root the current root node
     */
    public void inOrder(Node root) {
        if (root != null) {
            inOrder(root.getLeft());
            User u = (User) root.getDato();
            inOrder(root.getRight());
        }
    }

    /**
     * Performs a pre-order traversal of the binary tree.
     *
     * @param root the current root node
     */
    public void preOrder(Node root) {
        if (root != null) {
            ;
            preOrder(root.getLeft());
            preOrder(root.getRight());
        }
    }

    /**
     * Performs a post-order traversal of the binary tree.
     *
     * @param root the current root node
     */
    public void postOrder(Node root) {
        if (root != null) {
            postOrder(root.getLeft());
            postOrder(root.getRight());
            System.out.print(root.getDato() + ",");
        }
    }

    // =========================================================================
    /**
     * Shows the historical records of the binary tree.
     *
     * @param root the current root node
     */
    public void showHistorial(Node root) {
        if (root != null) {
            showHistorial(root.getLeft());
            User u = (User) root.getDato();
            // =================================================================
            User user_aux = u;
            ShowHistorialGUI gui = new ShowHistorialGUI(user_aux);
            // =================================================================
            showHistorial(root.getRight());
        }
    }
    // =========================================================================
}
