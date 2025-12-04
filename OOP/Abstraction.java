import java.util.Scanner;
/***abstraction is hiding certain details and showing only necessary info to the user(You don't need to know how this works, just use it.)
ex:You see a coffee machine with buttons:Espresso,Cappuccino,Latte.You press a button, and coffee comes out.You don’t care how the machine heats water, grinds beans, or mixes milk.
achieved thru abstract classes or interfaces
abstract keyword is non-access modifier
abstract classes are restricted class that cannot be used to create obj(should be inherited)
abstract methods- used only in abstract class which doesn't have a body(body is provided by subclasses)***/
abstract class Animal{
    //abstract method
    public abstract void animalSound();
    //regular method
    public void sleep(){
        System.out.println("zzz");
    }
}
//subclass to define method 
class Cat extends Animal{
    public void animalSound(){
        System.out.println("Meow");
    }
}
class Main{
    public static void main(String[] args) {
        Animal mycat=new Cat();//or Cat mycat=new Cat();
        mycat.animalSound();
        mycat.sleep();
    }
}


//mini project:Food app .you choose restaurant type ,place order
abstract class Restaurant {
    abstract void placeOrder();//all restaurants must follow this contract but each can have its own logic.
}

class PizzaRst extends Restaurant {
    void placeOrder() {
        System.out.println("Preparing pizza with cheese and toppings...");
        System.out.println("Order placed at Pizza Restaurant!");
    }
}
class BurgerRst extends Restaurant {
    void placeOrder() {
        System.out.println("Grilling burger with lettuce and sauce...");
        System.out.println("Order placed at Burger Restaurant!");
    }
}
class SouthIndianRst extends Restaurant {
    void placeOrder() {
        System.out.println("Preparing dosa and sambar...");
        System.out.println("Order placed at South Indian Restaurant!");
    }
}
//main method

class FoodApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Restaurant restaurant = new PizzaRestaurant();
        // when you don’t know yet which object to use — maybe the user is choosing.
        Restaurant restaurant;//reference variable named restaurant of type Restaurant

        System.out.println("Choose restaurant:");
        System.out.println("1. Pizza\n2. Burger\n3. South Indian");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                restaurant = new PizzaRst();
                break;
            case 2:
                restaurant = new BurgerRst();
                break;
            case 3:
                restaurant = new SouthIndianRst();
                break;//break only exits the switch.
            default:
                System.out.println("Invalid choice.");
                return;//immediately stop the method completely
        }

        restaurant.placeOrder(); // Abstraction: same method, different logic
        sc.close();
    }
}

