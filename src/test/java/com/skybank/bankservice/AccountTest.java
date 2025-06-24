package com.skybank.bankservice;  

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    private Account account;

    @BeforeEach
    void setUp() {
        account = new Account(new BankStatementPrinter());
    }

    @Test
    void deposit_shouldIncreaseBalance() {
        account.depositMoney(1000);
        assertEquals(1000, account.getBalance());
    }

    @Test
    void withdraw_shouldDecreaseBalance() {
        account.depositMoney(1000);
        account.withdrawMoney(400);
        assertEquals(600, account.getBalance());
    }

    @Test
    void withdraw_moreThanBalance_shouldThrow() {
        account.depositMoney(200);
        assertThrows(IllegalArgumentException.class, () -> account.withdrawMoney(500));
    }

    @Test
    void negativeDeposit_shouldThrow() {
        assertThrows(IllegalArgumentException.class, () -> account.depositMoney(-100));
    }

    @Test
    void negativeWithdraw_shouldThrow() {
        assertThrows(IllegalArgumentException.class, () -> account.withdrawMoney(-100));
    }
}
