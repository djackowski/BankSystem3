package commands;

import products.Account;

import java.util.ArrayList;
import java.util.List;

public class CreditCommand implements Command {
    private final int amount;
    private List<Credit> creditList = new ArrayList<Credit>();

    public CreditCommand(int amount) {
        this.amount = amount;
    }

    @Override
    public boolean execute(Account account) {
        int resultBalance = account.getBalance() + amount;
        account.setBalance(resultBalance);
        Credit currentCredit = new Credit(amount);
        creditList.add(currentCredit);
        System.out.println("You have taken the credit: " + amount);
        return true;
    }


    public boolean payFirst(Account account) {
        if (creditList.isEmpty()) {
            System.out.println("You have no credits to pay");
            return false;
        }
        int creditAmount = creditList.get(0).getAmount();
        double interest = account.calculateInterest(creditAmount);
        double creditWithInterest = interest + creditAmount;
        double resultBalance = account.getBalance() - creditWithInterest;
        if (resultBalance < 0) {
            System.out.println("You have no money to pay the credit");
            return false;
        }

        account.setBalance((int) resultBalance);
        System.out.println("You have paid credit: " + creditWithInterest + " Your account balance: " + account.getBalance());
        creditList.remove(0);

        return true;

    }

    private class Credit {
        private final int amount;

        private Credit(int amount) {
            this.amount = amount;
        }

        int getAmount() {
            return amount;
        }
    }
}
