
package MathematicalProblems;

/**
 * Problem 06: Find out the Max and Min number among n values
 * Author: Md. Masud Rana
 * 
 * This program finds the maximum and minimum value
 * from user input of n numbers.
 */

import java.util.Scanner;

public class MaxMin {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of values: ");
        int n = input.nextInt();

        // Take first value as initial max and min
        System.out.print("Enter value 1: ");
        int value = input.nextInt();
        int max = value;
        int min = value;

        // Loop through remaining values
        for (int i = 1; i < n; i++) {
            System.out.print("Enter value " + (i + 1) + ": ");
            value = input.nextInt();

            if (value > max) max = value;  // Update max
            if (value < min) min = value;  // Update min
        }

        System.out.println("Maximum value: " + max);
        System.out.println("Minimum value: " + min);
    }
}

