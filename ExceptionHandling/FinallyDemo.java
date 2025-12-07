
/**
 * The finally block always executed whether an exception is thrown or not.
 * The finally is used for closing resources like db connections, open files and network connections,
 */
public class FinallyDemo {
    public static void main(String[] args) {
        try {
            int a = 5 / 0;
            System.out.println("Result: "+a);
        } catch (Exception e) {
            System.out.println("Error: "+e.getMessage());
        } finally {
            System.out.println("Finally always runs");
        }

    }
}
