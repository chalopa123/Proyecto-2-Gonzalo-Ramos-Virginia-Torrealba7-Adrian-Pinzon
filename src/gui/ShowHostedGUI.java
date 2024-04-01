/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import javax.swing.JFrame;
import user.User;

/**
 * A GUI class for displaying client information.
 */
public class ShowHostedGUI extends javax.swing.JFrame {

    /**
     * The client object to display information for.
     */
    static User client;
    /**
     * The title of the GUI window.
     */
    static String title = "Showing information";

    // <editor-fold defaultstate="collapsed" desc="Constructor">                 
    /**
     * Creates new form ShowClientGUI
     *
     * @param aux
     */
    public ShowHostedGUI(User aux) {
        // Ignore
        initComponents();

        // Windows config
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setTitle(title);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        // Utils
        client = aux;
        this.update();
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        numLabel = new javax.swing.JLabel();
        dniLabel = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        lastnameLabel = new javax.swing.JLabel();
        emailLabel = new javax.swing.JLabel();
        phoneLabel = new javax.swing.JLabel();
        rideLabel = new javax.swing.JLabel();
        num = new javax.swing.JLabel();
        departureLabel = new javax.swing.JLabel();
        dni = new javax.swing.JLabel();
        departure = new javax.swing.JLabel();
        ride = new javax.swing.JLabel();
        phone = new javax.swing.JLabel();
        email = new javax.swing.JLabel();
        lastname = new javax.swing.JLabel();
        name = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(9, 35, 39));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 169, 165));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("INFORMACIÓN DE LA HABITACIÓN");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 250, 30));

        numLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        numLabel.setForeground(new java.awt.Color(144, 194, 231));
        numLabel.setText("NÚMERO HAB:");
        jPanel1.add(numLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, -1, -1));

        dniLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        dniLabel.setForeground(new java.awt.Color(144, 194, 231));
        dniLabel.setText("CI:");
        jPanel1.add(dniLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, -1, -1));

        nameLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        nameLabel.setForeground(new java.awt.Color(144, 194, 231));
        nameLabel.setText("NOMBRE:");
        jPanel1.add(nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, -1, -1));

        lastnameLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lastnameLabel.setForeground(new java.awt.Color(144, 194, 231));
        lastnameLabel.setText("APELLIDO:");
        jPanel1.add(lastnameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, -1, -1));

        emailLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        emailLabel.setForeground(new java.awt.Color(144, 194, 231));
        emailLabel.setText("EMAIL:");
        jPanel1.add(emailLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, -1, -1));

        phoneLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        phoneLabel.setForeground(new java.awt.Color(144, 194, 231));
        phoneLabel.setText("TELÉFONO:");
        jPanel1.add(phoneLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, -1, -1));

        rideLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        rideLabel.setForeground(new java.awt.Color(144, 194, 231));
        rideLabel.setText("LLEGADA:");
        jPanel1.add(rideLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, -1, -1));

        num.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        num.setForeground(new java.awt.Color(78, 128, 152));
        num.setText("DEFAULT");
        jPanel1.add(num, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, -1, -1));

        departureLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        departureLabel.setForeground(new java.awt.Color(144, 194, 231));
        departureLabel.setText("SALIDA:");
        jPanel1.add(departureLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, -1, -1));

        dni.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        dni.setForeground(new java.awt.Color(78, 128, 152));
        dni.setText("PRIVADO");
        jPanel1.add(dni, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, -1, -1));

        departure.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        departure.setForeground(new java.awt.Color(78, 128, 152));
        departure.setText("PRIVADO");
        jPanel1.add(departure, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, -1, -1));

        ride.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ride.setForeground(new java.awt.Color(78, 128, 152));
        ride.setText("DEFAULT");
        jPanel1.add(ride, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, -1, -1));

        phone.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        phone.setForeground(new java.awt.Color(78, 128, 152));
        phone.setText("DEFAULT");
        jPanel1.add(phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, -1, -1));

        email.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        email.setForeground(new java.awt.Color(78, 128, 152));
        email.setText("DEFAULT");
        jPanel1.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, -1, -1));

        lastname.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lastname.setForeground(new java.awt.Color(78, 128, 152));
        lastname.setText("DEFAULT");
        jPanel1.add(lastname, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, -1, -1));

        name.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        name.setForeground(new java.awt.Color(78, 128, 152));
        name.setText("DEFAULT");
        jPanel1.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 220));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // <editor-fold defaultstate="collapsed" desc="Functions">     
    /**
     * Updates the displayed information with the current client data.
     */
    private void update() {
        name.setText(client.getName());
        lastname.setText(client.getLast_name());
        email.setText(client.getEmail());
        phone.setText(client.getPhone());
        ride.setText(client.getRide());
        num.setText(String.valueOf(client.getNum()));
    }
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
            java.util.logging.Logger.getLogger(ShowHostedGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ShowHostedGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ShowHostedGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ShowHostedGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new ShowHostedGUI(client).setVisible(true);
        });
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Variable declaration">                 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel departure;
    private javax.swing.JLabel departureLabel;
    private javax.swing.JLabel dni;
    private javax.swing.JLabel dniLabel;
    private javax.swing.JLabel email;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lastname;
    private javax.swing.JLabel lastnameLabel;
    private javax.swing.JLabel name;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JLabel num;
    private javax.swing.JLabel numLabel;
    private javax.swing.JLabel phone;
    private javax.swing.JLabel phoneLabel;
    private javax.swing.JLabel ride;
    private javax.swing.JLabel rideLabel;
    // End of variables declaration//GEN-END:variables
    // </editor-fold>
}
