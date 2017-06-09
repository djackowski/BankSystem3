package operations.bank;

import commands.TransferCommand;
import org.junit.Before;
import org.junit.Test;
import products.BankAccount;
import products.BankMediator;

import static org.junit.Assert.assertEquals;

public class TransferCommandTest {
    private BankMediator bankMediator;
    @Before
    public void setUp() throws Exception {
        bankMediator = new BankMediator();
    }

    @Test
    public void whenTransfer_with100AmountAndZeroInitialBalance_shouldReturn0InSecondBankAccountBalance() throws Exception {
        //Given
        BankAccount firstBankAccount = new BankAccount(bankMediator);
        BankAccount secondBankAccount = new BankAccount(bankMediator);
        secondBankAccount.setBalance(100);
        bankMediator.addAccount(firstBankAccount);
        bankMediator.addAccount(secondBankAccount);
        //When
        secondBankAccount.send(new TransferCommand(firstBankAccount, 100));
        //Then
        assertEquals(0, secondBankAccount.getBalance());
    }

    @Test
    public void whenTransfer_with100AmountAnd0InitialBalance_shouldReturn100InSecondBankAccountBalance() throws Exception {
        //Given
        BankAccount firstBankAccount = new BankAccount(bankMediator);
        BankAccount secondBankAccount = new BankAccount(bankMediator);
        secondBankAccount.setBalance(0);
        bankMediator.addAccount(firstBankAccount);
        bankMediator.addAccount(secondBankAccount);
        //When
        firstBankAccount.send(new TransferCommand(secondBankAccount, 100));
        //Then
        assertEquals(100, secondBankAccount.getBalance());
    }

    @Test
    public void whenTransfer_with100AmountAnd100InitialBalance_shouldReturn0InFirstBankAccountBalance() throws Exception {
        //Given
        BankAccount firstBankAccount = new BankAccount(bankMediator);
        BankAccount secondBankAccount = new BankAccount(bankMediator);
        firstBankAccount.setBalance(100);
        bankMediator.addAccount(firstBankAccount);
        bankMediator.addAccount(secondBankAccount);
        //When
        firstBankAccount.send(new TransferCommand(secondBankAccount, 100));
        //Then
        assertEquals(0, firstBankAccount.getBalance());
    }

}
