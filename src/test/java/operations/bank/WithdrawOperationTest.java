package operations.bank;

import commands.WithdrawCommand;
import org.junit.Test;
import products.BankAccount;

import static org.junit.Assert.assertEquals;

public class WithdrawOperationTest {
    @Test
    public void whenWithdraw_with20AmountAndNoInitialBalance_shouldReturn0() throws Exception {
        //Given
        BankAccount bankAccount = new BankAccount(10);
        WithdrawCommand withdrawCommand = new WithdrawCommand(bankAccount, 20);

        //When
        bankAccount.executeCommand(withdrawCommand);
        //Then
        assertEquals(0, bankAccount.getBalance());
    }

    @Test
    public void whenWithdraw_with20AmountAnd100InitialBalance_shouldReturn80() throws Exception {
        //Given
        BankAccount bankAccount = new BankAccount(10);
        bankAccount.setBalance(100);
        WithdrawCommand withdrawCommand = new WithdrawCommand(bankAccount, 20);

        //When
        bankAccount.executeCommand(withdrawCommand);
        //Then
        assertEquals(80, bankAccount.getBalance());
    }

}
