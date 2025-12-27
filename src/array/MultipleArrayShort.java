/**
 * Problem 04: Sort the Three-Dimensional Array (row-wise)
 * Author: Md. Masud Rana
 * 
 * This program sorts each row of a 3D array individually
 * in ascending order.
 */
package array;

import java.util.Arrays;

public class MultipleArrayShort {

    public static void main(String[] args) {

        // Declare and initialize a 3D array (2 blocks, 2 rows, 3 columns)
        int[][][] arr = {
            {
                {9, 3, 5},
                {4, 1, 8}
            },
            {
                {7, 2, 6},
                {12, 10, 11}
            }
        };

        // Sort each row of each 2D block
        for (int i = 0; i < arr.length; i++) {          // iterate blocks
            for (int j = 0; j < arr[i].length; j++) {   // iterate rows in block
                Arrays.sort(arr[i][j]);                 // sort row
            }
        }

        // Print sorted 3D array
        System.out.println("Sorted 3D Array:");
        for (int i = 0; i < arr.length; i++) {          // blocks
            System.out.println("Block " + (i + 1) + ":");
            for (int j = 0; j < arr[i].length; j++) {   // rows
                for (int k = 0; k < arr[i][j].length; k++) { // columns
                    System.out.print(arr[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}

