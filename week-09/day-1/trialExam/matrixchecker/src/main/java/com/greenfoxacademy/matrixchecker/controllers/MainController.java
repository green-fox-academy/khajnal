package com.greenfoxacademy.matrixchecker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {

  @GetMapping("/")
  public String getMainPage() {
    return "index";
  }

  @PostMapping("/matrix")
  public String getAndValidateMatrix(@ModelAttribute(value = "matrix") String matrix) {
    return "redirect:/";
  }
}
