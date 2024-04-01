/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package app;

import Classes.Bedroom;
import TreeBinario.Nodo2;
import Structure.ExcelManager;
import gui.MainGUI;
import gui.ShowClientGUI;
import gui.ShowHostedGUI;
import Structure.HashTable;
import java.io.File;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import Structure.LinkedList;
import Structure.Reservation;
import Classes.Clientes2;
import Utilidad.Errors;
import Utilidad.Utils;

/**
 
 *
 * 
 */

public class App {

    /**
     * The title of the CRUD project.
     */
    private String title = "CRUD PROJECT V2";

    /**
     * An instance of the ExcelManager class used for handling Excel files.
     */
    private ExcelManager xlsx = new ExcelManager();

    /**
     * The file path to the database file. It is constructed using the system
     * property "user.dir" and points to the "database.xlsx" file located in the
     * "src/database" directory.
     */
    private String databasePath = System.getProperty("user.dir") + File.separator + "src" + File.separator + "database" + File.separator + "database.xlsx";

    /**
     * An array of Bedroom objects representing the available bedrooms.
     */
    private Bedroom[] habs;

    /**
     * A LinkedList representing a list of reservations.
     */
    private LinkedList reserv;

    /**
     * A HashTable used for storing status information.
     */
    private HashTable status;

    /**
     * Starts the application by initializing the ExcelManager, updating the
     * format request, and launching the GUI.
     */
    public void start() {
        this.excel();
        this.updateFormatRequest();
        this.gui();
    }

    // <editor-fold defaultstate="collapsed" desc="UI Functions">   
    /**
     * Searches for a reservation based on the user's DNI.
     */
    public void searchReservation() {
        // NOTA: La búsqueda de reservaciones se hacen en xlsx.reservas
        try {
            int dni = Utils.requestDNI();
            // =================================================================
            LinkedList d = reserv.copyList();
            Reservation booking = (Reservation) reserv.seachBina(dni, d);
            // =================================================================
            if (booking != null) {
                Clientes2 user_aux = booking.getClientes2();
                ShowClientGUI show = new ShowClientGUI(user_aux);

            } else {
                Errors.reservationNotFounded();
            }
        } catch (Exception e) {
            System.out.println(e);
            Errors.invalidInput();
        }
    }

    /**
     * Searches for the bedroom history based on the bedroom number.
     */
    public void searchBedroomHistorial() {
        try {
            int numBedroom = Utils.requestNumBedroom();
            if (numBedroom <= habs.length && numBedroom > 0) {
                habs[numBedroom - 1].getTree().showHistorial(habs[numBedroom - 1].getTree().getpRoot());

            } else {
                Errors.outOfLenghtBedrooms();
            }

        } catch (Exception e) {
            Errors.invalidInput();
        }
    }

    /**
     * Performs the check-in process for a reservation.
     */
    public void checkIn() {
        try {
            // NOTA: Para hacer el checkIn necesitamos: 
            // =================================================================
            int dni = Utils.requestDNI();
            Clientes2 user_aux;
            int counter;
            LinkedList d = reserv.copyList();
            // =================================================================
            // Buscar según el DNI, la reservación
            user_aux = null;
            counter = 0;
            Reservation booking = (Reservation) reserv.seachBina(dni, d);

            if (booking != null) {
                // =============================================================
                // Buscar habitación con la reservación, verificar si está disponible la habitación
                for (Bedroom aux : habs) {
                    counter++;

                    // Condición: Si no está ocupado
                    if (!aux.isOccupied()) {
                        System.out.println("[I] NO ESTÁ OCUPADA!!! ");

                        // Condición: Si es el mismo tipo que la reservada
                        if (aux.getType().equals(booking.getType())) {
                            reserv.deleteReserv(booking); //Se elimina el valor de las reservas ya que no puede permanecer ahi 
                            user_aux = booking.getClientes2();

                            aux.setOccupied(true);
                            user_aux.setNum(counter);
                            break;
                        }
                    }
                }
                // =============================================================
                if (user_aux != null) {
                    status.insert(user_aux);
                    Utils.info("Su Check-In ha sido completado con éxito");
                } else {
                    Errors.noAvaliableBedrooms();
                }

            } else {
                Errors.reservationNotFounded();
            }

        } catch (Exception e) {
            Errors.invalidInput();
        }
    }

