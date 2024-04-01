/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binaryTree;

/**
 * The Node class represents a node in a binary tree. It contains a data element
 * and references to its left and right child nodes.
 *
 * @param <T> the type of data stored in the node
 */
public class Node<T> {

    /**
     * The data element stored in the node.
     */
    T dato;
    /**
     * The left child node.
     */
    Node left;
    /**
     * The right child node.
     */
    Node right;

    /**
     * Constructs a node with the specified data.
     *
     * @param dato the data element to be stored in the node
     */
    public Node(T dato) {
        this.dato = dato;
        this.right = null;
        this.left = null;
    }

    /**
     * Returns the data element stored in the node.
     *
     * @return the data element stored in the node
     */
    public T getDato() {
        return dato;
    }

    /**
     * Sets the data element stored in the node.
     *
     * @param dato the data element to be set
     */
    public void setDato(T dato) {
        this.dato = dato;
    }

    /**
     * Returns the left child node of the current node.
     *
     * @return the left child node
     */
    public Node getLeft() {
        return left;
    }

    /**
     * Sets the left child node of the current node.
     *
     * @param left the left child node to be set
     */
    public void setLeft(Node left) {
        this.left = left;
    }

    /**
     * Returns the right child node of the current node.
     *
     * @return the right child node
     */
    public Node getRight() {
        return right;
    }

    /**
     * Sets the right child node of the current node.
     *
     * @param right the right child node to be set
     */
    public void setRight(Node right) {
        this.right = right;
    }

    /**
     * Checks if the node is a leaf node (i.e., has no child nodes).
     *
     * @return true if the node is a leaf node, false otherwise
     */
    public boolean isLeaf() {
        return (this.left == null && this.right == null);
    }
}
