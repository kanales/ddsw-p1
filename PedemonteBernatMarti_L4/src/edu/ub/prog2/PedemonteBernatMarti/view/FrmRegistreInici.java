package edu.ub.prog2.PedemonteBernatMarti.view;
import edu.ub.prog2.PedemonteBernatMarti.controller.Controller;
import edu.ub.prog2.utils.AppException;
import javax.swing.JOptionPane;

/**
 * 
 * @author Marti Pedemonte Bernat
 * FrmRegistreInici class. It extends JDialog. It contains all the logic of the
 * log-in and sign-in option. It contains a Controller object, 2 buttons, 2 labels
 * and 2 text fields. Its methods are:
 * btnLogInActionPerformed, btnSignInActionPerformed.
 * The window won't close until a user has logged in.
 * 
 */
public class FrmRegistreInici extends javax.swing.JDialog {

    /**
     * Controller object, same than AppUB4.
     */
    private Controller controller;
    
    /**
     * Default constructor of the class. It initialize all the components.
     * @param parent Parent.
     * @param modal booelan (always true).
     * @param cont controller needed to add the file.
     */
    public FrmRegistreInici(java.awt.Frame parent, boolean modal, Controller cont) {
        super(parent, modal);
        this.controller = cont;
        initComponents();
    }

    /**
     * Code generated automatically through the "Design" tab.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblUserName = new javax.swing.JLabel();
        lblUserID = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        txtUserID = new javax.swing.JTextField();
        btnLogIn = new javax.swing.JButton();
        btnSignIn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        lblUserName.setText("User name:");

        lblUserID.setText("User ID:");

        btnLogIn.setText("Log in");
        btnLogIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogInActionPerformed(evt);
            }
        });

        btnSignIn.setText("Sign in");
        btnSignIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignInActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblUserName)
                            .addComponent(lblUserID))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtUserName, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                            .addComponent(txtUserID)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(btnLogIn, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(btnSignIn, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(75, 75, 75))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUserName)
                    .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUserID)
                    .addComponent(txtUserID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLogIn)
                    .addComponent(btnSignIn))
                .addGap(40, 40, 40))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Log-in button. It sets the user, checking if it exists. It calls methods
     * of the controller object.
     * @param evt Event of pressing the button.
     */
    private void btnLogInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogInActionPerformed
        if (controller.existUser(txtUserID.getText())) {
            controller.setUser(txtUserID.getText());
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(null, "There isn't any"
                        + " user with such ID. Please, introduce a different one.",
                    "Wrong ID",JOptionPane.ERROR_MESSAGE);
        }        
    }//GEN-LAST:event_btnLogInActionPerformed

    /**
     * Sign-in button. It adds the user, checking if it already exists. It calls
     * methods of the controller object.
     * @param evt Event of pressing the button.
     */
    private void btnSignInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignInActionPerformed
        if (!controller.existUser(txtUserID.getText())) {
            try {
                controller.addUser(txtUserName.getText(), txtUserID.getText());
                String name = txtUserName.getText();
                txtUserName.setText("");
                txtUserID.setText("");
                JOptionPane.showMessageDialog(null, "A new user has been correctly created, " + name + ".",
                        "User created", JOptionPane.INFORMATION_MESSAGE);
                
            } catch (AppException ex) {
                JOptionPane.showMessageDialog(null, "There's already"
                        + " a user with such ID. Please, introduce a different one.",
                        "ID already taken", JOptionPane.ERROR_MESSAGE);
            }
            
        } else {
            JOptionPane.showMessageDialog(null, "There's already"
                        + " a user with such ID. Please, introduce a different one.",
                        "ID already taken", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnSignInActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogIn;
    private javax.swing.JButton btnSignIn;
    private javax.swing.JLabel lblUserID;
    private javax.swing.JLabel lblUserName;
    private javax.swing.JTextField txtUserID;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}
