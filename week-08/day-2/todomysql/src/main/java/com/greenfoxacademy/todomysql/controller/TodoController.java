package com.greenfoxacademy.todomysql.controller;

import com.greenfoxacademy.todomysql.model.Todo;
import com.greenfoxacademy.todomysql.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/todo")
public class TodoController {

  private TodoRepository todoRepository;

  @Autowired
  public TodoController(TodoRepository todoRepository) {
    this.todoRepository = todoRepository;
  }

  @GetMapping(value = {"/list", "/"})
  public String list(@RequestParam(value = "isActive", required = false) Boolean isActive, Model model) {
    if (isActive == null) {
      model.addAttribute("todoslist", todoRepository.findAll());
    } else {
      model.addAttribute("todoslist", todoRepository.findByDone(!isActive));
    }
    return "todoslist";
  }

  @GetMapping("/add")
  public String addTaskToList() {
    return "addTodo";
  }

  @PostMapping("/add")
  public String getTaskFromUserInput(@ModelAttribute(value = "newtodo") String title) {
    todoRepository.save(new Todo(title));
    return "redirect:/todo/";
  }

  @GetMapping("/{id}/delete")
  public String deleteTask(@ModelAttribute(value = "id") Long id) {
    todoRepository.deleteById(id);
    return "redirect:/todo/";
  }

  @GetMapping("/{id}/edit")
  public String editTask(@ModelAttribute(value = "id") Long id, Model model) {
    model.addAttribute("id", id);
    model.addAttribute("todo", todoRepository.findById(id).get());
    return "editTodo";
  }

  @PostMapping("/{id}/edit")
  public String setTheNewValuesForTask(@ModelAttribute(value = "todo") Todo todo) {
    todoRepository.save(todo);
    return "redirect:/todo/";
  }
}