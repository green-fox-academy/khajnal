package com.greenfoxacademy.bankofsimba.services;

import com.greenfoxacademy.bankofsimba.models.Bank;
import com.greenfoxacademy.bankofsimba.models.BankAccount;

import java.util.List;

public interface BankService {

  Bank findBankById(long id);

  List<BankAccount> findAllAccountByBankId(long id);
}
