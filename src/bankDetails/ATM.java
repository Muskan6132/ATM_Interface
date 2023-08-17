package bankDetails;

import java.util.Scanner;

public class ATM {

	private BankAccount bankAccount;
    Scanner atmObj;

    public ATM() {
           atmObj = new Scanner(System.in);
    }

    public void setUserAccount(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    public void displayMenu() {
        System.out.println("\nOptions:");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");
    }

    public void processUserChoice() {
        int choice = atmObj.nextInt();

        switch (choice) {
            case 1:
                checkBalance();
                break;
            case 2:
                deposit();
                break;
            case 3:
                withdraw();
                break;
            case 4:
                System.out.println("Thank you for using the ATM. Goodbye!");
                System.exit(0);
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }

    private void checkBalance() {
        double balance = bankAccount.getBalance();
        System.out.println("Your account balance: Rs. " + balance);
    }

    private void deposit() {
        System.out.print("Enter the amount to deposit: Rs. ");
        double amount =  atmObj.nextDouble();
        if (amount > 0) {
            bankAccount.deposit(amount);
            System.out.println("Rs. " + amount + " deposited successfully.");
        } else {
            System.out.println("Invalid amount. Deposit failed.");
        }
    }

    private void withdraw() {
        System.out.print("Enter the amount to withdraw: Rs. ");
        double amount = atmObj.nextDouble();
        if (amount > 0) {
            bankAccount.withdraw(amount);
        } else {
            System.out.println("Invalid amount. Withdrawal failed.");
        }
    }

}

