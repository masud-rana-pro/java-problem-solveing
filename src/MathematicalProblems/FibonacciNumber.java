
package MathematicalProblems;

/**
 *Problem : Find out the Fibonacci number.
 * Topic Covered : Input, Conditional Statement, Loop, Mathematical Calculation, Printing, Data Type
 * 
 * @author Md. Masud Rana
 */

import java.util.Scanner;

public class FibonacciNumber {
    public static void main(String[] args) {
        //Scanner object creation for getting user input.
        Scanner input = new Scanner(System.in);
        
        //Variavle for fibonacci positon
        int n;
        
        // Loop until user enters a positive number
        do {
            //For taking user input.
           System.out.println("Enter position (n) for calculating fibonacci number: ");
           n = input.nextInt(); 
           
           //Cheak the user input.
           if (n < 0) {
           System.out.print("Invalid input! Please enter a positive number.");
           }
        } while (n < 0);//Repeat if n is negative
        
        //If n is greater than zero then...
        int first = 0;
        int second = 1;
        int next = 0;
        
        if (n == 0) {
          next = first;
        } else if (n ==1){
          next = second;
        } else {
          for (int i = 2; i <= n; i++) {
            next = first + second;
            first = second;
            second = next;
          }
        }
        System.out.println("The fibonacci nubmer at position at " + n + " is " + next);
        input.close();
    }
}
