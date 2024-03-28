/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Structure;

import Structure.Reservation;

/**
 *
 * @author eduardopinzon
 */
public class CheckIn {
    private Reservation[][] guestsRegister;
    private int index;
    
    public CheckIn(int size){
        this.guestsRegister = new Reservation[size][2];
        this.index = 0;
    }

}
