package edu.ub.prog2.PedemonteBernatMarti.controller;
import edu.ub.prog2.PedemonteBernatMarti.model.*;
import edu.ub.prog2.utils.AppException;
import edu.ub.prog2.utils.InController;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * 
 * @author Marti Pedemonte Bernat
 * Controller class. It implements the interface InController, and it overwrites
 * all the necessary methods. It contains a Data, a PlayerViewer and a PlayListener
 * object, as well as four booleans: canPause, canResume, canStop and canSkip.
 * It links the view package with the model package, and contains all
 * the methods called in the AppUB4, FrmAddMediaFile and FrmRegistreInici class.
 * These methods are:
 * setUser, getUser, addVideo, addAudio, addImage, showPrivateRepository, 
 * showPublicRepository, removeFile, addUser, existUser, playMediaFile,
 * shareMediaFile, saveDataDisk, loadDataDisk, openWindowPlayer,
 * closeWindowPlayer, showMediaFile, playPrivateRepositoy, playPublicRepositoy,
 * resumePlayback, pausePlayback, stopPlayback, skipPlayback, setCycRep, getCycRep
 * showInfo, setCanPause, setCanStop, setCanSkip, setCanResume,
 * getCanPause, getCanStop, getCanSkip, getCanResume.
 */
public class Controller implements InController{
    
    /**
     * Data type object containing all the data.
     */
    private Data data;
    
    /**
     * Player viewer which will allaw us to play files.
     */
    private PlayerViewer pViewer;
    
    /**
     * Play listener which is needed to create the viewer.
     */
    private PlayListener pListener;

    /**
     * Boolean indicating if it is possible to pause.
     */
    private boolean canPause;
    
    /**
     * Boolean indicating if it is possible to resume.
     */
    private boolean canResume;
    
    /**
     * Boolean indicating if it is possible to stop.
     */
    private boolean canStop;
    
    /**
     * Boolean indicating if it is possible to skip.
     */
    private boolean canSkip;
    
    /**
     * Boolean indicating if the playing window has opened.
     */
    private boolean isOpened;
    
    /**
     * Default constructor for Controller, initializes the attributes and sets the
     * PlayListener object in Data.
     */
    public Controller() {
        pListener = new PlayListener();
        pViewer = new PlayerViewer(pListener);
        canPause = false;
        canResume = false;
        canStop = false;
        canSkip = false;
        isOpened = false;
        data = new Data();
        data.setPlayListener(pListener);
        
    }

    /**
     * Set user method. It calls the same method of the Data attribute.
     *
     * @param s Contains the ID of the current user.
     */
    public void setUser(String s) {
        this.data.setCurrentUser(s);
    }

    /**
     * Get user method. It calls the same method of the Data attribute.
     *
     * @return User type object, containing the current User.
     */
    public User getUser() {
        return this.data.getCurrentUser();
    }

    /**
     * Add video method. It creates the video and calls the same method of the
     * Data attribute.
     *
     * @param cami Path of the video.
     * @param desc Description of the video.
     * @param codec Codec of the video.
     * @param durada Duration of the video.
     * @param alc Height of the video.
     * @param amp Width of the video.
     * @param fps Frames per second of the video.
     * @throws AppException It catches the exception from the method of data
     * and throws it again.
     */
    @Override
    public void addVideo(String cami, String desc, String codec, float durada, int alc, int amp, float fps) throws AppException {
        Video newVideo = new Video(cami, desc, codec, durada, alc, amp, fps, this.pViewer);
        try {
            this.data.addVideo(newVideo);
        } catch (AppException e) {
            throw e;
        }
    }

    /**
     * Add audio method. It creates the audio and calls the same method of the
     * Data attribute.
     *
     * @param cami Path of the audio file.
     * @param camifoto Path of the image of the audio file.
     * @param desc Description of the audio file.
     * @param codec Codec of the audio file.
     * @param durada Duration of the audio file.
     * @param kbps Kilobits per second of the audio file.
     * @throws AppException It catches the exception from the method of data
     * and throws it again.
     */
    @Override
    public void addAudio(String cami, String camifoto, String desc, String codec, float durada, int kbps) throws AppException {
        File pic = new File(camifoto);
        Audio newAudio = new Audio(cami, pic, desc, codec, durada, kbps, this.pViewer);
        try {
            this.data.addAudio(newAudio);
        } catch (AppException e) {
            throw e;
        }
    }

    /**
     * Add image method. it creates the image object and calls the same method
     * of the Data attribute.
     * 
     * @param cami Path of the image.
     * @param desc Description of the image.
     * @param alc Height of the image.
     * @param amp Width of the image.
     * @throws AppException It catches the exception from the method of data
     * and throws it again.
     */
    @Override
    public void addImage(String cami, String desc, int alc, int amp) throws AppException {
        Image newIm = new Image(cami, desc, alc, amp, this.pViewer);
        try {
            this.data.addImage(newIm);
        } catch (AppException e) {
            throw e;
        }
    }

