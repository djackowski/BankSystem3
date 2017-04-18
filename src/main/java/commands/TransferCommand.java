package commands;

import products.BankAccount;

public class TransferCommand implements Command {
    private final BankAccount fromAccount;
    private final BankAccount toAccount;
    private final int amount;

    public TransferCommand(BankAccount fromAccount, BankAccount toAccount, int amount) {
        this.fromAccount = fromAccount;
        this.toAccount = toAccount;
        this.amount = amount;
    }

    public boolean execute() {
        if (fromAccount.getOverdraftMechanism() + fromAccount.getBalance() < amount) {
            System.out.println("You have not enough money");
            return false;
        }
        int firstAccountBalance = fromAccount.getBalance();
        int firstAccountResultBalance = firstAccountBalance - amount;
        fromAccount.setBalance(firstAccountResultBalance);
        int secondAccountBalance = toAccount.getBalance();
        int secondAccountResultBalance = secondAccountBalance + amount;
        toAccount.setBalance(secondAccountResultBalance);
        return true;
    }
}
