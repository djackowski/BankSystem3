package products;

import commands.Command;

public abstract class OverdraftAccountDecorator extends Account {

    protected Account decoratedAccount;

    public OverdraftAccountDecorator(Account decoratedAccount) {
        this.decoratedAccount = decoratedAccount;
    }

    @Override
    public void executeCommand(Command command) {
        decoratedAccount.executeCommand(command);
    }

    @Override
    public void send(Command command) {
        decoratedAccount.send(command);
    }
}
