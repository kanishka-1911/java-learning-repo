import java.util.Scanner;
class ifelse{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number:");
        int num = scan.nextInt();

        if (num % 3 == 0 && num % 5 == 0) {
            System.out.println("The number is divisible by both 3 and 5.");
        } else {
            System.out.println("The number is not divisible by both 3 and 5.");
        }

        scan.close();
    }
}

//example2
class loan{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("enter your age:");
        int age = scan.nextInt();
        System.out.print(" enter your salary:");
        int salary = scan.nextInt();

 if(age<25 || salary>=20000){
            System.out.println("you're eligible for loan");
            System.out.print("enter required loan amount:");
            int loan = scan.nextInt();
            scan.close();
//inner if is executed only if the outer if statement is true

            if(loan<= 50000){
                System.out.println("eligible loan amount");
            }
            else{
                System.out.println("loan avail is upto 50k only");
            }
        }

 else{
            System.out.println("not applicable  for loan");
        }
    }
    
 }
 //switch: used instead of many if-else if...-else
 //default is optional and doesn't follow order
 //float and double is not allowed
 //duplicate cases are not allowed
class switchex{
    public static void main(String[] args) {
        char ch='r';
        switch(ch){
            case 'a':System.out.println("vowel");
            break;
            case 'e':System.out.println("vowel");
            break;
            case 'i':System.out.println("vowel");
            break;
            case 'o':System.out.println("vowel");
            break;
            case 'u':System.out.println("vowel");
            break;
            default://if none of the above is applicable
            System.out.println("consonant");
         }
    }
}
