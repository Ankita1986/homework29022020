package homework29022020;
/*Read the numbers from the console entered by the user and print the minimum and
        maximum number the user has entered*/

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) { // Main method
        min(); // calling static method to main method

    }

    public static void min() {
        Scanner sc = new Scanner(System.in);
        int min = 0;
        int max = 0;
        boolean first = true;
        while (true) {
            System.out.println("Enter number (to exit enter any character): ");

            boolean isAnInt = sc.hasNextInt();
            if (isAnInt) {
                int number = sc.nextInt();
                if (first) {
                    first = false;
                    min = number;
                    max = number;
                }
                if (number > max) {

                    max = number;
                }
                if (number < min) {

                    min = number;
                } else {
                    break;
                }

                System.out.println("min = " + min + ", max=" + max);
                sc.close();


            }
        }
    }
}