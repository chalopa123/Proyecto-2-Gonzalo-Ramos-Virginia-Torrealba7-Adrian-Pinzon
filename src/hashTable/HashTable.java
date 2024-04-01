/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashTable;

import linkedList.LinkedList;
import user.User;

/**
 * HashTable implementation using an array of LinkedLists.
 *
 * @param <T> The type of elements to be stored in the HashTable.
 */
public class HashTable<T> {

    /**
     * Array of LinkedLists to store the elements.
     */
    LinkedList<User>[] table;
    /**
     * Size of the HashTable.
     */
    int size;

    // <editor-fold defaultstate="collapsed" desc="Constructor">   
    /**
     * Constructs a HashTable with the specified size.
     *
     * @param n The size of the HashTable.
     */
    public HashTable(int n) {
        size = n;
        table = new LinkedList[n];
        for (int i = 0; i < n; i++) {
            table[i] = new LinkedList();
        }

    }
    // </editor-fold> 

    // <editor-fold defaultstate="collapsed" desc="Table">  
    /**
     * Returns the array of LinkedLists in the HashTable.
     *
     * @return The array of LinkedLists.
     */
    public LinkedList[] getTable() {
        return table;
    }

    /**
     * Sets the array of LinkedLists in the HashTable.
     *
     * @param table The array of LinkedLists to set.
     */
    public void setTable(LinkedList[] table) {
        this.table = table;
    }
    // </editor-fold> 

    // <editor-fold defaultstate="collapsed" desc="Size"> 
    /**
     * Returns the size of the HashTable.
     *
     * @return The size of the HashTable.
     */
    public int getSize() {
        return size;
    }

    /**
     * Sets the size of the HashTable.
     *
     * @param size The size of the HashTable.
     */
    public void setSize(int size) {
        this.size = size;
    }
    // </editor-fold> 

    // <editor-fold defaultstate="collapsed" desc="Insert">   
    /**
     * Inserts a value into the HashTable.
     *
     * @param value The value to insert.
     */
    public void insert(T value) {
        User u = (User) value;
        int index = hashFunction(u.getName(), u.getLast_name());
        LinkedList<User> list = table[index];
        list.addLast((User) u);
    }
    // </editor-fold> 

    // <editor-fold defaultstate="collapsed" desc="Delete">   
    /**
     * Deletes an element from the HashTable based on the specified keys.
     *
     * @param key The key to search for (name of the user).
     * @param key2 The second key to search for (last name of the user).
     */
    public void delete(String key, String key2) {
        int index = hashFunction(key, key2);
        table[index].deleteUser(key, key2);
    }
    // </editor-fold> 

    // <editor-fold defaultstate="collapsed" desc="Search">   
    /**
     * Searches for an element in the HashTable based on the specified keys.
     *
     * @param key The key to search for (name of the user).
     * @param key2 The second key to search for (last name of the user).
     * @return The User object if found, or null if not found.
     */
    public User search(String key, String key2) {
        int index = hashFunction(key, key2);
        LinkedList list = table[index];
        if (list.isEmpty()) {
            return null;
        } else {
            return (User) list.getDato(key, key2);
        }
    }
    // </editor-fold> 

    // <editor-fold defaultstate="collapsed" desc="Show">   
    /**
     * Prints the elements of the HashTable.
     */
    public void show() {
        int n = 0;
        for (int i = 0; i < size; i++) {
            if (table[i] != null) {
                n++;
                table[i].show();
            }
        }

    }
    // </editor-fold> 

    // <editor-fold defaultstate="collapsed" desc="Hash function">  
    /**
     * Hash function to calculate the index based on the keys.
     *
     * @param key The key (name of the user).
     * @param key2 The second key (last name of the user).
     * @return The calculated index.
     */
    private int hashFunction(String key, String key2) {
        int value = 0;
        key = key.toLowerCase();
        key2 = key2.toLowerCase();
        for (int i = 0; i < key.length(); i++) {
            char caracter = key.charAt(i);
            value += (int) caracter;
        }

        for (int i = 0; i < key2.length(); i++) {
            char caracter = key2.charAt(i);
            value += (int) caracter;
        }
        return value % size;
    }
    // </editor-fold> 
}
