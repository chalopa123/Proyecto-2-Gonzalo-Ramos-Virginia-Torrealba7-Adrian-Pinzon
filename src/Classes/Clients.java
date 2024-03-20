package Classes;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/** Atributos para Clases
 *Metodo para Clases
 * @author eduardopinzon
 */
public class Clients {
    
    public String nombre;
    public String apellido;
    public int habitacion;
    public Clients nxt;
    String key = nombre + apellido;
    
    public Clients(String name, String Last, int hab){
        this.nombre = name;
        this.apellido = Last;
        this.habitacion = hab;
        this.nxt = null;
    }
    
}
