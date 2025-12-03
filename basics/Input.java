//print statement and input 

import java.util.*;
import java.io.*;

public class Input {
    public static void main(String[] args) {
        System.out.println("hello,learn java with kani");
    }
}
//methods of receiving inputs
//method 1

class input{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a num:");
        int num= scan.nextInt();
        System.out.println("you entered :"+ num);
        scan.close();
    }
}
//method 2
class input_2{
    public static void main(String[] args)throws IOException {
        InputStreamReader is=new InputStreamReader(System.in);//translator(binary form input to human readable)
        BufferedReader bf = new BufferedReader(is);//reads input and stores in buffer
        System.out.print("enter your name:");
        String name=bf.readLine();//reads the entire line
        System.out.println("hello,"+name);
    }
}