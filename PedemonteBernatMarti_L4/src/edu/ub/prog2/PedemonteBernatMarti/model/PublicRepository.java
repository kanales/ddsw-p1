package edu.ub.prog2.PedemonteBernatMarti.model;
import java.io.Serializable;
import java.util.Date;

/**
 * 
 * @author Marti Pedemonte Bernat
 * PublicRepository class. It implements the Serializable interface allowing
 * the class to be saved in an external file. It extends the FileFolder class.
 * It contains a creation date, and its methods are: shareMediaFile, showRepository.
 */
public class PublicRepository extends FileFolder implements Serializable{
    
    /**
     * Date object containing the creation of the public repository.
     */
    private final Date creationDate;
    
    /**
     * Default constructor of the class PublicRepository. It uses the superclass
     * constructor, and it initialize the Date attribute.
     */
    public PublicRepository (){
        super();
        creationDate = new Date();
    }

    /**
     * Share media file method. It adds the given media file to the repository.
     * @param file File shared to the public repository.
     */
    public void shareMediaFile(MediaFile file){
        this.addFile(file);
    }
    
    /**
     * Show repository method.
     * @return String variable containing all the information of the files in
     * the repository, as well as the creation date.
     */
    public String showRepository(){
        String string = new String();
        string = "Public Repository creation date: " + creationDate + "\n";
        string = string + super.toString();
        return string;
    }
    
}
