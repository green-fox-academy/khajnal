package com.greenfoxacademy.todoembeddeddata.controller;

import com.greenfoxacademy.todoembeddeddata.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/todo")
public class TodoController {

  private TodoRepository todoRepository;

  @Autowired
  public TodoController(TodoRepository todoRepository) {
    this.todoRepository = todoRepository;
  }

  @GetMapping(value = {"/list", "/"})
  public String list(Model model) {
    model.addAttribute("todoslist", todoRepository.findAll());
    return "todoslist";
  }
}