/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import javax.swing.JOptionPane;

/**
 * Utility class for displaying error messages.
 */
public class Errors {

    /**
     * Displays an error message for invalid input.
     */
    public static void invalidInput() {
        String msg = "ERROR: No es posible este comportamiento!";
        message(msg);
    }

    /**
     * Displays an error message for a reservation not found.
     */
    public static void reservationNotFounded() {
        String msg = "ERROR: La reservación no existe!";
        message(msg);
    }

    /**
     * Displays an error message for a hosted not found.
     */
    public static void hostedNotFounded() {
        String msg = "ERROR: El cliente no se encuentra!";
        message(msg);
    }

    /**
     * Displays an error message for a client not found.
     */
    public static void clientNotFounded() {
        String msg = "ERROR: El cliente no se encuentra!";
        message(msg);
    }

    /**
     * Displays an error message for an undefined error.
     */
    public static void undefinedError() {
        String msg = "ERROR: Se ha producido un error inesperado!";
        message(msg);
    }

    /**
     * Displays an error message for out of length bedrooms.
     */
    public static void outOfLenghtBedrooms() {
        String msg = "ERROR: El número que ha introducido es inválido o no existe la habitación!!";
        message(msg);
    }

    /**
     * Displays an error message for no available bedrooms.
     */
    public static void noAvaliableBedrooms() {
        String msg = "ERROR: No hay habitaciones disponibles. Su reserva va a quedar a la espera!";
        message(msg);
    }

    /**
     * Displays a custom error message.
     *
     * @param msg the error message to display
     */
    private static void message(String msg) {
        JOptionPane.showMessageDialog(null, msg, "ERROR", JOptionPane.ERROR_MESSAGE);
    }
}
