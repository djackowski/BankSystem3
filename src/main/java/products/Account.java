package products;


import operations.History;
import operations.InterestMechanism;
import operations.OperationBuilder;


public abstract class Account {
    private History history = new History();
    private InterestMechanism interestMechanism;
    private int balance;
    int id;

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setInterestMechanism(InterestMechanism interestMechanism) {
        this.interestMechanism = interestMechanism;
    }

    public History getHistory() {
        return history;
    }

    @Override
    public String toString() {
        return this.getClass().getName();
    }

    public abstract OperationBuilder getOperation();

    public int getId() {
        return id;
    }

}
