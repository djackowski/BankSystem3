package operations;

import java.util.ArrayList;
import java.util.List;

public class History {

    private List<String> operationList = new ArrayList<String>();
    private static History history;

    public static History getHistory() {
        if(history == null) {
            history = new History();
        }
        return history;
    }

    public void add(String description) {
        operationList.add(description);
        //TODO: factory
//        getHistory().add(description);
    }

    public List<String> getOperationList() {
        return operationList;
    }
}
