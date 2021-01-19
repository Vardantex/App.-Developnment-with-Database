/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CSTM9D4;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

//import java.awt.*;
//import java.swing.*;
/**
 *
 * @author Andrew
 */
//import javax.swing.*;
//import java.awt.event.*;

/**
 * This class demonstrates how to retrieve the action command
 * from an event object.
 */

public class HWJButtons extends JFrame
{
    // Buttons
   private JButton button1;  
   private JButton button2;  
   private JButton button3;  
    private JButton button4;  
     private JButton button5;  
      private JButton button6;  
       private JButton button7;  
        private JButton button8;  
         private JButton button9;  
          private JButton button10;  
           private JButton button11;  
            private JButton button12;  
             private JButton button13;  
              private JButton button14;  
               private JButton button15;  
                private JButton button16;  
                 private JButton button17;  
                  private JButton button18;  
                   private JButton button19;  
                    private JButton button20;  
                     private JButton button21;  
                      private JButton button22;  
                       private JButton button23;  
                        private JButton button24;  
                         private JButton button25;  
                          private JButton button26;  
                          
   private JPanel panel; // A panel to hold components
   private JPanel panel2;
   private JPanel panel3;
   private JPanel panel4;
   private JPanel panel5;
   private JPanel panel6;
   
   
   
   /** private JPane2 pane2;
  private JPane3 pane3;
  private JPane4 pane4;
  private JPane5 pane5;
  private JPane6 pane6;
  */

  
   private final int WINDOW_WIDTH = 275; // Window width
   private final int WINDOW_HEIGHT = 350; // Window height

	/**
	 * Constructor
	 */

   public HWJButtons()
   {
      // Set the title bar text.
      super("The Alphabets");

      // Set the size of the window.
      setSize(WINDOW_WIDTH, WINDOW_HEIGHT);

      // Specify what happens when the close button is clicked.
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      // Create the three buttons.
      button1 = new JButton("A");
      button2 = new JButton("B");
      button3 = new JButton("C");
      button4 = new JButton("D");
      button5 = new JButton("E");
      button6 = new JButton("F");
      button7 = new JButton("G");
      button8 = new JButton("H");
      button9 = new JButton("I");
      button10 = new JButton("J");
      button11 = new JButton("K");
      button12 = new JButton("L");
      button13 = new JButton("M");
      button14 = new JButton("N");
      button15 = new JButton("O");
      button16 = new JButton("P");
      button17 = new JButton("Q");
      button18 = new JButton("R");
      button19 = new JButton("S");
      button20 = new JButton("T");
      button21 = new JButton("U");
      button22 = new JButton("V");
      button23 = new JButton("W");
      button24 = new JButton("X");
      button25 = new JButton("Y");
      button26 = new JButton("Z");
      

      // Register an event listener with all 3 buttons.
      button1.addActionListener(new ButtonListener());
      button2.addActionListener(new ButtonListener());
      button3.addActionListener(new ButtonListener());
      button4.addActionListener(new ButtonListener());
      button5.addActionListener(new ButtonListener());
      button6.addActionListener(new ButtonListener());
      button7.addActionListener(new ButtonListener());
      button8.addActionListener(new ButtonListener());
      button9.addActionListener(new ButtonListener());
      button10.addActionListener(new ButtonListener());
      button11.addActionListener(new ButtonListener());
      button12.addActionListener(new ButtonListener());
      button13.addActionListener(new ButtonListener());
      button14.addActionListener(new ButtonListener());
      button15.addActionListener(new ButtonListener());
      button16.addActionListener(new ButtonListener());
      button17.addActionListener(new ButtonListener());
      button18.addActionListener(new ButtonListener());
      button19.addActionListener(new ButtonListener());
      button20.addActionListener(new ButtonListener());
      button21.addActionListener(new ButtonListener());
      button22.addActionListener(new ButtonListener());
      button23.addActionListener(new ButtonListener());
      button24.addActionListener(new ButtonListener());
      button25.addActionListener(new ButtonListener());
      button26.addActionListener(new ButtonListener());
      
      // Create a panel and add the buttons to it.
      panel = new JPanel();
      panel.add(button1);
      panel.add(button2);
      panel.add(button3);
      panel.add(button4);
      panel.add(button5);
      panel.add(button6);

       //JPane2 pane2 = new JPane2();
      panel2 = new JPanel();
      //panel.add(button6);
      panel.add(button7);
      panel.add(button8);
      panel.add(button9);
      panel.add(button10);
      panel.add(button11);
      panel3 = new JPanel();
      panel.add(button11);
      panel.add(button12);
      panel.add(button13);
      panel.add(button14);
      panel.add(button15);
      
      panel4 = new JPanel();
      panel.add(button16);
      panel.add(button17);
      panel.add(button18);
      panel.add(button19);
      panel.add(button20);
      
      panel5 = new JPanel();
      panel.add(button21);
      panel.add(button22);
      panel.add(button23);
      panel.add(button24);
      panel.add(button25);
      
      panel6 = new JPanel();
        panel.add(button26);     
      
      // Add the panel to the content pane.
      add(panel);
      //add(pane2);
   
      // Display the window.
      setVisible(true);
   }

