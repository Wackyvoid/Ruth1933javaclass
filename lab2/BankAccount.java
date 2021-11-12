import java.util.Scanner; //M3

public class BankAccount {
    //M2 V
    private String name;
    private String password;
    private double balance;

    //Having multiple constructors gives the programmer flexibility on saying what an object can be created from and which variables need to be initialized in the first place

    public BankAccount(String initName, String initPass, double initBalance) { //Will always be public for this course
        this.name = initName;
        this.password = initPass;
        this.balance = initBalance;
        //this. is optional here because of the global variables up top.
    }
    //^initializes three member variables

    public void withdraw(String enteredPassword, double amount) {
        if (password.equals(enteredPassword) && balance >= amount) {
            balance = balance - amount;
        }
    }
    public void deposit(String enteredPassword, double amount) {
        if (password.equals(enteredPassword)) {
            balance = balance + amount;
        }
    }

    //M 1

    public double getBalance(String enteredPassword) {
        if (password.equals(enteredPassword)) {
            return balance;
        } else {
            return -1;
        }
    }

    public boolean setPassword(String oldPassword, String newPassword) {
        if (password.equals(oldPassword)) {
            password = newPassword;
            return true;
        } else {
            return false;
        }
    }
    //M2

    public void transfer(BankAccount other, String enteredPassword, double amount) {
        if (password.equals(enteredPassword)) {
            this.withdraw(enteredPassword, amount);
            other.deposit(enteredPassword, amount);
        }
    }
    //M4

    public static void main(String [] args) {
        //M2 V
        BankAccount myAccount = new BankAccount("Java", "CSCI1933 rules!", 100.50); //Notice how you needed to fill in the name, pass, and balance
        BankAccount Account2 = new BankAccount("Python", "CSCI1933 rules!", 200);
        //myAccount.setPassword("CSCI1933 rules!", "1933 sucks");
        //myAccount.deposit("1933 sucks", 100.50);
        //System.out.println(myAccount.getBalance("1933 sucks"));
        //Still compiled and ran when we changed the member variables to private
        //System.out.println("My account's balance is: " + myAccount.balance);

        //milestone 3 V
        System.out.println("Enter Password");
        Scanner myScanner = new Scanner(System.in); //telling our new Scanner object to read from the user’s input.
        String input = myScanner.nextLine(); //The program will wait on the nextLine()method until something is input, at which point it will assign that to the input variable as a String.

        System.out.println("Nice!!");


//        System.out.println("Enter transfer amount");
//        double amount = myScanner.nextDouble();
//        myAccount.transfer(Account2, input, amount);
//        System.out.println("Your balance is " + myAccount.getBalance(input));
//        System.out.println("Your balance is " + Account2.getBalance("CSCI1933 rules!"));

    }
}
