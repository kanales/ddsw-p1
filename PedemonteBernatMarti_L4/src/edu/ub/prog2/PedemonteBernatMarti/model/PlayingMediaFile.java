package edu.ub.prog2.PedemonteBernatMarti.model;
import edu.ub.prog2.PedemonteBernatMarti.controller.*;
import edu.ub.prog2.utils.AppException;

/**
 * 
 * @author Marti Pedemonte Bernat
 * PlayingMediaFile class. It extends the MediaFile class, and creates an abstract
 * method which makes this class also abstract. It contains a String variable,
 * to store de codec of the Media File, a float variable, to store the length of
 * the file, and a PlayerViewer variable. Its methods are: getCodec, getDuration,
 * playMediaFile (the abstract method) and setPlayerViewer.
 */
public abstract class PlayingMediaFile extends MediaFile{
    
    /**
     * String variable containing the codec of the file.
     */
    protected String codec;
    
    /**
     * Float variable containing the duration of the file.
     */
    protected float durada;
    
    /**
     * PlayerViewer object, declared as transient in order to allow the class
     * to be saved.
     */
    protected transient PlayerViewer r;
    
    /**
     * Default constructor of the PlayingMediaFile class.
     * @param cami Path of the file. It is a parameter of the superclass constructor.
     * @param descripcio Description of the file, used in a setter of the superclass.
     * @param codec It initializes the codec.
     * @param durada It initializes the duration.
     * @param r It initializes the player.
     */
    protected PlayingMediaFile(String cami, String descripcio, String codec, float durada, PlayerViewer r) {
        super(cami);
        super.setDescription(descripcio);
        this.codec = codec;
        this.durada = durada;
        this.r = r;
    }
    
    /**
     * Get codec method.
     * @return String variable containing the codec.
     */
    public String getCodec (){
        return this.codec;
    }
    
    /**
     * Get duration method.
     * @return Float containing the duration of the file.
     */
    public float getDuration (){
        return this.durada;
    }
    
    /**
     * Play Media File method. It is an abstact method.
     * @throws edu.ub.prog2.utils.AppException
     */
    public abstract void playMediaFile() throws AppException;
    
    /**
     * Sets the PlayerViewer.
     * @param pVi New PlayerViewer for the file.
     */
    public void setPlayerViewer(PlayerViewer pVi){
        this.r = pVi;
    }
    
}
