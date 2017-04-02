package operations;


import products.Account;

public abstract class Operation {
    protected final Account account;

    protected Operation(Account account) {
        this.account = account;
    }

    protected History getHistory() {
        return account.getHistory();
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }


}
