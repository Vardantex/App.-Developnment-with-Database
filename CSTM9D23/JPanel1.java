/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CSTM9D23;

// Using a JPanel to help lay out components.
import java.awt.GridLayout;
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;

public class JPanel1 extends JFrame 
{
   private JPanel buttonJPanel; // panel to hold buttons
   private JButton[] buttons; // array of buttons

   // no-argument constructor
   public JPanel1()
   {
      super( "Panel Demo" );
      buttons = new JButton[ 5 ]; // create buttons array
      buttonJPanel = new JPanel(); // set up panel
      buttonJPanel.setLayout( new GridLayout( 1, buttons.length ) );

      // create and add buttons
      for ( int count = 0; count < buttons.length; count++ ) 
      {
         buttons[ count ] = new JButton( "Button " + ( count + 1 ) );
         buttonJPanel.add( buttons[ count ] ); // add button to panel
      } // end for

      add( buttonJPanel, BorderLayout.SOUTH ); // add panel to JFrame
   } // end PanelFrame constructor
} // end class PanelFrame
