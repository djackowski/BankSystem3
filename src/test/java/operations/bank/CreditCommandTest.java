package operations.bank;

import commands.CreditCommand;
import org.junit.Before;
import org.junit.Test;
import products.BankAccount;
import products.BankMediator;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class CreditCommandTest {
private BankMediator bankMediator;
    @Before
    public void setUp() throws Exception {
        bankMediator = new BankMediator();
    }

    @Test
    public void whenCredit_withZeroInitValue_shouldReturnIncreasedValue() throws Exception {
        //Given
        BankAccount bankAccount = new BankAccount(bankMediator);
        bankMediator.addAccount(bankAccount);

        //When
        bankAccount.send(new CreditCommand( 100));

        //Then
        assertEquals(100, bankAccount.getBalance());
    }

    @Test
    public void whenPayCredit_withEnoughInitValue_shouldReturnTrue() throws Exception {
        //Given
        BankAccount bankAccount = new BankAccount(bankMediator);
        bankMediator.addAccount(bankAccount);
        bankAccount.setBalance(200);
        CreditCommand creditCommand = new CreditCommand(100);
        bankAccount.send(creditCommand);

        //When
        boolean isPaid = creditCommand.payFirst(bankAccount);

        //Then
        assertTrue(isPaid);
    }

    @Test
    public void whenPayCredit_withNotEnoughInitValue_shouldReturnFalse() throws Exception {
        //Given
        BankAccount bankAccount = new BankAccount(bankMediator);
        bankMediator.addAccount(bankAccount);
        CreditCommand creditCommand = new CreditCommand(100);
        bankAccount.send(creditCommand);

        //When
        boolean isPaid = creditCommand.payFirst(bankAccount);

        //Then
        assertFalse(isPaid);
    }

    @Test
    public void whenPayCredit_withEnoughInitValue_shouldLessValueThanInit() throws Exception {
        //Given
        BankAccount bankAccount = new BankAccount(bankMediator);
        bankMediator.addAccount(bankAccount);
        int init = 2000;
        bankAccount.setBalance(init);
        int amount = 1000;
        CreditCommand creditCommand = new CreditCommand(amount);
        bankAccount.send(creditCommand);
        double interest = bankAccount.calculateInterest(amount);
        double result = init - interest;

        //When
        creditCommand.payFirst(bankAccount);

        //Then
        assertEquals(result, bankAccount.getBalance(), 0.0);
    }
}