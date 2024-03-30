/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;



/**
 *
 * @author eduardopinzon
 */
public class Principal {
    


    private JFrame frame;
    private JTextField customerNameField;
    private JTextField customerIdField;
    private JTextField roomNumberField;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Principal window = new Principal();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public Principal() {
        initialize();
    }

    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 450, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        JLabel lblCustomerName = new JLabel("Customer Name:");
        lblCustomerName.setBounds(10, 11, 96, 14);
        frame.getContentPane().add(lblCustomerName);

        customerNameField = new JTextField();
        customerNameField.setBounds(116, 8, 86, 20);
        frame.getContentPane().add(customerNameField);
        customerNameField.setColumns(10);

        JButton btnSearchCustomer = new JButton("Search Customer");
        btnSearchCustomer.setBounds(212, 7, 212, 23);
        frame.getContentPane().add(btnSearchCustomer);

        JLabel lblCustomerId = new JLabel("Customer ID:");
        lblCustomerId.setBounds(10, 36, 96, 14);
        frame.getContentPane().add(lblCustomerId);

        customerIdField = new JTextField();
        customerIdField.setBounds(116, 33, 86, 20);
        frame.getContentPane().add(customerIdField);
        customerIdField.setColumns(10);

        JButton btnSearchReservation = new JButton("Search Reservation");
        btnSearchReservation.setBounds(212, 32, 212, 23);
        frame.getContentPane().add(btnSearchReservation);

        JLabel lblRoomNumber = new JLabel("Room Number:");
        lblRoomNumber.setBounds(10, 61, 96, 14);
        frame.getContentPane().add(lblRoomNumber);

        roomNumberField = new JTextField();
        roomNumberField.setBounds(116, 58, 86, 20);
        frame.getContentPane().add(roomNumberField);
        roomNumberField.setColumns(10);

        JButton btnRoomHistory = new JButton("Room History");
        btnRoomHistory.setBounds(212, 57, 212, 23);
        frame.getContentPane().add(btnRoomHistory);

        JButton btnCheckIn = new JButton("Check In");
        btnCheckIn.setBounds(10, 86, 414, 23);
        frame.getContentPane().add(btnCheckIn);

        JButton btnCheckOut = new JButton("Check Out");
        btnCheckOut.setBounds(10, 120, 414, 23);
        frame.getContentPane().add(btnCheckOut);
    }
}

    
    
    
    
    
    

