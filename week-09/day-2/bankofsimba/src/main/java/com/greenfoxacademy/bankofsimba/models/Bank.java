package com.greenfoxacademy.bankofsimba.models;

import javax.persistence.*;
import java.util.List;

@Entity
public class Bank {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  Long id;
  @OneToMany(cascade = CascadeType.ALL)
  List<BankAccount> bankAccounts;

  public Bank() {
  }

  public Bank(List<BankAccount> bankAccounts) {
    this.bankAccounts = bankAccounts;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public List<BankAccount> getBankAccounts() {
    return bankAccounts;
  }

  public void setBankAccounts(List<BankAccount> bankAccounts) {
    this.bankAccounts = bankAccounts;
  }
}
