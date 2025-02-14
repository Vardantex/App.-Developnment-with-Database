/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CSTM10D21;


import javax.swing.*;
import java.awt.event.*;




/**
 *
 * @author class
 */
public class EventObjectWindow extends JFrame {

     private JButton button1;  // Button 1
   private JButton button2;  // Button 2
   private JButton button3;  // Button 3
   private JPanel panel;     // A panel to hold components
   private final int WINDOW_WIDTH = 320; // Window width
   private final int WINDOW_HEIGHT = 70; // Window height

   /**
    *  Constructor
    */

   public EventObjectWindow()
   {
      // Set the title bar text.
      super("Event Object Demonstration");

      // Set the size of the window.
      setSize(WINDOW_WIDTH, WINDOW_HEIGHT);

      // Specify what happens when the close button is clicked.
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      // Create the three buttons.
      button1 = new JButton("Button 1");
      button2 = new JButton("Button 2");
      button3 = new JButton("Button 3");

      // Register an event listener with all 3 buttons.
      button1.addActionListener(new ButtonListener());
      button2.addActionListener(new ButtonListener());
      button3.addActionListener(new ButtonListener());

      // Create a panel and add the buttons to it.
      panel = new JPanel();
      panel.add(button1);
      panel.add(button2);
      panel.add(button3);

      // Add the panel to the content pane.
      add(panel);

      // Display the window.
      setVisible(true);
   }

   /**
    *  Private inner class that handles the event when
    *  the user clicks a button.
    */

   private class ButtonListener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
        //Action when button is clicked
          JOptionPane.showMessageDialog(null, 
               "The action command for this event is " +
               e.getActionCommand());
      }
   }



    
}
