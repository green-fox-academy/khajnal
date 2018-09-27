package com.greenfoxacademy.todomysql.controller;

import com.greenfoxacademy.todomysql.services.AssigneeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/todo")
public class AssigneeController {

  private AssigneeService assigneeService;

  @Autowired
  public AssigneeController(AssigneeService assigneeService) {
    this.assigneeService = assigneeService;
  }

  @GetMapping("/listAssignees")
  public String getAllAssigneesPage(Model model) {
    model.addAttribute("allAssignees", assigneeService.findAll());
    return "assignees";
  }
}