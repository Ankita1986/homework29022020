package homework29022020;
// Example of constructor overloading
public class Exercise20Student5 { //class



    int id;
    String name;
    int age;
//creating two arg constructor
    Exercise20Student5(int i, String n) {
        id = i;
        name = n;
    }

    //creating three arg constructor
    Exercise20Student5(int i, String n, int a) {
        id = i;
        name = n;
        age = a;
    }

    public void display() {
        System.out.println(id + " " + name + " " + age);
    }

    public static void main(String args[]) {
        Exercise20Student5 s1 = new Exercise20Student5(111, "Karan");
        Exercise20Student5 s2 = new Exercise20Student5(222, "Aryan", 25);
        s1.display();
        s2.display();
    }
}

