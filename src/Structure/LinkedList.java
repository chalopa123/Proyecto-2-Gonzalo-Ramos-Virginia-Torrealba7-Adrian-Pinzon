/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Structure;

import Classes.Clients;

/**
 *
 * @author eduardopinzon
 */
public class LinkedList {
    
    Clients primero;
    int tamano;
    
    
    public LinkedList () {
        this.primero = null;
        this.tamano = 0;
        
}
    
    public void InsertarPrimero (String Name, String Last, int hab) {
        if (this.primero == null){
            this.primero = new Clients(Name, Last, hab);
            tamano ++;
           
        } else {
            Clients nuevo = new Clients(Name, Last, hab);
            nuevo.nxt = this.primero;
            this.primero = nuevo;
            tamano ++;
        } 
    }
    
    public void InsertarFinal (String Name, String Last, int hab) {
         if (this.primero == null){
            this.primero = new Clients( Name,  Last,  hab);
            tamano ++;
           
        } else{
            Clients aux = this.primero;
            while(aux.nxt != null){
                aux = aux.nxt;
            }
            Clients nuevo = new Clients(Name,  Last,  hab);
            aux.nxt = nuevo;
            tamano ++;
         }
    }
    
    public void Eliminar (String Name, String Last) {
        if(this.primero.nombre.equals(Name) && this.primero.apellido.equals(Last)){
            this.primero = this.primero.nxt;
            tamano --;
        }
        else{
            Clients aux = this.primero;
            while(aux.nxt !=null && (aux.nxt.nombre.equals(Name) || aux.nxt.apellido.equals(Last))){
                aux = aux.nxt;
            }
            aux.nxt = aux.nxt.nxt;
            tamano --;
        }
    }
    
    public Clients Search (String name, String last_name){
        if(this.primero.nombre.equals(name) && this.primero.apellido.equals(last_name)){
            return this.primero;
        }
        else{
            Clients aux = this.primero;
            while(aux.nxt !=null && (aux.nxt.nombre.equals(name) || aux.nxt.apellido.equals(last_name))){
                aux = aux.nxt;
            }
            return aux.nxt;
        }
    }
    
    public String Print(){
        String result = "";
        Clients aux = this.primero;
        while (aux != null){
            result += "[" + aux.nombre + "," + aux.apellido + "," + aux.habitacion + "]" + "\n";
            aux = aux.nxt;
        }
        return result; 
    }
}
