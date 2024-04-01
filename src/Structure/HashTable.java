/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Structure;

import Classes.Clients;


//[0 ->
//1 ->
//2 -> Andres
//3 ->
//
//]
/**
 *
 * @author eduardopinzon
 */
public class HashTable {
    
    LinkedList[] Data;
    int size;
    
    public HashTable() {
        this.Data = new LinkedList[600]; //Cambiar tamano de arrehlo
        this.size = 600;
        this.beg_array();
    }
    
    public void beg_array(){
        for (int i = 0; i < this.size; i++) {
            this.Data[i] =  new LinkedList();
        }
    }
    
    public int Hash(String name, String last_name){
        int name_ASC = 0;
        int last_name_ASC = 0;
        for (int i = 0; i < name.length(); i++) {
            char value = name.charAt(i);
            name_ASC += (int) value;
        }
        for (int i = 0; i < last_name.length(); i++) {
            char value = last_name.charAt(i);
            last_name_ASC += (int) value;
        }
        return (name_ASC + last_name_ASC) % this.size;    
    }
    
    public void Insert(String nombre,String apellido, int habitacion){
        int indexx = this.Hash(nombre, apellido);
        this.Data[indexx].InsertarFinal(nombre, apellido, habitacion);
    }
    
    public void Delete(String name, String last_name){
        int indexx = this.Hash(name, last_name);
        this.Data[indexx].Eliminar(name, last_name);       
    }
    
    public Clients Search (String name, String last_name){
        int indexx = this.Hash(name, last_name);
        return this.Data[indexx].Search(name, last_name);
    }
    
    public String Print(){
        String toty = "";
        for (int i = 0; i < size; i++) {
            toty += this.Data[i].Print();
        }
        return toty;
    }
    
}
