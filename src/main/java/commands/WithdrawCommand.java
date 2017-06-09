package commands;

import products.Account;

public class WithdrawCommand implements Command {
    private final Account bankAccount;
    private final int amount;

    public WithdrawCommand(Account bankAccount, int amount) {
        this.bankAccount = bankAccount;
        this.amount = amount;
    }

    public boolean execute(Account account) {
        int balance = bankAccount.getBalance();
        int resultBalance = balance - amount;
        if(resultBalance < 0) {
            return false;
        }
        bankAccount.setBalance(resultBalance);
        System.out.println("Money withdrawn: " + amount);
        return true;

    }

}
