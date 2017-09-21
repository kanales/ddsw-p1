package edu.ub.prog2.PedemonteBernatMarti.view;
import edu.ub.prog2.PedemonteBernatMarti.controller.Controller;
import edu.ub.prog2.utils.AppException;
import java.io.File;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 * 
 * @author Marti Pedemonte Bernat
 * FrmAddMediaFile class. It extends JDialog. It contains all the logic of the add-file
 * option. It contains a Controller object, 4 buttons, one combo box, 10 labels
 * and 9 text fields. Its methods are:
 * omplirLlista, btnCancelActionPerformed, btnAcceptActionPerformed, 
 * btnOpenFileActionPerformed, btnOpenThumbnailActionPerformed, 
 * cmbFileTypeItemStateChanged, txtFilePathCaretUpdate, txtDescriptionCaretUpdate,
 * txtCodecCaretUpdate, txtDurationCaretUpdate, txtHeightCaretUpdate, 
 * txtWidthCaretUpdate, txtFpsCaretUpdate, txtThumbnailCaretUpdate,
 * txtKbpsCaretUpdate, enableAcceptButton.
 * 
 */
public class FrmAddMediaFile extends javax.swing.JDialog {

    /**
     * Array list containing the three possible types of files.
     */
    private ArrayList<String> fileType;
    
    /**
     * Controller object, same than AppUB4.
     */    
    private Controller controller;
    
    /**
     * Default constructor of the class. It disables all the fields and fills the combo
     * box list. It initialize the components.
     * @param parent Parent.
     * @param modal booelan (always true).
     * @param cont controller needed to add the file.
     */
    public FrmAddMediaFile(java.awt.Frame parent, boolean modal, Controller cont) {
        super(parent, modal);
        this.controller = cont;
        this.fileType = new ArrayList<>();
        initComponents();
        omplirLlista();
        cmbFileType.setSelectedIndex(-1);
        txtFilePath.setEnabled(false);
        btnOpenFile.setEnabled(false);
        txtDescription.setEnabled(false);
        txtCodec.setEnabled(false);
        txtDuration.setEnabled(false);
        txtHeight.setEnabled(false);
        txtWidth.setEnabled(false);
        txtFps.setEnabled(false);
        txtThumbnail.setEnabled(false);
        btnOpenThumbnail.setEnabled(false);
        txtKbps.setEnabled(false);
        btnAccept.setEnabled(false);
    }
    
    /**
     * If fills the combo box list with all the types of files.
     */
    public void omplirLlista(){
        this.fileType.add("Video");
        this.fileType.add("Audio");
        this.fileType.add("Image");
        DefaultComboBoxModel cbox = new DefaultComboBoxModel();
        cbox.removeAllElements();
        for(String item: fileType){
            cbox.addElement(item);
        }
        cmbFileType.setModel(cbox);
    }

