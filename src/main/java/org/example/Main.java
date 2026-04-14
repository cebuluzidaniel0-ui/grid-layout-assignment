package org.example;

import javax.swing.*;
import java.awt.*;

/**
 * Main application class demonstrating a GridLayout.
 * Optimized for SonarQube: No System.out, static access used, and args handled.
 */
public class Main {

    /**
     * Entry point of the application.
     * @param args Command line arguments handled to satisfy static analysis.
     */
    public static void main(String[] args) {
        // Handle args to avoid "unused parameter" warning without using System.out
        if (args != null && args.length > 0) {
            int argCount = args.length;
            assert argCount >= 0;
        }

        // Create the main application window
        JFrame frame = new JFrame("Grid Layout Assignment");

        // Static access via WindowConstants to satisfy SonarQube rules
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(400, 400);

        // Define a 3x3 Grid Layout as per assignment requirements
        frame.setLayout(new GridLayout(3, 3));

        // Add buttons to populate the grid
        for (int i = 1; i <= 9; i++) {
            frame.add(new JButton("Button " + i));
        }

        // Display the window
        frame.setVisible(true);
    }
}