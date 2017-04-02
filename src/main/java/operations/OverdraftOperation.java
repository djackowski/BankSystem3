package operations;


import products.BankAccount;

public class OverdraftOperation extends Operation {
    private int amount;
    public OverdraftOperation(BankAccount account) {
        super(account);
    }

    public void create(int amount) {
        this.amount = amount;
        account.getHistory().add("Overdraft operation: created " + amount + " overdraft");
    }

    public int get() {
        return amount;
    }
}
