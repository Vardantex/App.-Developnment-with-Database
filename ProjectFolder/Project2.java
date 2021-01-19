/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjectFolder;



import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
import javax.swing.*;
import java.awt.event.*;
*/
import javax.swing.*; // Needed for Swing classes
import java.awt.*;    // Needed for BorderLayout class
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/**
 *
 * @author Andrew
 */
//spublic class Project2 {
    

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *
/**
 *
 * @author Andrew
 */


    /**
     * @param args the command line arguments
     */
   
  
/**
   This class demonstrates how JPanels can be nested
   inside each region of a content pane governed by
   a BorderLayout manager.
*/

public class Project2 extends JFrame


    {
   private final int WINDOW_WIDTH = 800;   // Window width
   private final int WINDOW_HEIGHT = 200;  // Window height

   

   
   public Project2()
   {
      // Set the title bar text.
      setTitle("Border Layout");

      // Set the size of the window.
      setSize(WINDOW_WIDTH, WINDOW_HEIGHT);

      // Specify an action for the close button.
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      // Add a BorderLayout manager to the content pane.
      setLayout(new BorderLayout());

      // Create five buttons.
      JButton button1 = new JButton("Welcome to Sunrise Specialty Catering"); //NORTH
      JButton button2 = new JButton("South Button");    //SOUTH
      JButton button3 = new JButton("East Button"); //EAST
      JButton button4 = new JButton("Main Dishes"); //WEST
      JButton button5 = new JButton("Center Button");   //CENTER

      // Add the five buttons to the content pane.
      add(button1, BorderLayout.NORTH);
      add(button2, BorderLayout.SOUTH);
      add(button3, BorderLayout.EAST);
      add(button4, BorderLayout.WEST);
      add(button5, BorderLayout.CENTER);

      // Display the window.
      setVisible(true);
   
   
   }   //Raw Code Untouched
   
        
        
        /**
   {
   private final int WINDOW_WIDTH = 800;   // Window width
   private final int WINDOW_HEIGHT = 600;  // Window height
    private JComboBox MainDishesBox;    
   private JPanel MainDishesPanel;         // To hold components

   
  

 public Project2()
   {
      // Set the title bar text.
      setTitle("Border Layout");

      // Set the size of the window.
      setSize(WINDOW_WIDTH, WINDOW_HEIGHT);

      // Specify an action for the close button.
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      // Add a BorderLayout manager to the content pane.
      setLayout(new BorderLayout()); 

      // Create five buttons.
      JButton button1 = new JButton("Welcome to Sunrise Specialty Catering"); //NORTH
      JButton button2 = new JButton("South Button");    //SOUTH
      JButton button3 = new JButton("East Button"); //EAST
      JButton button4 = new JButton("Main Dishes"); //WEST
      JButton button5 = new JButton("Center Button");   //CENTER

      // Add the five buttons to the content pane.
      add(button1, BorderLayout.NORTH);
      add(button2, BorderLayout.SOUTH);
      add(button3, BorderLayout.EAST);
      //add(button4, BorderLayout.WEST);
      add(MainDishesPanel, BorderLayout.WEST);
      add(button5, BorderLayout.CENTER);

      // Display the window.
     pack();
      setVisible(true);
   
      
   
   }
   
 private void buildMainDishesPanel()
   {
      // Create a panel to hold the combo box.
      MainDishesPanel = new JPanel();
     // MainDishesPanel = new JPanel();
       ComboBoxModel MainC = null;

      // Create the combo box
      MainDishesBox = new JComboBox(MainC);
    //  MainDishesBox = new JComboBox();
      // Register an action listener.
      MainDishesBox.addActionListener(new ComboBoxListener());

      // Add the combo box to the panel.
      MainDishesPanel.add(MainDishesBox);
   }
 
 
 
  /** private void buildSelectedMainDishesPanel()
   {
      // Create a panel to hold the components.
      selectedMainDishesPanel = new JPanel();

      // Create the label.
      label = new JLabel("You've selected: ");

      // Create the uneditable text field.
      selectedMainDishes = new JTextField(20);
      selectedMainDishes.setEditable(false);

      // Add the label and text field to the panel.
      selectedMainDishesPanel.add(label);
      selectedMainDishesPanel.add(selectedMainDishes);
   }
 
 
   public class Project2C extends JFrame {
   
    private JPanel MainDishesPanel;         // To hold components
  // private JPanel MainDishesPanel;
   
   private JPanel selectedMainDishesPanel; // To hold components
   //private JPanel selectedMainDishesPanel;
   
   private JComboBox MainDishesBox;        // A list of MainCs
 //  private JComboBox MainDishesBox;
   
   private JLabel label;               // Displays a message
   
   private JTextField selectedMainDishes;  // Selected MainC

   private String[] MainC = { "Beef_Meat_Loaf $70.00", "BBQ_Chicken_Pieces $60.00",
       "Grilled_Chicken_Pieces $60.00", "Grilled Salmon $20.00", "Pasta_Prima_Vera $40.00" 
   
   
   
   };
   
   
   
   
   private class ComboBoxListener
                      implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         // Get the selected MainC.
         String selection =
                 (String) MainDishesBox.getSelectedItem();
         
         // Display the selected MainC in the text field.
         selectedMainDishes.setText(selection);
      }
   }
   
 */
   
}
    