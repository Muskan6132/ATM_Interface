package bankDetails;

public class AtmBankMachine {
	public static void main(String[] args) {
        // Create a bank account with an initial balance of Rs 0
        BankAccount bankAccount = new BankAccount(0);

        // Create an ATM instance and set the user's bank account
        ATM atm = new ATM();
        atm.setUserAccount(bankAccount);

        // ATM User Interface
        while (true) {
            atm.displayMenu();
            atm.processUserChoice();
        }
    }

}
