package edu.ub.prog2.PedemonteBernatMarti.view;
import edu.ub.prog2.PedemonteBernatMarti.controller.Controller;
import edu.ub.prog2.utils.AppException;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.File;
import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 * 
 * @author Marti Pedemonte Bernat
 * AppUB4 class. It extends JFrame, and implements the WindowListener interface
 * allowing me to change some actions of the window. It contains most of the logic
 * of the model, since it is the main menu of the user.
 * It contains a Controller object, 13 buttons, two labels, two JLists (and JScrollPane)
 * and one toggle button. It links the view package with the controller package,
 * because it always calls the Controller class. Its methods are:
 * btnChangeUserActionPerformed, btnAddFileActionPerformed, btnDeleteFileActionPerformed,
 * lstPrivRepValueChanged, btnShareFileActionPerformed, btnPlayFileActionPerformed,
 * tbtnCiclicStateChanged, btnPlayPrivRepActionPerformed, btnPlayPubRepActionPerformed,
 * btnResumeActionPerformed, btnPauseActionPerformed, btnStopActionPerformed,
 * btnSkipActionPerformed, btnLoadDataActionPerformed, btnSaveDtaActionPerformed,
 * refreshPlayButtons, openRegWindow, openAddFileWindow, emptyLists, privRepFill,
 * pubRepFill, windowOpened.
 * There are also all the abstract methods of the interface but they're empty.
 */
public class AppUB4 extends javax.swing.JFrame implements WindowListener{
    
    /**
     * Controller, main atribute.
     */
    private Controller controller;
    
    /**
     * Default constructor of the class. Initializes the components and manages
     * some buttons' activation.
     */
    public AppUB4() {
        initComponents();
        this.addWindowListener(this);
        this.controller = new Controller();
        btnDeleteFile.setEnabled(false);
        btnShareFile.setEnabled(false);
        btnPlayFile.setEnabled(false);
        btnPlayPrivRep.setEnabled(false);
        btnPlayPubRep.setEnabled(false);
        btnResume.setEnabled(controller.getCanResume());
        btnPause.setEnabled(controller.getCanPause());
        btnStop.setEnabled(controller.getCanStop());
        btnSkip.setEnabled(controller.getCanSkip());
    }

