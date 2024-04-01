/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import javax.swing.JOptionPane;

/**
 * Utility class with helper methods.
 */
public class Utils {

    /**
     * Requests the DNI (identification number).
     *
     * @return the DNI entered by the user
     */
    public static int requestDNI() {
        int dni;
        // =====================================================================
        dni = Integer.parseInt(JOptionPane.showInputDialog("Cédula por favor (Sólo números)"));
        // =====================================================================
        return dni;
    }

    /**
     * Requests the name.
     *
     * @return the name entered by the user
     */
    public static String requestName() {
        String name;
        // =====================================================================
        name = JOptionPane.showInputDialog("Nombre por favor").trim();
        // =====================================================================
        return name;
    }

    /**
     * Requests the last name.
     *
     * @return the last name entered by the user
     */
    public static String requestLastame() {
        String name;
        // =====================================================================
        name = JOptionPane.showInputDialog("Apellido por favor").trim();
        // =====================================================================
        return name;
    }

    /**
     * Requests the number of bedrooms.
     *
     * @return the number of bedrooms entered by the user
     */
    public static int requestNumBedroom() {
        int bedroom;
        // =====================================================================
        bedroom = Integer.parseInt(JOptionPane.showInputDialog("Número de habitación por favor (Solo números)"));
        // =====================================================================
        return bedroom;
    }

    /**
     * Displays an information message.
     *
     * @param msg the message to display
     */
    public static void info(String msg) {
        JOptionPane.showMessageDialog(null, msg);
    }
}
