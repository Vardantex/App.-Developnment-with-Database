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
public class RangeSum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
System.out.println("the sum of elements 2 through 5 is " + rangeSum(numbers, 2, 5));
    }
        


public static int rangeSum(int[] array, int start, int end){
if (start > end)
return 0;
else 
    return array[start]+rangeSum(array, start + 1, end);

    }
    
}
