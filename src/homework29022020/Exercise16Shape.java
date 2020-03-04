package homework29022020;

public abstract class Exercise16Shape { // abstract class
    public abstract void draw();// abstract method
}

class Rectangle extends Exercise16Shape{ // extends parent class to child class
    public void draw() { // instance method
        System.out.println("drawing rectangle"); // printing statement
    }
}

class Circle1 extends Exercise16Shape  { // extends parent class to child class
    public void draw() { // instance method
        System.out.println("drawing circle");
    }
}


class TestAbstraction1 { //class
    public static void main(String args[]) { // Main method
        Exercise16Shape s = new Circle1();// Objected created for circle1 class
        s.draw(); // calling method
    }
}













