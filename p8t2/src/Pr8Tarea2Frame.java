
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Héctor Garbisu DIU 2015
 */
public class Pr8Tarea2Frame extends javax.swing.JFrame {

    /**
     * Creates new form Pr8Tarea1Frame
     */
    public Pr8Tarea2Frame() {
        initComponents();
        LoginButton.setEnabled(false);
    }

    /**
     * This met7hod is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        RegisterDialog = new javax.swing.JDialog();
        Pass1Label = new javax.swing.JLabel();
        Pass2Label = new javax.swing.JLabel();
        RegisterAceptarButton = new javax.swing.JButton();
        RegisterCancelarButton = new javax.swing.JButton();
        Pass1Field = new javax.swing.JPasswordField();
        Pass2Field = new javax.swing.JPasswordField();
        LoginDialog = new javax.swing.JDialog();
        PasswordLabel = new javax.swing.JLabel();
        LoginAceptarButton = new javax.swing.JButton();
        LoginCancelarButton1 = new javax.swing.JButton();
        PasswordField = new javax.swing.JPasswordField();
        Autor = new javax.swing.JLabel();
        AccionesPanel = new javax.swing.JPanel();
        LoginButton = new javax.swing.JButton();
        RegisterButton = new javax.swing.JButton();
        ExitButton = new javax.swing.JButton();
        EstadoPanel = new javax.swing.JPanel();
        RegLabel = new javax.swing.JLabel();
        LogLabel = new javax.swing.JLabel();
        RegTextField = new javax.swing.JTextField();
        LogTextField = new javax.swing.JTextField();

        RegisterDialog.setMinimumSize(new java.awt.Dimension(300, 200));

        Pass1Label.setText("Set Password:");

        Pass2Label.setText("Repeat Password:");

        RegisterAceptarButton.setText("Aceptar");
        RegisterAceptarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterAceptarButtonActionPerformed(evt);
            }
        });

        RegisterCancelarButton.setText("Cancelar");
        RegisterCancelarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterCancelarButtonActionPerformed(evt);
            }
        });

        Pass1Field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pass1FieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout RegisterDialogLayout = new javax.swing.GroupLayout(RegisterDialog.getContentPane());
        RegisterDialog.getContentPane().setLayout(RegisterDialogLayout);
        RegisterDialogLayout.setHorizontalGroup(
            RegisterDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RegisterDialogLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(RegisterDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RegisterDialogLayout.createSequentialGroup()
                        .addComponent(RegisterAceptarButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(RegisterCancelarButton)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(RegisterDialogLayout.createSequentialGroup()
                        .addGroup(RegisterDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Pass2Label)
                            .addComponent(Pass1Label))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(RegisterDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Pass2Field)
                            .addComponent(Pass1Field))))
                .addContainerGap())
        );
        RegisterDialogLayout.setVerticalGroup(
            RegisterDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RegisterDialogLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(RegisterDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Pass1Label)
                    .addComponent(Pass1Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(RegisterDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Pass2Label)
                    .addComponent(Pass2Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(RegisterDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RegisterAceptarButton)
                    .addComponent(RegisterCancelarButton))
                .addContainerGap())
        );

        LoginDialog.setMinimumSize(new java.awt.Dimension(200, 100));

        PasswordLabel.setText("Password:");

        LoginAceptarButton.setText("Aceptar");
        LoginAceptarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginAceptarButtonActionPerformed(evt);
            }
        });

        LoginCancelarButton1.setText("Cancelar");
        LoginCancelarButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginCancelarButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout LoginDialogLayout = new javax.swing.GroupLayout(LoginDialog.getContentPane());
        LoginDialog.getContentPane().setLayout(LoginDialogLayout);
        LoginDialogLayout.setHorizontalGroup(
            LoginDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginDialogLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(LoginDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(LoginDialogLayout.createSequentialGroup()
                        .addComponent(PasswordLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(PasswordField))
                    .addGroup(LoginDialogLayout.createSequentialGroup()
                        .addComponent(LoginAceptarButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(LoginCancelarButton1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        LoginDialogLayout.setVerticalGroup(
            LoginDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginDialogLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(LoginDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PasswordLabel)
                    .addComponent(PasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(LoginDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LoginAceptarButton)
                    .addComponent(LoginCancelarButton1))
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Demostración de diálogos");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        Autor.setText("Héctor Garbisu DIU 2015");

        AccionesPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));

        LoginButton.setText("Login");
        LoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginButtonActionPerformed(evt);
            }
        });

        RegisterButton.setText("Register");
        RegisterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterButtonActionPerformed(evt);
            }
        });

        ExitButton.setText("Exit");
        ExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout AccionesPanelLayout = new javax.swing.GroupLayout(AccionesPanel);
        AccionesPanel.setLayout(AccionesPanelLayout);
        AccionesPanelLayout.setHorizontalGroup(
            AccionesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AccionesPanelLayout.createSequentialGroup()
                .addGroup(AccionesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(RegisterButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ExitButton)
                    .addComponent(LoginButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 27, Short.MAX_VALUE))
        );
        AccionesPanelLayout.setVerticalGroup(
            AccionesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AccionesPanelLayout.createSequentialGroup()
                .addComponent(LoginButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RegisterButton)
                .addGap(18, 18, 18)
                .addComponent(ExitButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        EstadoPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Estado"));

        RegLabel.setText("Registrado:");

        LogLabel.setText("LogIn:");

        RegTextField.setText("NO");

        LogTextField.setText("NO");

        javax.swing.GroupLayout EstadoPanelLayout = new javax.swing.GroupLayout(EstadoPanel);
        EstadoPanel.setLayout(EstadoPanelLayout);
        EstadoPanelLayout.setHorizontalGroup(
            EstadoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EstadoPanelLayout.createSequentialGroup()
                .addGroup(EstadoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(RegLabel)
                    .addComponent(LogLabel))
                .addGroup(EstadoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(EstadoPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(RegTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EstadoPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(LogTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        EstadoPanelLayout.setVerticalGroup(
            EstadoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EstadoPanelLayout.createSequentialGroup()
                .addGroup(EstadoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RegLabel)
                    .addComponent(RegTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(EstadoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LogLabel)
                    .addComponent(LogTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Autor)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(AccionesPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(EstadoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(63, 63, 63))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(EstadoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(AccionesPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(90, 90, 90)
                .addComponent(Autor))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        showCloseDialog();
    }//GEN-LAST:event_formWindowClosing

    private void ExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitButtonActionPerformed
        showCloseDialog();
    }//GEN-LAST:event_ExitButtonActionPerformed

    private void RegisterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterButtonActionPerformed
        RegisterDialog.setVisible(true);
    }//GEN-LAST:event_RegisterButtonActionPerformed

    private void RegisterCancelarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterCancelarButtonActionPerformed
        RegisterDialog.setVisible(false);
    }//GEN-LAST:event_RegisterCancelarButtonActionPerformed

    private void RegisterAceptarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterAceptarButtonActionPerformed
        pass1 = String.valueOf(Pass1Field.getPassword());
        String pass2 = String.valueOf(Pass2Field.getPassword());
        Pass1Field.setText(null);
        Pass2Field.setText("");
        if(!pass1.equals(pass2))
            JOptionPane.showMessageDialog(null,
                    "Las Passwords son diferentes\n Intántalo de nuevo",
                    "Error",JOptionPane.ERROR_MESSAGE);
        else{
            RegTextField.setText("SI");
            RegisterDialog.setVisible(false);
            LoginButton.setEnabled(true);
        }
    }//GEN-LAST:event_RegisterAceptarButtonActionPerformed

    private void Pass1FieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pass1FieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Pass1FieldActionPerformed

    private void LoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginButtonActionPerformed
        // TODO add your handling code here:
        if(!isLogin){
          LoginDialog.setVisible(true);
          return;
        }
        int retorno= JOptionPane.showConfirmDialog(null,
                "¿Realmente desea hacer un LogOut?",
                "LogOut",JOptionPane.YES_NO_OPTION);
        if(retorno!=0)return;
        isLogin = false;
        LoginButton.setText("LogIn");
        LogTextField.setText("NO");
    }//GEN-LAST:event_LoginButtonActionPerformed

    private void LoginCancelarButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginCancelarButton1ActionPerformed
        LoginDialog.setVisible(false);
    }//GEN-LAST:event_LoginCancelarButton1ActionPerformed

    private void LoginAceptarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginAceptarButtonActionPerformed
        String password = String.valueOf(PasswordField.getPassword());
        PasswordField.setText(null);
        if(password.equals(pass1)){
            LogTextField.setText("SI");
            isLogin = true;
            LoginDialog.setVisible(true);
            LoginButton.setText("LogOut");
        }
        else{
            JOptionPane.showMessageDialog(null,
                    "La Password es incorrecta\nInténtalo de nuevo",
                    "Error",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_LoginAceptarButtonActionPerformed

    /**
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
            java.util.logging.Logger.getLogger(Pr8Tarea2Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pr8Tarea2Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pr8Tarea2Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pr8Tarea2Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pr8Tarea2Frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AccionesPanel;
    private javax.swing.JLabel Autor;
    private javax.swing.JPanel EstadoPanel;
    private javax.swing.JButton ExitButton;
    private javax.swing.JLabel LogLabel;
    private javax.swing.JTextField LogTextField;
    private javax.swing.JButton LoginAceptarButton;
    private javax.swing.JButton LoginButton;
    private javax.swing.JButton LoginCancelarButton1;
    private javax.swing.JDialog LoginDialog;
    private javax.swing.JPasswordField Pass1Field;
    private javax.swing.JLabel Pass1Label;
    private javax.swing.JPasswordField Pass2Field;
    private javax.swing.JLabel Pass2Label;
    private javax.swing.JPasswordField PasswordField;
    private javax.swing.JLabel PasswordLabel;
    private javax.swing.JLabel RegLabel;
    private javax.swing.JTextField RegTextField;
    private javax.swing.JButton RegisterAceptarButton;
    private javax.swing.JButton RegisterButton;
    private javax.swing.JButton RegisterCancelarButton;
    private javax.swing.JDialog RegisterDialog;
    // End of variables declaration//GEN-END:variables
    private String pass1;
    private Boolean isLogin = false;
    
    private void showCloseDialog() {
        int retorno = JOptionPane.showConfirmDialog(null,
                "¿Realmente desea salir?",
                "Salir",JOptionPane.YES_NO_OPTION);
        if(retorno == 0){
            System.exit(0);
        }
    }
}
