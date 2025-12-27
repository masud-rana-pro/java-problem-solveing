
package MathematicalProblems;

/**
 * Problem 07: Find out Ten Unique Random Numbers
 * Author: Md. Masud Rana
 * 
 * This program generates 10 unique random numbers
 * between 0 and 99.
 */

import java.util.Random;

public class UniqueRandomNumbers {

    public static void main(String[] args) {

        Random rand = new Random();
        int[] arr = new int[10];
        int count = 0;

        // Generate random numbers until array is full
        while (count < 10) {
            int num = rand.nextInt(100); // 0-99

            // Check if number already exists
            boolean exists = false;
            for (int i = 0; i < count; i++) {
                if (arr[i] == num) {
                    exists = true;
                    break;
                }
            }

            // If unique, add to array
            if (!exists) {
                arr[count] = num;
                count++;
            }
        }

        // Print all 10 unique numbers
        System.out.println("10 Unique Random Numbers:");
        for (int n : arr) {
            System.out.print(n + " ");
        }
    }
}

