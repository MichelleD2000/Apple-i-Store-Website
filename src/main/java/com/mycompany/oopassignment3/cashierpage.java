/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.oopassignment3;


public class cashierpage extends javax.swing.JFrame {

    /**
     * Creates new form cashierpage
     */
    public cashierpage() {
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

        menu = new javax.swing.JLabel();
        viewbtn1 = new javax.swing.JButton();
        searchbtn = new javax.swing.JButton();
        cancelbtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        menu.setFont(new java.awt.Font("Nirmala UI", 1, 30)); // NOI18N
        menu.setText("Menu");
        getContentPane().add(menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 90, -1, -1));

        viewbtn1.setBackground(new java.awt.Color(255, 255, 0));
        viewbtn1.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        viewbtn1.setText("VIEW ITEMS");
        viewbtn1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        viewbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewbtn1ActionPerformed(evt);
            }
        });
        getContentPane().add(viewbtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 240, -1, -1));

        searchbtn.setBackground(new java.awt.Color(255, 255, 0));
        searchbtn.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        searchbtn.setText("SEARCH ITEMS");
        searchbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        searchbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchbtnActionPerformed(evt);
            }
        });
        getContentPane().add(searchbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 310, -1, -1));

        cancelbtn.setBackground(new java.awt.Color(255, 255, 0));
        cancelbtn.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        cancelbtn.setText("CANCEL");
        cancelbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cancelbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelbtnActionPerformed(evt);
            }
        });
        getContentPane().add(cancelbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 500, -1, -1));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\METHNI\\Downloads\\peakpx (5).jpg")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void viewbtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewbtn1ActionPerformed
        viewpage view = new viewpage();
        view.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_viewbtn1ActionPerformed

    private void searchbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchbtnActionPerformed
        searchpage search = new searchpage();
        search.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_searchbtnActionPerformed

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
            java.util.logging.Logger.getLogger(cashierpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cashierpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cashierpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cashierpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cashierpage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelbtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel menu;
    private javax.swing.JButton searchbtn;
    private javax.swing.JButton viewbtn1;
    // End of variables declaration//GEN-END:variables
}
