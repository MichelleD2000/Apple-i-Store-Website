/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.oopassignment3;

import javax.swing.JOptionPane;


public class loginpageman extends javax.swing.JFrame {

    /**
     * Creates new form loginpageman
     */
    public loginpageman() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        password = new javax.swing.JLabel();
        cancelbtn = new javax.swing.JButton();
        passwordf = new javax.swing.JPasswordField();
        login = new javax.swing.JLabel();
        username1 = new javax.swing.JLabel();
        usernamef = new javax.swing.JTextField();
        loginbtn1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        password.setBackground(new java.awt.Color(0, 0, 0));
        password.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        password.setText("Password");
        getContentPane().add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, -1, -1));

        cancelbtn.setBackground(new java.awt.Color(255, 255, 0));
        cancelbtn.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        cancelbtn.setText("CANCEL");
        cancelbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cancelbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelbtnActionPerformed(evt);
            }
        });
        getContentPane().add(cancelbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 380, -1, -1));

        passwordf.setBackground(new java.awt.Color(255, 255, 51));
        passwordf.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        getContentPane().add(passwordf, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 260, 160, -1));

        login.setFont(new java.awt.Font("Nirmala UI", 1, 30)); // NOI18N
        login.setText("Manager Sign in");
        getContentPane().add(login, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, -1, -1));

        username1.setBackground(new java.awt.Color(0, 0, 0));
        username1.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        username1.setText("Username");
        getContentPane().add(username1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, -1, -1));

        usernamef.setBackground(new java.awt.Color(255, 255, 51));
        usernamef.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        getContentPane().add(usernamef, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 220, 160, -1));

        loginbtn1.setBackground(new java.awt.Color(255, 255, 0));
        loginbtn1.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        loginbtn1.setText("SIGN IN");
        loginbtn1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        loginbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginbtn1ActionPerformed(evt);
            }
        });
        getContentPane().add(loginbtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 380, -1, -1));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\METHNI\\Downloads\\peakpx (5).jpg")); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\METHNI\\Downloads\\peakpx (5).jpg")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginbtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginbtn1ActionPerformed
String user =  usernamef.getText();
        String pass =  passwordf.getText(); 
        if ( user.equals("manager1" ) && pass.equals("manager1") ) {  
            JOptionPane.showMessageDialog(rootPane, "Sign in Successful", "Message",0);  
            managerpage menu = new managerpage();
            menu.setVisible(true);
            this.setVisible(false);
        }

        else {
            JOptionPane.showMessageDialog(rootPane, "Error Occured!!!", "Warning",0); 
            usernamef.setText(null);  
            passwordf.setText(null);

        }
    }//GEN-LAST:event_loginbtn1ActionPerformed

    private void cancelbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelbtnActionPerformed
        loginpagecashier log  = new loginpagecashier();
        log.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_cancelbtnActionPerformed

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
            java.util.logging.Logger.getLogger(loginpageman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(loginpageman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(loginpageman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(loginpageman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new loginpageman().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelbtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel login;
    private javax.swing.JButton loginbtn1;
    private javax.swing.JLabel password;
    private javax.swing.JPasswordField passwordf;
    private javax.swing.JLabel username1;
    private javax.swing.JTextField usernamef;
    // End of variables declaration//GEN-END:variables
}