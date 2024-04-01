package user;

/**
 * The User class represents a user with basic attributes. It allows storing
 * personal information such as name, last name, gender, email, and phone
 * number. It also includes methods for accessing and modifying these
 * attributes.
 */
public class User {

    // Personal information
    /**
     * DNI of the person
     */
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

    // <editor-fold defaultstate="collapsed" desc="Constructor">   
    /**
     * Creates a new `User` object with the specified attributes.
     *
     * @param dni The user's identification number.
     * @param name The user's name.
     * @param last_name The user's last name.
     * @param gener The user's gender.
     * @param email The user's email.
     * @param phone The user's phone number.
     */
    public User(int dni, String name, String last_name, String gener, String email, String phone) {
        this.dni = dni;
        this.name = name;
        this.last_name = last_name;
        this.gender = gener;
        this.email = email;
        this.phone = phone;
    }

    /**
     * Creates a new `User` object with the specified attributes.
     *
     * @param name The user's name.
     * @param last_name The user's last name.
     * @param gener The user's gender.
     * @param email The user's email.
     * @param phone The user's phone number.
     */
    public User(String name, String last_name, String gener, String email, String phone) {
        this.name = name;
        this.last_name = last_name;
        this.gender = gener;
        this.email = email;
        this.phone = phone;

    }
    // </editor-fold> 

    // <editor-fold defaultstate="collapsed" desc="Phone">
    /**
     * Returns the user's phone number.
     *
     * @return The user's phone number.
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Sets the user's phone number.
     *
     * @param phone The phone number to set.
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }
    // </editor-fold> 

    // <editor-fold defaultstate="collapsed" desc="Name">   
    /**
     * Returns the user's name.
     *
     * @return The user's name.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the user's name.
     *
     * @param name The name to set.
     */
    public void setName(String name) {
        this.name = name;
    }
    // </editor-fold> 

    // <editor-fold defaultstate="collapsed" desc="Last name">   
    /**
     * Returns the user's last name.
     *
     * @return The user's last name.
     */
    public String getLast_name() {
        return last_name;
    }

    /**
     * Sets the user's last name.
     *
     * @param last_name The last name to set.
     */
    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }
    // </editor-fold> 

    // <editor-fold defaultstate="collapsed" desc="Gener">   
    /**
     * Returns the user's gender.
     *
     * @return The user's gender.
     */
    public String getGener() {
        return gender;
    }

    /**
     * Sets the user's gender.
     *
     * @param gener The gender to set.
     */
    public void setGener(String gener) {
        this.gender = gener;
    }
    // </editor-fold> 

    // <editor-fold defaultstate="collapsed" desc="Email"> 
    /**
     * Returns the user's email.
     *
     * @return The user's email.
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the user's email.
     *
     * @param email The email to set.
     */
    public void setEmail(String email) {
        this.email = email;
    }
    // </editor-fold> 

    // <editor-fold defaultstate="collapsed" desc="DNI">   
    /**
     * Returns the user's identification number.
     *
     * @return The user's identification number.
     */
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
    // </editor-fold> 

    // <editor-fold defaultstate="collapsed" desc="Ride">   
    /**
     * Returns the user's ride type.
     *
     * @return The user's ride type.
     */
    public String getRide() {
        return ride;
    }

    /**
     * Sets the user's ride type.
     *
     * @param ride The ride type to set.
     */
    public void setRide(String ride) {
        this.ride = ride;
    }
    // </editor-fold> 

    // <editor-fold defaultstate="collapsed" desc="Departure">   
    /**
     * Returns the user's departure location.
     *
     * @return The user's departure location.
     */
    public String getDeparture() {
        return departure;
    }

    /**
     * Sets the user's departure location.
     *
     * @param departure The departure location to set.
     */
    public void setDeparture(String departure) {
        this.departure = departure;
    }
    // </editor-fold> 

    // <editor-fold defaultstate="collapsed" desc="Num">   
    /**
     * Returns the user's identification number.
     *
     * @return The user's identification number.
     */
    public int getNum() {
        return num;
    }

    /**
     * Sets the user's identification number.
     *
     * @param num The number to set.
     */
    public void setNum(int num) {
        this.num = num;
    }
    // </editor-fold> 

    // <editor-fold defaultstate="collapsed" desc="Show">   
    /**
     * Displays the user's information.
     */
    public void show() {
        String sentence = this.name + " | " + this.last_name + " | " + this.gender + " | " + this.email + " | " + this.phone;
        System.out.println(sentence);
    }
    // </editor-fold> 
}
