/*
package tests;

import main.java.operations.*;
import org.junit.Before;
import org.junit.Test;

import static main.java.operations.OperationType.*;
import static org.junit.Assert.assertTrue;


public class OperationFactory2Test {

    private OperationFactory2 factory;

    @Before
    public void setUp() throws Exception {
        factory = new OperationFactory2();
    }

    @Test
    public void whenCreateFactory_withDepositType_createDepositOperation() {
        //When
        Operation operation = factory.create(DEPOSIT);
        //Then
        boolean condition = operation instanceof DepositOperation;
        assertTrue(condition);
    }

    @Test
    public void whenCreateFactory_withWithdrawType_createWithdrawOperation() {
        //When
        Operation operation = factory.create(WITHDRAW);
        //Then
        boolean condition = operation instanceof WithdrawOperation;
        assertTrue(condition);
    }

    @Test
    public void whenCreateFactory_withTransferType_createTransferOperation() {
        //When
        Operation operation = factory.create(TRANSFER);
        //Then
        boolean condition = operation instanceof TransferOperation;
        assertTrue(condition);
    }
}*/
