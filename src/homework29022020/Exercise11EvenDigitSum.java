package homework29022020;
/*Even Digit Sum
        Write a method named getEvenDigitSum with one parameter of type int called number.
        The method should return the sum of the even digits within the number.
        If the number is negative, the method should return -1 to indicate an invalid value*/

public class Exercise11EvenDigitSum {
    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(123456789)); // calling method with one parameter
        System.out.println(getEvenDigitSum(252)); // calling method with one parameter
        System.out.println(getEvenDigitSum(-22)); // calling method with one parameter
    }

    public static int getEvenDigitSum(int number) { // return type method with one parameter
        if (number < 0) { // if condition
            return -1;
        }

        int finalNumber = 0; // Local variable
        while (number > 0) {// loop ends when all the numbershave been tested
            if (((number % 10) % 2) == 0) { // Test for the last digit is even
                finalNumber += number % 10; // takes out the last digit
            }
            number /= 10; // takes out last digit to test the next digit
        }
        return finalNumber;


    }


}
