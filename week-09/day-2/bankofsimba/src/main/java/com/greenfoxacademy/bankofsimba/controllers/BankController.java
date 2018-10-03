package com.greenfoxacademy.bankofsimba.controllers;

import com.greenfoxacademy.bankofsimba.services.BankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BankController {

  BankService bankService;
  private static final long bankId = 1;

  @Autowired
  public BankController(BankService bankService) {
    this.bankService = bankService;
  }

  @GetMapping("/")
  public String getMain(Model model) {
    model.addAttribute("accounts", bankService.findAllAccountByBankId(bankId));
    return "index";
  }
}
