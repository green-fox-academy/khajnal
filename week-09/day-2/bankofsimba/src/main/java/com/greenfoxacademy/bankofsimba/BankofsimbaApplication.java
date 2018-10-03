package com.greenfoxacademy.bankofsimba;

import com.greenfoxacademy.bankofsimba.models.Bank;
import com.greenfoxacademy.bankofsimba.models.BankAccount;
import com.greenfoxacademy.bankofsimba.repositories.BankAccountRepository;
import com.greenfoxacademy.bankofsimba.repositories.BankRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BankofsimbaApplication implements CommandLineRunner {

  BankRepository bankRepository;
  BankAccountRepository bankAccountRepository;

  @Autowired
  public BankofsimbaApplication(BankRepository bankRepository, BankAccountRepository bankAccountRepository) {
    this.bankRepository = bankRepository;
    this.bankAccountRepository = bankAccountRepository;
  }

  public static void main(String[] args) {
    SpringApplication.run(BankofsimbaApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    BankAccount bankAccount = new BankAccount("Bela", 200, "tiger");
    BankAccount bankAccount2 = new BankAccount("Kata", 100, "bear");
    BankAccount bankAccount3 = new BankAccount("Pista", 200, "diszno");
    Bank bank = new Bank();

    bank.addToList(bankAccount);
    bank.addToList(bankAccount2);
    bank.addToList(bankAccount3);

    bankRepository.save(bank);
  }
}
