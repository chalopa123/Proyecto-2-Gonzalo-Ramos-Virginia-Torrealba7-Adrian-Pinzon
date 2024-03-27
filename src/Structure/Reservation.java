/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Structure;

import Classes.Clientes2;

/**
 *
 * @author eduardopinzon
 */
public class Reservation {
    
    /**
     * User information of the reservation.
     */
    private Clientes2 user;
    /**
     * Type of the room: Simple, double, triple, suite.
     */
    private String type;

    // <editor-fold defaultstate="collapsed" desc="Constructor">   
    /**
     * Constructs a new Reservation object.
     *
     * @param user the user associated with the reservation
     * @param type the type of the room
     */
    public Reservation(Clientes2 user, String type) {
        this.user = user;
        this.type = type;
    }
    // </editor-fold>  

    // <editor-fold defaultstate="collapsed" desc="User">   
    /**
     * Returns the user associated with the reservation.
     *
     * @return the user associated with the reservation
     */
    public Clientes2 getUser() {
        return user;
    }

    /**
     * Sets the user associated with the reservation.
     *
     * @param user the user to set
     */
    public void setUser(Clientes2 user) {
        this.user = user;
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
        return user.getDni();
    }
    // </editor-fold>  

    // <editor-fold defaultstate="collapsed" desc="Show">   
    /**
     * Displays the reservation details.
     */
    public void show() {
        System.out.println(user.getDni());
        user.show();
    }
    // </editor-fold> 
}
