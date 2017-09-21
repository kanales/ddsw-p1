package edu.ub.prog2.PedemonteBernatMarti.model;
import edu.ub.prog2.PedemonteBernatMarti.controller.*;
import edu.ub.prog2.utils.AppException;
import java.io.File;

/**
 * 
 * @author Marti Pedemonte Bernat
 * Audio class. It extends the PlayingMediaFile class. It contains the
 * image of the audio atribute and the kilobits per second attribute.
 * It also contains the playMediaFile method and the toString method.
 */
public class Audio extends PlayingMediaFile{
    
    /**
     * File type object, containing the image of the audio file.
     */
    private final File fitxerImatge;
    
    /**
     * Integer type object, containing the number of kilobits per second of the audio file.
     */
    private final int kpbs;
    
    /**
     * Default constructor for Audio, calling the superclass constructor.
     * @param cami, path of the audio file. Parameter in the superclass constructor.
     * @param fitxerImatge, initialize the image of the audio file.
     * @param descripcio, description of the file. Parameter in the superclass constructor.
     * @param codec, codec of the audio file. Parameter in the superclass constructor.
     * @param durada, duration of the audio file. Parameter in the superclass constructor.
     * @param kpbs, initialize the number of kilobits per second of the audio file.
     * @param r, player of the file. Parameter in the superclass constructor.
     */
    public Audio(String cami, File fitxerImatge, String descripcio, String codec, float durada, int kpbs, PlayerViewer r) {
        super(cami, descripcio, codec, durada, r);
        this.fitxerImatge = fitxerImatge;
        this.kpbs = kpbs;
    }

    /**
     * Play media file method. It calls the play method of the PlayerViewer attribute,
     * passing itself and its image.
     * @throws edu.ub.prog2.utils.AppException
     */
    @Override
    public void playMediaFile() throws AppException{
        try{
            if (this.fitxerImatge.exists()) {
                r.play(this, this.fitxerImatge);
            } else {
                r.play(this);
            }
        }catch(AppException ex){
            throw ex;
        }
        
        
    }
    
    /**
     * To string method. 
     * @return Type string variable, returns all the information of the audio file.
     */
    @Override
    public String toString(){
        String summary;
        summary = "Audio name: \""+this.getFileName()+"\"; Extension: "+this.getExtension()+
                "; Description: \""+this.getDescription()+"\"; Date: "+this.getLastModification()+
                "; Full path: "+this.getFullPath()+"; Codec: "+this.getCodec()+
                "; Duration: "+this.getDuration()+" seconds; Kilobits per second: "+this.kpbs;
        
        return summary;        
    }
    
}
