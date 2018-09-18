package com.greenfoxacademy.bankofsimba.controller;

import com.greenfoxacademy.bankofsimba.model.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class BankAccountController {
  List<BankAccount> allAccounts = new ArrayList<>();
  BankAccount bankAccountZazu = new BankAccount("Zazu", 5000, "bird");
  BankAccount bankAccountMufasa = new BankAccount("Mufasa", 4000, "lion");
  BankAccount bankAccountTimon = new BankAccount("Timon", 3000, "meerkat");
  BankAccount bankAccountSimba = new BankAccount("Simba", 2000, "lion");




  @GetMapping("/show")
  public String greeting(Model model) {
    model.addAttribute("bankAccount", bankAccountSimba);
    return "bankaccount";
  }

  @GetMapping("/html")
  public String html(Model model) {
    String message = "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>";
    model.addAttribute("html", message);
    model.addAttribute("bankAccount", bankAccountSimba);
    return "bankaccount";
  }

//  @GetMapping("/showAll")
//  }
}