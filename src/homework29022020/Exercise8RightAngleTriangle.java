package homework29022020;
// Display right angle triangle of @ using nested for loops
public class Exercise8RightAngleTriangle {

    public static void main(String[] args) { // Main method
        Exercise8RightAngleTriangle obj = new Exercise8RightAngleTriangle(); // object created
        obj.Triangle();     // method called from instance to static
    }

    public void Triangle() { // Instance method
        for (int a = 1; a <= 5; a++){ // for lop for row

            for (int b = 1; b <= a; b++){ // for loop for space

                System.out.print(" @"); // printing statement
            }
            System.out.println("\n ");


        }
    }


}
