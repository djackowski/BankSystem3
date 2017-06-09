package products;


import commands.Command;
import operations.interests.LinearInterest;

import java.util.Calendar;

public class BankAccount extends Account {
    private int balance;
    private Calendar createdDate;
    private Mediator mediator;

    public BankAccount(Mediator mediator) {
        id.getAndIncrement();
        this.mediator = mediator;
        createdDate = Calendar.getInstance();
        interestMechanism = new LinearInterest();
    }

    @Override
    public void send(Command command) {
        mediator.notify(command);
    }

    @Override
    public void executeCommand(Command command) {
        boolean isExecuted = command.execute(this);
        if (isExecuted) {
            getCommandHistory().add(command);
        }
    }

    public Calendar getCreatedDate() {
        return createdDate;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }


}
