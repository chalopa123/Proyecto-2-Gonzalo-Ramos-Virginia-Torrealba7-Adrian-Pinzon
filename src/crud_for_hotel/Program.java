/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud_for_hotel;

import app.App;

/**
 * The Program class represents the entry point of the CRUD for Hotel
 * application. It contains the main method that initializes the App and starts
 * the application.
 *
 * The main method creates an instance of the App class and calls its start
 * method to start the application.
 *
 * @author Gonzalo
 */
public class Program {

    /**
     * The main method is the entry point of the program.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        App app = new App();
        app.start();
    }
}
