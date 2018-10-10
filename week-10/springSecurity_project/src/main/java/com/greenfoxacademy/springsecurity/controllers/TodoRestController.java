package com.greenfoxacademy.springsecurity.controllers;

import com.greenfoxacademy.springsecurity.models.Todo;
import com.greenfoxacademy.springsecurity.services.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class TodoRestController {

  TodoService todoService;

  @Autowired
  public TodoRestController(TodoService todoService) {
    this.todoService = todoService;
  }

  @GetMapping("/list")
  public List<Todo> listAllTodos() {
    return todoService.findAll();
  }

  @PostMapping("/save")
  public List<Todo> saveTodo(@RequestBody Todo todo) {
    todoService.save(todo);
    return todoService.findAll();
  }
}