    /**
     * Code generated automatically through the "Design" tab.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblFilePath = new javax.swing.JLabel();
        txtFilePath = new javax.swing.JTextField();
        btnAccept = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        btnOpenFile = new javax.swing.JButton();
        cmbFileType = new javax.swing.JComboBox<>();
        lblFileType = new javax.swing.JLabel();
        lblDescription = new javax.swing.JLabel();
        lblCodec = new javax.swing.JLabel();
        lblDuration = new javax.swing.JLabel();
        lblHeight = new javax.swing.JLabel();
        lblWidth = new javax.swing.JLabel();
        lblFps = new javax.swing.JLabel();
        lblThumbnail = new javax.swing.JLabel();
        lblKbps = new javax.swing.JLabel();
        txtDescription = new javax.swing.JTextField();
        txtCodec = new javax.swing.JTextField();
        txtDuration = new javax.swing.JTextField();
        txtHeight = new javax.swing.JTextField();
        txtWidth = new javax.swing.JTextField();
        txtFps = new javax.swing.JTextField();
        txtThumbnail = new javax.swing.JTextField();
        txtKbps = new javax.swing.JTextField();
        btnOpenThumbnail = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblFilePath.setText("File path:");

        txtFilePath.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtFilePathCaretUpdate(evt);
            }
        });

        btnAccept.setText("Accept");
        btnAccept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcceptActionPerformed(evt);
            }
        });

        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        btnOpenFile.setText("Open file");
        btnOpenFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOpenFileActionPerformed(evt);
            }
        });

        cmbFileType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbFileType.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbFileTypeItemStateChanged(evt);
            }
        });

        lblFileType.setText("File type:");

        lblDescription.setText("Description:");

        lblCodec.setText("Codec:");

        lblDuration.setText("Duration (secs):");

        lblHeight.setText("Height:");

        lblWidth.setText("Width:");

        lblFps.setText("Frames per sec.:");

        lblThumbnail.setText("Thumbnail:");

        lblKbps.setText("Kbits per second:");

        txtDescription.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtDescriptionCaretUpdate(evt);
            }
        });

        txtCodec.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtCodecCaretUpdate(evt);
            }
        });

        txtDuration.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtDurationCaretUpdate(evt);
            }
        });

        txtHeight.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtHeightCaretUpdate(evt);
            }
        });

        txtWidth.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtWidthCaretUpdate(evt);
            }
        });

        txtFps.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtFpsCaretUpdate(evt);
            }
        });

        txtThumbnail.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtThumbnailCaretUpdate(evt);
            }
        });

        txtKbps.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtKbpsCaretUpdate(evt);
            }
        });

        btnOpenThumbnail.setText("Open file");
        btnOpenThumbnail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOpenThumbnailActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblWidth)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblFilePath)
                            .addComponent(lblFileType)
                            .addComponent(lblDescription)
                            .addComponent(lblCodec)
                            .addComponent(lblDuration)
                            .addComponent(lblHeight)
                            .addComponent(lblFps)
                            .addComponent(lblThumbnail)
                            .addComponent(lblKbps))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtFps, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtWidth)
                                .addComponent(cmbFileType, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtCodec, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                                .addComponent(txtDuration, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtHeight, javax.swing.GroupLayout.Alignment.LEADING))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtThumbnail)
                                    .addComponent(txtDescription)
                                    .addComponent(txtFilePath, javax.swing.GroupLayout.DEFAULT_SIZE, 360, Short.MAX_VALUE))
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnOpenFile, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnOpenThumbnail, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(txtKbps, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(274, 274, 274)
                .addComponent(btnAccept, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(214, 214, 214))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFileType)
                    .addComponent(cmbFileType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFilePath)
                    .addComponent(txtFilePath, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnOpenFile))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDescription, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDescription))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodec)
                    .addComponent(txtCodec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDuration)
                    .addComponent(txtDuration, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHeight)
                    .addComponent(txtHeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblWidth)
                    .addComponent(txtWidth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFps)
                    .addComponent(txtFps, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblThumbnail)
                    .addComponent(txtThumbnail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnOpenThumbnail))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblKbps)
                    .addComponent(txtKbps, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancel)
                    .addComponent(btnAccept))
                .addGap(40, 40, 40))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Cancel button. It only closes the JDialog without adding any file.
     * @param evt Event of pressing the button.
     */
    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelActionPerformed

