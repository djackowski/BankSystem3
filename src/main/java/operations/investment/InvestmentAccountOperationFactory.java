package operations.investment;


import operations.AccountOperations;
import products.Account;

public class InvestmentAccountOperationFactory extends AccountOperations {
    protected InvestmentAccountOperationFactory(Account account) {
        super(account);
    }

    @Override
    protected InvestmentAccountOperationBuilder create() {
        return new InvestmentAccountOperationBuilder(account);
    }
}
