public class BankAccount {
    
int accountNumber;

double balance;

String transactionHistory;


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



public void deposit(double despositAmount) {
    
    

}


public void withdrawal(double withdrawalAmount) {
    
}


public void  theTransactionHistory(String transactionHistory) {
    
    
}
}
