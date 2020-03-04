package homework29022020;

// Write a program to input any number and check if it Armstrong number or not

import java.util.Scanner;

public class Exercise10ArmstrongNumber {

    public static void main(String[] args) // main method
    {
        main1(); // calling method
    }

    public static void main1() {
        // Local variables
        int num = 0, originalNum, remainder, result = 0;
        System.out.println("Enter a three-digit integer: "); // printing statement
        Scanner s = new Scanner(System.in); // scanner class
        num = s.nextInt();
        s.close();// scanner closed
        originalNum = num;

        while (originalNum != 0) {// while loop
            remainder = originalNum % 10;
            result += remainder * remainder * remainder;
            originalNum /= 10;
        }
        if (result == num) { // if condition
            System.out.println(num + " is an Armstrong number."); // printing statement

        } else { // else statement
            System.out.println(num + " is not an Armstrong number."); // printing statement


        }
    }


}
