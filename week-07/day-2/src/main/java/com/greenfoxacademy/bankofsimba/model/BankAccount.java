package com.greenfoxacademy.bankofsimba.model;

public class BankAccount {
  private String name;
  private double balance;
  private String animalType;
  private boolean isKing = false;

  public BankAccount() {
  }

  public BankAccount(String name, double balance, String animalType, boolean isKing) {
    this.name = name;
    this.balance = balance;
    this.animalType = animalType;
    this.isKing = isKing;
  }

  public String getName() {
    return name;
  }

  public double getBalance() {
    return balance;
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

  public boolean getIsKing() {
    return isKing;
  }
}