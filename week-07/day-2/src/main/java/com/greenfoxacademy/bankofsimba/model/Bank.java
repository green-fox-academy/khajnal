package com.greenfoxacademy.bankofsimba.model;

import java.util.List;

public class Bank {
  private List<BankAccount> allBankAccounts;

  public Bank() {
  }

  public Bank(List<BankAccount> allBankAccounts) {
    this.allBankAccounts = allBankAccounts;
  }

  public List<BankAccount> getAllBankAccounts() {
    return allBankAccounts;
  }

  public void setAllBankAccounts(List<BankAccount> allBankAccounts) {
    this.allBankAccounts = allBankAccounts;
  }

  public void addToAllBankAccounts(BankAccount bankAccount) {
    allBankAccounts.add(bankAccount);
  }
}
