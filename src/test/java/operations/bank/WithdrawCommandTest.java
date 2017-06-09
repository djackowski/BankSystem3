package operations.bank;

import commands.WithdrawCommand;
import org.junit.Before;
import org.junit.Test;
import products.BankAccount;
import products.BankMediator;

import static org.junit.Assert.assertEquals;

public class WithdrawCommandTest {
    private BankMediator bankMediator;

    @Before
    public void setUp() throws Exception {
        bankMediator = new BankMediator();
    }

    @Test
    public void whenWithdraw_with20AmountAndNoInitialBalance_shouldReturn0() throws Exception {
        //Given
        BankAccount bankAccount = new BankAccount(bankMediator);
        bankMediator.addAccount(bankAccount);
        //When
        bankAccount.send(new WithdrawCommand(bankAccount, 20));
        //Then
        assertEquals(0, bankAccount.getBalance());
    }

    @Test
    public void whenWithdraw_with20AmountAnd100InitialBalance_shouldReturn80() throws Exception {
        //Given
        BankAccount bankAccount = new BankAccount(bankMediator);
        bankMediator.addAccount(bankAccount);
        bankAccount.setBalance(100);
        //When
        bankAccount.send(new WithdrawCommand(bankAccount, 20));
        //Then
        assertEquals(80, bankAccount.getBalance());
    }

}
