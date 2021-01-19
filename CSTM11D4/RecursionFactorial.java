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
public class RecursionFactorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
  int i;
       for(i=0;i<5;i++)
           System.out.println("counter="  + Factorial(i));
    }
    public static int Factorial(int number)
    {
        if(number== 0)
            return 1;
        else
            return number * Factorial(number-1);
        
        
    }
    
}
