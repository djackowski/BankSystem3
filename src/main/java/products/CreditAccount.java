package products;


import operations.credit.CreditOperationBuilder;

public class CreditAccount extends Account {
    private final CreditOperationBuilder creditOperationBuilder;

    public CreditAccount() {
        creditOperationBuilder = new CreditOperationBuilder(this);
    }

    @Override
    public CreditOperationBuilder getOperation() {
        return creditOperationBuilder;
    }

}
