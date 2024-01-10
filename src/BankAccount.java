import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BankAccount {

    private String accountNumber;

    private double balance;

    private List<Transaction> transactionHistory;

    public BankAccount(String accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0.0;
        this.transactionHistory = new ArrayList<>();

    }

    public void deposit(double amount) {

        balance += amount;
        Transaction transaction = new Transaction(new Date(), "Deposit ", amount);
        transactionHistory.add(transaction);
    }

    public boolean withdrawal(double amount) {

        if (amount <= balance) {
            balance -= amount;
            Transaction transaction = new Transaction(new Date(), "Withdrawal", amount);
            transactionHistory.add(transaction);
            return true;

        } else {

            System.out.println("Insufficient funds. ");
            return false;
        }

    }

    public void showTransactionHistory() {

        for (Transaction transaction : transactionHistory) {
            System.out.println("Date: " + transaction.getdate() + ", Type: " + transaction.getType() + ", Amount: "
                    + transaction.getAmount());
        }
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public List<Transaction> getTransactionHistory() {
        return transactionHistory;
    }

    public void setTransactionHistory(List<Transaction> transactionHistory) {
        this.transactionHistory = transactionHistory;
    }
}
