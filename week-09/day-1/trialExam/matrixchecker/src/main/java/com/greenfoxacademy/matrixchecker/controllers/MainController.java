package com.greenfoxacademy.matrixchecker.controllers;

import com.greenfoxacademy.matrixchecker.services.MatrixService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {

  MatrixService matrixService;

  @Autowired
  public MainController(MatrixService matrixService) {
    this.matrixService = matrixService;
  }

  @GetMapping("/")
  public String getMainPage(Model model) {
    model.addAttribute("result", matrixService.getResult());
    return "index";
  }

  @PostMapping("/matrix")
  public String getAndValidateMatrix(@ModelAttribute(value = "matrix") String matrix, Model model) {
    matrixService.setResult(matrix);
    return "redirect:/";
  }
}
