package commands;


import products.Account;

public interface Command {
    boolean execute(Account account);
}
