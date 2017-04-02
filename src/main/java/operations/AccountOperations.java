package operations;


import products.Account;

public abstract class AccountOperations {
    protected final Account account;

    protected AccountOperations(Account account) {
        this.account = account;
    }

    protected abstract OperationBuilder create();
}
