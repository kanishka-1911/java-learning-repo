//linking multiple constructors together so they run in a sequence when an object is created.
//this() → calls another constructor in the same class.
class Student {
    String name;
    int age;

    public Student() {
        this("Unknown", 17);
        System.out.println("No arg constructor called");
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Parameterised constructor");
    }
}

public class ConsChaining {
    public static void main(String[] args) {

        Student s1 = new Student();
        Student s2 = new Student("Alice", 20);
    }
}

//super() → calls a constructor in the parent class.

class Animal {
    String name;

    // Parent constructor
    public Animal(String name) {
        this.name = name;
        System.out.println("Its " + name);
    }
}

// Child class
class Cat extends Animal {

    public Cat() {
        super("Cat"); // calls Animal(String name)
        System.out.println("Parent class constructor called. Animal is " + name);
    }
}

 class SuperConstructorDemo {
    public static void main(String[] args) {
        Cat c = new Cat(); // create Cat object
        
    }
}

