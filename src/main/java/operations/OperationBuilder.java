package operations;


import products.Account;

public abstract class OperationBuilder {
    protected final Account account;

    protected OperationBuilder(Account account) {
        this.account = account;
    }


}
