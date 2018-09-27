package com.greenfoxacademy.todomysql.controller;

import com.greenfoxacademy.todomysql.model.Assignee;
import com.greenfoxacademy.todomysql.services.AssigneeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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


  //  nem lehet masik controllerben ugyanolyan illegalstateexception
  @GetMapping("/listAssignees/{id}/delete")
  public String removeAssignee(@PathVariable(value = "id") long id) {
    assigneeService.deleteById(id);
    return "redirect:/todo/listAssignees";
  }

  @GetMapping("/listAssignees/{id}/edit")
  public String editAssignee(@PathVariable(value = "id") long id, Model model) {
    model.addAttribute("id", id);
    model.addAttribute("assignee", assigneeService.findById(id));
    return "editAssignee";
  }

  @PostMapping("/listAssignees/{id}/edit")
  public String changeAssignee(@ModelAttribute(value = "assignee") Assignee assignee) {
    assigneeService.save(assignee);
    return "redirect:/todo/listAssignees";
  }
}