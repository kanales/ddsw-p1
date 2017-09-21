package edu.ub.prog2.PedemonteBernatMarti.model;
import edu.ub.prog2.PedemonteBernatMarti.controller.*;
import edu.ub.prog2.utils.AppException;

/**
 * 
 * @author Marti Pedemonte Bernat
 * Image class. It extends the ShowingMediaFile class. It contains the
 * height and width of the image as attributes.
 * It also contains the showMediaFile method and the toString method.
 */
public class Image extends ShowingMediaFile{
    
    /**
     * Height of the image integer.
     */
    private int alc;
    
    /**
     * Width of the image integer.
     */
    private int amp;

    /**
     * Default constructor of the Image class.
     * @param cami Path of the image.
     * @param desc Description of the image.
     * @param alcada Height of the image.
     * @param amplada Width of the image.
     * @param repVis PlayerViewer needed to show the image.
     */
    public Image(String cami, String desc, int alcada, int amplada, PlayerViewer repVis) {
        super(cami, repVis);
        super.setDescription(desc);
        this.alc = alcada;
        this.amp = amplada;
    }

    /**
     * Show image method. it calls the show method of the PlayerViewer attribute.
     * @param secs Seconds the image will be shown.
     * @throws AppException AppException
     */
    @Override
    public void showMediaFile(int secs) throws AppException {
        try{
            this.getViewer().show(this, secs);
        }catch(AppException ex){
            throw ex;
        }
        
    }
    
    /**
     * To string method. 
     * @return Type string variable, returns all the information of the image.
     */
    @Override
    public String toString(){
        String summary;
        summary = "Image name: \"" + this.getFileName() + "\"; Extension: " + this.getExtension()
                + "; Description: \"" + this.getDescription() + "\"; Date: " + this.getLastModification()
                + "; Full path: " + this.getFullPath() + "; Height: " + this.alc
                + "; Width: " + this.amp;
        return summary;
    }
    
}
