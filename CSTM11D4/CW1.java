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
public class CW1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   
    for(int counter=0;counter<=21;counter++) {
        System.out.printf("%d! = %d/n", counter, factorial(counter));
       
    }
    
    }
    public static long factorial (long number){
        if (number<=1)
            return 1;
        else
            return number*factorial(number-1);
    }
}

