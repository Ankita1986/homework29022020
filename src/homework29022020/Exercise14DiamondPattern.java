package homework29022020;
/*Write a program in Java to display the pattern like a diamond.
    using While loop*/

import java.util.Scanner;

public class Exercise14DiamondPattern {
    public static void main(String[] args) {// main method
        Scanner sc = new Scanner(System.in);// scanner class
        System.out.println("Enter N : "); // printing statement
        int n = sc.nextInt();
        System.out.print("Enter Symbol : ");

        char c = sc.next().charAt(0);
        sc.close();// closing scanner
        // local variables
        int i = 1;
        int j;
        while (i <= n) {// while statement
            j = 1;
            while (j++ <= n - i) {
                System.out.print(" ");

            }
            j = 1;
            while (j++ <= i * 2 - 1) {
                System.out.print(c);

            }
            System.out.println();
            i++;
        }

        i = n - 1;
        while (i > 0) {
            j = 1;
            while (j++ <= n - i) {
                System.out.print(" ");

            }
            j = 1;
            while (j++ <= i * 2 - 1) {
                System.out.print(c);

            }

            System.out.println();
            i--;
        }

    }


}
