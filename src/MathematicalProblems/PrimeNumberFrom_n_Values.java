
/**
 *Problem : Find out the Prime number from n values.
 * 
 * @author Md. Masud Rana
 */
import java.util.Scanner;

public class PrimeNumberFrom_n_Values {
    public static void main(String[] args) {
        //Scanner object create.
        Scanner input = new Scanner(System.in);
        
        //Variable defination for how many number to be inputed
        int n;
        
        //Cheaking the input value
        do {
          System.out.print("Enter how many value you want to cheak : ");  
          n = input.nextInt();
          
          //Negative value chaking
          if (n < 0) {
              System.out.println("Please enter a positive integer number.");
          } 
        } while (n < 0);
        
        //An array for storing the numbers
        int[] numbers = new int[n];
        
        //looping and taking the numbers
        System.out.println("Enter " + n + " positive integer.");
        for (int i = 0; i < n; i++) {
            int value;
            do {
              value = input.nextInt();
              
              if (value < 1) {
                  System.out.println("Please enter a positive integer.");
              }
            } while (i < 1);
            numbers[i] = value;        
        }
        
        
        
    }
}
