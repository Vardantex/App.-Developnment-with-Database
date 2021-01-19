/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CSTM10D2;

/**
 *
 * @author class
 */


import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.text.DecimalFormat;


public class SalesTaxCW extends JFrame {
 private JLabel label1, label2;     // Message labels
   private JTextField fahrenheitTemp; // Fahrenheit temp
   private JTextField celsiusTemp; // Celsius temp
   private JPanel fpanel;          // Fahrenheit panel
   private JPanel cpanel;          // Celsius panel
   private JPanel sliderPanel;     // Slider panel
   private JSlider slider;         // Temperature adjuster

   /**
      Constructor
   */

   public SalesTaxCW()
   {
      // Set the title.
      setTitle("Sales Tax Calculator");

      // Specify an action for the close button.
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      // Create the message labels.
      label1 = new JLabel("Enter the amount of the purchase: ");
      label2 = new JLabel("Sales Tax: ");

      // Create the read-only text fields.
      fahrenheitTemp = new JTextField(10);
      fahrenheitTemp.setEditable(true);
      
      // Create the slider.
      slider = new JSlider(JSlider.HORIZONTAL, 0, 10, 0);
      slider.setMajorTickSpacing(10); // Major tick every 20
      slider.setMinorTickSpacing(1);  // Minor tick every 5
      slider.setPaintTicks(true);     // Display tick marks
      slider.setPaintLabels(true);    // Display numbers
      slider.addChangeListener(new SliderListener());
      
      celsiusTemp = new JTextField("0.0", 10);
      celsiusTemp.setEditable(false);

      

      // Create panels and place the components in them.
      fpanel = new JPanel();
      fpanel.add(label1);
      fpanel.add(fahrenheitTemp);
      cpanel = new JPanel();
      cpanel.add(label2);
      cpanel.add(celsiusTemp);
      sliderPanel = new JPanel();
      sliderPanel.add(slider);

      // Create a GridLayout manager.
      setLayout(new GridLayout(3, 1));

      // Add the panels to the content pane.
      add(fpanel);
         add(sliderPanel);
         add(cpanel);
   

      // Pack and display the frame.
      pack();
      setVisible(true);
   }

   /**
      Private inner class to handle the change events
      that are generated when the slider is moved.
   */

   private class SliderListener implements ChangeListener
   {
      public void stateChanged(ChangeEvent e)
      {
         double fahrenheit, celsius;
         DecimalFormat fmt = new DecimalFormat("0.0");

         // Get the slider value.
         celsius = slider.getValue();

         // Convert the value to Fahernheit.
         fahrenheit = (9.0 / 5.0) * celsius + 32.0;

         // Store the celsius temp in its display field.
         celsiusTemp.setText(
                     Double.toString(celsius));

         // Store the Fahrenheit temp in its display field.
         fahrenheitTemp.setText(fmt.format(fahrenheit));
      }
   }
}