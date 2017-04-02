package operations.bank;


import operations.History;
import operations.Operation;
import products.Account;
import products.BankAccount;

public class WithdrawOperation extends Operation {
    private BankAccount bankAccount;

    public WithdrawOperation(Account account) {
        super(account);
        bankAccount = (BankAccount) account;
    }

    public void withdraw(int amount) {
        if (bankAccount.getBalance() + bankAccount.getOverdraftMechanism() < amount) {
            System.out.println("You have not enough money");
            return;
        }
        int balance = bankAccount.getBalance();
        int resultBalance = balance - amount;
        bankAccount.setBalance(resultBalance);
        String description = "Withdraw operation: " + amount;
        bankAccount.getHistory().add(description);
        History.getHistory().add(description);

        System.out.println("Money withdrawn: " + amount);
    }

}