    /**
     * Performs the check-out process for a hosted client.
     */
    public void checkOut() {
        // NOTE: Para hacer Check-Out necesitamos el (nombre) y el (apellido)
        // =====================================================================
        try {
            String name = Utils.requestName();
            String lastname = Utils.requestLastame();
            // =================================================================
            Clientes2 user_aux;
            // =================================================================
            // Buscar usuario
            user_aux = status.search(name, lastname);
            // =====================================================================
            // Si el usuario existe, lo eliminas
            if (user_aux != null) {
                if (user_aux.getDni() == 0) {
                    try {
                        int dni = Utils.requestDNI();
                        user_aux.setDni(dni);

                        // Elimina...
                        status.delete(name, lastname);

                        // Elimina...
                        int index = user_aux.getNum() - 1;
                        habs[index].setOccupied(false);

                        // input dni y si no esta en el arbol  (con alguno de los recorridos) a;adirlo porque los usuarios que provienen de las habitaciones (Estados) no tiene cedula 
                        Nodo2 aux = new Nodo2(user_aux);
                        habs[index].getTree().insert(habs[index].getTree().getpRoot(), aux);
                        habs[index].getTree().inOrder(habs[index].getTree().getpRoot());

                        // Information
                        Utils.info("Su Check-Out ha sido realizado correctamente!");

                    } catch (Exception e) {
                        Errors.invalidInput();

                    }
                } else {
                    // Elimina...
                    status.delete(name, lastname);

                    // Elimina...
                    int index = user_aux.getNum() - 1;
                    habs[index].setOccupied(false);

                    // input dni y si no esta en el arbol  (con alguno de los recorridos) a;adirlo porque los usuarios que provienen de las habitaciones (Estados) no tiene cedula 
                    Nodo2 aux = new Nodo2(user_aux);
                    habs[index].getTree().insert(habs[index].getTree().getpRoot(), aux);
                    habs[index].getTree().inOrder(habs[index].getTree().getpRoot());

                    // Information
                    Utils.info("Su Check-Out ha sido realizado correctamente!");
                }

            } else {
                Errors.clientNotFounded();
            }

        } catch (Exception e) {
            Errors.invalidInput();
        }
    }

    /**
     * Searches for a hosted client based on the client's name and last name.
     */
    public void searchHosted() {
        try {
            String name = Utils.requestName();
            String lastname = Utils.requestLastame();
            Clientes2 user_aux = (Clientes2) status.search(name, lastname);

            if (user_aux != null) {
                ShowHostedGUI show = new ShowHostedGUI(user_aux);
            } else {
                Errors.hostedNotFounded();
            }

        } catch (Exception e) {
            Errors.undefinedError();
        }
    }
    // </editor-fold> 

    // <editor-fold defaultstate="collapsed" desc="App functions">   
    /**
     * Initializes the ExcelManager by reading the database file.
     */
    private void excel() {
        xlsx.read(this.databasePath);
        // =====================================================================
        habs = this.xlsx.habs;
        reserv = this.xlsx.reservas.copyList();
        reserv.sort();
        status = this.xlsx.statusHabs;
    }

    /**
     * Sets up the GUI for the application.
     */
    private void gui() {
        MainGUI gui = new MainGUI(this.title, this);
    }

    /**
     * Updates the format request for the GUI.
     */
    private void updateFormatRequest() {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | UnsupportedLookAndFeelException e) {
        }
    }
    // </editor-fold> 
}
