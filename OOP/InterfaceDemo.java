/***
 * Interface enables abstraction & polymorphism
 * Methods are implicitly public and abstract
 * fields are public static final
 */

interface Vehicle {
    void start();  
    void stop(); 
}

//Create concrete classes 
class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("Car engine started with a key.");
    }

    @Override
    public void stop() {
        System.out.println("Car engine stopped.");
    }
}

class Bicycle implements Vehicle {
    @Override
    public void start() {
        System.out.println("Bicycle starts moving by pedaling.");
    }

    @Override
    public void stop() {
        System.out.println("Bicycle stops using hand brakes.");
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        Vehicle myCar = new Car();         
        Vehicle cycle = new Bicycle(); 

        myCar.start();    
        myCar.stop();  

        cycle.start(); 
        cycle.stop();  
    }
}
