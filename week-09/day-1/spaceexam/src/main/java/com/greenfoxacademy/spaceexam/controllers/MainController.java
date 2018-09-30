package com.greenfoxacademy.spaceexam.controllers;

import com.greenfoxacademy.spaceexam.services.SpaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

  private SpaceService spaceService;

  @Autowired
  public MainController(SpaceService spaceService) {
    this.spaceService = spaceService;
  }

  @GetMapping()
  public String getMainPage(Model model) {
    model.addAttribute("planets", spaceService.getAllPlanets());
    model.addAttribute("ship", spaceService.getSpaceShipById(1L));
    return "index";
  }
}