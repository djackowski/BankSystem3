package operations.bank;

import commands.DepositCommand;
import org.junit.Test;
import products.BankAccount;

import static org.junit.Assert.assertEquals;

public class DepositOperationTest {

    @Test
    public void whenDeposit_with10Value_shouldReturn110() throws Exception {
        //Given
        BankAccount bankAccount = new BankAccount(1023);
        bankAccount.setBalance(100);
        DepositCommand depositOperation = new DepositCommand(bankAccount, 10);

        //When
        bankAccount.executeCommand(depositOperation);

        //Then
        assertEquals(110, bankAccount.getBalance());
    }

}