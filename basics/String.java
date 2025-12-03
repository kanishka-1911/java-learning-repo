//two ways to create string:using string literal and using new keyword
//String literals are automatically stored in the String Pool(in heap) when declared using "string".It saves memory by reducing duplicates. If you create the same string literal multiple times,Java doesn’t create a new object instead, it reuses the existing object from the String Pool.

class string {
    public static void main(String[] args) {
        String str1 = "Hello"; // str1 is stored in the String Pool
        String str2 = "Hello"; // str2 will refer to the same object from the String Pool
        System.out.println(str1 == str2);//true as they point to the same reference

    }
}

//When you create a new String object using new String("text"), it is stored in the heap memory (even though its value might already exist in the String Pool)
class heap {
    public static void main(String[] args) {
        String str1 = "Hello"; // Stored in String Pool
        String str2 = new String("Hello"); // Stored in Heap memory (new object)
        String str3 = new String("Hello"); 
        System.out.println(str1 == str2); // Output: false (str1 and str2 are different objects)
        System.out.println(str2==str3);

    }
}

//string methods
class strmethod{
    public static void main(String[] args) {

        String str1 = "learn java";
        String str2 = "java";

        // 1. length()
        System.out.println("Length: " + str1.length());

        // 2. charAt()
        System.out.println("Character at index 2: " + str1.charAt(2));

        // 3. toUpperCase() and toLowerCase()
        System.out.println("Uppercase: " + str1.toUpperCase());
        System.out.println("Lowercase: " + str1.toLowerCase());

        // 4. equals() and equalsIgnoreCase()
        System.out.println("Equals 'java': " + str1.equals("java"));
        System.out.println("EqualsIgnoreCase 'java': " + str2.equalsIgnoreCase("JAVA"));

        // 5. contains()
        System.out.println("Contains 'java': " + str1.contains("java"));

        // 6. substring()
        System.out.println("Substring (6 to 10): " + str1.substring(6, 10)); 

        // 7. replace()
        System.out.println("Replace 'java' with 'python': " + str1.replace("java", "python"));

        // 8. startsWith() and endsWith()
        System.out.println("Starts with 'learn': " + str1.startsWith("learn"));
        System.out.println("Ends with 'java': " + str1.endsWith("java"));

        // 9. trim()
        String str3 = "   Hello World   ";
        System.out.println("Trimmed string: '" + str3.trim() + "'");

        // 10. split()
        String data = "apple,banana,grape";
        String[] items = data.split(",");
        System.out.println("Split items:");
        for (String item : items) {
            System.out.println(item);
        }
    }
}
//stringbuffer creates mutable string objects.It is synchronised so performance is slow
//reduces memory
//ex:multi threaded program
//two chefs use the same chopping board (shared resource) at the same time without coordination, things can go wrong so synchronization ensures only one resource can be accesssed at a time
class sbuffer{
    public static void main(String[] args) {
        StringBuilder sf = new StringBuilder("Learn");
        sf.append(" Java");
        sf.reverse();
        System.out.println("StringBuilder reversed: " + sf); 
    }
}

//stringbuilder creates mutable string objects.It is not thread safe(doesn't use synchronisation) so performance is faster than stringbuffer
//it reduces memory as it modifies the same object instead of creating new object
//ex:single threaded program
//you have multiple chefs (threads) working at the same time, you can get food ready faster.
class sbuilder{
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Welcome");
        
        sb.append(" to Java");
        System.out.println(sb);  

        sb.insert(7, " you"); 
        System.out.println(sb);

        sb.replace(0, 11, "I'm new"); 
        System.out.println(sb);  

        sb.delete(0, 11); //delete char from 0 to 10
        System.out.println(sb);  
        sb.reverse(); 
        System.out.println(sb); 
    }
}
class buf{
    public static void main(String[] args) {
        String s=10+20+"kani";//+ is overloaded
        System.out.println(s);
        String r=20+27+"kani"+10+11;
        System.out.println(r);
        System.out.println("Java".substring(2,2));
    }
}
