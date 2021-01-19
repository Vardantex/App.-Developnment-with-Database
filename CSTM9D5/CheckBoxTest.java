/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CSTM9D5;

/**
 *
 * @author Andrew
 */
import javax.swing.JFrame;

public class CheckBoxTest
{
   public static void main( String[] args )
   { 
      CheckBoxFrame checkBoxFrame = new CheckBoxFrame(); 
      checkBoxFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
      checkBoxFrame.setSize( 275, 100 ); // set frame size
      checkBoxFrame.setVisible( true ); // display frame
   } // end main
} // end class CheckBoxTest