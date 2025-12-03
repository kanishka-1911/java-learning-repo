//static keyword is used to create class level variables & methods without creating object of the class
//reduce memory usage and improve performance
class StaticDemo {
    static int a = 30;

    public static void main(String[] args) {
        System.out.println(StaticDemo.a);
    }
}

// static initializer:used to initialise static variables
// runs once per class before the main func
// automatically executed by JVM
class init {
    static int id;
    String name;// cannot initialise
    static {
        id = 101;
        System.out.println("Static block executed.ID: " + id);
    }

    public static void main(String[] args) {
        System.out.println("Main method executed.ID= " + id);
    }
}

// this:refers to the current object.
// refers to the instant variables or methods of current object
// disambiguate bw instance & local variable that have the same name
// can be used only in non static method or cons
class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public static void main(String[] args) {
        Person obj = new Person("ABC", 20);
        System.out.println(obj.getName());
    }
}

// super keyword: reference variable used inside child class to refer to
// immediate parent class
// can use it for fields,methods and constructors.

class superDemo {
    // field
    String a = "I'm parent";
    String name;

    // constructor
    public superDemo(String name) {
        this.name = name;
    }

    // method
    void Sayhey() {
        System.out.println("Hey from parent");
    }

}

class superChild extends superDemo {
    String a = "I'm child";
    int age;

    public superChild(String name, int age) {
        super(name);
        this.age = age;
        System.out.println("Name is " + name + ". Age is " + age);
    }

    void show() {
        super.Sayhey();
        System.out.println("Child field: " + a);
        System.out.println("Parent class: " + super.a);
    }
}

class Main {
    public static void main(String[] args) {
        superChild s = new superChild("Ritu", 18);
        s.show();
    }
}
