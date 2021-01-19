/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CSTM9D18;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JNurseryRhyme extends JFrame {

   FlowLayout flow = new FlowLayout();
   JLabel msg1 = new  JLabel("Little Miss Muffet sat on a tuffet");
   JLabel msg2 = new JLabel("Eating her curds and whey");
   JLabel msg3 = new JLabel("Along came a spider and sat down beside her");
   JLabel msg4 = new JLabel("And frightened Miss Muffet away");

   public JNurseryRhyme(){
   
      super("Nursery Rhyme Frame");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setLayout(flow);
      add(msg1); 
      add(msg2);
      add(msg3);
      add(msg4);
   }
   public static void main(String[] args){
   
     JNurseryRhyme aFrame = new JNurseryRhyme();
     aFrame.setSize(300,150);
     aFrame.setVisible(true);
   }
}