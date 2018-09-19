package com.greenfoxacademy.week07day03.controller;

import com.greenfoxacademy.week07day03.service.Utility;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

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
  public String getSpecificColor(@PathVariable(value = "color") String color, Model model) {
    model.addAttribute("color", color);
    return "background";
  }
}