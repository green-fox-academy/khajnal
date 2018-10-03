package com.greenfoxacademy.bankofsimba.services;

import com.greenfoxacademy.bankofsimba.models.Bank;
import com.greenfoxacademy.bankofsimba.models.BankAccount;
import com.greenfoxacademy.bankofsimba.repositories.BankAccountRepository;
import com.greenfoxacademy.bankofsimba.repositories.BankRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BankServiceImpl implements BankService{

  BankAccountRepository bankAccountRepository;
  BankRepository bankRepository;

  @Autowired
  public BankServiceImpl(BankAccountRepository bankAccountRepository, BankRepository bankRepository) {
    this.bankAccountRepository = bankAccountRepository;
    this.bankRepository = bankRepository;
  }


  @Override
  public Bank findBankById(long id) {
    return bankRepository.findById(id).get();
  }

  @Override
  public List<BankAccount> findAllAccountByBankId(long id) {
    Bank bank = findBankById(id);
    return bank.getBankAccounts();
  }

}
