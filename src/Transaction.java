import java.util.Date;

public class Transaction {

    private Date date;
    private String type;
    private int amount;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
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
