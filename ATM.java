import java.util.*;
class ATM {
    private final BankAccount bankAccount;
     Scanner scan = new Scanner(System.in);

    public ATM(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    public void displayMenu() {
        System.out.println("1. Withdraw");
        System.out.println("2. Deposit");
        System.out.println("3. Check Balance");
        System.out.println("4. Exit");
    }

    //replaced normal switch case with enhanced switch case as recommended by Intellij Idea
    public void processOption(int option) {
        switch (option) {
            case 1 -> handleWithdrawal();
            case 2 -> handleDeposit();
            case 3 -> checkBalance();
            case 4 -> {
                System.out.println("Thank you for using the ATM. Goodbye!");
                System.exit(0);
            }
            default -> System.out.println("Invalid option. Please try again.");
        }
    }

    private void handleWithdrawal() {
        System.out.print("Enter withdrawal amount: ");
        double amount = scan.nextDouble();
        if (amount > 0) {
            bankAccount.withdraw(amount);
        } else {
            System.out.println("Invalid amount. Please enter a positive value.");
        }
    }

    private void handleDeposit() {
        System.out.print("Enter deposit amount: ");
        double amount = scan.nextDouble();
        if (amount > 0) {
            bankAccount.deposit(amount);
        } else {
            System.out.println("Invalid amount. Please enter a positive value.");
        }
    }

    private void checkBalance() {
        System.out.println("Current balance: " + bankAccount.getBalance());
    }
}