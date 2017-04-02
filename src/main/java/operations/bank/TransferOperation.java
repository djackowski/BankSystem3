package operations.bank;


import operations.History;
import operations.Operation;
import products.Account;
import products.BankAccount;

public class TransferOperation extends Operation {
    private BankAccount bankAccount;

    public TransferOperation(Account account) {
        super(account);
        bankAccount = (BankAccount) account;
    }

    public void transfer(int amount, BankAccount toAccount) {
        if (bankAccount.getOverdraftMechanism() + bankAccount.getBalance() < amount) {
            System.out.println("You have not enough money");
            return;
        }
        int firstAccountBalance = account.getBalance();
        int firstAccountResultBalance = firstAccountBalance - amount;
        account.setBalance(firstAccountResultBalance);
        int secondAccountBalance = toAccount.getBalance();
        int secondAccountResultBalance = secondAccountBalance + amount;
        toAccount.setBalance(secondAccountResultBalance);
        String description = "Transfer operation from " + account.getId() + " to " + toAccount.getId() + ": " + amount;
        account.getHistory().add(description);
        History.getHistory().add(description);

    }
}
