package com.greenfoxacademy.spaceexam.controllers;

import com.greenfoxacademy.spaceexam.services.SpaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {

  private static final long shipId = 1;
  private SpaceService spaceService;

  @Autowired
  public MainController(SpaceService spaceService) {
    this.spaceService = spaceService;
  }

  @GetMapping()
  public String getMainPage(Model model) {
    model.addAttribute("planets", spaceService.getAllPlanets());
    model.addAttribute("ship", spaceService.getSpaceShipById(shipId));
    return "index";
  }

  @GetMapping("/toship/{id}")
  public String moveToShip(@PathVariable(value = "id") long planetId) {
    spaceService.movePeopleToShip(shipId, planetId);
    return "redirect:/";
  }

  @GetMapping("/toplanet/{id}")
  public String moveToPlanet(@PathVariable(value = "id") long planetId) {
    spaceService.movePeopleToPlanet(shipId, planetId);
    return "redirect:/";
  }

  @PostMapping("/movehere/{id}")
  public String moveShip(@PathVariable(value = "id") long id) {
    spaceService.moveShipToPlanet(shipId, id);
    return"redirect:/";
  }
}