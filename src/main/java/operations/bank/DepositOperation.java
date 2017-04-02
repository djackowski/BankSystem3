package operations.bank;


import operations.History;
import operations.Operation;
import products.Account;
import products.BankAccount;

public class DepositOperation extends Operation {
    private BankAccount bankAccount;
    public DepositOperation(Account account) {
        super(account);
        bankAccount = (BankAccount) account;
    }

    public void deposit(int amount) {
        int balance = bankAccount.getBalance();
        int resultBalance = balance + amount;
        bankAccount.setBalance(resultBalance);
        String description = "Deposit operation: " + amount;
        bankAccount.getHistory().add(description);
        History.getHistory().add(description);
        System.out.println("Money deposited: " + amount);

    }
}
