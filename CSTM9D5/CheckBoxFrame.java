/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CSTM9D5;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JCheckBox;

public class CheckBoxFrame extends JFrame 
{
   private JTextField textField; // displays text in changing fonts
   private JCheckBox boldJCheckBox; // to select/deselect bold
   private JCheckBox italicJCheckBox; // to select/deselect italic

   // CheckBoxFrame constructor adds JCheckBoxes to JFrame
   public CheckBoxFrame()
   {
      super( "JCheckBox Test" );
      setLayout( new FlowLayout() ); // set frame layout

      // set up JTextField and set its font
      textField = new JTextField( "Watch the font style change", 20 );
      textField.setFont( new Font( "Serif", Font.PLAIN, 14 ) );
      add( textField ); // add textField to JFrame

      boldJCheckBox = new JCheckBox( "Bold" ); // create bold checkbox
      italicJCheckBox = new JCheckBox( "Italic" ); // create italic
      add( boldJCheckBox ); // add bold checkbox to JFrame
      add( italicJCheckBox ); // add italic checkbox to JFrame

      // register listeners for JCheckBoxes
      CheckBoxHandler handler = new CheckBoxHandler();
      boldJCheckBox.addItemListener( handler );
      italicJCheckBox.addItemListener( handler );
   } // end CheckBoxFrame constructor

   // private inner class for ItemListener event handling
   private class CheckBoxHandler implements ItemListener 
   {
      // respond to checkbox events
      public void itemStateChanged( ItemEvent event )
      {
         Font font = null; // stores the new Font

         // determine which CheckBoxes are checked and create Font
         if ( boldJCheckBox.isSelected() && italicJCheckBox.isSelected() )
            font = new Font( "Serif", Font.BOLD + Font.ITALIC, 14 );
         else if ( boldJCheckBox.isSelected() )
            font = new Font( "Serif", Font.BOLD, 14 );
         else if ( italicJCheckBox.isSelected() )
            font = new Font( "Serif", Font.ITALIC, 14 );
         else
            font = new Font( "Serif", Font.PLAIN, 14 );

         textField.setFont( font ); // set textField's font
      } // end method itemStateChanged
   } // end private inner class CheckBoxHandler
} // end class CheckBoxFrame