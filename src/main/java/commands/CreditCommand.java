package commands;

import products.BankAccount;

import java.util.ArrayList;
import java.util.List;

public class CreditCommand implements Command {
    private final BankAccount bankAccount;
    private final int amount;
    private List<Credit> creditList = new ArrayList<Credit>();

    public CreditCommand(BankAccount bankAccount, int amount) {
        this.bankAccount = bankAccount;
        this.amount = amount;
    }

    public boolean execute() {
        int resultBalance = bankAccount.getBalance() + amount;
        bankAccount.setBalance(resultBalance);
        Credit currentCredit = new Credit(amount);
        creditList.add(currentCredit);
        System.out.println("You have taken the credit: " + amount);
        return true;
    }


    public void payFirst() {
  /*      if (creditList.isEmpty()) {
            System.out.println("You have no credits to pay");
            return;
        }
        int creditAmount = creditList.get(0).getAmount();
        InterestOperation interestOperation = new InterestOperation(account);
        interestOperation.setInterestMechanism(CREDIT);
        double interest = interestOperation.calculate(creditAmount);
        double creditWithInterest = interest + creditAmount;
        double resultBalance = bankAccount.getBalance() - creditWithInterest;
        if (resultBalance < 0) {
            System.out.println("You have no money to pay the credit");
            return;
        }

        bankAccount.setBalance((int) resultBalance);
        System.out.println("You have paid credit: " + creditWithInterest + " Your account balance: " + bankAccount.getBalance());
        String description = "Credit operation payed: " + creditWithInterest;
        getHistory2().add(description);
        History2.getHistory2().add(description);
        creditList.remove(0);*/

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
