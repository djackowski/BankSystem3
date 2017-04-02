package operations.bank;


import operations.Operation;
import operations.OperationFactory;
import products.Account;

public class DepositOperationFactory extends OperationFactory {

    private DepositOperation depositOperation = new DepositOperation(account);

    public DepositOperationFactory(Account account) {
        super(account);
    }


    @Override
    protected Operation create() {
        return depositOperation;
    }

}
