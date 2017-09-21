package edu.ub.prog2.PedemonteBernatMarti.model;
import edu.ub.prog2.PedemonteBernatMarti.controller.*;
import edu.ub.prog2.utils.AppException;

/**
 * 
 * @author Marti Pedemonte Bernat
 * ShowingMediaFile class. It extends the MediaFile class, and creates an abstract
 * method which makes this class also abstract. It contains a PlayerViewer
 * attribute. Its methods are: showMediaFile (abstract), getViewer and SetPlayerViewer.
 */
public abstract class ShowingMediaFile extends MediaFile{
    
    /**
     * PlayerViewer object, declared as transient in order to allow the class
     * to be saved.
     */
    private transient PlayerViewer pV;
    
    /**
     * Default constructor of the ShowingMediaFile class.
     * @param cami Path of the file.
     * @param pView It initializes the player.
     */
    public ShowingMediaFile(String cami, PlayerViewer pView) {
        super(cami);
        this.pV = pView;
    }
    
    /**
     * Abstract method that shows the file.
     * @param secs Time the file will be shown.
     * @throws AppException AppException
     */
    public abstract void showMediaFile(int secs) throws AppException;
    
    /**
     * Getter of the PlayerViewer object.
     * @return The PlayerViewer attribute.
     */
    protected PlayerViewer getViewer(){
        return this.pV;
    }
    
    /**
     * Setter of the PlayerViewer object.
     * @param pVi New PlayerViewer object.
     */
    public void setPlayerViewer(PlayerViewer pVi) {
        this.pV = pVi;
    }
    
}
