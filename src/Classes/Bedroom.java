/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import TreeBinario.Tree;

/**
 *
 * @author VirginiaT
 */

// Clase Bedroom

public class Bedroom {
    
    
    private String type;
    
    private int floor;
    
    private boolean occupied;
    
    private Tree tree;
    
    /**
     * @param type estilo de la habitación.
     * @param floor el número de piso donde está localizada la habitación
     */
  
    public Bedroom(String type, int floor) {
        this.type = type;
        this.floor = floor;
        this.tree = new Tree();
    }

 
    public Tree getTree() {
        return tree;
    }

   
    public void setTree(Tree tree) {
        this.tree = tree;
    }

    public boolean isOccupied() {
        return occupied;
    }

  
    public void setOccupied(boolean occupied) {
        this.occupied = occupied;
    }

  
    public String getType() {
        return type;
    }

  
    public void setType(String type) {
        this.type = type;
    }

    
    public int getFloor() {
        return floor;
    }

   
    public void setFloor(int floor) {
        this.floor = floor;
    }

    
    public void show() {
        System.out.println(type);
        System.out.println(floor);

    }
    
}
