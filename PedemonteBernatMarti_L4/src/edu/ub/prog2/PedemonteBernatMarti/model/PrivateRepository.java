package edu.ub.prog2.PedemonteBernatMarti.model;
import edu.ub.prog2.utils.AppException;
import java.io.File;
import java.io.Serializable;

/**
 * 
 * @author Marti Pedemonte Bernat
 * PrivateRepository class. It implements the Serializable interface allowing
 * the class to be saved in an external file. It extends the FileFolder class.
 * It contains a user. Its methods are: getUser, inTheRepository, addMediaFile,
 * showRepository, deleteFile.
 */
public class PrivateRepository extends FileFolder implements Serializable{
    
    /**
     * User associated with the repository.
     */
    private User user;
    
    /**
     * Default constructor of the PrivateRepository class. It sets the user.
     * @param usuari User associated with the repository.
     */
    public PrivateRepository (User usuari){
        super();
        this.user = usuari;
    }
    
    /**
     * Get user method.
     * @return User object.
     */
    public User getUser (){
        return this.user;
    }
    
    /**
     * Method that verifies if a given file is in the repository.
     * @param file File given to check if it is in the repository.
     * @return Boolean variable, true if the given file is in the repository, false otherwise.
     */
    public boolean inTheRepository (MediaFile file){
        for (int i = 0; i < this.getSize(); i++) {
            if (this.getAt(i) != null && ((MediaFile) this.getAt(i)).equals((MediaFile) file)) {
                return true;
            }
        }
        return false;
    }
    
    /**
     * Add file method. It adds the given media file to the repository, checking if
     * it exists in the disk and if it is already in the repository.
     * @param newFile Added MediaFile in the repository.
     * @throws AppException if the file doesn't exist in the disk or it is
     * already in the repository, the exception is thrown.
     */
    public void addMediaFile(MediaFile newFile) throws AppException {
        boolean repeatedFile = this.inTheRepository(newFile);
        if (repeatedFile || !newFile.exists()) {
            AppException exception = new AppException("File already in the folder or file doesn't exist.");
            throw exception;
        } else {
            this.addFile(newFile);
        }
    }
    
    /**
     * Show repository method. It shows the information of the files in the
     * repository, using a method of the superclass.
     * @return String variable containing the information of all the files.
     */
    public String showRepository(){
        String info = "";
        info = info + super.toString();
        return info;       
    }
    
    /**
     * Delete file method. It deletes the file in the given position.
     * @param i Position of the deleted file in the repository.
     */
    public void deleteFile(int i){
        File file = this.getAt(i);
        super.removeFile(file);     
    }
    
}
