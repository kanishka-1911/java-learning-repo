/***polymorphism means having many forms;allowing the same method to act differently depending on the object it's called on.
two main types:- Method Overloading(compile-time): Same method name with different parameters in the same class
Method overriding:subclass redefine a method from its superclass***/

class Animal{
    public void makeSound(){
        System.out.println("Sound differs for each animal");
    }
}
class Cat extends Animal{//subclass
    @Override
    public void makeSound(){
        System.out.println("Cat meows");//overriding
    }
}
class Dog extends Animal{
    @Override
    public void makeSound(){
        System.out.println("Dog barks");
    }
}
class Main{
    public static void main(String[] args) {
        Animal ani=new Animal();
        Animal mycat=new Cat();//-  polymorphic references to call the overridden methods.
//here ref var mydog belongs to animal super class :the compiler checks if the method makeSound() exists in the reference type 
//- At runtime, the JVM looks at the actual object type (Dog) and calls the overridden method from that class.

        Animal mydog=new Dog();
        ani.makeSound();
        mycat.makeSound();
        mydog.makeSound();
    }
}
