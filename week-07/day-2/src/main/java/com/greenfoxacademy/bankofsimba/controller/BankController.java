package com.greenfoxacademy.bankofsimba.controller;

import com.greenfoxacademy.bankofsimba.model.Bank;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BankController {

  Bank lionKingBank = new Bank();

  @GetMapping("/bank")
  public String showAll(Model model) {
    model.addAttribute("allAccounts", lionKingBank.getAllBankAccounts());
    return "bank";
  }
}
