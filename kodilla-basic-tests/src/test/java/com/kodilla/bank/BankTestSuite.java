package com.kodilla.bank;
import homework.bank.Bank;
import homework.bank.CashMachine;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

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

        // Dodaj testy dla pozostałych metod
    }
