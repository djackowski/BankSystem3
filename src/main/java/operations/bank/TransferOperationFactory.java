package operations.bank;


import operations.Operation;
import operations.OperationFactory;
import products.Account;

public class TransferOperationFactory extends OperationFactory {

    private TransferOperation transferOperation = new TransferOperation(account);

    public TransferOperationFactory(Account account) {
        super(account);
    }

    @Override
    protected Operation create() {
        return transferOperation;
    }

}
