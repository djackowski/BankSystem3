package commands;


import products.Account;
import products.BankAccount;

public class InvestmentCommand implements Command {
    private int amount;
    private boolean isStarted;


    public InvestmentCommand(int amount) {
        this.amount = amount;
    }

    @Override
    public boolean execute(Account account) {
        start(account);
        stop(account);
        return true;
    }

    private void start(final Account account) {
        if (account.getBalance() < amount) {
            System.out.println("You have no available money to invest!");
            return;
        }
        isStarted = true;
        int resultBalance = account.getBalance() - amount;
        account.setBalance(resultBalance);

    }

    public void stop(Account account) {
        if(!isStarted) return;
        double interest = account.calculateInterest(amount);
        final int balance = (int) (account.getBalance() + amount + interest);
        saveInterest(account, balance);
        isStarted = false;
    }
    private void saveInterest(Account account, int balance) {
        account.setBalance(balance);
        System.out.println("Interest saved. Current balance = " + account.getBalance());
    }

    private void cancel(BankAccount bankAccount) {
        if(!isStarted) return;

        isStarted = false;
        int resultBalance = bankAccount.getBalance() + amount;
        bankAccount.setBalance(resultBalance);
        System.out.println("Investment cancelled. Money has been restored.");

    }

}
