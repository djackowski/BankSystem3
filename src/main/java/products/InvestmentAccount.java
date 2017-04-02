package products;


import operations.investment.InvestmentAccountOperationBuilder;

public class InvestmentAccount extends Account {
    private InvestmentAccountOperationBuilder investmentAccountOperationBuilder;

    public InvestmentAccount() {
        investmentAccountOperationBuilder = new InvestmentAccountOperationBuilder(this);
    }

    @Override
    public InvestmentAccountOperationBuilder getOperation() {
        return investmentAccountOperationBuilder;
    }
}
