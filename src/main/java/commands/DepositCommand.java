package commands;

import products.BankAccount;

public class DepositCommand implements Command {
    private final BankAccount bankAccount;
    private final int amount;

    public DepositCommand(BankAccount bankAccount, int amount) {
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
