/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package E;
import java.awt.GridLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JTextField;



//import java.awt.*;
//import javax.swing.*;


/**
 *
 * @author Andrew
 */
public abstract class CSTM9D11JInsurance extends JFrame implements ItemListener
{
   JCheckBox HPBox,POBox;
   ButtonGroup insuranceGroup;
   JCheckBox dentalInsurance,visionInsurance;
   JTextField textfield1,textfield2;
   CSTM9D11JInsurance()
   {
       setLayout(new GridLayout(3,2));
       //create button group and 2 check boxes and add them to button group
       insuranceGroup=new ButtonGroup();
       HPBox=new JCheckBox("HMO(health maintenance organiztion)");
       POBox=new JCheckBox("PPO(preferred provider orgainzation)");
       insuranceGroup.add(HPBox);
       insuranceGroup.add(POBox);


       //creating remaining check boxes
       dentalInsurance=new JCheckBox("Dental Insurance");
       visionInsurance=new JCheckBox("Vision Insurance");
     
       
//add check boxes to frame
       add(HPBox);
       add(POBox);
       add(dentalInsurance);
       add(visionInsurance);
      
       //add event Listeners to Check boxes
       HPBox.addItemListener(new ItemListener() {
           @Override
           public void itemStateChanged(ItemEvent e) {
               String value=textfield2.getText();
               int i=value.equals("")?0:Integer.parseInt(value);
               if (e.getStateChange() == ItemEvent.SELECTED)
                   i+=200;
               else
                   i-=200;
               textfield1.setText("HMO-");
               textfield2.setText(i+"");
           }
       });
       POBox.addItemListener(new ItemListener() {
           @Override
           public void itemStateChanged(ItemEvent e) {
               String value=textfield2.getText();
               int i=value.equals("")?0:Integer.parseInt(value);
               if (e.getStateChange() == ItemEvent.SELECTED)
                   i+=600;
               else
                   i-=600;
               textfield1.setText("PPO-");
               textfield2.setText(i+"");
           }
       });
       dentalInsurance.addItemListener(new ItemListener() {
           @Override
           public void itemStateChanged(ItemEvent e) {
               String value=textfield2.getText();
               int i=value.equals("")?0:Integer.parseInt(value);
               if (e.getStateChange() == ItemEvent.SELECTED) {
                   i+=75;
                   textfield1.setText(textfield1.getText()+" and Dental");
               }
               else
                   i-=75;
              
               textfield2.setText(i+"");
           }
       });
       visionInsurance.addItemListener(new ItemListener() {
           @Override
           public void itemStateChanged(ItemEvent e) {
               String value=textfield2.getText();
               int i=value.equals("")?0:Integer.parseInt(value);
               if (e.getStateChange() == ItemEvent.SELECTED) {
                   i+=20;
                   textfield1.setText(textfield1.getText()+" and Vision");
               }
               else
                   i-=20;
              
               textfield2.setText(i+"");
           }
       });
      
       textfield1=new JTextField("");
       textfield2=new JTextField("");
       textfield2.setEditable(false);
       textfield1.setEditable(false);
       textfield2.setEditable(false);
       add(textfield1);
       add(textfield2);
     
       //set frame meta options
       setVisible(true);
       setDefaultCloseOperation(EXIT_ON_CLOSE);
       setLocationRelativeTo(null);
       setSize(500, 200);
   }
   
}


