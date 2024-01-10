import java.util.List;
import java.util.ArrayList;

public class BankAccount {

    int accountNumber;

    public BankAccount(int accountNumber, int balance, List<String> transactionHistory) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.transactionHistory = transactionHistory;
    }

    int balance;
    private List<String> transactionHistory;

    public BankAccount() {
        this.transactionHistory = new ArrayList<>();
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public List<String> getTransactionHistory() {
        return transactionHistory;
    }

    public void setTransactionHistory(List<String> transactionHistory) {
        this.transactionHistory = transactionHistory;
    }

    /////////////////// methods////////////////////////////////////////////////////////////////////
    public void deposit(int amount, String type) {
        if (amount > 0) {
            balance += amount;
            Transaction deposit = new Transaction("11-11-2011", "deposit", amount);
            transactionHistory.add(String.valueOf(balance));

        }
    }

    public void withdrawal(int amount, String type) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            Transaction withdrawal = new Transaction("11-11-2011", "deposit", amount);

            transactionHistory.add(String.valueOf(balance));
        } else {
            System.out.println("Insufficient funds for withdrawal.");
        }

    }

    public void recordTransaction(List<String> transactionHistory) {
        for (String transaction : transactionHistory) {
            System.out.println(transaction);
        }

    }

    public void createAccount() {

    }
}
