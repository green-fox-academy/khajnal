package com.greenfoxacademy.week07day03.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UtilityController {


  @GetMapping("/useful")
  public String useful(Model model) {
    return "bla";
  }
}
