package homework29022020;
/* Read 10 numbers from the console entered by the user and print the sum of those
        numbers*/

import java.util.Scanner;

public class ReadingUserInputChallange1 {
    public static void main(String[] args) { // Main method
        reading(); // calling method
    }
    public static void reading(){ // Static method


        Scanner scanner = new Scanner(System.in); // scanner class
        // Local variable
        int x = 1;
        int sum = 0;
        while (x <= 10) { // While loop


            System.out.println("Enter number #" + x); // Printing statement
            boolean hasNextInt = scanner.hasNextInt();
            x++;
            if (hasNextInt) { // if condition
                int number = scanner.nextInt();
                sum += number;

            } else { // else condition
                System.out.println("Invalid Value"); // printing statement
            }
            scanner.nextLine();
        }
        System.out.println("Your sum is : " + sum); // printing statement
        scanner.close(); // scanner closed


    }
}