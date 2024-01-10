import java.util.Date;

public class Transaction {

    private Date date;
    private String type;
    private double amount;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Date getdate() {
        return date;
    }

    public void setdate(Date date) {
        this.date = date;
    }

    public Transaction(Date date, String type, int amount) {
        this.date = date;
        this.type = type;
        this.amount = amount;
    }

}
