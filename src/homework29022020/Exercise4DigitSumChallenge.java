package homework29022020;
//digit sum challenge
public class Exercise4DigitSumChallenge {
    public static void main(String[] args) {// main method
        System.out.println("The sum of the digits in number 125 is " +sumDigits(125));
        System.out.println("The sum of the digits in number -125 is " +sumDigits(-125));
        System.out.println("The sum of the digits in number 4 is " +sumDigits(4));
        System.out.println("The sum of the digits in number 32123 is " +sumDigits(32123));

    }
    private static int sumDigits(int number) {// static method with private modifier
        if (number < 10) {// if statement
            return -1;
        }
        int sum = 0; // local variable
        while (number > 0){// while loop condition
            //Extract the least-significant digit
            int digit = number % 10;
            sum += digit;
            //Drop the least-significant digit
            number /= 10;
        }
        return sum;






    }







}








