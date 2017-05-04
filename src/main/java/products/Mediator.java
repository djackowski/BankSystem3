package products;

import commands.Command;

/**
 * https://dzone.com/articles/design-patterns-mediator
 */
public interface Mediator {
    void execute(Command command, Account bankAccount);
}
