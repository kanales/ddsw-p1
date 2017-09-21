package edu.ub.prog2.PedemonteBernatMarti.model;
import edu.ub.prog2.PedemonteBernatMarti.controller.*;
import edu.ub.prog2.utils.AppException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Marti Pedemonte Bernat
 * Data class. It implements the Serializable interface allowing the class to
 * be saved in an external file. It contains most of the logic of the model.
 * It contains a PublicRepository, a list of User and PrivateRepository, and
 * also an integer to switch between users and repositories. It also contains
 * a boolean for the cyclic reproduction, and a PlayListener attribute.
 * It links the model package with the controller package, because it is always
 * called by the Controller class. Its methods are:
 * setCurentUser, getCurrentUser, addVideo, addAudio, addImage, showPrivateRepository, 
 * showPublicRepository, removeFile, addUser, existUser, playMediaFile,
 * shareMediaFile, saveDataDisk, loadDataDisk, toString1, showMediaFile
 * setRepCyc, getRepCyc, playPrivateRepository, playPublicRepository, setPlayerViewer,
 * setPlayListener.
 */
public class Data implements Serializable{
    
    /**
     * Public repository.
     */
    private PublicRepository pubRep;
    
    /**
     * List of users using the application.
     */
    private List<User> users;
    
    /**
     * List of private repositories.
     */
    private List<PrivateRepository> privRep;
    
    /**
     * Integer containing the position of the current user.
     */
    private int currentUser;
    
    /**
     * Cyclic reproduction boolean.
     */
    private boolean repCyc;
    
    /**
     * Play listener attribute.
     */
    private PlayListener pList;
    
    /**
     * Default constructor for Data, initializes all the attributes.
     */
    public Data(){
        //this.pubRep = new PublicRepository();
        this.users = new ArrayList<> ();
        this.privRep = new ArrayList<> ();
        this.currentUser = -1;
        this.repCyc = false;        
    }
    
    /**
     * Set current user method. Given an ID, it searches the users list and
     * assigns the correct position of the user to the currentUser attribute.
     * @param s ID of the current user.
     */
    public void setCurrentUser(String s){
        for(int i=0; i<users.size(); i++){
            if (users.get(i).getUserID().equals(s)){
                this.currentUser = i;
                return;
            }
        }
    }
    
    /**
     * Getter of the current user.
     * @return The current user.
     */
    public User getCurrentUser(){
        return users.get(currentUser);
    }
    
    /**
     * Add new video method. Given a video, it adds it to the private repository
     * of the current user.
     * @param newVideo Video which will be added to the repository.
     * @throws AppException It catches the exception from the method of privRep
     * and throws it again.
     */
    public void addVideo(Video newVideo) throws AppException{
        try{
            privRep.get(currentUser).addMediaFile(newVideo);
        }catch (AppException e){
            throw e;
        }
    }
    
    /**
     * Add new audio file method. Given an audio file, it adds it to the
     * private repository of the current user. 
     * @param newAudio Audio file which will be added to the repository.
     * @throws AppException It catches the exception from the method of privRep
     * and throws it again.
     */
    public void addAudio(Audio newAudio) throws AppException{
        try{
            privRep.get(currentUser).addMediaFile(newAudio);
        }catch(AppException e){
            throw e;
        }
    }
    
    /**
     * Add new image method. Given an image, it adds it to the private repository
     * of the current user.
     * @param newIm Image which will be added to the repository.
     * @throws AppException It catches the exception from the method of privRep
     * and throws it again.
     */
    public void addImage(Image newIm) throws AppException{
        try{
            privRep.get(currentUser).addMediaFile(newIm);
        }catch(AppException e){
            throw e;
        }
    }
    
    /**
     * Show private repository method. It shows the files and its information inside
     * the private repository of the current user.
     * @return A list of String, each string from a different file.
     */
    public List<String> showPrivateRepository() {
        String rep = privRep.get(currentUser).showRepository();
        List<String> privRep = new ArrayList <> ();
        while(rep.length()>0){
            int i = rep.indexOf("\n");
            if(i != -1){
                privRep.add(rep.substring(0, i));
                rep = rep.substring(i+1);
            }else{
                privRep.add(rep);
                rep = "";
            }
        }
        return privRep;
    }
    
