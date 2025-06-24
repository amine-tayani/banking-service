package com.skybank.bankservice;

import java.util.ArrayList;
import java.util.List;

public class Account implements AccountService {
  private final List<Transaction> transactions = new ArrayList<>();
  private int balance = 0;
  private final BankStatementPrinter statementPrinter;

  public Account(BankStatementPrinter statementPrinter) {
    this.statementPrinter = statementPrinter;
  }

  @Override
  public void depositMoney(int amount) {
    if (amount <= 0)
      throw new IllegalArgumentException("Deposit amount must be positive");
    balance += amount;
    transactions.add(new Transaction(TransactionType.DEPOSIT, amount, balance));
  }

  @Override
  public void withdrawMoney(int amount) {
    if (amount <= 0)
      throw new IllegalArgumentException("Withdraw amount must be positive");
    if (amount > balance)
      throw new IllegalArgumentException("Insufficient funds");
    balance -= amount;
    transactions.add(new Transaction(TransactionType.WITHDRAW, amount, balance));
  }

  @Override
  public void printAccountStatement() {
    statementPrinter.print(transactions);
  }

  public int getBalance() {
    return balance;
  }
}
