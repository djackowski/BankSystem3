package operations.credit;


import operations.History;
import operations.InterestOperation;
import operations.Operation;
import products.Account;
import products.BankAccount;

import java.util.ArrayList;
import java.util.List;

import static operations.InterestMechanism.CREDIT;

public class CreditOperation extends Operation {
    private List<Credit> creditList = new ArrayList<Credit>();

    protected CreditOperation(Account account) {
        super(account);
    }


    public void take(BankAccount bankAccount, int amount) {
        int resultBalance = bankAccount.getBalance() + amount;
        bankAccount.setBalance(resultBalance);
        Credit currentCredit = new Credit(amount);
        creditList.add(currentCredit);
        System.out.println("You have taken the credit: " + amount);
        String description = "Credit operation taken: " + amount;
        getHistory().add(description);
        History.getHistory().add(description);
    }

    public void payFirst(BankAccount bankAccount) {
        if (creditList.isEmpty()) {
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
        getHistory().add(description);
        History.getHistory().add(description);
        creditList.remove(0);

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
