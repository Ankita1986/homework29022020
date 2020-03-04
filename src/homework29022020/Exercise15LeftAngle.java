package homework29022020;
// Display left angle triangle of * using nested for loops
public class Exercise15LeftAngle {
    public static void main(String[] args) {// main method
        int a = 5;
        leftAngle(a); // calling method

    }

    public static void leftAngle(int a) {
        int b, c;
        for (b = 0; b < a; b++) {
            for (c = 2 * (a - b); c >= 0; c--) {
                System.out.print(" ");
            }
            for (c = 0; c <= b; c++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }


}
