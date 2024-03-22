/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author VirginiaT
 */
public class Bedroom {
    
    /**
     * The type of the bedroom.
     */
    private String type;
    /**
     * The floor number where the bedroom is located.
     */
    private int floor;
    /**
     * The occupancy status of the bedroom.
     */
    private boolean occupied;
    /**
     * The tree representing the bedroom's history.
     */
    private Tree tree;

    /**
     * Creates a new Bedroom object with the specified type and floor. The
     * associated tree is initialized as an empty tree.
     *
     * @param type the type of the bedroom
     * @param floor the floor number where the bedroom is located
     */
    public Bedroom(String type, int floor) {
        this.type = type;
        this.floor = floor;
        this.tree = new Tree();
    }

    /**
     * Returns the tree associated with the bedroom.
     *
     * @return the associated tree
     */
    public Tree getTree() {
        return tree;
    }

    /**
     * Sets the associated tree for the bedroom.
     *
     * @param tree the tree to be associated with the bedroom
     */
    public void setTree(Tree tree) {
        this.tree = tree;
    }

    /**
     * Checks if the bedroom is occupied.
     *
     * @return true if the bedroom is occupied, false otherwise
     */
    public boolean isOccupied() {
        return occupied;
    }

    /**
     * Sets the occupancy status of the bedroom.
     *
     * @param occupied the occupancy status of the bedroom
     */
    public void setOccupied(boolean occupied) {
        this.occupied = occupied;
    }

    /**
     * Returns the type of the bedroom.
     *
     * @return the type of the bedroom
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the type of the bedroom.
     *
     * @param type the type of the bedroom
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Returns the floor number where the bedroom is located.
     *
     * @return the floor number
     */
    public int getFloor() {
        return floor;
    }

    /**
     * Sets the floor number where the bedroom is located.
     *
     * @param floor the floor number
     */
    public void setFloor(int floor) {
        this.floor = floor;
    }

    /**
     * Displays the information of the bedroom, including the type and floor.
     */
    public void show() {
        System.out.println(type);
        System.out.println(floor);

    }
    
}
