import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Create a bank account with an initial balance of 1000
        BankAccount userAccount = new BankAccount(1000);

        // Create an ATM  object
        ATM atm = new ATM(userAccount);

        // Display the ATM menu and process user input until they choose to exit

            atm.displayMenu();

            System.out.print("Enter your choice: ");
            int choice = new Scanner(System.in).nextInt();

            atm.processOption(choice);
        }
}