    /**
     * Show Private Repository method. It calls the same method of the Data
     * attribute.
     *
     * @return A list of String.
     */
    @Override
    public List<String> showPrivateRepository() {
        return this.data.showPrivateRepository();
    }

    /**
     * Show Public Repository method. It calls the same method of the Data
     * attribute.
     *
     * @return A list of String.
     */
    @Override
    public List<String> showPublicRepository() {
        return this.data.showPublicRepository();
    }

    /**
     * Remove file method. Calls the same method of the Data attribute.
     *
     * @param i Position of the removed file.
     * @throws AppException It catches the exception from the method of data
     * and throws it again.
     */
    @Override
    public void removeFile(int i) throws AppException {
        try {
            this.data.removeFile(i);
        } catch (AppException e) {
            throw e;
        }
    }

    /**
     * Add user method. Calls the same method of the Data attribute.
     *
     * @param string Name of the new user.
     * @param string1 ID of the new user.
     * @throws AppException It catches the exception from the method of data
     * and throws it again.
     */
    @Override
    public void addUser(String string, String string1) throws AppException {
        try {
            this.data.addUser(string, string1);
        } catch (AppException e) {
            throw e;
        }
    }

    /**
     * Exist user method. Calls the same method of the Data attribute.
     *
     * @param string ID of the required user.
     * @return Boolean, true if it exists or false otherwise.
     */
    @Override
    public boolean existUser(String string) {
        return this.data.existUser(string);
    }

    /**
     * Play media file method. It opens the window of the player and calls
     * the same method of the Data attribute. It changes the booleans status to their necessary state.
     *
     * @param i Position of the played file
     * @throws AppException It catches the exception from the method of data
     * and throws it again.
     */
    @Override
    public void playMediaFile(int i) throws AppException {
        try {
            this.openWindowPlayer();
            this.data.playMediaFile(i);
            this.canPause = true;
            this.canStop = true;
            this.canSkip = true;
            this.canResume = false;
        } catch (AppException e) {
            this.closeWindowPlayer();
            throw e;
        }
    }

    /**
     * Share media file method. Calls the same method of the Data attribute.
     * @param i Position of the shared file.
     * @throws AppException It catches the exception from the method of data
     * and throws it again.
     */
    @Override
    public void shareMediaFile(int i) throws AppException {
        try {
            this.data.shareMediaFile(i);
        } catch (AppException e) {
            throw e;
        }
    }

