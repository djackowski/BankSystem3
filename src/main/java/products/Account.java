package products;


import commands.Command;
import operations.interests.Interest;

import java.util.List;


public abstract class Account {
    private History history = new History();
    private int balance;
    int id;
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

    public void executeCommand(Command command) {
        boolean isExecuted = command.execute();
        if (isExecuted) {
            getCommandHistory().add(command);
        }
    }

    @Override
    public String toString() {
        return this.getClass().getName();
    }

    public int getId() {
        return id;
    }

}
