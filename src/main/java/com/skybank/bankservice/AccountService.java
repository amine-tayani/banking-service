package com.skybank.bankservice;

public interface AccountService {

  void depositMoney(int amount);

  void withdrawMoney(int amount);

  void printAccountStatement();
}