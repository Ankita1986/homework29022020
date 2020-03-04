package homework29022020;
// creating a parent class
public class Exercise19Bank {
    public int getRateOfInterest() { // Method with int data type
        return 0;  // return type
    }
}

//Creating child classes.
class SBI extends Exercise19Bank { // extend parent class to child class
    public int getRateOfInterest() { // method with int data type
        return 8; // return type
    }
}

class ICICI extends Exercise19Bank { // extend parent class to child class
    public int getRateOfInterest() { // method with int data type
        return 7; // return type
    }
}

class AXIS extends Exercise19Bank { // extend parent class to child class
    public int getRateOfInterest() { // method with int data type
        return 9; // return type
    }
}


class Test2 { // Test class
    public static void main(String args[]) { // Main method
        SBI s = new SBI(); // object creation
        ICICI i = new ICICI(); // object creation
        AXIS a = new AXIS(); // object creation
        System.out.println("SBI Rate of Interest: " + s.getRateOfInterest()); // printing statement
        System.out.println("ICICI Rate of Interest: " + i.getRateOfInterest()); // printing statement
        System.out.println("AXIS Rate of Interest: " + a.getRateOfInterest()); // printing statement
    }
}


