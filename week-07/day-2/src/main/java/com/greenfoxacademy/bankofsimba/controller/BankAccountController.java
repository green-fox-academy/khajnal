package com.greenfoxacademy.bankofsimba.controller;

import com.greenfoxacademy.bankofsimba.model.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BankAccountController {
  BankAccount bankAccount = new BankAccount("simba", 2000, "lion");

  @GetMapping("/show")
  public String greeting(Model model) {
    model.addAttribute("bankAccount", bankAccount);
    return "bankaccount";
  }

  @GetMapping("/html")
  public String html(Model model) {
    String message = "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>";
    model.addAttribute("html", message);
    model.addAttribute("bankAccount", bankAccount);
    return "bankaccount";
  }
}