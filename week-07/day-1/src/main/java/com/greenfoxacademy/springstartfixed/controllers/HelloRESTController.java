package com.greenfoxacademy.springstartfixed.controllers;

import com.greenfoxacademy.springstartfixed.Greeting;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRESTController {

  @RequestMapping
  public Greeting greeting() {
    Greeting greeting = new Greeting(1, "Hello, World!");
    return greeting;
  }
}