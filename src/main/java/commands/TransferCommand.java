package commands;

import products.Account;
import products.BankAccount;

public class TransferCommand implements Command {
    private final BankAccount toAccount;
    private final int amount;

    public TransferCommand(BankAccount toAccount, int amount) {
        this.toAccount = toAccount;
        this.amount = amount;
    }

    @Override
    public boolean execute(Account account) {
     /*   if (fromAccount.getOverdraftMechanism() + fromAccount.getBalance() < amount) {
            System.out.println("You have not enough money");
            return false;
        }*/
        int firstAccountBalance = account.getBalance();
        int firstAccountResultBalance = firstAccountBalance - amount;
        account.setBalance(firstAccountResultBalance);
        int secondAccountBalance = toAccount.getBalance();
        int secondAccountResultBalance = secondAccountBalance + amount;
        toAccount.setBalance(secondAccountResultBalance);
        return true;
    }
}
