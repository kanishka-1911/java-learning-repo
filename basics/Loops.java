import java.util.Scanner;

//for(initialisation;condition;increment/decrement)
//used when num of iterations is known(eating 5 biscuits from a jar)
class forloop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the num to find fact:");
        int num = sc.nextInt();
        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        System.out.println("the factorial of " + num + " is:" + factorial);
        sc.close();
    }
}

// for 2
class Main {

    public static void main(String[] args) {

        for (int i = 10; i >= 1; i /= 2) {

            System.out.print(i + " ");
        }
    }

}

class tablesOf {
    public static void main(String[] args) {
        for (int i = 1; i < 16; i++) {
            System.out.println(i + " x 7 = " + i * 7);
        }
    }
}



// while loop, used when no. of iterations is unknown.
// ex:eating biscuits until the jar is empty
class whileloop {
    public static void main(String[] args) {
        int biscuits = 10;
        while (biscuits > 0) { // while(condition){code}
            System.out.println("biscuit:" + biscuits);
            biscuits--;
        }
    }
}

// example 2
class test {
    public static void main(String[] args) {
        int a = 2;
        while (a < 10) {
            System.out.println(a + " ");
            a++;
        }
        System.out.println("loop completed");
    }
}
class print{
    public static void main(String[] args) {
        int i=1;
        while(i<=10){
            System.out.print(i+" ");
            i++;
        }
    }
}
class tables {
    public static void main(String[] args) {
        int num = 13;
        int i = 1;
        while (i < 17) {
            System.out.println(num + "*" + i + "=" + num * i);
            i++;
        }
    }
}

// do-while,executes first and then checks condition
// eating atleast 1 coookie and then decide if you want more
class dowhile {
    public static void main(String[] args) {
        int i = 0;
        do {
            System.out.println(i);
            i++;
        } while (i < 6);
    }
}
class valid{
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int count=0;
        do{
            System.out.print("Enter a num between 11-20: ");
            count = s.nextInt();
        } while(count<10);//loop runs until it sets to false
    }
}
// break: exits the loop when the condition is met
// stop attending test after completion of 6 questions
class Break {
    public static void main(String[] args) {
        int answered = 0;
        for (int qn = 1; qn <= 10; qn++) {
            System.out.println("Answering question " + qn);
            answered++;

            if (answered == 6) {
                System.out.println("Answered 6 questions.Stopping the test.");
                break;
            }
        }
    }
}

class breakex {
    public static void main(String[] args) {
        int i = 0;
        for (i = 0; i < 6; i++) {// int i = 0 inside the for loop creates a new local variable i that shadows the
                                 // one declared before so dont use (int i=0;i<5) if you declared i already

            break;
        }
        System.out.println(i);// i is still 0 because the increment (i++) was skipped due to break

    }
}
class break3 {
    public static void main(String[] args) {
        int i;
        for (i = 0; i < 10; i++) {
            if (i == 4) {
                break;
            }
        }
        System.out.println(i); // Prints 4
    }
}

// continue: skips the specified iteration and proceeds to next
// skipping question 5 and proceeding to attend oter questions
class Continue {
    public static void main(String[] args) {
        for (int qn = 1; qn <= 10; qn++) {
            if (qn == 5) {
                System.out.println("Skipping question " + qn);
                continue;
            }
            System.out.println("Answering question " + qn);
        }
    }
}

class work {
    public static void main(String[] args) {
        int i = 0;
        for (i = 0; i < 5; i++) {
        }
        System.out.println(i);//5 

    }
}




// nested loop teacher 1,teacher 2,teacher 3 asked stu to write john 5 times
class teacher {
    public static void main(String[] args) {
        for (int teach = 1; teach <= 3; teach++) {// 3 teacher loop
            for (int impos = 1; impos <= 5; impos++) {//each teacher assigns 5 times imposition
                System.out.println("T" + teach + " :john");

            }
            System.out.println("-----------");
        }
    }
}
//star pattern
class rectStar{
    public static void main(String[] args) {
        for (int i=0;i<=2;i++){
            for (int j=0;j<=2;j++){
                System.out.print("*"+" ");//inner loop to print in a line 
            }
            System.out.println();//outer loop to print in nextline
        }
    }
}
class rightStar{
    public static void main(String[] args) {
         for (int i=1;i<=3;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
         }
    }
}



