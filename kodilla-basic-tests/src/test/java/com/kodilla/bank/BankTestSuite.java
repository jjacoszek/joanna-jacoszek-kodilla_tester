package com.kodilla.bank;

import homework.bank.Bank;
import homework.bank.CashMachine;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BankTestSuite {


    private Bank bank;

        @BeforeEach
        void setUp() {
            bank = new Bank();
        }

        @Test
        void testGetTotalBalance() {
            // Arrange
            CashMachine cashMachine1 = new CashMachine();
            cashMachine1.add(100);
            cashMachine1.add(-50);

            CashMachine cashMachine2 = new CashMachine();
            cashMachine2.add(200);
            cashMachine2.add(-100);

            bank.addCashMachine(cashMachine1);
            bank.addCashMachine(cashMachine2);

            // Act
            int totalBalance = bank.getTotalBalance();

            // Assert
            assertEquals(150, totalBalance);
        }

    @Test
    void testAddCashMachine() {
        CashMachine cashMachine1 = new CashMachine();
        bank.addCashMachine(cashMachine1);

        assertEquals(1, bank.getSize());
        CashMachine[] machinesArray1 = bank.getCashMachines();
        assertNotNull(machinesArray1);
        assertEquals(1, machinesArray1.length);
        assertSame(cashMachine1, machinesArray1[0]);

        CashMachine cashMachine2 = new CashMachine();
        bank.addCashMachine(cashMachine2);

        assertEquals(2, bank.getSize());
        CashMachine[] machinesArray2 = bank.getCashMachines();
        assertNotNull(machinesArray2);
        assertEquals(2, machinesArray2.length);
        assertSame(cashMachine2, machinesArray2[1]);
    }
    }
