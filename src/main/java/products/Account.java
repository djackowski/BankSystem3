package products;


import commands.Command;
import operations.interests.Interest;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;


public abstract class Account {
    private History history = new History();
    private int balance;
    static AtomicInteger id = new AtomicInteger();
    protected Interest interestMechanism;

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setInterestMechanism(Interest interestMechanism) {
        this.interestMechanism = interestMechanism;
    }

    public List<Command> getCommandHistory() {
        return history.getCommandList();
    }


    public static AtomicInteger getId() {
        return id;
    }

    @Override
    public String toString() {
        return this.getClass().getName();
    }

    public double calculateInterest(int amount) {
        return interestMechanism.calculate(amount);
    }

    public Interest getInterestMechanism() {
        return interestMechanism;
    }

    public abstract void executeCommand(Command command);

    public abstract void send(Command command);

}
