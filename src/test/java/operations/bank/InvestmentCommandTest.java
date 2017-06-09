package operations.bank;

import commands.InvestmentCommand;
import operations.interests.LinearInterest;
import org.junit.Before;
import org.junit.Test;
import products.BankAccount;
import products.BankMediator;

import static operations.interests.LinearInterestConstants.MEDIUM;
import static org.junit.Assert.assertEquals;

public class InvestmentCommandTest {
private BankMediator bankMediator;
    @Before
    public void setUp() throws Exception {
        bankMediator = new BankMediator();
    }

    @Test
    public void whenInvestCommand_with100InitValue_shouldReturnInitValueWithInterests() throws Exception {
        //Given
        BankAccount bankAccount = new BankAccount(bankMediator);
        bankAccount.setBalance(100);
        bankMediator.addAccount(bankAccount);
        bankAccount.setInterestMechanism(new LinearInterest());
        int expectedResult = (int) (bankAccount.getBalance() * MEDIUM) + bankAccount.getBalance();

        //When
        bankAccount.send(new InvestmentCommand( 100));

        //Then
        assertEquals(expectedResult, bankAccount.getBalance());
    }

}