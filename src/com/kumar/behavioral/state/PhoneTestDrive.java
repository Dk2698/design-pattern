package com.kumar.behavioral.state;

import javax.swing.*;

/**
 * Test drive for the Phone state management.
 */
public class PhoneTestDrive {
    public static void main(String[] args) {
        Phone phone = new Phone();

        // Create buttons for phone actions
        JButton homeButton = new JButton("Home");
        homeButton.addActionListener(e -> System.out.println(phone.pressHome()));

        JButton onOffButton = new JButton("On/OFF");
        onOffButton.addActionListener(e -> System.out.println(phone.pressOnOff()));

        // Setup GUI (if needed) to add buttons to the frame
        JFrame frame = new JFrame("Phone State Test");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new java.awt.FlowLayout());
        frame.add(homeButton);
        frame.add(onOffButton);
        frame.setSize(300, 100);
        frame.setVisible(true);
    }
}
