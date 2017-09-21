package edu.ub.prog2.PedemonteBernatMarti.model;
import edu.ub.prog2.utils.InFileFolder;
import java.io.*;
import java.util.ArrayList;

/**
 *
 * @author Marti Pedemonte Bernat
 * File Folder class. It contains an ArrayList of variables MediaFile,
 * and all the getters and setters.
 */
public class FileFolder implements InFileFolder, Serializable{
    /**
     * ArrayList of variables MediaFile.
     */
    private ArrayList<MediaFile> folder;
    /**
     * Default FileFolder constructor. It sets
     * the maximum size of the ArrayList as 100.
     */
    public FileFolder(){
        folder = new ArrayList<> ();
    }
    /**
     * Alternative FileFolder constructor. It sets
     * the maximum size of the ArrayList as "size".
     * @param size size of the folder.
     */
    public FileFolder(int size){
        folder = new ArrayList<> (size);
    }
    /**
     * Get size method.
     * @return Type int variable, containing the number of files in the folder.
     */
    @Override
    public int getSize() {
        return this.folder.size();
    }
    /**
     * Add file method. Adds a file into the folder.
     * @param file File to add. 
     */
    @Override
    public void addFile(File file){
        this.folder.add((MediaFile) file);
    }
    
    /**
     * Remove file method. It removes the file from the folder.
     * @param file File to remove.
     */
    @Override
    public void removeFile(File file) {
        for(int i=0; i<this.getSize(); i++){
            if(this.getAt(i) != null && ((MediaFile)this.getAt(i)).equals((MediaFile) file)){
                this.folder.remove(i);
                i=i-1;
            }
        }
        //System.out.println("File not found, thus impossible to remove.");
    }
    /**
     * Get at method.
     * @param i Position.
     * @return The file in the parameter "position".
     */
    @Override
    public File getAt(int i) {
        return this.folder.get(i);
    }
    /**
     * Clear method. It removes all files from the folder.
     */
    @Override
    public void clear() {
        this.folder.clear();
    }
    /**
     * To String method.
     * @return Type String variable, containing the information of all the files in the folder.
     */
    @Override
    public String toString(){
        String summary;
        summary = "";
        for(int i=0; i<this.getSize(); i++){
            int count = i+1;
            summary = summary + "[" + count + "] " + ((MediaFile)this.getAt(i)).toString()+"\n";
        }
        return summary;                
    }

    /**
     * Is full method.
     * @return Boolean variable, true.
     */
    @Override
    public boolean isFull() {
        return true;
    }
    
}
