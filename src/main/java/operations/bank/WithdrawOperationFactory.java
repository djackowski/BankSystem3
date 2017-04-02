package operations.bank;


import operations.Operation;
import operations.OperationFactory;
import products.Account;

public class WithdrawOperationFactory extends OperationFactory {

    private WithdrawOperation withdrawOperation = new WithdrawOperation(account);

    public WithdrawOperationFactory(Account account) {
        super(account);
    }

    @Override
    protected Operation create() {
        return withdrawOperation;
    }

}
