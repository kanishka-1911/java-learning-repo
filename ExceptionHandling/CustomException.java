/***
 * Define custom exception class by extending Exception class
 * Use and handle the exception in a class
 */
class InsufficientBalanceException extends Exception { 
 public InsufficientBalanceException(String msg){
        super(msg); 
    }
}


public class CustomException {
    private double balance = 500.00;

    public void withdraw(double amount) throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException("Cannot withdraw " + amount + ". Insufficient funds. Current balance: " + balance);
        }
        balance -= amount;
        System.out.println("Withdrawal successful. Remaining balance: " + balance);
    }
    public static void main(String[] args) {
        CustomException account = new CustomException();
        try {
            account.withdraw(700.00);
        } catch (InsufficientBalanceException e) {
            System.out.println("Exception caught: " + e.getMessage()); 
        }
    }
}
