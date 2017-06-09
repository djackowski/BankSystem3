package products;

import commands.Command;

public class OverdraftAccount extends OverdraftAccountDecorator {


    public OverdraftAccount(Account decoratedAccount) {
        super(decoratedAccount);
    }

    @Override
    public void executeCommand(Command command) {
        super.executeCommand(command);
        decoratedAccount.executeCommand(command);
    }

    @Override
    public void send(Command command) {
        super.send(command);
        decoratedAccount.send(command);
    }
}