    /**
     * Show public repository method. It shows the shared files and its information.
     * @return A list of String, each string from a different file.
     */
    public List<String> showPublicRepository() {
        String rep = this.pubRep.showRepository();
        List<String> publicRep = new ArrayList <> ();
        while(rep.length()>0){
            int i = rep.indexOf("\n");
            if(i != -1){
                publicRep.add(rep.substring(0, i));
                rep = rep.substring(i+1);
            }else{
                publicRep.add(rep);
                rep = "";
            }
        }
        return publicRep;
    }
    
    /**
     * Remove file method. It removes the file in the given position od the
     * Private Repository of the current user, as well as all the copies made
     * in the Public Repository.
     * @param i Position of the removed file.
     * @throws AppException It catches the exception from the method of privRep
     * and throws it again.
     */
    public void removeFile(int i) throws AppException {
        if( i < privRep.get(currentUser).getSize() && i >= 0){
            File file = privRep.get(currentUser).getAt(i);
            privRep.get(currentUser).deleteFile(i);
            //al data tambe ha deliminar tots els del public iguals!
            pubRep.removeFile(file);            
        }else{
            throw new AppException("There isn't a file in this position.");
        }
    }
    
    /**
     * Add user method. It creates a new user and a new private repository
     * associated with the user.
     * @param nom Name of the new user.
     * @param ident ID of the new user.
     * @throws AppException It catches the exception from the method of privRep
     * and throws it again.
     */
    public void addUser(String nom, String ident) throws AppException {
        User usuari = new User (nom, ident);
        PrivateRepository priv = new PrivateRepository (usuari);
        if(this.existUser(ident)){
            throw new AppException("ID already taken. ");            
        }else{
            this.users.add(usuari);
            this.privRep.add(priv);
        }
    }
    
    /**
     * Exist user method. It verifies if, given an ID, exists any user with such
     * ID in the list.
     * @param string ID to verify.
     * @return Boolean type variable, true if there is a user with the given ID,
     * false otherwise.
     */
    public boolean existUser(String string) {
        //model.existusuari ,  el bucle el fa la classe user
        for (int i=0; i<users.size(); i++){
            if(string.equals(users.get(i).getUserID())){
                return true;
            }
        }
        return false;
    }
    
    /**
     * Play media file method. It plays the file in the given position of the
     * private repository of the current user.
     * @param i Position of the played file.
     * @throws AppException Exception thrown if the position selected doesn't
     * exist or the file cannot be played.
     */
    public void playMediaFile(int i) throws AppException {
        if( i < privRep.get(currentUser).getSize() && i >= 0){
            File file = this.privRep.get(currentUser).getAt(i);
            if(file instanceof MediaFile){
                FileFolder ff = new FileFolder();
                ff.addFile(file);
                this.pList.startPlayback(ff, repCyc);
            }else{
                throw new AppException("This file is not playable.");
            }
                   
        }else{
            throw new AppException("There isn't a file in this position.");
        } 
    }
    
    
    /**
     * Share media file method. It shares to the public repository the file in
     * the given position.
     * @param i Position of the shared file in the private repository.
     * @throws AppException Exception thrown if the position selected doesn't
     * exist.
     */
    public void shareMediaFile(int i) throws AppException {
        if( i < privRep.get(currentUser).getSize() && i >= 0){
            MediaFile file = (MediaFile) this.privRep.get(currentUser).getAt(i);
            this.pubRep.shareMediaFile(file);         
        }else{
            throw new AppException("There isn't a file in this position.");
        }
    }
    
    /**
     * Save data method. It saves the data in a file given its path.
     * @param string Path of the file that will contain the data.
     * @throws AppException App exception
     * @throws FileNotFoundException File not found exception
     * @throws IOException Ioe exception
     */
    public void saveDataDisk(String string) throws AppException, FileNotFoundException, IOException {
        File dataFolder = new File(string);
        FileOutputStream fout = new FileOutputStream(dataFolder);
        ObjectOutputStream oos = new ObjectOutputStream(fout);
        oos.writeObject(this);
        fout.close();
    }

