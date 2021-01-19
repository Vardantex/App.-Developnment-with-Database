/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CSTM10D21;
                        
import java.awt.Color; //Needed in both
import javax.swing.JFrame;

/**
 *
 * @author class
 */
public class newLinesRectsOvalsJPanel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    
     // create frame for LinesRectsOvalsJPanel
      JFrame frame = 
         new JFrame( "Drawing lines, rectangles and ovals" );
      frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
   
      LinesRectsOvalsJPanel linesRectsOvalsJPanel = 
         new LinesRectsOvalsJPanel(); 
      linesRectsOvalsJPanel.setBackground( Color.WHITE ); 
      frame.add( linesRectsOvalsJPanel ); // add panel to frame
      frame.setSize( 400, 210 ); // set frame size
      frame.setVisible( true ); // display frame
    
    
    
    
    
    }
    
}
