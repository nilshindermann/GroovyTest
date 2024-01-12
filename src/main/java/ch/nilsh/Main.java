package ch.nilsh;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

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
        JFrame frame = new JFrame("GroovyTest (1.20.5)");
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

        // Add progress bar
        JProgressBar progressBar = new JProgressBar();
        progressBar.setBounds(50, 200, 400, 30);
        progressBar.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                JProgressBar bar = (JProgressBar) e.getSource();
                bar.setValue(bar.getMinimum());
            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }
        });
        frame.add(progressBar);

        // Add button to start the progress bar
        JButton btnStart = new JButton("Start");
        btnStart.setBounds(50, 100, 200, 30);
        btnStart.addActionListener(event -> new Thread(() -> {
            while (progressBar.getValue() < progressBar.getMaximum()) {
                try {
                    progressBar.setValue(progressBar.getValue() + 1);
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }).start());
        frame.add(btnStart);
    }
}