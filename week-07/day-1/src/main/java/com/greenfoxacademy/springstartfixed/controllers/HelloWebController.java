package com.greenfoxacademy.springstartfixed.controllers;

import com.greenfoxacademy.springstartfixed.Greeting;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWebController {

//  @RequestMapping("/web/greeting")
//  public String greeting(Model model) {
//    model.addAttribute("name", " World");
//    return "greeting";
//  }

  @RequestMapping("web/greeting")
  @ResponseBody
  public String greeting(@RequestParam(value = "name", required = true) String content) {
    Greeting greeting = new Greeting(content);
    return "Hello " + greeting.getContent() + "! This page was loaded " + greeting.getId() + " times.";
  }
}