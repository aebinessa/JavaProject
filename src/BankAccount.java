

public class BankAccount {
    
private int accountNumber;

private double balance;

private String transactionHistory;


public BankAccount(int accountNumber, double balance, String transactionHistory) {
    this.accountNumber = accountNumber;
    this.balance = balance;
    this.transactionHistory = transactionHistory;

    
}
public int getAccountNumber() {
    return accountNumber;
}
public void setAccountNumber(int accountNumber) {
    this.accountNumber = accountNumber;
}



public double getBalance() {
    return balance;
}
public void setBalance(double balance) {
    this.balance = balance;
}




public String getTransactionHistory() {
    return transactionHistory;
}
public void setTransactionHistory(String transactionHistory) {
    this.transactionHistory = transactionHistory;
}



public void deposit(double balance) {
    
    if (balance<0) {

        
        
    }
    

}


public void withdrawal(double balance) {
    
}


public void  theTransactionHistory(String transactionHistory) {
    
    
}
}
