/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author VirginiaT
 */

// Estructura Clientes_2
// Complementar Clientes Principal

public class Clientes2 {
    
    private int dni;
    /**
     * Name of the person
     */
    private String name;
    /**
     * Last name of the person
     */
    private String last_name;
    /**
     * Gender of the person
     */
    private String gender;
    /**
     * Email of the person
     */
    private String email;
    /**
     * Phone number of the person
     */
    private String phone;

    // Hotel information
    /**
     * ? of the person
     */
    private String ride;
    /**
     * ? of the person
     */
    private String departure;
    /**
     * ? of the person
     */
    private int num;

    
    public Clientes2(int dni, String name, String last_name, String gener, String email, String phone) {
        this.dni = dni;
        this.name = name;
        this.last_name = last_name;
        this.gender = gener;
        this.email = email;
        this.phone = phone;
    }

 
    public Clientes2(String name, String last_name, String gener, String email, String phone) {
        this.name = name;
        this.last_name = last_name;
        this.gender = gener;
        this.email = email;
        this.phone = phone;

    }
    
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    
    
    public String getName() {
        return name;
    }

    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getLast_name() {
        return last_name;
    }

    
    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }
   
    
    public String getGener() {
        return gender;
    }

    
    public void setGener(String gener) {
        this.gender = gener;
    }
  
    public String getEmail() {
        return email;
    }

    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public int getDni() {
        return dni;
    }

    /**
     * Sets the user's identification number.
     *
     * @param dni The identification number to set.
     */
    public void setDni(int dni) {
        this.dni = dni;
    }
 
    
    public String getRide() {
        return ride;
    }


    public void setRide(String ride) {
        this.ride = ride;
    }
 
    
    public String getDeparture() {
        return departure;
    }

    
    public void setDeparture(String departure) {
        this.departure = departure;
    }

    
    public int getNum() {
        return num;
    }

    
    public void setNum(int num) {
        this.num = num;
    }
    

   
    public void show() {
        String sentence = this.name + " | " + this.last_name + " | " + this.gender + " | " + this.email + " | " + this.phone;
        System.out.println(sentence);
    }
}
