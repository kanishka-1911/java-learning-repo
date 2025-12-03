//Enum is a special data type used to define a collection of fixed, constant values.
//Enums are often used when you have a variable that can only take a small set of predefined values (like days of the week, directions, states, etc.).
//All enum constants are public, static, and final by default.
//An enum cannot be instantiated using new because the instances are created automatically
enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

 class Main {
    public static void main(String[] args) {
        Day today = Day.MONDAY;

        System.out.println("Today is " + today);

        // Looping through enum values
        for (Day d : Day.values()) {
            System.out.println(d);
        }
    }
}
//enum with fields and methods

enum Direction {
    NORTH("Up"), SOUTH("Down"), EAST("Right"), WEST("Left");

    private String description;

    // Constructor
    Direction(String description) {
        this.description = description;
    }

    // Method
    public String getDescription() {
        return description;
    }
}
class Demo {
    public static void main(String[] args) {
        Direction dir = Direction.EAST;
        System.out.println(dir + " means " + dir.getDescription());
    }
}

//levels
class enumDemo{

    enum Levels{
        LOW,MEDIUM,HIGH
    }
    public static void main(String[] args) {
        Levels l=Levels.MEDIUM;
        System.out.println(l);
        
        for(Levels lev:Levels.values()){
            System.out.println(lev);
        }
    }
}