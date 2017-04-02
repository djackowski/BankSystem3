package operations.bank;

import operations.OperationBuilder;
import operations.OperationFactory;
import products.Account;
import products.BankAccount;

public class BankOperationBuilder extends OperationBuilder {

private OperationFactory operationFactory;
    public BankOperationBuilder(Account account) {
        super(account);
    }

    public BankOperationBuilder deposit(int amount) {
        operationFactory = new DepositOperationFactory(account);
        DepositOperation depositOperation = (DepositOperation) operationFactory.get();
        depositOperation.deposit(amount);
        return this;
    }

    public BankOperationBuilder withdraw(int amount) {
        operationFactory = new WithdrawOperationFactory(account);
        WithdrawOperation withdrawOperation = (WithdrawOperation) operationFactory.get();
        withdrawOperation.withdraw(amount);
        return this;
    }

    public BankOperationBuilder transfer(int amount, BankAccount account) {
        operationFactory = new TransferOperationFactory(this.account);
        TransferOperation transferOperation = (TransferOperation) operationFactory.get();
        transferOperation.transfer(amount, account);
        return this;
    }

}
