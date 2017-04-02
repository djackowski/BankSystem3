package operations.bank;


import operations.AccountOperations;
import products.Account;

public class BankOperationFactory extends AccountOperations {
    public BankOperationFactory(Account account) {
        super(account);
    }

    @Override
    public BankOperationBuilder create() {
        return new BankOperationBuilder(account);
    }
}
