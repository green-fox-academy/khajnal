package com.greenfoxacademy.springstartfixed.controllers;

import com.greenfoxacademy.springstartfixed.Greeting;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRESTController {

//  @RequestMapping("/greeting")
//  public Greeting greeting() {
//    Greeting greeting = new Greeting(1, "Hello, World!");
//    return greeting;
//  }

  @RequestMapping("/greeting")
  public Greeting greeting(@RequestParam(value = "name", required = true) String content){
    Greeting greeting = new Greeting(1, "Hello, " + content);
    return greeting;
  }
}