package operations.credit;


import operations.Operation;
import operations.OperationFactory;
import products.Account;

public class CreditOperationFactory extends OperationFactory {
    private final CreditOperation creditOperation;

    protected CreditOperationFactory(Account account) {
        super(account);
        creditOperation = new CreditOperation(account);
    }

    @Override
    protected Operation create() {
        return creditOperation;
    }
}
