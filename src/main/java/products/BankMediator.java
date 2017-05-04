package products;

import commands.Command;

import java.util.ArrayList;
import java.util.List;

public class BankMediator implements Mediator {
    private List<Account> accountList = new ArrayList<Account>();

    public void addAccount(Account account) {
        accountList.add(account);
    }

    public void execute(Command command, Account account) {
        for (Account acc : accountList) {
            if (acc.equals(account)) {
                account.executeCommand(command);
            }
        }
    }
}
