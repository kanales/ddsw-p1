package edu.ub.prog2.PedemonteBernatMarti.model;
import java.io.Serializable;

/**
 * 
 * @author Marti Pedemonte Bernat
 * User class. It implements the Serializable interface allowing
 * the class to be saved in an external file. Its methods are: getUserName,
 * getUserID, setUserName, setUserID, toString, equals.
 */
public class User implements Serializable{
    
    /**
     * Name of the user.
     */
    private String name;
    
    /**
     * ID of the user.
     */
    private String ident;
    
    /**
     * Default constructor of the user. Sets the name and ID of the user.
     * @param nom Name of the user.
     * @param ident ID of the user.
     */
    public User (String nom, String ident){
        this.name = nom;
        this.ident = ident;
    }
    
    /**
     * Getter of the users' name.
     * @return String variable with the users' name.
     */
    public String getUserName(){
        return this.name;
    }
    
    /**
     * Getter of the users' ID.
     * @return String variable with the users' ID.
     */
    public String getUserID(){
        return this.ident;
    }
    
    /**
     * Setter of the users' name.
     * @param name New name of the user.
     */
    public void setUserName(String name){
        this.name = name;
    }
    
    /**
     * Setter of the users' ID.
     * @param ident New ID of the user.
     */
    public void setUserID(String ident){
        this.ident = ident;
    }
    
    /**
     * To string method.
     * @return String variable containing the information of the user.
     */
    @Override
    public String toString(){
        return "Name: " + this.name + ".   " + "ID: " + this.ident + "\n";
    }
    
    /**
     * Equals method. It compares the given user with this.
     * @param user User to compare.
     * @return Boolean variable, true if both users have the same ID, false otherwise.
     */
    public boolean equals(User user){
        return this.ident.equals(user.getUserID());
    }
    
}
