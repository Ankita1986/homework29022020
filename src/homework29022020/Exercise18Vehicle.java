package homework29022020;

public class Exercise18Vehicle {

    public void run(){// instance method
        System.out.println("Vehicle is running"); // printing statement
    }
}

//Creating a child class
class Bike2 extends Exercise18Vehicle { //extending parent class to child class
    //defining the same method as in the parent class
    public void run() { // instance method
        System.out.println("Bike is running safely"); // printing statement
    }

    public static void main(String args[]) { // main method
        Bike2 obj = new Bike2();//creating object
        obj.run();//calling method
    }
}