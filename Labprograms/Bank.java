package Labprograms;

class BankAccount {
    String accountNumber;
    String accountHolder;
    double balance;

    // Default constructor
    BankAccount() {
        accountNumber = "110258280900";
        accountHolder = "Jeevan";
        balance = 5000;
    }

    void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
    }
}

public class Bank {
    public static void main(String[] args) {

        BankAccount acc1 = new BankAccount();

        acc1.displayAccountInfo();
    }
}
