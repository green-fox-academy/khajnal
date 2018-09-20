package com.greenfoxacademy.tamagochi.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class MainController {

  @GetMapping("/")
  public String getMain() {
    return "index";
  }
}
