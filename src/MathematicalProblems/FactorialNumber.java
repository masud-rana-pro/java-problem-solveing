
package MathematicalProblems;

import java.util.Scanner;

/**
 *Problem :  Find out the Factorial number from n values.
 * 
 * @author Md. Masud Rana
 */
public class FactorialNumber {
    public static void main(String[] args) {
        //Scanner object creation for getting user input.
        Scanner input = new Scanner(System.in);
        
        //Taking user input
        System.out.print("Please enter an integer number for calculating factorial : ");
        int n = input.nextInt();
        
        long factorial = 1;
        
        //Loop for factorial calculation.
        for (int i = 1; i <= n; i++) {
          factorial *= i;
        }
        System.out.println("The factorial of " + n + " is " + factorial);
        input.close();
    }
}
