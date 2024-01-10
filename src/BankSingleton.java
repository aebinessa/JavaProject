public class BankSingleton {

    private BankSingleton(){

    }

    private static BankSingleton instance;

    public static BankSingleton getInstance() {
        if (instance == null) {
            instance = new BankSingleton();
        }
        return instance;
    }
}
