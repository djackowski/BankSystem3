package commands;

import products.Account;
import products.BankAccount;

public class DepositCommand implements Command {
    private final Account bankAccount;
    private final int amount;

    public DepositCommand(Account bankAccount, int amount) {
        this.bankAccount = bankAccount;
        this.amount = amount;
    }

    public boolean execute() {
        int balance = bankAccount.getBalance();
        int resultBalance = balance + amount;
        bankAccount.setBalance(resultBalance);
        System.out.println("Money deposited: " + amount);
        return true;
    }
}
