package operations.investment;


public class InvestmentOperation {
    private int amount;
  /*  private TimerTask task;

    protected InvestmentOperation(Account account) {
        super(account);
    }

    public void start(final BankAccount bankAccount, int amount, long timeInMillis) {
        if (bankAccount.getBalance() < amount) {
            System.out.println("You have no available money to invest!");
            return;
        }
        this.amount = amount;
        int resultBalance = bankAccount.getBalance() - amount;
        bankAccount.setBalance(resultBalance);

        long timeInSeconds = timeInMillis / 1000;
        System.out.println("Waiting " + timeInSeconds + "s to calculate interest");

        InterestOperation interestOperation = new InterestOperation(account);
        interestOperation.setInterestMechanism(InterestMechanism.ACCOUNT);
        double interest = interestOperation.calculate(amount);

        final int balance = (int) (bankAccount.getBalance() + interest + amount);

        Timer t = new Timer();
        task = new TimerTask() {
            @Override
            public void run() {
                saveInterest(bankAccount, balance);
            }
        };
        t.schedule(task, timeInMillis);
        account.getHistory2().add("Investment operation started: " + amount);
    }

    private void saveInterest(BankAccount bankAccount, int balance) {

        bankAccount.setBalance(balance);
        System.out.println("Interest saved. Current balance = " + bankAccount.getBalance());
        account.getHistory2().add("Investment operation saved: " + amount);

    }

    public void cancel(BankAccount bankAccount) {
        task.cancel();
        restoreMoneyToAccount(bankAccount);
    }

    private void restoreMoneyToAccount(BankAccount bankAccount) {
        int resultBalance = bankAccount.getBalance() + amount;
        bankAccount.setBalance(resultBalance);
        System.out.println("Investment cancelled. Money has been restored.");
        String description = "Investment operation cancelled. Restored money: " + resultBalance;
        account.getHistory2().add(description);
        History2.getHistory2().add(description);


    }*/

}
