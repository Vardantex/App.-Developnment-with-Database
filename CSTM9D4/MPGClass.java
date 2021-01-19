/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CSTM9D4;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.text.DecimalFormat;

public class MPGClass extends JFrame
{
   
   private JPanel panel;
   private JTextField gallonsInput;
   private JTextField milesInput;
   private JButton calcButton;
   
   
   private final int WINDOW_WIDTH = 360;
   private final int WINDOW_HEIGHT = 130;
   
    
   public MPGClass()
   {
      setTitle("Miles Per Gallon Calculator");
      
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      buildPanel();
      
      add(panel);
      
      setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
      setVisible(true);
   }

   
   private void buildPanel()
   {
      JLabel message1 = 
               new JLabel("Total number of gallons:");
      JLabel message2 = 
               new JLabel("Number of miles driven:");
      
      gallonsInput = new JTextField(10);
      milesInput = new JTextField(10);
      
      calcButton = new JButton("Calculate MPG");
      
      calcButton.addActionListener(new CalcButtonListener());
      
      panel = new JPanel();
      
      panel.add(message1);
      panel.add(gallonsInput);
      panel.add(message2);
      panel.add(milesInput);
      panel.add(calcButton);
   }

   
   
   private class CalcButtonListener implements ActionListener
   {
     
      
      public void actionPerformed(ActionEvent e)
      {
         double gallons, miles, mpg;
         
         DecimalFormat fmt = new DecimalFormat("#,##0.0");
         
         gallons = Double.parseDouble(gallonsInput.getText());
         
         miles = Double.parseDouble(milesInput.getText());
         
         mpg = miles / gallons;
         
         JOptionPane.showMessageDialog(null, "You got " +
                                       fmt.format(mpg) +
                                       " miles per gallon.");
      }
   }
}