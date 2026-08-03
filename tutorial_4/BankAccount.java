package tutorial_4;

import java.util.Scanner;


public class BankAccount {
    // Instance variables
    String accountNumber;
    String accountHolder;
    double balance;

    // Constructor to initialize details
    public BankAccount(String accNum, String holder, double initialBalance) {
        accountNumber = accNum;
        accountHolder = holder;
        balance = initialBalance;
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount; // Adds amount to the current balance
            System.out.printf("Successfully deposited: %.2f\n", amount);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    // Method to display details
    public void displayDetails() {
        System.out.println("\n--- Account Details ---");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.printf("Current Balance: %.2f\n", balance);
    
    }
}

// Non-public main class inside the same file
class Bankmain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Input account details
        System.out.println("--- Create New Bank Account ---");
        System.out.print("Enter Account Number: ");
        String accNum = scanner.nextLine();
        
        System.out.print("Enter Account Holder Name: ");
        String holder = scanner.nextLine();
        
        System.out.print("Enter Initial Balance: ");
        double initialBalance = scanner.nextDouble();

        // 2. Create the BankAccount object
        BankAccount account = new BankAccount(accNum, holder, initialBalance);

        // Show starting details
        account.displayDetails();

        // 3. Input deposit amount
        System.out.print("Enter amount to deposit: ");
        double depositAmount = scanner.nextDouble();

        // 4. Perform deposit and show updated balance
        account.deposit(depositAmount);
        account.displayDetails();

        scanner.close();
    }
}

