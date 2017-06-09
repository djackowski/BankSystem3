package commands;

import products.Account;

public class DepositCommand implements Command {
    private final int amount;

    public DepositCommand(int amount) {
        this.amount = amount;
    }

    @Override
    public boolean execute(Account account) {
        int balance = account.getBalance();
        int resultBalance = balance + amount;
        account.setBalance(resultBalance);
        System.out.println("Money deposited: " + amount);
        return true;
    }

}
