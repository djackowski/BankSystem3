package operations.bank;

import commands.TransferCommand;
import org.junit.Test;
import products.BankAccount;

import static org.junit.Assert.assertEquals;

public class TransferOperationTest {
    @Test
    public void whenTransfer_with100AmountAndZeroInitialBalance_shouldReturn0InSecondBankAccountBalance_() throws Exception {
        //Given
        BankAccount firstBankAccount = new BankAccount(10);
        BankAccount secondBankAccount = new BankAccount(11);
        TransferCommand transferCommand = new TransferCommand(firstBankAccount, secondBankAccount, 100);
        //When
        firstBankAccount.executeCommand(transferCommand);
        //Then
        assertEquals(0, secondBankAccount.getBalance());
    }

    @Test
    public void whenTransfer_with100AmountAnd100InitialBalance_shouldReturn100InSecondBankAccountBalance() throws Exception {
        //Given
        BankAccount firstBankAccount = new BankAccount(10);
        firstBankAccount.setBalance(100);
        BankAccount secondBankAccount = new BankAccount(11);
        TransferCommand transferCommand = new TransferCommand(firstBankAccount, secondBankAccount, 100);
        //When
        firstBankAccount.executeCommand(transferCommand);
        //Then
        assertEquals(100, secondBankAccount.getBalance());
    }

    @Test
    public void whenTransfer_with100AmountAnd100InitialBalance_shouldReturn0InFirstBankAccountBalance() throws Exception {
        //Given
        BankAccount firstBankAccount = new BankAccount(10);
        firstBankAccount.setBalance(100);
        BankAccount secondBankAccount = new BankAccount(11);
        TransferCommand transferCommand = new TransferCommand(firstBankAccount, secondBankAccount, 100);
        //When
        firstBankAccount.executeCommand(transferCommand);
        //Then
        assertEquals(0, firstBankAccount.getBalance());
    }

}
