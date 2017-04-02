package products;


import operations.InterestOperation;
import operations.OverdraftOperation;
import operations.bank.BankOperationBuilder;
import operations.bank.BankOperationFactory;

import java.util.Calendar;
import java.util.Date;

import static operations.InterestMechanism.ACCOUNT;

public class BankAccount extends Account {

    private int balance;
    private Calendar createdDate;
    private InterestOperation interestOperation = new InterestOperation(this);
    private OverdraftOperation overdraftOperation = new OverdraftOperation(this);

    public BankAccount(int id) {
        this.id = id;
        createdDate = Calendar.getInstance();
    }


    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public double calculateInterest() {
        interestOperation.setInterestMechanism(ACCOUNT);
        return interestOperation.calculate(balance);
    }

    @Override
    public BankOperationBuilder getOperation() {
        return new BankOperationFactory(this).create();
    }

    public Date getCreatedDate() {
        return createdDate.getTime();
    }

    public void setOverdraftMechanism(int amount) {
        overdraftOperation.create(amount);
    }

    public int getOverdraftMechanism() {
        return overdraftOperation.get();
    }
}
