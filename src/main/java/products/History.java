package products;

import commands.Command;

import java.util.ArrayList;
import java.util.List;

public class History {
    private List<Command> commandList = new ArrayList<Command>();

    public void add(Command command) {
        commandList.add(command);
    }

    public List<Command> getCommandList() {
        return commandList;
    }
}
