package edu.ub.prog2.PedemonteBernatMarti.controller;
import edu.ub.prog2.PedemonteBernatMarti.model.*;
import edu.ub.prog2.utils.AppException;
import edu.ub.prog2.utils.BasicPlayListener;
import edu.ub.prog2.utils.BasicPlayerViewer;
import java.io.File;

/**
 * 
 * @author Marti Pedemonte Bernat
 * PlayingViewer class. It extends the BasicPlayerViewer class, and it overwrites
 * all the necessary methods of the abstract superclass. Its methods are:
 * play (videos), play (audios) and show (image), plus those not overwritten
 * and inherited from the superclass.
 */
public class PlayerViewer extends BasicPlayerViewer{
    
    /**
     * Default constructor of the PlayerViewer class.
     * @param controller BasicPlayerListener parameter needed to initialize
     * the superclass.
     */
    public PlayerViewer(BasicPlayListener controller) {
        super(controller);
    }
    
    /**
     * Play a video method. It calls the play method of the superclass.
     * @param pmf PlayingMediaFile file which will be played.
     * @throws AppException AppException
     */
    public void play(PlayingMediaFile pmf) throws AppException{
        try{
            super.play(pmf);
        }catch(AppException ex){
            throw ex;
        }
        
    }
    
    /**
     * Play an audio method. It calls the play method of the superclass.
     * @param audio Audio file which will be played.
     * @param fitxerImatge Thumbnail which will be shown.
     * @throws AppException AppException
     */
    public void play(Audio audio, File fitxerImatge) throws AppException{
        try{
            super.play(audio, fitxerImatge);
        }catch(AppException ex){
            throw ex;
        }
        
    }
    
    /**
     * Show an image method. It calls the show method of the superclass.
     * @param file Image which will be shwon.
     * @param secs Time that the image will be shown.
     * @throws AppException AppException
     */
    public void show(ShowingMediaFile file, int secs) throws AppException{
        try{
            super.show(file, secs);
        }catch(AppException ex){
            throw ex;
        }
        
    }
    
}
