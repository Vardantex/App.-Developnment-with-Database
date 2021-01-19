/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CSTM10D21;





import javax.swing.JFrame;


/**
 *
 * @author class
 */
public class newArcsJPanel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        // create frame for ArcsJPanel
      JFrame frame = new JFrame( "Drawing Arcs" );
      frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );

      ArcsJPanel arcsJPanel = new ArcsJPanel(); // create ArcsJPanel
      frame.add( arcsJPanel ); // add arcsJPanel to frame
      frame.setSize( 300, 210 ); // set frame size
      frame.setVisible( true ); // display frame




    }
    
}
