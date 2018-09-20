package com.greenfoxacademy.tamagochi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

  @GetMapping("/")
  public String getIndex(@RequestParam(value = "name", required = false) String foxNameInput, Model model) {
    if (foxNameInput == null)
      return "login";
    model.addAttribute("nameOfFox", foxNameInput);
    return "index";
  }

  @PostMapping("/login")
  public String loggedIn(@RequestParam(value = "foxname") String foxNameInput) {
    return "redirect:/?name=" + foxNameInput;
  }

  @GetMapping("/login")
  public String login() {
    return "login";
  }
}
