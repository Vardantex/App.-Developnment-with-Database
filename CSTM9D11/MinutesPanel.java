/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CSTM9D11;

/**
 *
 * @author Andrew
 */
//public class MinutesPanel {
    
import java.awt.*;
import javax.swing.*;


 
 // Long Distance Calls
 

public class MinutesPanel extends JPanel
{
   private JTextField minutes;   // To get minutes
   
   /**
    * Constructor
    */
   
   public MinutesPanel()
   {
      // Create the label and text field.
      JLabel minutesMsg = new JLabel("Minutes:");
      minutes = new JTextField(10);
      
      // Create a GridLayout manager.
      setLayout(new GridLayout(1, 2));
      
      // Create a border.
      setBorder(BorderFactory.createTitledBorder("Time of Call"));
      
      // Add the labels and text fields to this panel.
      add(minutesMsg);
      add(minutes);
   }
   
   /**
    * getCharges method
    */
   
   public double getCharges(double rate)
   {
      double charges = Double.parseDouble(minutes.getText()) * rate;
      return charges;
   }
}

