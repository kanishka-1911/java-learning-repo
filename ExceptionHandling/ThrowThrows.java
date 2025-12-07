/**
 * throw keyword is used to explicitly raise single exception within a method(Throws an exception object.)
 * Stops execution and transfers control to EH
 * Can be used with both checked and unchecked exception.
 */
public class ThrowThrows {
     static void checkAge(int age) {
        if (age < 18) throw new ArithmeticException("You must be above 18 to apply voter card");
        else   System.out.println("You are old enough to vote");
    }
    public static void main(String[] args) {
            checkAge(16);
        
    }
}
/**
*throws keyword is used in a method signature to declare which exceptions the method might throw.
*transfers control to the caller method
*primarily used for checked exceptions. 
 */
class Throws{

    void readFile() throws IOException {
        // risky code
    }
}
