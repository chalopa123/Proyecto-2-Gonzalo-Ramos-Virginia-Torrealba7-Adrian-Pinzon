/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Structure;

/**
 *
 * @author VirginiaT
 */


import Classes.Clientes2;


public class Reservation2 {
    
    /**
 * Represents a reservation with user information and room type.
 */

    
    private Clientes2 clientes2;
    /**
     * Type of the room: Simple, double, triple, suite.
     */
    private String type;




 /**
     * Constructs a new Reservation object.
     *
     * @param clientes2 the user associated with the reservation
     * @param type the type of the room
     */


    public Reservation2(Clientes2 clientes2, String type) {
        this.clientes2 = clientes2;
        this.type = type;
    }


   
    // </editor-fold>  

    // <editor-fold defaultstate="collapsed" desc="User">   
    /**
     * Returns the user associated with the reservation.
     *
     * @return the user associated with the reservation
     */
    public Clientes2 getClientes2() {
        return clientes2;
    }

    /**
     * Sets the user associated with the reservation.
     *
     * @param user the user to set
     */
    public void setClientes2(Clientes2 clientes2) {
        this.clientes2 = clientes2;
    }
    // </editor-fold>  

    // <editor-fold defaultstate="collapsed" desc="Type">   
    /**
     * Returns the type of the room.
     *
     * @return the type of the room
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the type of the room.
     *
     * @param type the type of the room to set
     */
    public void setType(String type) {
        this.type = type;
    }
    // </editor-fold> 

    // <editor-fold defaultstate="collapsed" desc="FUNCIÓN: Buscar reservación">   
    /**
     * Returns the DNI (identification number) of the user associated with the
     * reservation.
     *
     * @return the DNI of the user
     */
    public int getDni() {
        return clientes2.getDni();
    }
    // </editor-fold>  

    // <editor-fold defaultstate="collapsed" desc="Show">   
    /**
     * Displays the reservation details.
     */
    public void show() {
        System.out.println(clientes2.getDni());
        clientes2.show();
    }
    // </editor-fold> 
}



