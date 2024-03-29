
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
    private String[][] guestsRegister;
    private int index;
    
    public CheckIn(int size){
        this.guestsRegister = new String[size][2];
        this.index = 0;
    }
    
    public void Registrar(String reservationId, String roomId){
        if (index < guestsRegister.length) {
            guestsRegister[index][0] = reservationId;
            guestsRegister[index][1] = roomId;
            System.out.println("Check-in completado. Habitacion " + roomId + " asignada a la reservacion " + reservationId);
            index ++;
        } else {
            System.out.println("No hay habitaciones disponibles. No se puede hacer check-in.");
        }
    }

}
