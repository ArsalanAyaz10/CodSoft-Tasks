import java.util.*;
class BankAccount{
private double balance = 10000;

public BankAccount(double initialBalance){

        this.balance = initialBalance;
}

public double getBalance(){
        return balance;
}

public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit successful. New balance: " + balance);
}

public void withdraw(double amount){

        if (amount <= balance) {
        balance -= amount;
        System.out.println("Withdrawed "+ amount + ". New balance: " + balance);
     }
        else {
        System.out.println("Withdrawal failed,Insufficient Balance.");
        }
   }
}