    /**
     * Save data method. It calls the same method of the Data attribute.
     * @param string Path of the file where the data will be saved.
     * @throws AppException It catches the exception from the method of data
     * and throws it again.
     */
    @Override
    public void saveDataDisk(String string) throws AppException {
        try {
            this.data.saveDataDisk(string);
        } catch (IOException ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Load data method. Calls the same method of the Data attribute, to load the
     * Data attribute, and then calls the setPlayerViewer and setPlayListener, setting
     * the pListener and pViewer to all the files in Data.
     * @param string Path of the loading file.
     * @throws AppException It catches the exception from the method of data
     * and throws it again.
     */
    @Override
    public void loadDataDisk(String string) throws AppException {
        try {
            this.data = this.data.loadDataDisk(string);
            this.data.setPlayerViewer(pViewer);
            this.data.setPlayListener(pListener);
        } catch (AppException e) {
            throw e;
        } catch (IOException ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }

    /**
     * Open window method. It opens the window of the MediaPlayer, calling the
     * method of the PlayerViewer object.
     */
    @Override
    public void openWindowPlayer() {
        this.pViewer.open();
        this.isOpened = true;
    }

    /**
     * Close window method. It closes the window of the MediaPlayer, calling the
     * method of the PlayerViewer object.
     */
    @Override
    public void closeWindowPlayer() throws AppException {
        this.pViewer.close();
        this.isOpened = false;
    }

    /**
     * Shows an Image object. First it opens a window, then it calls the same method
     * of the Data attribute. It changes the booleans status to their necessary state.
     * 
     * @param i Position of the image.
     * @param sec Seconds the image will be viewable.
     * @throws AppException It catches the exception from the method of data
     * and throws it again.
     */
    @Override
    public void showMediaFile(int i, int sec) throws AppException {
        try {
            this.openWindowPlayer();
            this.data.showMediaFile(i, sec);
            this.canPause = true;
            this.canStop = true;
            this.canSkip = true;
            this.canResume = false;
        } catch (AppException e) {
            this.closeWindowPlayer();
            throw e;
        }
        
    }

    /**
     * Plays the private repository. First it opens a window, then it calls the
     * same method of the Data attribute. It changes the booleans status to their necessary state.
     * @throws AppException It catches the exception from the method of data
     * and throws it again.
     */
    @Override
    public void playPrivateRepositoy() throws AppException {
        try {
            this.openWindowPlayer();
            this.data.playPrivateRepository();
            this.canPause = true;
            this.canStop = true;
            this.canSkip = true;
            this.canResume = false;
        } catch (AppException e) {
            this.closeWindowPlayer();
            throw e;
        }
    }

    /**
     * Plays the public repository. First it opens a window, then it calls the
     * same method of the Data attribute. It changes the booleans status to their necessary state.
     * @throws AppException It catches the exception from the method of data and
     * throws it again.
     */
    @Override
    public void playPublicRepositoy() throws AppException {
        try {
            this.openWindowPlayer();
            this.data.playPublicRepository();
            this.canPause = true;
            this.canStop = true;
            this.canSkip = true;
            this.canResume = false;
        } catch (AppException e) {
            this.closeWindowPlayer();
            throw e;
        }
    }
    
    /**
     * Resumes the current played file. Calls the method from the PlayingViewer
     * attribute. It changes the booleans status to their necessary state.
     * @throws AppException .
     */
    @Override
    public void resumePlayback() throws AppException {
        if(canResume && this.pListener.getPlaying()){
            this.pViewer.resume();
            this.canResume = false;
            this.canPause = true;
            this.canStop = true;
            this.canSkip = true;
        }else{
            throw new AppException("No paused file.");
        }
        
    }

    /**
     * Pauses the current played file. Calls the method from the PlayingViewer
     * attribute. It changes the booleans status to their necessary state.
     * @throws AppException .
     */
    @Override
    public void pausePlayback() throws AppException {
        if (canPause && this.pListener.getPlaying()) {
            this.pViewer.pause();
            this.canPause = false;
            this.canResume = true;
            this.canStop = true;
            this.canSkip = true;
        } else {
            throw new AppException("No playing file.");
        }
        
    }

    /**
     * Stops the current played file. Calls the method from the PlayingViewer
     * attribute. It changes the booleans status to their necessary state.
     * @throws AppException .
     */
    @Override
    public void stopPlayback() throws AppException {
        if (canStop && this.pListener.getPlaying()) {
            this.pViewer.stop();
            this.canStop = false;
            this.canResume = true;
            this.canPause = false;
            this.canSkip = false;
        } else {
            throw new AppException("No playing file.");
        }
        
    }

    /**
     * Skips the current played file. Calls methods from the PlayListener
     * attribute. It changes the booleans status to their necessary state.
     * @throws AppException Returns "There is no next file." if indeed there is
     * no next file to play.
     */
    @Override
    public void skipPlayback() throws AppException {
        if(this.pListener.hasNext() && this.canSkip && this.pListener.getPlaying()){
            this.pListener.next();
            this.canPause = true;
            this.canStop = true;
            this.canSkip = true;
            this.canResume = false;
        }else{
            throw new AppException("There is no next file or unable to skip.");
        }
        
    }
    
    /**
     * Sets the boolean of the cyclic reproduction in Data.
     * @param t New cyclic reproduction boolean status passed to data.
     */
    public void setCycRep(boolean t){
        this.data.setRepCyc(t);
    }
    
    /**
     * Gets the currect cyclic reproduction boolean status of data.
     * @return The boolean variable from data.
     */
    public boolean getCycRep(){
        return this.data.getRepCyc();
    }
    
    /**
     * Show information method. It calls the same method of the Data attribute.
     *
     * @return A list of string containing all the information.
     */
    public List<String> showInfo() {
        return this.data.toString1();
    }
    
    /**
     * CanPause setter. It sets the boolean.
     * @param b New value for the boolean.
     */
    public void setCanPause(boolean b){
        this.canPause = b;
    }
    
    /**
     * CanStop setter. It sets the boolean.
     * @param b New value for the boolean.
     */
    public void setCanStop(boolean b){
        this.canStop = b;
    }
    
    /**
     * CanSkip setter. It sets the boolean.
     * @param b New value for the boolean.
     */
    public void setCanSkip(boolean b){
        this.canSkip = b;
    }
    
    /**
     * CanResume setter. It sets the boolean.
     * @param b New value for the boolean.
     */
    public void setCanResume(boolean b){
        this.canResume = b;
    }
    
    /**
     * CanResume getter. It gets the boolean.
     * @return A boolean containing the value of canResume.
     */
    public boolean getCanResume(){
        return this.canResume;
    }
    
    /**
     * CanPause getter. It gets the boolean.
     * @return A boolean containing the value of canPause.
     */
    public boolean getCanPause(){
        return this.canPause;
    }
    
    /**
     * CanStop getter. It gets the boolean.
     * @return A boolean containing the value of canStop.
     */
    public boolean getCanStop(){
        return this.canStop;
    }
    
    /**
     * CanSkip getter. It gets the boolean.
     * @return A boolean containing the value of canSkip.
     */
    public boolean getCanSkip(){
        return this.canSkip;
    }
    
    /**
     * getPlaying getter. It gets the boolean.
     * @return Boolean containing the value of playing.
     */
    public boolean getPlaying(){
        return this.pListener.getPlaying();
    }
    
    /**
     * isOpened getter. It gets the value of the isOpened boolean.
     * @return Boolean containing the value of isOpened.
     */
    public boolean getIsOpened(){
        return this.isOpened;
    }
    
    
}
