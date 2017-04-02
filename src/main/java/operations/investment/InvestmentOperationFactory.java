package operations.investment;


import operations.Operation;
import operations.OperationFactory;
import products.Account;

public class InvestmentOperationFactory extends OperationFactory {

    private InvestmentOperation investmentOperation;

    public InvestmentOperationFactory(Account account) {
        super(account);
        investmentOperation = new InvestmentOperation(account);
    }

    @Override
    protected Operation create() {
        return investmentOperation;
    }

}
