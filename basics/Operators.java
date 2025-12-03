public class operators {
    public static void main(String[] args) {
        // Arithmetic Operators
        int a = 10, b = 3;
        System.out.println("Arithmetic Operators:");
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));

        // Relational Operators
        System.out.println("\nRelational Operators:");
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));

        // Logical Operators
        boolean x = true, y = false;
        System.out.println("\nLogical Operators:");
        System.out.println("x && y: " + (x && y));
        System.out.println("x || y: " + (x || y));
        System.out.println("!x: " + (!x));

        // Assignment Operators
        int num = 5;
        System.out.println("\nAssignment Operators:");
        System.out.println("Original num: " + num);
        num += 3;
        System.out.println("num += 3: " + num);
        num *= 2;
        System.out.println("num *= 2: " + num);
    }
}

// unary operators
class unary {
    public static void main(String[] args) {
        int a = 5;
        System.out.println("Original a: " + a);
        System.out.println("++a (pre-increment): " + (++a)); // 6
        System.out.println("--a (pre-decrement): " + (--a)); // 5
        System.out.println("a++ (post-increment): " + (a++)); // 5, then a becomes 6
        System.out.println("a-- (post-decrement): " + (a--)); // 6, then a becomes 5
        System.out.println("Final a: " + a);

        // Unary minus
        int b = -a;
        System.out.println("Unary minus of a: " + b);
    }
}

// ternary operators
// var = (condition)?expTrue : expFalse;
class ternary {
    public static void main(String[] args) {
        boolean rain = true;
        String result = (rain) ? "yes,take umbrella" : "no,its sunny";
        System.out.println("should i take umbrella?:" + result);
    }
}

// bitwise operators
class Bitwise {
    public static void main(String[] args) {
        int a = 5;
        int b = 20;
        System.out.println("a&b: " + (a & b));//1 if both bits are 1
        System.out.println("a|b: " + (a | b));//1 if either bit is 1
        System.out.println("a^b: " + (a ^ b));//1 if bits are different
        System.out.println("~a: " + (~a));//Inverts the bits
        
    }
        

}

// shift operators >> <<
class shift {
    public static void main(String[] args) {
        int a = 2 + 3 << 5 / 6;
        int b = 6 >> 4 % 4;
        if (a > b) {
            System.out.println(a + 6);
        } else {
            System.out.println(b - 3);
        }
    }
}
