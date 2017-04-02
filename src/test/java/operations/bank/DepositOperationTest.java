package operations.bank;

import org.junit.Test;
import products.BankAccount;

import static org.junit.Assert.assertEquals;

public class DepositOperationTest {

    @Test
    public void whenDeposit_with10Value_shouldReturn110() throws Exception {
        //Given
        BankAccount bankAccount = new BankAccount(1023);
        bankAccount.setBalance(100);
        DepositOperation depositOperation = new DepositOperation(bankAccount);

        //When
        depositOperation.deposit(10);

        //Then
        assertEquals(110, bankAccount.getBalance());
    }

}