    /**
     * Accept button. It only closes the JDialog adding the given file, using
     * the method from the controller object.
     * @param evt Event of pressing the button.
     */
    private void btnAcceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcceptActionPerformed
        String s = (String) cmbFileType.getSelectedItem();
        if ("Video".equals(s)) {
            try{
                float duration = Float.parseFloat(txtDuration.getText());
                int height = Integer.parseInt(txtHeight.getText());
                int width = Integer.parseInt(txtWidth.getText());
                float fps = Float.parseFloat(txtFps.getText());
                controller.addVideo(txtFilePath.getText(), txtDescription.getText(),
                        txtCodec.getText(), duration, height, width, fps);
                this.dispose();
            }catch(AppException ex){
                JOptionPane.showMessageDialog(null, ex.getMessage(),
                        "Error", JOptionPane.ERROR_MESSAGE);
            }catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(null, ex.getMessage(),
                        "Insert a number, not letters!", JOptionPane.ERROR_MESSAGE);
            }
        }
        if ("Audio".equals(s)) {
            try {
                float duration = Float.parseFloat(txtDuration.getText());
                int kbps = Integer.parseInt(txtKbps.getText());
                controller.addAudio(txtFilePath.getText(), txtThumbnail.getText(), txtDescription.getText(),
                        txtCodec.getText(), duration, kbps);
                this.dispose();
            } catch (AppException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage(),
                        "Error", JOptionPane.ERROR_MESSAGE);
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage(),
                        "Insert a number, not letters!", JOptionPane.ERROR_MESSAGE);
            }
        }
        if ("Image".equals(s)) {
            try {
                int height = Integer.parseInt(txtHeight.getText());
                int width = Integer.parseInt(txtWidth.getText());
                controller.addImage(txtFilePath.getText(), txtDescription.getText(),
                        height, width);
                this.dispose();
            } catch (AppException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage(),
                        "Error", JOptionPane.ERROR_MESSAGE);
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage(),
                        "Insert a number, not letters!", JOptionPane.ERROR_MESSAGE);
            }
        }
                
    }//GEN-LAST:event_btnAcceptActionPerformed

    /**
     * Open file button. It opens a JFileChooser to allow the client to select the
     * file he want to add.
     * @param evt Event of pressing the button.
     */
    private void btnOpenFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpenFileActionPerformed
        File fitxer;
        JFileChooser selec = new JFileChooser();
        int resultat = selec.showOpenDialog(this);
        if(resultat == JFileChooser.APPROVE_OPTION){
            fitxer = selec.getSelectedFile();
            txtFilePath.setText(fitxer.toString());
        }
    }//GEN-LAST:event_btnOpenFileActionPerformed

    /**
     * Open thumbnail button. It opens a JFileChooser to allow the client to
     * select the thumbnail he want to add.
     * @param evt Event of pressing the button.
     */
    private void btnOpenThumbnailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpenThumbnailActionPerformed
        File fitxer;
        JFileChooser selec = new JFileChooser();
        int resultat = selec.showOpenDialog(this);
        if(resultat == JFileChooser.APPROVE_OPTION){
            fitxer = selec.getSelectedFile();
            txtThumbnail.setText(fitxer.toString());
        }
    }//GEN-LAST:event_btnOpenThumbnailActionPerformed

    /**
     * It sets some fields to active and some to inactive state, depending on
     * the type of file selected. If all the fields of the selected file are
     * filled, it enables the accept button.
     * @param evt Event of changing the state of the combobox.
     */
    private void cmbFileTypeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbFileTypeItemStateChanged
        txtFilePath.setEnabled(true);
        btnOpenFile.setEnabled(true);
        txtDescription.setEnabled(true);
        String s = (String) cmbFileType.getSelectedItem();
        if("Video".equals(s)){
            txtCodec.setEnabled(true);
            txtDuration.setEnabled(true);
            txtHeight.setEnabled(true);
            txtWidth.setEnabled(true);
            txtFps.setEnabled(true);
            txtThumbnail.setText("");
            txtThumbnail.setEnabled(false);
            btnOpenThumbnail.setEnabled(false);
            txtKbps.setText("");
            txtKbps.setEnabled(false);
            if(txtFilePath.getText().length()>0 && txtDescription.getText().length()>0
                    && txtCodec.getText().length()>0 && txtDuration.getText().length()>0
                    && txtHeight.getText().length()>0 && txtWidth.getText().length()>0
                    && txtFps.getText().length()>0){
                btnAccept.setEnabled(true);                
            }else{btnAccept.setEnabled(false);}
        }
        if("Audio".equals(s)){
            txtCodec.setEnabled(true);
            txtDuration.setEnabled(true);
            txtHeight.setText("");
            txtHeight.setEnabled(false);
            txtWidth.setText("");
            txtWidth.setEnabled(false);
            txtFps.setText("");
            txtFps.setEnabled(false);
            txtThumbnail.setEnabled(true);
            btnOpenThumbnail.setEnabled(true);
            txtKbps.setEnabled(true);
            if (txtFilePath.getText().length() > 0 && txtDescription.getText().length() > 0
                    && txtCodec.getText().length() > 0 && txtDuration.getText().length() > 0
                    && txtThumbnail.getText().length() > 0 && txtKbps.getText().length() > 0) {
                btnAccept.setEnabled(true);
            }else{btnAccept.setEnabled(false);}
        }
        if("Image".equals(s)){
            txtCodec.setText("");
            txtCodec.setEnabled(false);
            txtDuration.setText("");
            txtDuration.setEnabled(false);
            txtHeight.setEnabled(true);
            txtWidth.setEnabled(true);
            txtFps.setText("");
            txtFps.setEnabled(false);
            txtThumbnail.setText("");
            txtThumbnail.setEnabled(false);
            btnOpenThumbnail.setEnabled(false);
            txtKbps.setText("");
            txtKbps.setEnabled(false);
            if (txtFilePath.getText().length() > 0 && txtDescription.getText().length() > 0
                    && txtHeight.getText().length() > 0 && txtWidth.getText().length() > 0) {
                btnAccept.setEnabled(true);
            }else{btnAccept.setEnabled(false);}
        }
        
        
    }//GEN-LAST:event_cmbFileTypeItemStateChanged

    /**
     * Checks if, given an update event, it is possible to enable the accept button.
     * @param evt Event of changing the state of the field.
     */
    private void txtFilePathCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtFilePathCaretUpdate
        enableAcceptButton();
    }//GEN-LAST:event_txtFilePathCaretUpdate

    /**
     * Checks if, given an update event, it is possible to enable the accept button.
     * @param evt Event of changing the state of the field.
     */
    private void txtDescriptionCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtDescriptionCaretUpdate
        enableAcceptButton();
    }//GEN-LAST:event_txtDescriptionCaretUpdate

    /**
     * Checks if, given an update event, it is possible to enable the accept button.
     * @param evt Event of changing the state of the field.
     */
    private void txtCodecCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtCodecCaretUpdate
        enableAcceptButton();
    }//GEN-LAST:event_txtCodecCaretUpdate

    /**
     * Checks if, given an update event, it is possible to enable the accept button.
     * @param evt Event of changing the state of the field.
     */
    private void txtDurationCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtDurationCaretUpdate
        enableAcceptButton();
    }//GEN-LAST:event_txtDurationCaretUpdate

    /**
     * Checks if, given an update event, it is possible to enable the accept button.
     * @param evt Event of changing the state of the field.
     */
    private void txtHeightCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtHeightCaretUpdate
        enableAcceptButton();
    }//GEN-LAST:event_txtHeightCaretUpdate

    /**
     * Checks if, given an update event, it is possible to enable the accept button.
     * @param evt Event of changing the state of the field.
     */
    private void txtWidthCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtWidthCaretUpdate
        enableAcceptButton();
    }//GEN-LAST:event_txtWidthCaretUpdate

    /**
     * Checks if, given an update event, it is possible to enable the accept button.
     * @param evt Event of changing the state of the field.
     */
    private void txtFpsCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtFpsCaretUpdate
        enableAcceptButton();
    }//GEN-LAST:event_txtFpsCaretUpdate

    /**
     * Checks if, given an update event, it is possible to enable the accept button.
     * @param evt Event of changing the state of the field.
     */
    private void txtThumbnailCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtThumbnailCaretUpdate
        enableAcceptButton();
    }//GEN-LAST:event_txtThumbnailCaretUpdate

    /**
     * Checks if, given an update event, it is possible to enable the accept button.
     * @param evt Event of changing the state of the field.
     */
    private void txtKbpsCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtKbpsCaretUpdate
        enableAcceptButton();
    }//GEN-LAST:event_txtKbpsCaretUpdate

    /**
     * If all the fields of the selected file are filled, it enables the accept button.
     */
    public void enableAcceptButton(){
        String s = (String) cmbFileType.getSelectedItem();
        if ("Video".equals(s)) {
            if (txtFilePath.getText().length() > 0 && txtDescription.getText().length() > 0
                    && txtCodec.getText().length() > 0 && txtDuration.getText().length() > 0
                    && txtHeight.getText().length() > 0 && txtWidth.getText().length() > 0
                    && txtFps.getText().length() > 0) {
                btnAccept.setEnabled(true);
            } else {
                btnAccept.setEnabled(false);
            }
        }
        if ("Audio".equals(s)) {
            if (txtFilePath.getText().length() > 0 && txtDescription.getText().length() > 0
                    && txtCodec.getText().length() > 0 && txtDuration.getText().length() > 0
                    && txtThumbnail.getText().length() > 0 && txtKbps.getText().length() > 0) {
                btnAccept.setEnabled(true);
            } else {
                btnAccept.setEnabled(false);
            }
        }
        if ("Image".equals(s)) {
            if (txtFilePath.getText().length() > 0 && txtDescription.getText().length() > 0
                    && txtHeight.getText().length() > 0 && txtWidth.getText().length() > 0) {
                btnAccept.setEnabled(true);
            } else {
                btnAccept.setEnabled(false);
            }
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAccept;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnOpenFile;
    private javax.swing.JButton btnOpenThumbnail;
    private javax.swing.JComboBox<String> cmbFileType;
    private javax.swing.JLabel lblCodec;
    private javax.swing.JLabel lblDescription;
    private javax.swing.JLabel lblDuration;
    private javax.swing.JLabel lblFilePath;
    private javax.swing.JLabel lblFileType;
    private javax.swing.JLabel lblFps;
    private javax.swing.JLabel lblHeight;
    private javax.swing.JLabel lblKbps;
    private javax.swing.JLabel lblThumbnail;
    private javax.swing.JLabel lblWidth;
    private javax.swing.JTextField txtCodec;
    private javax.swing.JTextField txtDescription;
    private javax.swing.JTextField txtDuration;
    private javax.swing.JTextField txtFilePath;
    private javax.swing.JTextField txtFps;
    private javax.swing.JTextField txtHeight;
    private javax.swing.JTextField txtKbps;
    private javax.swing.JTextField txtThumbnail;
    private javax.swing.JTextField txtWidth;
    // End of variables declaration//GEN-END:variables
}
