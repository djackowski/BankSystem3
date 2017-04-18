import commands.TransferCommand;
import commands.WithdrawCommand;
import products.BankAccount;
import commands.DepositCommand;

public class Bank {

    public static void main(String[] args) {
   /*     //Bank account
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

        History2 firstAccountHistory = firstAccount.getHistory2();
        History2 secondAccountHistory = secondAccount.getHistory2();
        System.out.println("First Account operations.History2: " + firstAccountHistory.getOperationList());
        System.out.println("Second Account operations.History2: " + secondAccountHistory.getOperationList());
        System.out.println("Bank operations.History2: " + History2.getHistory2().getOperationList());
        //InvestmentAccount

        BankAccount thirdAccount = new BankAccount(234);
        thirdAccount.setBalance(2000);
        System.out.println("Third account balance before: " + thirdAccount.getBalance());
        InvestmentAccount firstInvest = new InvestmentAccount();
        firstInvest.getOperation()
                .start(thirdAccount, 1000, 5000);

        firstInvest.getOperation().cancel(thirdAccount);

        System.out.println("InvestmentAccount history: " + firstInvest.getHistory2().getOperationList());


        //CreditAccount
        BankAccount creditBankAccount = new BankAccount(21321);
        CreditAccount creditAccount = new CreditAccount();
        creditAccount.getOperation().take(creditBankAccount, 2000);
        creditAccount.getOperation().take(creditBankAccount, 3000);
        creditAccount.getOperation().take(creditBankAccount, 1000);
        creditAccount.getOperation().payFirst(creditBankAccount);
        creditAccount.getOperation().payFirst(creditBankAccount);
        creditAccount.getOperation().payFirst(creditBankAccount);

        System.out.println("CreditAccount history: " + creditAccount.getHistory2().getOperationList());
        System.out.println("Bank history: " + History2.getHistory2().getOperationList());

        //Overdraft
        BankAccount bank = new BankAccount(2313124);
        bank.getOperation().withdraw(1000);
        bank.setOverdraftMechanism(200);
        bank.getOperation().withdraw(100);
        bank.getBalance();
        bank.getOperation().deposit(200);*/

        BankAccount bankAccount = new BankAccount(2);
        BankAccount bankAccount2 = new BankAccount(3);
        bankAccount.executeCommand(new DepositCommand(bankAccount, 100));
        bankAccount.executeCommand(new WithdrawCommand(bankAccount, 100));
        bankAccount.executeCommand(new DepositCommand(bankAccount, 200));
        bankAccount.executeCommand(new TransferCommand(bankAccount, bankAccount2, 20));
    }
}
