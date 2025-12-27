
package MathematicalProblems;

/**
 * Problem 10: Calculate the number with Power
 * Author: Md. Masud Rana
 * 
 * This program calculates base^power using loop
 */

import java.util.Scanner;

public class PowerCalculation {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter base number: ");
        int base = input.nextInt();

        System.out.print("Enter power number: ");
        int power = input.nextInt();

        int result = 1;

        // Multiply base 'power' times
        for (int i = 1; i <= power; i++) {
            result *= base;
        }

        System.out.println(base + " ^ " + power + " = " + result);
    }
}

