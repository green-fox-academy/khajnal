package com.greenfoxacademy.week07day03.controller;

import com.greenfoxacademy.week07day03.service.Utility;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UtilityController {

  @Autowired
  Utility utility;

  @GetMapping("/useful")
  public String useful(Model model) {
    model.addAttribute("colors", utility.getUtilities());
    return "useful";
  }

  @GetMapping("/useful/{color}")
  public String coloredPage(@PathVariable(value = "color") String color, Model model) {
    model.addAttribute("color", color);
    return "background";
  }

  @GetMapping("/useful/colored")
  public String randomColoredPage(Model model) {
    model.addAttribute("color", utility.randomColor());
    return "background";
  }

  @GetMapping("/useful/email")
  public String email(@RequestParam(value = "email") String email, Model model) {
    model.addAttribute("emailAddress", email);
    model.addAttribute("isValid", utility.isValidEmail(email));
    return "email";
  }
}