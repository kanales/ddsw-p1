package edu.ub.prog2.PedemonteBernatMarti.model;
import java.io.File;
import java.util.*;

/**
 * 
 * @author Marti Pedemonte Bernat
 * Media File class. It contains the description atribute,
 * and all the getters and setters. It also contains
 * two more methods, the equals and the toString method.
 */
public class MediaFile extends File{
    /**
     * Description on the current media file.
     */
    private String description;
    /**
     * Default constructor for MediaFile.
     * @param cami Path of the file.
     */
    public MediaFile(String cami){
        super(cami);
        description = "";
    }
    /**
     * Get last modification method.
     * @return Type Date variable, containing the last modification date of the file.
     */
    public Date getLastModification(){
        long number = this.lastModified();
        Date lastMod = new Date(number);
        return lastMod;
    }
    /**
     * Get full path method.
     * @return Type String variable, containing the file's full path.
     */
    public String getFullPath(){
        return this.getAbsolutePath();
    }
    /**
     * Get file name method.
     * @return Type String variable, containing the name of the file.
     */
    public String getFileName(){
        String fullName = this.getName();
        int index = fullName.lastIndexOf('.'); //busco l'ultim punt del nom
        return fullName.substring(0, index);//substring des del prinicpi fins abans del punt.
    }
    /**
     * Get file extension method.
     * @return Type String variable, containing the extension of the file. 
     */
    public String getExtension(){
        String fullName = this.getName();
        int index = fullName.lastIndexOf('.'); //busco l'ultim punt del nom
        return fullName.substring(index+1);//substring des del punt fins al final
    }
    /**
     * Get file description method.
     * @return Type String variable, containing the description of the file.
     */
    public String getDescription(){
        return description;        
    }
    /**
     * Set description method.
     * @param newDescription , containing the new description for the file.
     */
    public void setDescription(String newDescription){
        this.description = newDescription;        
    }
    
    /**
     * Equals file method.
     * @param MediaFile File to compare.
     * @return Type boolean variable, true if both files are equal, false otherwise.
     */
    @Override
    public boolean equals(Object MediaFile){
        if(MediaFile == this){
            return true;
        }
        if(!(MediaFile instanceof MediaFile)){
            return false;
        }
        MediaFile file = (MediaFile) MediaFile;
        return file.getFileName().equals(this.getFileName())
                &&file.getDescription().equals(this.getDescription())
                &&file.getExtension().equals(this.getExtension())
                &&file.getFullPath().equals(this.getFullPath());
    }
    
    /**
     * To String method.
     * @return Type String variable, containing all the data of the file.
     */
    @Override
    public String toString(){
        String summary;
        summary = "Name: \""+this.getFileName()+"\"; Extension: "+this.getExtension()+
                "; Description: \""+this.getDescription()+"\"; Date: "+this.getLastModification()+
                "; Full path: "+this.getFullPath();
        return summary;        
    }
    
}
