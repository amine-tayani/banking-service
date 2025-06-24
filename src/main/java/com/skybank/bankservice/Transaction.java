package com.skybank.bankservice;

import java.time.LocalDate;

public class Transaction {
    private final TransactionType type;
    private final int amount;
    private final int balance;
    private final LocalDate date;

    public Transaction(TransactionType type, int amount, int balance) {
        this.type = type;
        this.amount = amount;
        this.balance = balance;
        this.date = LocalDate.now();
    }

    public TransactionType getType() {
        return type;
    }

    public int getAmount() {
        return amount;
    }

    public int getBalance() {
        return balance;
    }

    public LocalDate getDate() {
        return date;
    }
}
