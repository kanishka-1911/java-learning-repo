import java.util.Scanner;
//encapsulation ensures that the sensitive data is hidden from the users ex:passwords are hidden to the users
//done by access modifiers(private) and using getter & setter methods
//wrapping data and methods in a  class and restricting access to some of the obj data
class Bank {
    private double balance;

    // constructor to initialise balance
    public Bank(double intial_bal) {
        this.balance = intial_bal;
    }

    // public method to return balance(getter)
    public double getBalance() {
        return balance;
    }

    // public method to deposit money(setter)
    public void deposit(double amt) {
        boolean is_valid = false;
        while (!is_valid) {
            if (amt > 0) {
                balance += amt;
                System.out.println("Depositted " + amt);
                is_valid = true;
            } else {
                System.out.println("Deposit valid money");
                break;
            }
        }
    }

    // public method to withdraw
    public void withdraw(double amt) {
        if (amt > 0 && amt < balance) {
            balance -= amt;
            System.out.println("withdrawn " + amt);
        }
        System.out.println("now the balance is " + getBalance());
    }

    public static void main(String[] args) {
        Bank bk = new Bank(200);
        bk.deposit(0);
        bk.withdraw(500);

    }
}
class person{
    String name;
    //getter
    public String getName(){
        return name;
    }
    //setter
    public void setName(String Name){
        this.name=Name;
    }
    public static void main(String[] args) {
        person p1=new person();
        person p2=new person();
        p1.setName("Kani");
        p2.setName("Arsh");
        System.out.println(p1.getName()+" here");
        System.out.println(p2.getName()+" calling");
    }
}

//mini project on encapsulation
class bankacc{
    private String accountHolder;//data hiding
    private int pin;
    private double balance;
    //constructor 
    public bankacc(String holder,int pin,double balance){
        this.accountHolder=holder;
        this.pin=pin;
        this.balance=balance;
    }
    //public method to verify pin
    public boolean verifyPin(int inputPin){
        return this.pin==inputPin;
    }
    //method to deposit
    public void deposit(double amt){
        if (amt>0){
            balance+=amt;
            System.out.println("Depositted rs "+amt);
        }
        else{
            System.out.println("Invalid deposit");
        }
    }
    //method to withdraw
    public void withdraw(double amt){
        if(amt<balance){
            balance-=amt;
            System.out.println("Withdrawal of rs "+amt+" is succesfull");
        }
        else{
            System.out.println("Withdrawal not possible");
        }
    }
    //method to check balance
    public void checkBalance(){
        System.out.println("Curren balance is "+balance);
    }
    //method to get account holder name
    public String getHoldername(){
        return accountHolder;
    }
}
class Atm{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        bankacc acc=new bankacc("kani",1911,2000);
        //acc.pin=1920 causes error
        System.out.println("Welcome "+acc.getHoldername()+" !");
        System.out.print("Enter your pin: ");
        int enteredPin=sc.nextInt();
        boolean verify=acc.verifyPin(enteredPin);
        if(verify){
            int choice;
            do{
                System.out.println("\n--ATM menu--");
                System.out.println("1. Check balance");
                System.out.println("2. Deposit");
                System.out.println("3. Withdraw");
                System.out.println("4. Exit");
                System.out.print("choose option: ");
                choice=sc.nextInt();
                switch(choice){
                    case 1:
                    acc.checkBalance();
                    break;
                    case 2:
                    System.out.print("Enter deposit amount: ");
                    double deposit=sc.nextDouble();
                    acc.deposit(deposit);
                    break;
                    case 3:
                    System.out.print("Enter withdrawal amount: ");
                    double withdraw=sc.nextDouble();
                    acc.withdraw(withdraw);
                    break;
                    case 4:
                    System.out.println("Thank you!");
                    break;
                    default:
                    System.out.println("Invalid");
                }
            } while(choice!=4);
        }else{
            System.out.println("Incorrect pin.Access denied");
        }
        sc.close();
    }
}