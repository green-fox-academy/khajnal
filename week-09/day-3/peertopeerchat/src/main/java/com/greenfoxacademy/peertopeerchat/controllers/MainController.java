package com.greenfoxacademy.peertopeerchat.controllers;

import com.greenfoxacademy.peertopeerchat.models.User;
import com.greenfoxacademy.peertopeerchat.services.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {

  MainService mainService;

  @Autowired
  public MainController(MainService mainService) {
    this.mainService = mainService;
  }

  @GetMapping("/")
  public String getMain(Model model) {
    return "index";
  }

  @GetMapping("/register")
  public String getRegisterPage(Model model) {
    model.addAttribute("user", new User());
    return "registry";
  }

  @PostMapping("/register")
  public String getNewUser(@ModelAttribute User user) {
    mainService.saveUser(user);
    return "redirect:/";
  }
}
