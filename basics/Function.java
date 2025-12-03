//function (or method) is a block of code that performs a specific task. You define a method once and call it multiple times throughout your program.
//syntax:  returnType functionName(parameters) {
// body of the function
//return value;}

//parameters passes while calling is actual arguemnts
//fuction declaration-formal parameters

import java.util.Scanner;


//void vs return type
public class Function {
       // void method – just performs an action
       public static void greetUser(String name) {
              System.out.println("Welcome, " + name + "!");
       }

       // return type method – returns a result
       public static int multiply(int a, int b) {
              return a * b;
       }

       public static void main(String[] args) {
              // Calling void method
              greetUser("Kanishka");

              // Calling return type method
              int result = multiply(5, 4);
              System.out.println("Multiplication result: " + result);
       }
}

// predefined vs userdefined function
class user {
       //user defined function 
       public static int square(int x) {
              return x * x;
       }

       public static void main(String[] args) {
              //calling user def 
              int sq = square(5);

              //predefined function
              double root = Math.sqrt(25);//sqrt is a predef method from class Math
              
              System.out.println("square root(predefined):" + root);
              System.out.println("square using user-defined:" + sq);
       }
}

// static method vs instance method
class hotel {
       public static void welcomeMessage() { // method belongs to the class and not to any specific object
              System.out.println("Welcome to our hotel!");
       }

       public void orderFood() {
              System.out.println("Ordering food...");
       }

       public static void main(String[] args) {
              // static method can be called directly
              welcomeMessage();//or hotel.welcomeMessage

              // non-static method requires object
              hotel ht = new hotel();
              ht.orderFood();
       }
}
class Example {

    //  Static method
    static void printStaticMessage() {
        System.out.println("I'm a static method. No object needed!");
    }

    //  Non-static method
    void printNonStaticMessage() {
        System.out.println("I'm a non-static method. You need an object to use me!");
    }

    public static void main(String[] args) {
        // Call static method directly using class name
        Example.printStaticMessage();

        // Create an object to call non-static method because main method is static(Cannot make a static reference to the non-static method)
        Example obj = new Example();
        obj.printNonStaticMessage();
    }
}
// types of function based on parameters and return type:

class Restaurant {

       // 1. No parameters, no return value
       public static void greetCustomer() {
              System.out.println("Hello, welcome to our restaurant!");// just displays value to the console but doesn't
                                                                      // return anything
       }

       // 2. With parameters, no return value
       public static void placeOrder(String item) {
              System.out.println("Ordered " + item);
       }

       // 3. With parameters and return value
       public static String serveOrder(String item) { // returns a string
              return "Here is your " + item + ". Enjoy!";// returns a value which you can store in a var
       }

       // 4. No parameters but return value
       public static String getSpecialOfTheDay() {
              return "Today's special is Butter Chicken.";
       }

       public static void main(String[] args) {
              // Type 1
              greetCustomer();

              // Type 2
              placeOrder("Pizza");

              // Type 3
              String servedItem = serveOrder("Coffee");
              System.out.println(servedItem);

              // Type 4
              String special = getSpecialOfTheDay();
              System.out.println(special);
       }
}

class Stat {
       public static boolean isEven(int num) {
              return num % 2 == 0;
       }

       public static void main(String[] args) {
              boolean res = isEven(4);
              System.out.println("is 4 even? :" + res);
       }
}
//exercise from emc
class Addition{
       int a=10;
       int b=20;
       public int add(){
              return a+b;
       }
       public static void main(String[] args) {
              Addition ad=new Addition();
              System.out.println(ad.add());
       }
}
class garden{
       int apple_price=20;
       int count=5;
       public void totMoney(){
              int total=apple_price*count;
              System.out.println("Total money is "+total);
       }
       public static void main(String[] args) {
              garden obj=new garden();
              obj.totMoney();
       }
}
class store{
       void getChoc(double amt){
              System.out.println(amt +" sent");
              System.out.println("Chocolate purchased");
       }
       void getJuice(double amt){
              System.out.println(amt +" sent");
              System.out.println("juice purchased!");

       }
       public static void main(String[] args) {
              store obj=new store();
              obj.getChoc(57);
              obj.getJuice(50);
       }
}
class calc{
       // int a;
       // int b;
       public double add(int a,int b){
              return a+b;
       }
       public double sub(int a,int b){
              return a-b;
       }
       public double multiply(int a,int b){
              return a*b;
       }
       public double div(int a,int b){
              return a/b;
       }
       public static void main(String[] args) {
              calc c=new calc();
              double res=c.add(175,20);
              System.out.println("Addition: "+res);
              System.out.println("Subtraction "+c.sub(100,20));
              System.out.println("Multiplication: "+c.multiply(100,20));
              System.out.println("Division: "+c.div(100,10));
       }
}
//get name & phone num
class Person{
       String getName(String name){
              return "Welcome "+name;
       }
       String getPhone(String num){
              return num;
       }
       public static void main(String[] args) {
              Person p1=new Person();
            String  name=p1.getName("Kanishka");
       String num=p1.getPhone("8072256868");
       System.out.println(name);
       System.out.println(num);
       }
}
//find odd or even
class Find{
       public static void evenOrodd(int num){
              if (num%2==0){
                     System.out.println(num+" is even");
              }
              else{
                     System.out.println(num+" is odd");
              }
       }
       public static void main(String[] args) {
              Scanner sc=new Scanner(System.in);
              System.out.print("Enter a num: ");
              int n=sc.nextInt();
              Find.evenOrodd(n);
              sc.close();
       }
}
//pass or fail function
class Student{
       public String passOrFail(int mark){
              String res=(mark>35)?"Pass":"Fail";
              return res;
       }
       public static void main(String[] args) {
              Scanner scan=new Scanner(System.in);
              Student s=new Student();
              System.out.print("Enter total mark: ");
              int mark=scan.nextInt();
              System.out.println(s.passOrFail(mark));
              scan.close();
       }
}

