package com.kodilla.bank;
import homework.bank.CashMachine;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CashMachineTestSuite {

        @Test
        public void shouldReturnZeroBalanceForNewCashMachine() {
            CashMachine cashMachine = new CashMachine();
            assertEquals(0, cashMachine.getBalance());
        }

        @Test
        public void shouldReturnCorrectBalanceAfterDepositsAndWithdrawals() {
            CashMachine cashMachine = new CashMachine();
            cashMachine.add(100);
            cashMachine.withdraw(50);
            cashMachine.add(200);

            assertEquals(250, cashMachine.getBalance());
        }

        @Test
        public void shouldReturnCorrectNumberOfTransactions() {
            CashMachine cashMachine = new CashMachine();
            cashMachine.add(100);
            cashMachine.withdraw(50);
            cashMachine.add(200);

            assertEquals(3, cashMachine.getNumberOfTransactions());
        }

        @Test
        public void shouldReturnCorrectArrayOfTransactions() {
            CashMachine cashMachine = new CashMachine();
            cashMachine.add(100);
            cashMachine.withdraw(50);
            cashMachine.add(200);

            int[] expectedTransactions = {100, -50, 200};
            assertArrayEquals(expectedTransactions, cashMachine.getTransactions());
        }
    }

