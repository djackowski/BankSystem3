package commands;

import products.Account;
import products.BankAccount;

public class WithdrawCommand implements Command {
    private final Account bankAccount;
    private final int amount;

    public WithdrawCommand(Account bankAccount, int amount) {
        this.bankAccount = bankAccount;
        this.amount = amount;
    }

    public boolean execute() {
        //TODO: overdraft should me improved
      /*  if (bankAccount.getBalance() + bankAccount.getOverdraftMechanism() < amount) {
            System.out.println("You have not enough money");
            return false;
        }*/
        int balance = bankAccount.getBalance();
        int resultBalance = balance - amount;
        bankAccount.setBalance(resultBalance);
        System.out.println("Money withdrawn: " + amount);
        return true;

    }

}
