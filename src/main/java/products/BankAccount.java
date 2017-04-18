package products;


import operations.OverdraftOperation;
import operations.interests.LinearInterest;

import java.util.Calendar;
import java.util.Date;

public class BankAccount extends Account {
    private int balance;
    private Calendar createdDate;
    //private InterestOperation interestOperation = new InterestOperation(this);
    private OverdraftOperation overdraftOperation = new OverdraftOperation();

    public BankAccount(int id) {
        this.id = id;
        createdDate = Calendar.getInstance();
        interestMechanism = new LinearInterest();
    }


    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public double calculateInterest() {
        return interestMechanism.calculate(balance);
    }

    public Date getCreatedDate() {
        return createdDate.getTime();
    }

    public void setOverdraftMechanism(int amount) {
       // overdraftOperation.create(amount);
    }

    public int getOverdraftMechanism() {
        return 0;
      //  return overdraftOperation.get();
    }
}