    /**
     * Code generated automatically through the "Design" tab.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnChangeUser = new javax.swing.JButton();
        btnAddFile = new javax.swing.JButton();
        btnDeleteFile = new javax.swing.JButton();
        btnShareFile = new javax.swing.JButton();
        btnSaveDta = new javax.swing.JButton();
        btnLoadData = new javax.swing.JButton();
        btnPlayFile = new javax.swing.JButton();
        btnPlayPubRep = new javax.swing.JButton();
        btnPlayPrivRep = new javax.swing.JButton();
        btnResume = new javax.swing.JButton();
        btnPause = new javax.swing.JButton();
        btnStop = new javax.swing.JButton();
        btnSkip = new javax.swing.JButton();
        tbtnCiclic = new javax.swing.JToggleButton();
        lblPubRep = new javax.swing.JLabel();
        lblPrivRep = new javax.swing.JLabel();
        scpPrivRep = new javax.swing.JScrollPane();
        lstPrivRep = new javax.swing.JList<>();
        scpPubRep = new javax.swing.JScrollPane();
        lstPubRep = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("User's Main Menu");
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                formMouseMoved(evt);
            }
        });

        btnChangeUser.setText("Change User");
        btnChangeUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangeUserActionPerformed(evt);
            }
        });

        btnAddFile.setText("Add a file");
        btnAddFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddFileActionPerformed(evt);
            }
        });

        btnDeleteFile.setText("Delete file");
        btnDeleteFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteFileActionPerformed(evt);
            }
        });

        btnShareFile.setText("Share file");
        btnShareFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShareFileActionPerformed(evt);
            }
        });

        btnSaveDta.setText("Save data");
        btnSaveDta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveDtaActionPerformed(evt);
            }
        });

        btnLoadData.setText("Load data");
        btnLoadData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoadDataActionPerformed(evt);
            }
        });

        btnPlayFile.setText("Play file");
        btnPlayFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlayFileActionPerformed(evt);
            }
        });

        btnPlayPubRep.setText("Play the public repository");
        btnPlayPubRep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlayPubRepActionPerformed(evt);
            }
        });

        btnPlayPrivRep.setText("Play the private repository");
        btnPlayPrivRep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlayPrivRepActionPerformed(evt);
            }
        });

        btnResume.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/ub/prog2/PedemonteBernatMarti/view/icons/play_button.png"))); // NOI18N
        btnResume.setBorder(null);
        btnResume.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/ub/prog2/PedemonteBernatMarti/view/icons/play_button_disabled.png"))); // NOI18N
        btnResume.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/ub/prog2/PedemonteBernatMarti/view/icons/play_button_pressed_1.png"))); // NOI18N
        btnResume.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/ub/prog2/PedemonteBernatMarti/view/icons/play_button_selected.png"))); // NOI18N
        btnResume.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResumeActionPerformed(evt);
            }
        });

        btnPause.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/ub/prog2/PedemonteBernatMarti/view/icons/pause.png"))); // NOI18N
        btnPause.setBorder(null);
        btnPause.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/ub/prog2/PedemonteBernatMarti/view/icons/pause_disabled.png"))); // NOI18N
        btnPause.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/ub/prog2/PedemonteBernatMarti/view/icons/pause_pressed_1.png"))); // NOI18N
        btnPause.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/ub/prog2/PedemonteBernatMarti/view/icons/pause_selected.png"))); // NOI18N
        btnPause.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPauseActionPerformed(evt);
            }
        });

        btnStop.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/ub/prog2/PedemonteBernatMarti/view/icons/stop.png"))); // NOI18N
        btnStop.setBorder(null);
        btnStop.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/ub/prog2/PedemonteBernatMarti/view/icons/stop_disabled.png"))); // NOI18N
        btnStop.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/ub/prog2/PedemonteBernatMarti/view/icons/stop_pressed_1.png"))); // NOI18N
        btnStop.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/ub/prog2/PedemonteBernatMarti/view/icons/stop_selected.png"))); // NOI18N
        btnStop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStopActionPerformed(evt);
            }
        });

        btnSkip.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/ub/prog2/PedemonteBernatMarti/view/icons/skip.png"))); // NOI18N
        btnSkip.setBorder(null);
        btnSkip.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/ub/prog2/PedemonteBernatMarti/view/icons/skip_disabled.png"))); // NOI18N
        btnSkip.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/ub/prog2/PedemonteBernatMarti/view/icons/skip_pressed_1.png"))); // NOI18N
        btnSkip.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/ub/prog2/PedemonteBernatMarti/view/icons/skip_selected.png"))); // NOI18N
        btnSkip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSkipActionPerformed(evt);
            }
        });

        tbtnCiclic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/ub/prog2/PedemonteBernatMarti/view/icons/cyclic.png"))); // NOI18N
        tbtnCiclic.setBorder(null);
        tbtnCiclic.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/ub/prog2/PedemonteBernatMarti/view/icons/cyclic_pressed_1.png"))); // NOI18N
        tbtnCiclic.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/ub/prog2/PedemonteBernatMarti/view/icons/cyclic_selected.png"))); // NOI18N
        tbtnCiclic.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/ub/prog2/PedemonteBernatMarti/view/icons/cyclic_toggled_selected.png"))); // NOI18N
        tbtnCiclic.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/ub/prog2/PedemonteBernatMarti/view/icons/cyclic_toggled.png"))); // NOI18N
        tbtnCiclic.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                tbtnCiclicStateChanged(evt);
            }
        });

        lblPubRep.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblPubRep.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPubRep.setText("Public Repository");

        lblPrivRep.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblPrivRep.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPrivRep.setText("Private Repository");

        lstPrivRep.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        lstPrivRep.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstPrivRepValueChanged(evt);
            }
        });
        scpPrivRep.setViewportView(lstPrivRep);

        lstPubRep.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        scpPubRep.setViewportView(lstPubRep);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(scpPrivRep, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btnLoadData, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnSaveDta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(btnChangeUser, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(10, 10, 10))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(scpPubRep, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAddFile, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDeleteFile, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnShareFile, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnPlayFile, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(118, 118, 118)
                        .addComponent(btnResume)
                        .addGap(15, 15, 15)
                        .addComponent(btnPause)
                        .addGap(15, 15, 15)
                        .addComponent(btnStop)
                        .addGap(15, 15, 15)
                        .addComponent(btnSkip)
                        .addGap(15, 15, 15)
                        .addComponent(tbtnCiclic)
                        .addGap(257, 257, 257))))
            .addGroup(layout.createSequentialGroup()
                .addGap(135, 135, 135)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnPlayPrivRep, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(220, 220, 220)
                        .addComponent(btnPlayPubRep, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblPrivRep, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(220, 220, 220)
                        .addComponent(lblPubRep, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(135, 135, 135))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(btnChangeUser)
                        .addGap(10, 10, 10)
                        .addComponent(btnLoadData)
                        .addGap(10, 10, 10)
                        .addComponent(btnSaveDta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(btnAddFile)
                                .addGap(20, 20, 20)
                                .addComponent(btnDeleteFile)
                                .addGap(20, 20, 20)
                                .addComponent(btnShareFile)
                                .addGap(20, 20, 20)
                                .addComponent(btnPlayFile)
                                .addGap(20, 20, 20)
                                .addComponent(lblPrivRep))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(82, 82, 82)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnStop)
                                    .addComponent(btnResume)
                                    .addComponent(btnSkip)
                                    .addComponent(tbtnCiclic)
                                    .addComponent(btnPause))
                                .addGap(81, 81, 81)
                                .addComponent(lblPubRep)))
                        .addGap(15, 15, 15)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scpPrivRep, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(scpPubRep, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPlayPrivRep)
                    .addComponent(btnPlayPubRep))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * btnChangeUserActionPerformed. Once pressed, it calls the openRegWindow method.
     * @param evt Event of pressing the button.
     */
    private void btnChangeUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangeUserActionPerformed
        openRegWindow();
    }//GEN-LAST:event_btnChangeUserActionPerformed

    /**
     * btnAddFileActionPerformed. Once pressed, it calls the openAddFileWindow method.
     * @param evt Event of pressing the button.
     */
    private void btnAddFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddFileActionPerformed
        openAddFileWindow();
    }//GEN-LAST:event_btnAddFileActionPerformed

    /**
     * btnDeleteFileActionPerformed. Once pressed, it deletes the selected files
     * of the private repository list. It opens a JOptionPane of confirmation.
     * @param evt Event of pressing the button.
     */
    private void btnDeleteFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteFileActionPerformed
        try{
            int res = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete"+
                    " the selected files?", "Confirmation", JOptionPane.YES_NO_OPTION);
            if(JOptionPane.YES_OPTION == res){
                int j=0;
                for(int i : lstPrivRep.getSelectedIndices()){
                    controller.removeFile(i-j);
                    j++;
                }
                refreshPlayButtons();
            }            
        }catch(AppException ex){
            //..
        }
        pubRepFill();
        privRepFill();
    }//GEN-LAST:event_btnDeleteFileActionPerformed

    /**
     * lstPrivRepValueChanged. Once changed the state of selection of the private
     * repository list, it enables the Delete, Share and Play buttons if the selection
     * isn't empty.
     * @param evt Event of changing the state of selection of the list.
     */
    private void lstPrivRepValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstPrivRepValueChanged
        btnDeleteFile.setEnabled(!lstPrivRep.isSelectionEmpty());
        btnShareFile.setEnabled(!lstPrivRep.isSelectionEmpty());
        btnPlayFile.setEnabled(!lstPrivRep.isSelectionEmpty());
    }//GEN-LAST:event_lstPrivRepValueChanged

    /**
     * btnShareFileActionPerformed. Once pressed, it shares the selected files
     * of the private repository list.
     * @param evt Event of pressing the button.
     */
    private void btnShareFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShareFileActionPerformed
        try{
            for (int i : lstPrivRep.getSelectedIndices()) {
                controller.shareMediaFile(i);
                refreshPlayButtons();
            }
        }catch(AppException ex){
            //..
        }
        pubRepFill();
        privRepFill();
    }//GEN-LAST:event_btnShareFileActionPerformed

    /**
     * btnPlayFileActionPerformed. Once pressed, it plays the selected file
     * of the private repository list. It opens a JOptionPane of warning if there are
     * two files selected. It refreshes de play buttons activation state.
     * @param evt Event of pressing the button.
     */
    private void btnPlayFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlayFileActionPerformed
        try {
            if(lstPrivRep.getSelectedIndices().length > 1){
                JOptionPane.showMessageDialog(null, "Select only one file at a time",
                        "Warning", JOptionPane.INFORMATION_MESSAGE);
            }else{
                controller.playMediaFile(lstPrivRep.getSelectedIndex());
                refreshPlayButtons();
            } 
        } catch (AppException ex) {
            //..
        }
        pubRepFill();
        privRepFill();
    }//GEN-LAST:event_btnPlayFileActionPerformed

    /**
     * tbtnCiclicStateChanged. Once changed the state of the toggle button, if
     * is not selected, sets the cyclic reproduction to false. If it's selected,
     * it changes it to true.
     * @param evt Event of changing the state of the toggle button.
     */
    private void tbtnCiclicStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_tbtnCiclicStateChanged
        if(!tbtnCiclic.isSelected()){
            controller.setCycRep(false);
        }else{
            controller.setCycRep(true);
        }
        
    }//GEN-LAST:event_tbtnCiclicStateChanged

    /**
     * btnPlayPrivRepActionPerformed. Once pressed, it plays the private repository.
     * It refreshes de play buttons activation state.
     * @param evt Event of pressing the button.
     */
    private void btnPlayPrivRepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlayPrivRepActionPerformed
        try {
            this.controller.playPrivateRepositoy();
            refreshPlayButtons();
        } catch (AppException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(),
                        "Warning", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnPlayPrivRepActionPerformed

    /**
     * btnPlayPubRepActionPerformed. Once pressed, it plays the private repository.
     * It refreshes de play buttons activation state.
     * @param evt Event of pressing the button.
     */
    private void btnPlayPubRepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlayPubRepActionPerformed
        try {
            this.controller.playPublicRepositoy();
            refreshPlayButtons();
        } catch (AppException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(),
                        "Warning", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnPlayPubRepActionPerformed

    /**
     * btnResumeActionPerformed. Once pressed, it resumes the paused/stopped media
     * file. It refreshes de play buttons activation state.
     * @param evt Event of pressing the button.
     */
    private void btnResumeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResumeActionPerformed
        try {
            this.controller.resumePlayback();
            refreshPlayButtons();
        } catch (AppException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(),
                        "Warning", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnResumeActionPerformed

    /**
     * btnPauseActionPerformed. Once pressed, it pauses the current playing media
     * file. It refreshes de play buttons activation state.
     * @param evt Event of pressing the button.
     */
    private void btnPauseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPauseActionPerformed
        try {
            this.controller.pausePlayback();
            refreshPlayButtons();
        } catch (AppException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(),
                        "Warning", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnPauseActionPerformed

    /**
     * btnStopActionPerformed. Once pressed, it stops the current playing media
     * file. It refreshes de play buttons activation state.
     * @param evt Event of pressing the button.
     */
    private void btnStopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStopActionPerformed
        try {
            this.controller.stopPlayback();
            refreshPlayButtons();
        } catch (AppException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(),
                        "Warning", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnStopActionPerformed

    /**
     * btnSkipActionPerformed. Once pressed, it skips the current playing media
     * file. It refreshes de play buttons activation state.
     * @param evt Event of pressing the button.
     */
    private void btnSkipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSkipActionPerformed
        try {
            this.controller.skipPlayback();
            refreshPlayButtons();
        } catch (AppException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(),
                        "Warning", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnSkipActionPerformed

    /**
     * btnLoadDataActionPerformed. Once pressed, it loads the information
     * previously saved in a file. It opens a JFileChooser to choos that file.
     * It refreshes de play buttons activation state.
     * @param evt Event of pressing the button.
     */
    private void btnLoadDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoadDataActionPerformed
        File fitxer;
        JFileChooser selec = new JFileChooser();
        int resultat = selec.showOpenDialog(this);
        if (resultat == JFileChooser.APPROVE_OPTION) {
            fitxer = selec.getSelectedFile();
            try {
                controller.loadDataDisk(fitxer.toString());
                refreshPlayButtons();
            } catch (AppException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage(),
                        "Warning", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        openRegWindow();
    }//GEN-LAST:event_btnLoadDataActionPerformed

    /**
     * btnSaveDtaActionPerformed. Once pressed, it saves the information
     * of the users and their repositories in a file. It opens a JFileChooser to
     * choose that file. It refreshes de play buttons activation state.
     * @param evt Event of pressing the button.
     */
    private void btnSaveDtaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveDtaActionPerformed
        File fitxer;
        JFileChooser selec = new JFileChooser();
        int resultat = selec.showOpenDialog(this);
        if (resultat == JFileChooser.APPROVE_OPTION) {
            fitxer = selec.getSelectedFile();
            try {
                controller.saveDataDisk(fitxer.toString());
                JOptionPane.showMessageDialog(null, "Data saved succesfully",
                        "Saved", JOptionPane.INFORMATION_MESSAGE);
            } catch (AppException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage(),
                        "Warning", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnSaveDtaActionPerformed

    /**
     * formMouseMoved. Once the mouse has moved, it refreshes the play buttons.
     * @param evt Moving the mouse.
     */
    private void formMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseMoved
        refreshPlayButtons();
    }//GEN-LAST:event_formMouseMoved

    /**
     * Main method.
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AppUB4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AppUB4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AppUB4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AppUB4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                AppUB4 prog = new AppUB4();
                prog.setLocationRelativeTo(null);
                prog.setVisible(true);
                prog.emptyLists();
            }
        });
    }
    
    /**
     * Refreshes the activation state of the playing control buttons.
     */
    public void refreshPlayButtons(){
        if(controller.getPlaying()){
            btnResume.setEnabled(controller.getCanResume());
            btnPause.setEnabled(controller.getCanPause());
            btnStop.setEnabled(controller.getCanStop());
            btnSkip.setEnabled(controller.getCanSkip());
        }else{
            btnResume.setEnabled(false);
            btnPause.setEnabled(false);
            btnStop.setEnabled(false);
            btnSkip.setEnabled(false);
        }
        if(controller.showPrivateRepository().size()>0){
            btnPlayPrivRep.setEnabled(true);
        }else{
            btnPlayPrivRep.setEnabled(false);
        }
        if(controller.showPublicRepository().size()>1){
            btnPlayPubRep.setEnabled(true);
        }else{
            btnPlayPubRep.setEnabled(false);
        }
    }
    
    /**
     * Opens a registration frame in which the client has to sign in or log in
     * a previously signed-in user.
     */
    public void openRegWindow(){
        FrmRegistreInici finestraRegistreInici = new FrmRegistreInici(this, true, this.controller);
        finestraRegistreInici.pack();
        finestraRegistreInici.setTitle("User registration");
        finestraRegistreInici.setLocationRelativeTo(null);
        finestraRegistreInici.setVisible(true);
        this.setTitle(controller.getUser().getUserName()+"'s private main menu");
        pubRepFill();
        privRepFill();
        tbtnCiclic.setSelected(controller.getCycRep());
    }
    
    /**
     * Opens a addFile frame in which the client has to introduce all the data of
     * the file.
     */
    public void openAddFileWindow(){
        FrmAddMediaFile finestraAddFile = new FrmAddMediaFile(this, true, this.controller);
        finestraAddFile.pack();
        finestraAddFile.setTitle("Add file");
        finestraAddFile.setLocationRelativeTo(null);
        finestraAddFile.setVisible(true);
        pubRepFill();
        privRepFill();
    }
    
    /**
     * It cleares both repositoriy lists, method called in the main just once.
     */
    public void emptyLists(){
        DefaultListModel model = new DefaultListModel();
        model.clear();
        lstPrivRep.setModel(model);
        lstPubRep.setModel(model);
    }
    
    /**
     * It fills the private repository list with the files it contains.
     */
    public void privRepFill(){
        DefaultListModel model = new DefaultListModel();
        model.clear();
        for (String item : controller.showPrivateRepository()) {
            model.addElement(item);
        }
        lstPrivRep.setModel(model);
    }
    
    /**
     * It fills the private repository list with the files it contains.
     */
    public void pubRepFill() {
        DefaultListModel model = new DefaultListModel();
        model.clear();
        for (String item : controller.showPublicRepository()) {
            model.addElement(item);
        }
        lstPubRep.setModel(model);
    }

    /**
     * Window opened method. It overwrites the method from the WindowListener
     * interface and when a new AppUB4 window opens it calls the openRegWindow
     * method, allowing the client to log in with his user.
     * @param we Opened window event.
     */
    @Override
    public void windowOpened(WindowEvent we) {
        openRegWindow();
    }

    @Override
    public void windowClosing(WindowEvent we) {
        if(controller.getIsOpened()){
            try {
                controller.closeWindowPlayer();
                System.exit(0);
            } catch (AppException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage(),
                        "Warning", JOptionPane.INFORMATION_MESSAGE);
            }
        }else{
            System.exit(0);
        }
    }

    @Override
    public void windowClosed(WindowEvent we) {}

    @Override
    public void windowIconified(WindowEvent we) {}

    @Override
    public void windowDeiconified(WindowEvent we) {}

    @Override
    public void windowActivated(WindowEvent we) {}

    @Override
    public void windowDeactivated(WindowEvent we) {}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddFile;
    private javax.swing.JButton btnChangeUser;
    private javax.swing.JButton btnDeleteFile;
    private javax.swing.JButton btnLoadData;
    private javax.swing.JButton btnPause;
    private javax.swing.JButton btnPlayFile;
    private javax.swing.JButton btnPlayPrivRep;
    private javax.swing.JButton btnPlayPubRep;
    private javax.swing.JButton btnResume;
    private javax.swing.JButton btnSaveDta;
    private javax.swing.JButton btnShareFile;
    private javax.swing.JButton btnSkip;
    private javax.swing.JButton btnStop;
    private javax.swing.JLabel lblPrivRep;
    private javax.swing.JLabel lblPubRep;
    private javax.swing.JList<String> lstPrivRep;
    private javax.swing.JList<String> lstPubRep;
    private javax.swing.JScrollPane scpPrivRep;
    private javax.swing.JScrollPane scpPubRep;
    private javax.swing.JToggleButton tbtnCiclic;
    // End of variables declaration//GEN-END:variables
}
