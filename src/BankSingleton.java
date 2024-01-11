import java.util.ArrayList;
import java.util.List;

public class BankSingleton {

 private static BankSingleton instance;
 private List<User>userAccounts;
 
 private BankSingleton(){

    userAccounts = new ArrayList<>();
 }

 public static BankSingleton getInstance(){

    if(instance == null){

        instance = new BankSingleton();
    }
    return instance;
 }

 public boolean austhenticateUser(String userName, String password){

    for(User user : userAccounts){

        if (user.getUsername().equals(userName) && user.getPassword().equals(password)) {
            return true;
        }
    }
    return false;
 }
 public void createUser(String userName, String password){

    if (!userExists(userName)) {
        BankAccount account = new BankAccount(generateAccountNumber());
        User newUser = new User(userName, password, account);
        userAccounts.add(newUser);
    }
    else{
        System.out.println("Username already exists. Choose a different one. ");
    }

 }

private boolean userExists(String userName){
    for(User user : userAccounts){
        if(user.getUsername().equals(userName)){
            return true;
        }
        }
        return false;}
    

public User getUserAccount(String userName){

    for(User user : userAccounts){

        if(user.getUsername().equals(userName)){

            return user;
        }
    }
    return null;
}

private String generateAccountNumber(){

    return "Account " + System.currentTimeMillis();
}
}