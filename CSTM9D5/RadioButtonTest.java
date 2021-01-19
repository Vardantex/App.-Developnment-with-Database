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

public class RadioButtonTest  
{
   public static void main( String[] args )
   {
      RadioButton radioButtonFrame = new RadioButton();
      radioButtonFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
      radioButtonFrame.setSize( 300, 100 ); // set frame size
      radioButtonFrame.setVisible( true ); // display frame
   } // end main
}