    /**
     * Load data method. It loads the data in a file given its path.
     * @param string Path of the file that contains the data.
     * @return Data type object containing the loaded data.
     * @throws AppException App exception
     * @throws FileNotFoundException File Not Found Exception
     * @throws IOException IOException
     * @throws ClassNotFoundException Class Not Found Exception 
     */
    public Data loadDataDisk(String string) throws AppException, FileNotFoundException, IOException, ClassNotFoundException {
        File dataFolder = new File(string);
        if(!dataFolder.exists()){
            AppException exception = new AppException("File not found.");
            throw exception;
        }
        else{
            FileInputStream fin = new FileInputStream(dataFolder);
            ObjectInputStream ois = new ObjectInputStream(fin);
            Data data = (Data) ois.readObject();
            fin.close();
            return data;
        }
    }
    
    /**
     * To string method. It shows the users and private repositories list, as well
     * as the public repository.
     * @return List of String containing all the information about the attributes
     * of the Data-type object.
     */
    public List<String> toString1() {
        String usersList = new String();
        String repoList = new String();
        for(int i=0; i<this.users.size(); i++){
            usersList = usersList + this.users.get(i).toString();
            repoList = repoList + privRep.get(i).showRepository();
        }
        String pubRepList = this.pubRep.showRepository();
        List<String> info = new ArrayList <> ();
        info.add(usersList);
        info.add(repoList);
        info.add(pubRepList);
        return info;
    }
    
    /**
     * Show media file method. It shows the image in the given position of the
     * private repository of the current user.
     * @param i Position of the image.
     * @param sec Time (in seconds) that the image will be shown.
     * @throws AppException It throws an exception if the file is not showable
     * or it doesn't exist.
     */
    public void showMediaFile(int i, int sec) throws AppException{
        if (i < privRep.get(currentUser).getSize() && i >= 0) {
            File file = this.privRep.get(currentUser).getAt(i);
            if (file instanceof MediaFile) {
                FileFolder ff = new FileFolder();
                ff.addFile(file);
                this.pList.startPlayback(ff, repCyc);
            } else {
                throw new AppException("This file is not viewable.");
            }
        } else {
            throw new AppException("There isn't a file in this position.");
        }
    }
    
    /**
     * Sets the cyclic reproduction boolean.
     * @param t New cyclic reproduction boolean.
     */
    public void setRepCyc(boolean t){
        this.repCyc = t;
    }
    
    /**
     * Sets the cyclic reproduction boolean.
     * @return Current cyclic reproduction boolean.
     */
    public boolean getRepCyc(){
        return this.repCyc;
    }
    
    /**
     * Play private repository. It plays the repository, calling the method in
     * the PlayListener.
     * @throws AppException Thrown if the folder is empty.
     */
    public void playPrivateRepository () throws AppException{
        FileFolder ff = new FileFolder();
        ff = privRep.get(currentUser);
        boolean b = this.repCyc;
        if(ff.getSize()==0){
            throw new AppException("Empty Repository.");
        }else{
            this.pList.startPlayback(ff, b);
        }
    }
    
    /**
     * Play public repository. It plays the repository, calling the method in
     * the PlayListener.
     * @throws AppException Thrown if the folder is empty.
     */
    public void playPublicRepository() throws AppException {
        FileFolder ff = new FileFolder();
        ff = pubRep;
        if (ff.getSize() == 0) {
            throw new AppException("Empty Repository.");
        } else {
            this.pList.startPlayback(ff, this.repCyc);
        }
    }
    
    /**
     * Sets the player viewer of all the files in all the repositories. It is called
     * in the load method.
     * @param pVi PlayerViewer object.
     */
    public void setPlayerViewer (PlayerViewer pVi){
        for(int i=0; i<this.pubRep.getSize(); i++){
            File f = this.pubRep.getAt(i);
            if(f instanceof ShowingMediaFile){
                ((ShowingMediaFile) f).setPlayerViewer(pVi);
            }else if(f instanceof PlayingMediaFile){
                ((PlayingMediaFile) f).setPlayerViewer(pVi);
            }
        }
        for(int i=0; i<this.privRep.size(); i++){
            for(int j=0; j<this.privRep.get(i).getSize(); j++){
                File f = this.privRep.get(i).getAt(j);
                if (f instanceof ShowingMediaFile) {
                    ((ShowingMediaFile) f).setPlayerViewer(pVi);
                } else if (f instanceof PlayingMediaFile) {
                    ((PlayingMediaFile) f).setPlayerViewer(pVi);
                }
            }
        }
    }    

    /**
     * Set PlayListener method. It sets the PlayListener attribute given one.
     * @param pL PlayListener object.
     */
    public void setPlayListener(PlayListener pL){
        this.pList = pL;
    }
    
    
}
