package com.greenfoxacademy.todomysql.controller;

import com.greenfoxacademy.todomysql.services.TodoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class proba {

  TodoService todoService;

  public proba(TodoService todoService) {
    this.todoService = todoService;
  }

  @GetMapping("/blublu")
  public String proba() {
    return "blublu";
  }
}
