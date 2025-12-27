
package MathematicalProblems;

/**
 * Problem 09: Find out Odd and Even numbers among n values
 * Author: Md. Masud Rana
 * 
 * This program checks each input number and
 * prints whether it is odd or even.
 */

import java.util.Scanner;

public class OddEvenCheck {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of values: ");
        int n = input.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter value " + (i + 1) + ": ");
            int num = input.nextInt();

            if (num % 2 == 0) {
                System.out.println(num + " is Even");
            } else {
                System.out.println(num + " is Odd");
            }
        }
    }
}

