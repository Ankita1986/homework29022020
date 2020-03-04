package homework29022020;
// first and last digit sum


public class Exercise7FirstAndLastDigitSum {
    public static void main(String[] args) { // Main method
        System.out.println(sumFirstAndLastDigit(257)); // Printing statement


    }

    public static int sumFirstAndLastDigit(int number) { // int type method with one parameter

        // number = 12 should output 3
        int num = number;
        if (num < 0) {
            return -1;
        }
        int lastDigit = num % 10;

        while (num >= 10) {
            num = number / 10;
            number = num;
        }
        int firstDigit = num;

        return firstDigit + lastDigit;
    }
}



















