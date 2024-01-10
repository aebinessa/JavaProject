public class Transaction {

    private String date;
    private String type = "withdrawal"; // or "deposit"
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

    public String getdate() {
        return date;
    }

    public void setdate(String date) {
        this.date = date;
    }

    public Transaction(String date, String type, int amount) {
        this.date = date;
        this.type = type;
        this.amount = amount;
    }

}
