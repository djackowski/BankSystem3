package operations;


import products.Account;

public abstract class OperationFactory {
    protected final Account account;

    protected OperationFactory(Account account) {
        this.account = account;
    }

    public Operation get() {
        return create();
    }

    protected abstract Operation create();

}
