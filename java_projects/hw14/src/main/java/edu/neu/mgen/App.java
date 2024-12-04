package edu.neu.mgen;

import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //System.out.println( "Hello World!" );
        SwingUtilities.invokeLater(() -> {
            String username = JOptionPane.showInputDialog("Enter your username:");
            if (username != null && !username.trim().isEmpty()) {
                new ChatClient(username);
            }
        });
    }
}

// Develop the following program:
// A chat application using chat windows
// Sign-up and login tools
// Two chat participants can send typed messages and receive messages.