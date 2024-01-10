public class Transaction {

    private String data;
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

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Transaction(String data, String type, int amount) {
        this.data = data;
        this.type = type;
        this.amount = amount;
    }

}
