/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CSTM11D4;

/**
 *
 * @author class
 */
public class Recursive {

    /**
     * @param args the command line arguments
     */
   public static void message(int n)
   {
      if (n > 0)
      {
         System.out.println("This is a recursive method.");
         message(n -1);
      }
   }
    
}
