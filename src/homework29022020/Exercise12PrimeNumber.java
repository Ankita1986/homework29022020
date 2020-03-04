package homework29022020;

// Write a programme to input any number and check if it is prime number or not.

import java.util.Scanner;

public class Exercise12PrimeNumber {
    public static void main(String args[]) { // Main method
        prime(); // Calling static method to main method
    }
    public static void prime() { // Static method
        int temp; // local variable
        boolean isPrime = true; // Local variable
        Scanner sc = new Scanner(System.in); // Scanner class
        System.out.println("Enter any number:::: "); // Printing statement
        int num = sc.nextInt(); // capture the input in an integer
        sc.close();// closing scanner class
        for (int i = 2; i <= num / 2; i++) {//for loop condition
            temp = num % i;
            if (temp == 0) { // if condition
                isPrime = false;
                break;

            }
            if (isPrime) {
                System.out.println(num + " is a prime number"); // printing statement
            } else {
                System.out.println(num + " is not a prime number");// Printing statement
            }


        }
    }

}





