	/**
	 * Private inner class that handles the event when
    * the user clicks a button. 
	 */

   private class ButtonListener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         // Determine which button was clicked and display
         // a message.
         if (e.getSource() == button1)
         {
            JOptionPane.showMessageDialog(null, "You selected " +
                                           "the letter A.");
         }
         else if (e.getSource() == button2)
         {
            JOptionPane.showMessageDialog(null, "You clicked " +
                                          "the letter B.");
         }
         else if (e.getSource() == button3)
         {
            JOptionPane.showMessageDialog(null, "You clicked " +
                                          "the letter C.");
         }
         else if (e.getSource() == button4)
         {
            JOptionPane.showMessageDialog(null, "You clicked " +
                                          "the letter D.");
         }
         else if (e.getSource() == button5)
         {
            JOptionPane.showMessageDialog(null, "You clicked " +
                                          "the letter E.");
         }
         else if (e.getSource() == button6)
         {
            JOptionPane.showMessageDialog(null, "You clicked " +
                                          "the letter F.");
         }
         else if (e.getSource() == button7)
         {
            JOptionPane.showMessageDialog(null, "You clicked " +
                                          "the letter G.");
         }
         else if (e.getSource() == button8)
         {
            JOptionPane.showMessageDialog(null, "You clicked " +
                                          "the letter H.");
         }
         else if (e.getSource() == button9)
         {
            JOptionPane.showMessageDialog(null, "You clicked " +
                                          "the letter I.");
         }
         else if (e.getSource() == button10)
         {
            JOptionPane.showMessageDialog(null, "You clicked " +
                                          "the letter J.");
         }
         else if (e.getSource() == button11)
         {
            JOptionPane.showMessageDialog(null, "You clicked " +
                                          "the letter K.");
         }
         else if (e.getSource() == button12)
         {
            JOptionPane.showMessageDialog(null, "You clicked " +
                                          "the letter L.");
         }
         else if (e.getSource() == button13)
         {
            JOptionPane.showMessageDialog(null, "You clicked " +
                                          "the the letter M.");
         }
         else if (e.getSource() == button14)
         {
            JOptionPane.showMessageDialog(null, "You clicked " +
                                          "the the letter N.");
         }
         else if (e.getSource() == button15)
         {
            JOptionPane.showMessageDialog(null, "You clicked " +
                                          "the the letter O.");
         }
         else if (e.getSource() == button16)
         {
            JOptionPane.showMessageDialog(null, "You clicked " +
                                          "the the letter P.");
         }
         else if (e.getSource() == button17)
         {
            JOptionPane.showMessageDialog(null, "You clicked " +
                                          "the the letter Q.");
         }
         else if (e.getSource() == button18)
         {
            JOptionPane.showMessageDialog(null, "You clicked " +
                                          "the the letter R.");
         }
         else if (e.getSource() == button19)
         {
            JOptionPane.showMessageDialog(null, "You clicked " +
                                          "the the letter S.");
         }
         else if (e.getSource() == button20)
         {
            JOptionPane.showMessageDialog(null, "You clicked " +
                                          "the the letter T.");
         }
         else if (e.getSource() == button21)
         {
            JOptionPane.showMessageDialog(null, "You clicked " +
                                          "the the letter U.");
         }
         else if (e.getSource() == button22)
         {
            JOptionPane.showMessageDialog(null, "You clicked " +
                                          "the the letter V.");
         }
         else if (e.getSource() == button23)
         {
            JOptionPane.showMessageDialog(null, "You clicked " +
                                          "the the letter W.");
         }
         else if (e.getSource() == button24)
         {
            JOptionPane.showMessageDialog(null, "You clicked " +
                                          "the the letter X.");
         }
         else if (e.getSource() == button25)
         {
            JOptionPane.showMessageDialog(null, "You clicked " +
                                          "the the letter Y.");
         }
         else if (e.getSource() == button26)
         {
            JOptionPane.showMessageDialog(null, "You clicked " +
                                          "the the letter Z.");
         }
      
      
      
      }
      
   }
}