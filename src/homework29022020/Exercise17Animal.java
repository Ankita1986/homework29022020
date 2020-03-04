package homework29022020;

public class Exercise17Animal {// class
    public void eat() { //instance method
        System.out.println("eating...");
    }
}


class Dog extends Exercise17Animal {// extending parent class to child class
    public void bark() { //instance method
        System.out.println("barking..."); //printing statement
    }
}


class BabyDog extends Dog { // extending parent class to child class
    public void weep() { // instance method
        System.out.println("weeping..."); // printing statement
    }
}
    class TestInheritance2 { // class to call all method
        public static void main(String args[]) { // main method
            BabyDog d = new BabyDog(); // objected created
            // method calling
            d.weep();
            d.bark();
            d.eat();

        }

    }



