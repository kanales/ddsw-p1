package edu.ub.prog2.PedemonteBernatMarti.controller;
import edu.ub.prog2.PedemonteBernatMarti.model.PlayingMediaFile;
import edu.ub.prog2.PedemonteBernatMarti.model.Image;
import edu.ub.prog2.PedemonteBernatMarti.model.FileFolder;
import edu.ub.prog2.utils.AppException;
import edu.ub.prog2.utils.BasicPlayListener;
import java.io.File;
import java.io.Serializable;
/**
 * 
 * @author Marti Pedemonte Bernat
 * PlayListener class. It extends the BasicPlayListener class, and implements the
 * interface Serializable. It overwrites all the necessary methods of the
 * abstract superclass. It contains a FileFolder, three integers (position and times)
 * and a boolean object. Its methods are: onEndFile, next, hasNext, startPlayback and
 * startPlayback2, plus those not overwritten and inherited from the superclass.
 */
public class PlayListener extends BasicPlayListener implements Serializable{
    
    /**
     * FileFolder object nedded to play a whole repository.
     */
    private FileFolder ffolder;
    
    /**
     * Imteger needed to play a file in this position.
     */
    private int position;
    
    /**
     * Boolean needed to specify if the reproduction is cyclic.
     */
    private boolean cyc;
    
    /**
     * Showing time of an image.
     */
    private int time;
    
    /**
     * Showing time of a single image.
     */
    private int indef_time;
    
    /**
     * Boolean indicating if there is any file being played.
     */
    private boolean playing;
    
    /**
     * Default constructor of this class. It initializes all its attributes, setting
     * the initial position and the boolean as "false" and both times.
     */
    public PlayListener (){
        super();
        this.ffolder = new FileFolder();
        this.position = 0;
        this.cyc = false;
        this.time = 7;
        this.indef_time = -1;
        this.playing = false;
    }

    /**
     * Method called at the end of the reproduction of a file. If there is another
     * file next to the previously played, it plays it. Otherwise it sets the
     * position to 0.
     */
    @Override
    protected void onEndFile() {
        if(this.hasNext()){
            this.next();
        }else{
            this.position = 0;
            this.playing = false;
            
        }
    }

    /**
     * Method that plays the following file, changing the position of the file
     * that has to be played.
     */
    @Override
    protected void next() {
        this.position ++;
        this.startPlayback2(this.ffolder, this.cyc);
    }

    /**
     * Checks if there is another file left to be played.
     * @return True if there is another file to be played, false otherwise.
     */
    @Override
    protected boolean hasNext() {
        return this.position + 1 < this.ffolder.getSize();
    }
    
    /**
     * Method that calls the playMediaFile method of the PlayingMediaFile 's or
     * the showMediaFile of the Image objects. It will be called in the next method.
     * @param ff Folder that will be entirely played/shown.
     * @param repCic Boolean needed to specify if the reproduction has to be cyclic.
     */
    public void startPlayback2(FileFolder ff, boolean repCic){
        File file = ff.getAt(position);
        try{
            if (file instanceof PlayingMediaFile) {
                ((PlayingMediaFile) file).playMediaFile();
            } else if (file instanceof Image) {
                if (ff.getSize() == 1) {
                    ((Image) file).showMediaFile(this.indef_time);
                } else {
                    ((Image) file).showMediaFile(this.time);
                }
            }
            if (repCic && ((this.position + 1) == this.ffolder.getSize())) {  //rep llista sencera i torna a l'inici
                this.position = -1;
            }
            
        }catch(AppException ex){
            this.onEndFile();
        }

        
    }
    
    /**
     * Method that starts to play the folder. It just sets the position to zero,
     * and then calls startPlayback2 with the same parameters.
     * @param ff Folder that will be entirely played/shown.
     * @param repCic Boolean needed to specify if the reproduction has to be cyclic.
     */
    public void startPlayback(FileFolder ff, boolean repCic){
        this.ffolder = ff;
        this.cyc = repCic;
        this.position = 0;
        this.playing = true;
        this.startPlayback2(this.ffolder, this.cyc);
    }
    
    /**
     * Getter of the boolean attribute playing.
     * @return Boolean type, returning true if playing is true, false otherwise.
     */
    public boolean getPlaying (){
        return this.playing;
    }
    
}
