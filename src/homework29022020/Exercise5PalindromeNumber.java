package homework29022020;

public class Exercise5PalindromeNumber {
    public static void main(String[] args) {// main method
        System.out.println(isPalindrome(11212));// printing statement

    }

    public static boolean isPalindrome(int number) { // boolen method with one parameter
        int reverse = 0; // local variable
        if (number < 0) {// if condition
            number *= -1;
        }
        int num = number;
        while (num > 0) { // while loop
            int lastDigit = num % 10;
            reverse *= 10;
            reverse += lastDigit;
            num /= 10;
        }
        System.out.println(number); // printing statement
        System.out.println(reverse); // printing statement
        if (reverse == number) {
            return true;
        } else {
            return false;
        }
    }


}
