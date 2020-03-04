package homework29022020;
/* Write a Java program that takes the user to provide a single character from the
        alphabet. Print Vowel of Consonant, depending on the user input. If the user input
        Is not a letter (between a and z or A and Z), or is a string of length > 1, print an
        error message.
        For eg:
        Input an alphabet: p
        Expected Output:
        Input letter is Consonant*/
import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) { // main method
        Exercise3 ex = new Exercise3(); // creating object
        ex.vowel1();// Calling instance method to main method
    }
    public void vowel1(){// instance method
        Scanner in = new Scanner(System.in); // scanner class
        System.out.print("Input an alphabet: ");// printing statement
        String input = in.next().toLowerCase();
        boolean uppercase = input.charAt(0) >= 65 && input.charAt(0) <= 90;

        boolean lowercase = input.charAt(0) >= 97 && input.charAt(0) <= 122;

        boolean vowels = input.equals("a") || input.equals("e") || input.equals("i") || input.equals("o") ||
                input.equals("u");
        if (input.length() > 1) { // if condition
            System.out.println("Error. Not a single character.");
        } else if (!(uppercase || lowercase)) {
            System.out.println("Error. Not a letter. Enter uppercase or lowercase letter.");
        } else if (vowels) {
            System.out.println("Input letter is Vowel");
        } else {
            System.out.println("Input letter is Consonant");
        }
        in.close(); // scanner closed


    }
}
