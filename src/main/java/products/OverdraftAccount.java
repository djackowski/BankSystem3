package products;

import commands.Command;

//TODO: implements...
public class OverdraftAccount extends Account {
    private int overdraft;
    private int maxOverdraft = 200;

    private final Account account;

    public OverdraftAccount(Account account) {
        this.account = account;
    }

    //FIXME:
    @Override
    public void executeCommand(Command command) {
        account.executeCommand(command);
        super.executeCommand(command);
    }
}
