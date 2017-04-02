package operations.credit;


import operations.OperationBuilder;
import products.Account;
import products.BankAccount;

public class CreditOperationBuilder extends OperationBuilder {
    private CreditOperationFactory creditOperationFactory;
    public CreditOperationBuilder(Account account) {
        super(account);
        creditOperationFactory = new CreditOperationFactory(account);
    }

    public CreditOperationBuilder take(BankAccount bankAccount, int amount) {
        CreditOperation creditOperation = (CreditOperation) creditOperationFactory.get();
        creditOperation.take(bankAccount, amount);
        return this;
    }

    public CreditOperationBuilder payFirst(BankAccount bankAccount) {
        CreditOperation creditOperation = (CreditOperation) creditOperationFactory.get();
        creditOperation.payFirst(bankAccount);
        return this;
    }


}
