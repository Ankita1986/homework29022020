package homework29022020;

//Print the sequence 1 1 2 3 5 8 13 21 (Fibonacci number)

import java.util.Scanner;

public class Exercise9FibonacciNumber {
    public static void main(String[] args) {
        seq();//calling static method to main method
    }

    public static void seq() {//static method

        Scanner scan = new Scanner(System.in);//scanner class
        System.out.println("Enter 0 here to find sequence number");//printing statement
        int number1 = scan.nextInt();
        System.out.println("Enter 1 here to find sequence number");//printing statement
        int number2 = scan.nextInt();
        scan.close();

        //local variables
        int number3;
        int a;
        int count = 9;

        System.out.println("" + number2);//printing statement

        for (a = 2; a < count; ++a) {//for loop statement
            number3 = number1 + number2;
            System.out.println(+number3);
            number1 = number2;
            number2 = number3;


        }
    }
}