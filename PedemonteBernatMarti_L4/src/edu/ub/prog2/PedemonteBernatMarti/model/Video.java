package edu.ub.prog2.PedemonteBernatMarti.model;
import edu.ub.prog2.PedemonteBernatMarti.controller.*;
import edu.ub.prog2.utils.AppException;

/**
 * 
 * @author Marti Pedemonte Bernat
 * Video class. It extends the PlayingMediaFile class. It contains the
 * height, width and frames per second of the video as attributes.
 * It also contains the playMediaFile method and the toString method.
 */
public class Video extends PlayingMediaFile{
    
    /**
     * Height of the video.
     */
    private final int alcada;
    
    /**
     * Width of the video.
     */
    private final int amplada;
    
    /**
     * Frames per second of the video.
     */
    private final float fps;
    
    /**
     * Default constructor for Video, calling the superclass constructor.
     * @param cami, path of the video. Parameter in the superclass constructor.
     * @param descripcio, description of the file. Parameter in the superclass constructor.
     * @param codec, codec of the audio file. Parameter in the superclass constructor.
     * @param durada, duration of the audio file. Parameter in the superclass constructor.
     * @param alcada, initialize the height of the video.
     * @param amplada, initialize the widht of the video.
     * @param fps, initialize the number of frames per second of the video.
     * @param r, player of the file. Parameter in the superclass constructor.
     */
    public Video(String cami, String descripcio, String codec, float durada, int alcada, int amplada, float fps, PlayerViewer r) {
        super(cami, descripcio, codec, durada, r);
        this.alcada = alcada;
        this.amplada = amplada;
        this.fps = fps;
    }

    /**
     * Play media file method. It calls the play method of the PlayerViewer attribute,
     * passing itself.
     * @throws edu.ub.prog2.utils.AppException
     */
    @Override
    public void playMediaFile() throws AppException{
        try{
            r.play(this);
        }catch(AppException ex){
            throw ex;
        }
        
    }
    
    /**
     * To string method. 
     * @return Type string variable, returns all the information of the video.
     */
    @Override
    public String toString(){
        String summary;
        summary = "Video name: \""+this.getFileName()+"\"; Extension: "+this.getExtension()+
                "; Description: \""+this.getDescription()+"\"; Date: "+this.getLastModification()+
                "; Full path: "+this.getFullPath()+"; Codec: "+this.getCodec()+
                "; Duration: "+this.getDuration()+" seconds; Height: "+this.alcada+
                "; Width: "+this.amplada+"; Frames per second: "+this.fps;
        return summary;        
    }
    
}
