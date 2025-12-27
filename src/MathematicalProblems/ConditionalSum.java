
package MathematicalProblems;

/**
 * Problem 08: Find out the Conditional Sum until input 0
 * Author: Md. Masud Rana
 * 
 * This program sums numbers entered by the user
 * until the user enters 0 (zero).
 */

import java.util.Scanner;

public class ConditionalSum {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int sum = 0;
        int num;

        System.out.println("Enter numbers (0 to stop):");

        // Repeat input until 0 is entered
        do {
            num = input.nextInt();
            sum += num;
        } while (num != 0);

        System.out.println("Total Sum: " + sum);
    }
}

