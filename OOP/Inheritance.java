//inheriting trributes & methods from super class to sub classes using extends keyword
//without inheritance fields of a class cannot be accessed by another class
class Vehicle {
    protected String brand = "Ford";

    public void honk() {
        System.out.println("Tuut,tutt!");
    }
}

class Car extends Vehicle {
    private String modelName = "Mustang";// sub class can have additional attributes
    public String getModelName() {
        return modelName;//since modelname is private it can't be accessed outside the vehicle class so using this method
    }
}
class Main{
public static void main(String[] args) {
    Car myCar = new Car();
    System.out.println("The brand is " + myCar.brand + ". " + "The model is " + myCar.getModelName());
    myCar.honk();

}
}

//Example 2

class Animal{
    String say;
    String place="Zoo";
    void habit(){
        System.out.println("Each Animal have specific habit");
    }
}
class Tiger extends Animal{
    String name="Tiger";
    void habit(){
        System.out.println("Hunts");
    }
}
class Deer extends Animal{
    String name="Deer";
    void habit(){
        System.out.println("Eats grass");
    }
}
class AnimalDemo{
    public static void main(String[] args) {
       
        Deer d=new Deer();
        System.out.println(d.say="hello from superclass");
        System.out.println(d.name);
        d.habit();
        Tiger t=new Tiger();
        t.habit();
    }
}