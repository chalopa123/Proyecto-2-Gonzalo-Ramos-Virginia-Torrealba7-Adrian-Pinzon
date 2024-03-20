/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import Structure.HashTable;



/**
 *
 * @author ramos
 */
public class main {
    public static void main(String[] args) {
        HashTable prueba = new HashTable();
        prueba.Insert("Gonzalo", "Perez", 1);
        prueba.Insert("Brenda", "Monte", 2);
        prueba.Insert("Andres", "EDD", 3);
        prueba.Insert("Juan", "Caballo", 4);
        System.out.println("ANTES:");
        System.out.println(prueba.Print());
        Clients encontrado = prueba.Search("Gonzalo", "Perez");
        System.out.println(encontrado.habitacion);
        
    }
}
