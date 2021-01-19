/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjectFolder;



import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
   This class demonstrates a combo box.
*/

public class Project3 extends JFrame
{
   private JPanel MainDishesPanel;         // To hold components
  // private JPanel MainDishesPanel;
   private JPanel GreetingsPanel;
   private JPanel SideDishesPanel;
   private JPanel DessertsPanel;
   
   
   private JPanel selectedMainDishesPanel; // To hold components
   //private JPanel selectedMainDishesPanel;
   private JPanel selectedSideDishesPanel;
   private JPanel selectedDessertsPanel;
   
   private JComboBox MainDishesBox;        // A list of MainCs
 //  private JComboBox MainDishesBox;
   private JComboBox SideDishesBox;
   private JComboBox DessertsBox;
   
   private JLabel label;               // Displays a message
   
   private JTextField selectedMainDishes;  // Selected MainC
   private JTextField selectedSideDishes;
   private JTextField selectedDesserts;
   
   
   // The following array holds the values that will
   // be displayed in the MainDishesBox combo box.
   private String[] MainC = { "Beef_Meat_Loaf $70.00", "BBQ_Chicken_Pieces $60.00",
       "Grilled_Chicken_Pieces $60.00", "Grilled Salmon $20.00", "Pasta_Prima_Vera $40.00" 
   };

   private String[] SideC = { "Salad $6.50", "Mixed vegetabled $9.50", "Potatoes $5.50", "Rice_Dishes $7.75",
       "Beans $6.75", "Bread $4.00"
   };
   
   private String[] Desserts = { "No_Dessert $0", "Chocolate Cake $2.25", "Apple Pie $1.50",
       "Butterscotch pudding $2.50"
   };
   
   
   /**
      Constructor
   */

   public Project3()
   {
      // Set the title.
      setTitle("Sunrise Specialty Catering");

      // Specify an action for the close button.
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      // Create a BorderLayout manager.
      setLayout(new BorderLayout());
            setLayout(new BorderLayout());

      // Build the panels.
      buildMainDishesPanel();
      buildSelectedMainDishesPanel();

      buildSideDishesPanel();
      buildSelectedSideDishesPanel();
      
      buildDessertsPanel();
      buildSelectedDessertsPanel();
      
      
        //buildMainDishesPanel();
        
      // Add the panels to the content pane.
      add(MainDishesPanel, BorderLayout.WEST);
      add(selectedMainDishesPanel, BorderLayout.SOUTH);
      add(SideDishesPanel, BorderLayout.CENTER);
      add(DessertsPanel, BorderLayout.EAST);
      
      // Pack and display the window.
      pack();
      setVisible(true);
   }

   /**
      The buildMainDishesPanel method adds a combo box 
      with the types of MainC to a panel.
   */

   private void buildMainDishesPanel()
   {
      // Create a panel to hold the combo box.
      MainDishesPanel = new JPanel();
     // MainDishesPanel = new JPanel();

      // Create the combo box
      MainDishesBox = new JComboBox(MainC);
    //  MainDishesBox = new JComboBox();
      // Register an action listener.
      MainDishesBox.addActionListener(new ComboBoxListener());

      // Add the combo box to the panel.
      MainDishesPanel.add(MainDishesBox);
   }

   private void buildSideDishesPanel()
   {
       SideDishesPanel = new JPanel();
       
       SideDishesBox = new JComboBox(SideC);
       
       SideDishesBox.addActionListener(new ComboBoxListener());
       
       SideDishesPanel.add(SideDishesBox);
   }
   
   private void buildDessertsPanel()
   {
       DessertsPanel = new JPanel();
       
       DessertsBox = new JComboBox(Desserts);
       
       DessertsBox.addActionListener(new ComboBoxListener());
       
       DessertsPanel.add(DessertsBox);
   }
   /**
      The buildSelectedMainDishesPanel method adds a
      read-only text field to a panel.
   */

   private void buildSelectedMainDishesPanel()
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

   private void buildSelectedSideDishesPanel()
   { 
       selectedSideDishesPanel = new JPanel();
       label = new JLabel("You've also selected ");
       
       selectedSideDishes = new JTextField(20);
       selectedSideDishes.setEditable(false);
       
       selectedSideDishesPanel.add(label);
       selectedSideDishesPanel.add(selectedSideDishes);
   }
   
   private void buildSelectedDessertsPanel()
   {
       selectedDessertsPanel = new JPanel();
       label = new JLabel("Desserts selected are ");
       
       selectedDesserts = new JTextField(20);
       selectedDesserts.add(selectedDesserts);
       
       selectedDessertsPanel.add(label);
       selectedDessertsPanel.add(selectedDesserts);
   }
   
   /**
      Private inner class that handles the event when
      the user selects an item from the combo box.
   */

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

 /** private class DessertsBox
         implements ActionListener
 {
    Public void actionPerformed(ActionEvent e)
     {
      
        
     }
 }
*/



}