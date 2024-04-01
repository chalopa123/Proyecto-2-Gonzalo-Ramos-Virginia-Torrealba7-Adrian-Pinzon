/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import app.App;

/**
 * The MainGUI class represents the main graphical user interface of the
 * application.
 *
 */
public class MainGUI extends javax.swing.JFrame {

    /**
     * Static variable to store a title of the program
     */
    static String t;
    /**
     * Static variable to store an instance of the App class.
     */
    static App app;

    // <editor-fold defaultstate="collapsed" desc="Constructor">   
    /**
     * Creates new form MainGUI
     *
     * @param title Title of the program
     * @param appParam App instance to work with harmony
     */
    public MainGUI(String title, App appParam) {
        // Ignore
        initComponents();

        // Window config
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setTitle(title);
        this.setResizable(false);

        // Utilities
        app = appParam;
    }
    // </editor-fold> 

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        checkOut = new javax.swing.JButton();
        searchHosted = new javax.swing.JButton();
        searchReservation = new javax.swing.JButton();
        searchHistorialBedroom = new javax.swing.JButton();
        checkIn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(9, 35, 39));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 169, 165));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Booking system");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 380, 30));

        checkOut.setBackground(new java.awt.Color(144, 194, 231));
        checkOut.setForeground(new java.awt.Color(11, 83, 81));
        checkOut.setText("ADMIN: Check-Out");
        checkOut.setFocusPainted(false);
        checkOut.setFocusable(false);
        checkOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkOutActionPerformed(evt);
            }
        });
        jPanel1.add(checkOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, 280, 30));

        searchHosted.setBackground(new java.awt.Color(144, 194, 231));
        searchHosted.setForeground(new java.awt.Color(11, 83, 81));
        searchHosted.setText("CLIENTES: Ver clientes hopedados");
        searchHosted.setFocusPainted(false);
        searchHosted.setFocusable(false);
        searchHosted.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchHostedActionPerformed(evt);
            }
        });
        jPanel1.add(searchHosted, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 280, 30));

        searchReservation.setBackground(new java.awt.Color(144, 194, 231));
        searchReservation.setForeground(new java.awt.Color(11, 83, 81));
        searchReservation.setText("ADMIN: Buscar reservación");
        searchReservation.setFocusPainted(false);
        searchReservation.setFocusable(false);
        searchReservation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchReservationActionPerformed(evt);
            }
        });
        jPanel1.add(searchReservation, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 280, 30));

        searchHistorialBedroom.setBackground(new java.awt.Color(144, 194, 231));
        searchHistorialBedroom.setForeground(new java.awt.Color(11, 83, 81));
        searchHistorialBedroom.setText("ADMIN: Ver historial de una habitación");
        searchHistorialBedroom.setFocusPainted(false);
        searchHistorialBedroom.setFocusable(false);
        searchHistorialBedroom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchHistorialBedroomActionPerformed(evt);
            }
        });
        jPanel1.add(searchHistorialBedroom, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 280, 30));

        checkIn.setBackground(new java.awt.Color(144, 194, 231));
        checkIn.setForeground(new java.awt.Color(11, 83, 81));
        checkIn.setText("ADMIN: Check-In");
        checkIn.setFocusPainted(false);
        checkIn.setFocusable(false);
        checkIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkInActionPerformed(evt);
            }
        });
        jPanel1.add(checkIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 280, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // <editor-fold defaultstate="collapsed" desc="Events">
    /**
     * Event handler for the "Search Hosted" action.
     *
     * @param evt The action event
     */
    private void searchHostedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchHostedActionPerformed
        app.searchHosted();
    }//GEN-LAST:event_searchHostedActionPerformed

    /**
     * Event handler for the "Search Reservation" action.
     *
     * @param evt The action event
     */
    private void searchReservationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchReservationActionPerformed
        app.searchReservation();
    }//GEN-LAST:event_searchReservationActionPerformed

    /**
     * Event handler for the "Search Bedroom History" action.
     *
     * @param evt The action event
     */
    private void searchHistorialBedroomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchHistorialBedroomActionPerformed
        app.searchBedroomHistorial();
    }//GEN-LAST:event_searchHistorialBedroomActionPerformed

    /**
     * Event handler for the "Check-In" action.
     *
     * @param evt The action event
     */
    private void checkInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkInActionPerformed
        app.checkIn();
    }//GEN-LAST:event_checkInActionPerformed

    /**
     * Event handler for the "Check-Out" action.
     *
     * @param evt The action event
     */
    private void checkOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkOutActionPerformed
        app.checkOut();
    }//GEN-LAST:event_checkOutActionPerformed
    // </editor-fold> 

    // <editor-fold defaultstate="collapsed" desc="Main function">
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
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new MainGUI(t, app).setVisible(true);
        });
    }
    // </editor-fold>   

    // <editor-fold defaultstate="collapsed" desc="Variable declaration">
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton checkIn;
    private javax.swing.JButton checkOut;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton searchHistorialBedroom;
    private javax.swing.JButton searchHosted;
    private javax.swing.JButton searchReservation;
    // End of variables declaration//GEN-END:variables
    // </editor-fold>   
}
