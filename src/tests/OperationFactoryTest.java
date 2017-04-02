/*
package tests;

import main.java.operations.OperationFactory;
import main.java.products.BankAccount;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OperationFactoryTest {
    private OperationFactory operationFactory;
    private BankAccount bankAccount;

    @Before
    public void setUp() throws Exception {
        bankAccount = new BankAccount(0);
        operationFactory = new OperationFactory(bankAccount);
    }

    @After
    public void tearDown() throws Exception {
        bankAccount = null;
        operationFactory = null;
    }

    @Test
    public void whenDeposit_withSpecifiedAmount_getBalanceIncreasedByThisValue() {
        //When
        operationFactory.deposit(10);
        //Then
        int balance = bankAccount.getBalance();
        assertEquals(10, balance);
    }

    @Test
    public void whenWithdraw_withSpecifiedAmount_getBalanceDecreasedByThisValue() {
        //Given
        bankAccount.setBalance(30);
        //When
        operationFactory.withdraw(10);
        //Then
        int balance = bankAccount.getBalance();
        assertEquals(20, balance);
    }

    @Test
    public void whenTransfer_withSpecifiedAccount_getTargetAccountBalanceIncreasedBySpecifiedAmount() {
        //Given
        BankAccount toAccount = new BankAccount(1);
        bankAccount.setBalance(30);
        //When
        operationFactory.transfer(20, toAccount);
        //Then
        int firstBalance = bankAccount.getBalance();
        int secondBalance = toAccount.getBalance();
        assertEquals(10, firstBalance);
        assertEquals(20, secondBalance);
    }
}*/
