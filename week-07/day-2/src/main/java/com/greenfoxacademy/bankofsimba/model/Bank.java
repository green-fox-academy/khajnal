package com.greenfoxacademy.bankofsimba.model;

import java.util.ArrayList;
import java.util.List;

public class Bank {
  private List<BankAccount> allBankAccounts;

  public Bank() {
    allBankAccounts = new ArrayList<>();
    allBankAccounts.add(new BankAccount("Zazu", 5000, "bird"));
    allBankAccounts.add(new BankAccount("Simba", 2000, "lion"));
    allBankAccounts.add(new BankAccount("Mufasa", 4000, "lion"));
    allBankAccounts.add(new BankAccount("Timon", 3000, "meerkat"));
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

  public void add(BankAccount bankAccount) {
    allBankAccounts.add(bankAccount);
  }
}
