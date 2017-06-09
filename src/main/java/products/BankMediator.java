package products;

import commands.Command;

import java.util.ArrayList;
import java.util.List;

public class BankMediator implements Mediator {
    private List<Account> accountList = new ArrayList<Account>();

    public void addAccount(Account account) {
        accountList.add(account);
    }

    @Override
    public void notify(Command command) {
        for (Account acc : accountList) {
            acc.executeCommand(command);
        }
    }
}
