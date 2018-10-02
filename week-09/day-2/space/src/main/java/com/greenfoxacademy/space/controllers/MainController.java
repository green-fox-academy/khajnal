package com.greenfoxacademy.space.controllers;

import com.greenfoxacademy.space.services.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {

  MainService mainService;
  private final long spaceShipId = 1;

  @Autowired
  public MainController(MainService mainService) {
    this.mainService = mainService;
  }

  @GetMapping("/")
  public String getMainPage(Model model) {
    model.addAttribute("planets", mainService.getAllPlanets());
    model.addAttribute("ship", mainService.getSpaceShipById(spaceShipId));
    return "index";
  }

  @PostMapping("/movehere/{id}")
  public String moveTheShipToOtherPlanet(@PathVariable(value = "id") long planetId) {
    mainService.moveShipToOtherPlanet(planetId, spaceShipId);
    return "redirect:/";
  }

  @GetMapping("/toship/{id}")
  public String movePeopleToShip(@PathVariable(value ="id") long planetId) {
    mainService.movePeopleToShipFromPlanet(planetId, spaceShipId);
    return "redirect:/";
  }

  @GetMapping("/toplanet/{id}")
  public String movePeopleToPlanet(@PathVariable(value ="id") long planetId) {
    mainService.peopleToPlanet(planetId, spaceShipId);
    return "redirect:/";
  }
}