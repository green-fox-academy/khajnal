package com.greenfoxacademy.week09day1.controllers;

import com.greenfoxacademy.week09day1.models.DoubledNumber;
import com.greenfoxacademy.week09day1.services.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainRestController {

  private MainService mainService;

  @Autowired
  public MainRestController(MainService mainService) {
    this.mainService = mainService;
  }

  @GetMapping("/doubling")
  public DoubledNumber giveBackDoubledNumber(@RequestParam(value = "input", required = false) Integer input) {
    if (input == null) {
      return null;
    }
    return mainService.doubleTheInput(input);
  }

  @GetMapping("/greeter")
  public String greetBack(@RequestParam(value = "name", required = false) String name, @RequestParam(value = "title", required = false) String title) {
    String error = "";
    if (name == null && title == null) {
      error = "Please provide a name and title";
      return error;
    } else if (name == null) {
      error = "Please provide a name.";
      return error;
    } else if (title == null) {
      error = "Please provide a title.";
      return error;
    }
    String welcomeMessage = "Oh, hi there " + name + ", my dear " + title;
    return welcomeMessage;
  }
}
