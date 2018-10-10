package com.greenfoxacademy.springsecurity.controllers;

import com.greenfoxacademy.springsecurity.models.Todo;
import com.greenfoxacademy.springsecurity.services.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/todo")
public class TodoController {

  private TodoService todoService;

  @Autowired
  public TodoController(TodoService todoService) {
    this.todoService = todoService;
  }

  @GetMapping(value = {"/list", "/"})
  public String list(@RequestParam(value = "isActive", required = false) Boolean isActive, @RequestParam(value = "value", required = false) String searchedValue, Model model) {
    model.addAttribute("todolist", todoService.getProperTodos(isActive, searchedValue));
    return "todoslist";
  }

  @PostMapping(value = {"/list", "/"})
  public String getSearched(@ModelAttribute(value = "searchedValue") String searchedValue, Model model) {
    model.addAttribute("searchedValue", searchedValue);
    return "redirect:/todo/?value=" + searchedValue;
  }

  @GetMapping("/add")
  public String getAddPage(Model model) {
    model.addAttribute("todo", new Todo());
    return "addTodo";
  }

  @PostMapping("/add")
  public String addTodoFromUserInput(@ModelAttribute Todo todo) {
    todoService.save(todo);
    return "redirect:/todo/";
  }

  @GetMapping("/{id}/delete")
  public String deleteTask(@PathVariable(value = "id") Long id) {
    todoService.deleteById(id);
    return "redirect:/todo/";
  }

  @GetMapping("/{id}/edit")
  public String editTask(@PathVariable(value = "id") Long id, Model model) {
    model.addAttribute("id", id);
    model.addAttribute("todo", todoService.findById(id));
    return "editTodo";
  }

  @PostMapping("/{id}/edit")
  public String setTheNewValuesForTask(@ModelAttribute(value = "todo") Todo todo) {
    todoService.save(todo);
    return "redirect:/todo/";
  }
}