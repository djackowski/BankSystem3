package operations.bank;

import commands.DepositCommand;
import org.junit.Before;
import org.junit.Test;
import products.BankAccount;
import products.BankMediator;

import static org.junit.Assert.assertEquals;

public class DepositCommandTest {
private BankMediator bankMediator;
    @Before
    public void setUp() throws Exception {
        bankMediator = new BankMediator();
    }

    @Test
    public void whenDeposit_withInitValue_shouldReturnIncreasedValue() throws Exception {
        //Given
        BankAccount bankAccount = new BankAccount(bankMediator);
        bankAccount.setBalance(100);
        bankMediator.addAccount(bankAccount);

        //When
        bankAccount.send(new DepositCommand( 100));

        //Then
        assertEquals(200, bankAccount.getBalance());
    }

}