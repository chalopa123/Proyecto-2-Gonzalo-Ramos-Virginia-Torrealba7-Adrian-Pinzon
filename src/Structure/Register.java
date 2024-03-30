/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Structure;


/**
 *
 * @author eduardopinzon
 */


public class Register {
    private String[][] guestsRegister;
    private int index;
    
    public Register(int size){
        this.guestsRegister = new String[size][2];
        this.index = 0;
    }
    
    public void checkIn(String reservationId, String roomId){
        if (index < guestsRegister.length) {
            guestsRegister[index][0] = reservationId;
            guestsRegister[index][1] = roomId;
            System.out.println("Check-in completado. Habitacion " + roomId + " asignada a la reservacion " + reservationId);
            index ++;
        } else {
            System.out.println("No hay habitaciones disponibles. No se puede hacer check-in.");
        }
    }
    public void checkOut(String reservationId) {
        for (int i = 0; i < index; i++) {
            if (guestsRegister[i][0].equals(reservationId)) {
                System.out.println("Check-out completado para la reservación " + reservationId);
                // Shift the remaining elements to the left
                for (int j = i; j < index - 1; j++) {
                    guestsRegister[j][0] = guestsRegister[j + 1][0];
                    guestsRegister[j][1] = guestsRegister[j + 1][1];
                }
                index--;
                return;
            }    
        }
    }      
}
