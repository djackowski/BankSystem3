package products;

import commands.Command;


public interface Mediator {
    void notify(Command command);
}
