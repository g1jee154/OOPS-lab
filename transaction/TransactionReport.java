package transaction;

public class TransactionReport {
    public void generateReport(Account account) {
        System.out.println("\n--- Transaction Report ---");
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Available Balance: Rs. " + account.getBalance());
        System.out.println("--------------------------");
    }
}
