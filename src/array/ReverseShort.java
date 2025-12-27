/**
 * Problem 05: Sort the Array in Reverse Order
 * Author: Md. Masud Rana
 * 
 * This program sorts a 1D array in ascending order first,
 * then prints it in reverse order.
 */
package array;

import java.util.Arrays;

public class ReverseShort {

    public static void main(String[] args) {

        int[] arr = {5, 1, 9, 3};

        // Sort array in ascending order
        Arrays.sort(arr);

        // Print array in reverse order
        System.out.println("Array in reverse order:");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
