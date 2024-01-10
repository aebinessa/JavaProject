import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        BankSingleton bankSingleton = BankSingleton.getInstance();

        bankSingleton.createUser("AbdullahB", "Coded123");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        if (bankSingleton.austhenticateUser(username, password)) {
            System.out.println("Login Successful");
        } else {
            System.out.println("Login Unsuccessful");
        }

        User user = bankSingleton.getUserAccount(username);
        user.displayAccountDetails();

        System.out.print("Enter deposit amount: ");
        double depositAmount = scanner.nextDouble();
        user.getAccount().deposit(depositAmount);

        user.displayAccountDetails();

        System.out.print("Enter withdrawal amount: ");
        double withdrawalAmount = scanner.nextDouble();
        user.getAccount().withdrawal(withdrawalAmount);

        user.displayAccountDetails();

        // Update account details
        System.out.print("Enter new username: ");
        String newUsername = scanner.next();
        System.out.print("Enter new password: ");
        String newPassword = scanner.next();
        user.updateAccountDetails(newUsername, newPassword);

        user.displayAccountDetails();

        scanner.close();

    }
}
