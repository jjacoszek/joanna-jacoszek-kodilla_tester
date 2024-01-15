package com.kodilla.bank;

import homework.CashMachine;
import homework.bank.Bank;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTestSuite {

    Bank bank =new Bank();

     @Test
        public void shouldAddCashMachine() {
            bank.addCashMachine(100);
            int[] cashMachines = bank.getCashMachines();
            assertEquals(1, cashMachines.length);
            assertEquals(100, cashMachines[0]);
        }

        @Test
        public void shouldReturnTotalBalance() {
            bank.addCashMachine(50);
            bank.addCashMachine(-20);
            assertEquals(30, bank.getTotalBalance());
        }

        @Test
        public void shouldReturnTotalPaycheck() {
            CashMachine cashMachine = new CashMachine();
            cashMachine.withdraw(50);
            cashMachine.add(30);
            bank.addCashMachine(12);

            assertEquals(1, bank.getTotalPaycheck());
        }

        @Test
        public void shouldReturnTotalPayment() {
            CashMachine cashMachine = new CashMachine();
            cashMachine.withdraw(20);
            cashMachine.add(100);
            bank.addCashMachine(1);

            assertEquals(1, bank.getTotalPayment());
        }

        @Test
        public void shouldReturnAvgPaycheck() {
            CashMachine cashMachine = new CashMachine();
            cashMachine.withdraw(50);
            cashMachine.withdraw(30);
            bank.addCashMachine(21);

            assertEquals(-40, bank.getAvgPaycheck());
        }

        @Test
        public void shouldReturnAvgPayment() {
            CashMachine cashMachine = new CashMachine();
            cashMachine.add(20);
            cashMachine.add(80);
            bank.addCashMachine(23);

            assertEquals(50, bank.getAvgPayment());
        }
    }


