package homework29022020;
//Write a program in Java to display the pattern like triangle with a number.

import java.util.Scanner;

public class Exercise6NumberPattern {

    public static void main(String[] args) { // main method
        TriangleWithNumber(); // calling static method to main method
    }

    public static void TriangleWithNumber() { // static method
        int i, j, n; // Local variable
        System.out.print("Input number of rows : "); // printing statement
        Scanner in = new Scanner(System.in); // Printing statement
        n = in.nextInt();

        for (i = 1; i <= n; i++) { // foe loop statement
            for (j = 1; j <= i; j++)
                System.out.print(j);

            System.out.println("");
        }
    }


}
