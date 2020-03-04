package homework29022020;

/*a method named hasSharedDigit with two parameters of type int.
        Each number should be within the range of 10 (inclusive) - 99 (inclusive). If one of the numbers is not
        within the range, the method should return false.
        The method should return true if there is a digit that appears in both numbers, such as 2 in 12 and 23;
        otherwise, the method should return false*/
public class Exercise13SharedDigit {

    public static void main(String[] args) { // main method
        System.out.println(hasSharedDigit(65, 54)); // calling static method to main method
        System.out.println(hasSharedDigit(9,50));// calling static method to main method
    }

    public static boolean hasSharedDigit(int number1, int number2) { // boolen return type method
        if (number1 < 10 || number1 > 99 || number2 < 10 || number2 > 99) // if condition
            return false;
        while (number1 > 0) { // while loop
            int secondNumber = number2;
            int firstNumber = number1;
            while (secondNumber > 0) {
                if (firstNumber % 10 == secondNumber % 10) { // if condition
                    return true;
                }
                secondNumber /= 10;
            }
            number1 /= 10;
        }
        return false;
    }
}

























