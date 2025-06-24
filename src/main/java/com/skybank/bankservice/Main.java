package com.skybank.bankservice;

public class Main {
    public static void main(String[] args) {
        BankStatementPrinter printer = new BankStatementPrinter();
        Account account = new Account(printer);
        account.depositMoney(2000);
        account.withdrawMoney(530);
        account.depositMoney(100);
        account.printAccountStatement();
        System.out.println("Account balance: " + account.getBalance());
    }
}