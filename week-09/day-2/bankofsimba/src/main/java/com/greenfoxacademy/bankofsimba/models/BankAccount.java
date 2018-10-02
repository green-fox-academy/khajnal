package com.greenfoxacademy.bankofsimba.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.text.DecimalFormat;

@Entity
public class BankAccount {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String name;
  private String balance;
  private String animalType;

  public BankAccount() {
  }

  public BankAccount(String name, double balance, String animalType) {
    this.name = name;
    DecimalFormat df = new DecimalFormat("#.##");
    this.balance = df.format(balance) + "zebra";
    this.animalType = animalType;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getBalance() {
    return balance;
  }

  public void setBalance(double balance) {
    DecimalFormat df = new DecimalFormat("#.##");
    this.balance = df.format(balance) + "zebra";
  }

  public String getAnimalType() {
    return animalType;
  }

  public void setAnimalType(String animalType) {
    this.animalType = animalType;
  }
}