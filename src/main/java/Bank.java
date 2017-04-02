import operations.History;
import products.BankAccount;
import products.CreditAccount;
import products.InvestmentAccount;

public class Bank {

    public static void main(String[] args) {
        //Bank account
        BankAccount firstAccount = new BankAccount(1203);
        BankAccount secondAccount = new BankAccount(1204);
        firstAccount.getOperation()
                .deposit(1200)
                .withdraw(1000)
                .transfer(120, secondAccount)
                .withdraw(80);

        secondAccount.getOperation().transfer(10, firstAccount);

        int firstAccountBalance = firstAccount.getBalance();
        int secondAccountBalance = secondAccount.getBalance();

        System.out.println("First balance = " + firstAccountBalance + " Second balance = " + secondAccountBalance);
        System.out.println("Date: " + firstAccount.getCreatedDate());

        History firstAccountHistory = firstAccount.getHistory();
        History secondAccountHistory = secondAccount.getHistory();
        System.out.println("First Account operations.History: " + firstAccountHistory.getOperationList());
        System.out.println("Second Account operations.History: " + secondAccountHistory.getOperationList());
        System.out.println("Bank operations.History: " + History.getHistory().getOperationList());
        //InvestmentAccount

        BankAccount thirdAccount = new BankAccount(234);
        thirdAccount.setBalance(2000);
        System.out.println("Third account balance before: " + thirdAccount.getBalance());
        InvestmentAccount firstInvest = new InvestmentAccount();
        firstInvest.getOperation()
                .start(thirdAccount, 1000, 5000);

        firstInvest.getOperation().cancel(thirdAccount);

        System.out.println("InvestmentAccount history: " + firstInvest.getHistory().getOperationList());


        //CreditAccount
        BankAccount creditBankAccount = new BankAccount(21321);
        CreditAccount creditAccount = new CreditAccount();
        creditAccount.getOperation().take(creditBankAccount, 2000);
        creditAccount.getOperation().take(creditBankAccount, 3000);
        creditAccount.getOperation().take(creditBankAccount, 1000);
        creditAccount.getOperation().payFirst(creditBankAccount);
        creditAccount.getOperation().payFirst(creditBankAccount);
        creditAccount.getOperation().payFirst(creditBankAccount);

        System.out.println("CreditAccount history: " + creditAccount.getHistory().getOperationList());
        System.out.println("Bank history: " + History.getHistory().getOperationList());

        //Overdraft
        BankAccount bank = new BankAccount(2313124);
        bank.getOperation().withdraw(1000);
        bank.setOverdraftMechanism(200);
        bank.getOperation().withdraw(100);
        bank.getBalance();
        bank.getOperation().deposit(200);
    }
}
