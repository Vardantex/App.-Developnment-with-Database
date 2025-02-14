/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CSTM9D16;

/**
 *
 * @author class
 */
//public class MealPlanCW {
  /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor. */  

import java.awt.*;
import static java.awt.BorderLayout.EAST;
import static java.awt.BorderLayout.WEST;
import java.awt.event.*;
import javax.swing.*;

/**
   This class demonstrates a combo box.
*/

public class MealPlanCW extends JFrame
{
   private JPanel monthPanel;         // To hold components
   private JPanel selectedMonthPanel; // To hold components
   private JPanel buttonPanel;        // To hold the button

   private JList monthList;         // To hold months
   private JList selectedMonthList; // Selected months

   private JScrollPane scrollPane1; // Scroll pane - first list
   private JScrollPane scrollPane2; // Scroll pane - second list

   private JButton button;          // A button

   // The following array holds the values that
   // will be displayed in the monthList list component.
   private String[] months = { "Allen Hall: $1,500 per semester", "Pike Hall: $1,600 per semester",
            " Farthing Hall: $1,200 per semester", "University Suites: $1,800 per semester" };
   int AH = 1500, PH = 1600, FH = 1200, US = 1800;
   
   private String[] mealp = { "7 meals per week: $560 per semester", "14 meals per week: $1,095 per semester",
       "Unlimited meals: $1,500 per semester" };
   int seven = 560, onefour = 1095, inf = 1500;

       //    semester "
           
   
   
   /**
      Constructor
   */

   public MealPlanCW()
   {
      // Set the title.
      setTitle("Dorm Meal Plan Calculator");

      // Specify an action for the close button.
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      // Add a BorderLayout manager.
      setLayout(new BorderLayout());

      // Build the panels.
      buildMonthPanel();
      buildSelectedMonthsPanel();
      buildButtonPanel();

      // Add the panels to the content pane.
      add(monthPanel, BorderLayout.NORTH);
      add(selectedMonthPanel,BorderLayout.CENTER);
      add(buttonPanel, BorderLayout.SOUTH);

      // Pack and display the window.
      pack();
      setVisible(true);
   }

   /**
      The buildMonthPanel method adds a list containing the
      names of the months to a panel.
   */

   private void buildMonthPanel()
   {
      // Create a panel to hold the list.
      monthPanel = new JPanel();

      // Create the list.
      monthList = new JList(months);

      // Set the selection mode to multiple
      // interval selection.
      monthList.setSelectionMode(
        ListSelectionModel.SINGLE_INTERVAL_SELECTION);

      // Set the number of visible rows to 12.
      monthList.setVisibleRowCount(4);

      // Add the list to a scroll pane.
      scrollPane1 = new JScrollPane(monthList);

      // Add the scroll pane to the panel.
      monthPanel.add(scrollPane1);
   }

   /**
      The buildSelectedMonthsPanel method adds a list
      to a panel. This will hold the selected months.
   */

   private void buildSelectedMonthsPanel()
   {
      // Create a panel to hold the list.
      selectedMonthPanel = new JPanel();

      // Create the list.
      selectedMonthList = new JList();

      // Set the number of visible rows to 12.
      selectedMonthList.setVisibleRowCount(4);

      // Add the list to a scroll pane.
      scrollPane2 = new JScrollPane(selectedMonthList);
      
      

      // Add the scroll pane to the panel.
      selectedMonthPanel.add(scrollPane2);
   }

   /**
      The buildButtonPanel method adds a
      button to a panel.
   */

   private void buildButtonPanel()
   {
      // Create a panel to hold the list.
      buttonPanel = new JPanel();

      // Create the button.
      button = new JButton("Get Selections");

      // Add an action listener to the button.
      button.addActionListener(new ButtonListener());

      // Add the button to the panel.
      buttonPanel.add(button);
   }

   /**
      Private inner class that handles the event when
      the user clicks the button.
   */

   private class ButtonListener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         // Get the selected values.
         Object[] selections =
                        monthList.getSelectedValues();

         // Store the selected items in selectedMonthList.
         selectedMonthList.setListData(selections);
     
      
      
      }
   }
}
