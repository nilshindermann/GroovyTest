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
        JFrame frame = new JFrame("GroovyTest");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(600, 400);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setVisible(true);
    }
}