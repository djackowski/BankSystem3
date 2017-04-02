package operations.investment;


import operations.OperationBuilder;
import products.Account;
import products.BankAccount;

public class InvestmentAccountOperationBuilder extends OperationBuilder {

    private InvestmentOperationFactory investmentOperationFactory = new InvestmentOperationFactory(account);

    public InvestmentAccountOperationBuilder(Account account) {
        super(account);
    }

    public InvestmentAccountOperationBuilder start(BankAccount bankAccount, int amount, long timeInMillis) {
        InvestmentOperation investmentOperation = (InvestmentOperation) investmentOperationFactory.get();
        investmentOperation.start(bankAccount, amount, timeInMillis);
        return this;
    }

    public InvestmentAccountOperationBuilder cancel(BankAccount bankAccount) {
        InvestmentOperation investmentOperation = (InvestmentOperation) investmentOperationFactory.get();
        investmentOperation.cancel(bankAccount);
        return this;
    }
}
