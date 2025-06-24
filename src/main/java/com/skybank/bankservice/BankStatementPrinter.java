package com.skybank.bankservice;

import java.util.List;

public class BankStatementPrinter {
  public void print(List<Transaction> transactions) {
    System.out.printf("%-12s| %-10s| %-10s| %-10s%n", "DATE", "TYPE", "AMOUNT", "BALANCE");
    for (Transaction transaction : transactions) {
      System.out.printf(
          "%-12s| %-10s| %-10d| %-10d%n",
          transaction.getDate(),
          transaction.getType(),
          transaction.getAmount(),
          transaction.getBalance());
    }
  }
}
