package ch.nilsh;

import javax.swing.*;

/**
 * Simple main class
 */
public class Main {
    /**
     * Main entry point of our application
     *
     * @param args Arguments
     */
    public static void main(String[] args) {
        JFrame frame = new JFrame("GroovyTest (1.20.2)");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(600, 400);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setVisible(true);
        frame.setLayout(null);

        // Add example button
        JButton btnExample = new JButton("Example Button");
        btnExample.setBounds(50, 50, 200, 30);
        btnExample.addActionListener(event -> JOptionPane.showMessageDialog(frame, "You just clicked the button!"));
        frame.add(btnExample);
    }
}