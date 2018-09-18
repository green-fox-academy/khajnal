package com.greenfoxacademy.bankofsimba.model;

import java.text.DecimalFormat;

public class BankAccount {
  private String name;
  private double balance;
  private String animalType;

  public BankAccount() {
  }

  public BankAccount(String name, double balance, String animalType) {
    this.name = name;
    this.balance = balance;
    this.animalType = animalType;
  }

  public String getName() {
    return name;
  }

  public String getBalance() {
    return String.format("%.2f", balance) + " Zebra";
  }

  public String getAnimalType() {
    return animalType;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setBalance(double balance) {
    this.balance = balance;
  }

  public void setAnimalType(String animalType) {
    this.animalType = animalType;
  }
}