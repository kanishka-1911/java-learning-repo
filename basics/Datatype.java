//primitive datatype
class DT{
    public static void main(String[] args) {
        int age = 20;
        float percentage = 85.6f;
        char grade = 'A';
        boolean isTrue=age>15;
        String name = "Kanishka";

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Percentage: " + percentage);
        System.out.println("Grade: " + grade);
        System.out.println("Passed: " + isTrue);
    }
}
//typecasting
class Typecast {
    public static void main(String[] args) {
        double price = 99.99;

        // Explicit type casting (double to int)
        int roundedPrice = (int) price;

        // Implicit casting (int to double)
        int items = 4;
        double total = items + price;

        System.out.println("Original price (double): " + price);
        System.out.println("Rounded price (int): " + roundedPrice);
        System.out.println("Total (items + price): " + total);
    }
}
//constants
class constant{
    public static void main(String[] args) {
        //variable which is final,has constant value
            final double PI = 3.14159;
            int radius = 5;
            double area = PI * radius * radius;
            System.out.println("Radius: " + radius);
            System.out.println("Area of Circle: " + area);
            //PI=3.14 will cause an error
        }
    }
    
