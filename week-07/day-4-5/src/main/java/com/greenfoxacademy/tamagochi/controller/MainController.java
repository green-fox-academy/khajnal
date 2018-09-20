package com.greenfoxacademy.tamagochi.controller;

import com.greenfoxacademy.tamagochi.model.Catering;
import com.greenfoxacademy.tamagochi.model.FoxClub;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

  FoxClub foxClub;
  Catering catering;

  public MainController() {
    foxClub = new FoxClub();
    catering = new Catering();
  }

  @GetMapping("/")
  public String getIndex(@RequestParam(value = "name", required = false) String foxNameInput, Model model) {
    if (foxNameInput == null)
      return "login";
    if (!foxClub.isMember(foxNameInput)) {
      foxClub.addMember(foxNameInput);
      foxClub.findTheFox(foxNameInput).addAction("new Fox created");
    }
    model.addAttribute("fox", foxClub.findTheFox(foxNameInput));
    return "index";
  }

  @PostMapping("/login")
  public String loggedIn(@RequestParam(value = "foxname") String foxNameInput) {
    return "redirect:/?name=" + foxNameInput;
  }

  @GetMapping("/login")
  public String login() {
    return "login";
  }

  @PostMapping("/nutritionStore")
  public String cateringDone(@RequestParam(value = "name") String name, @ModelAttribute(value = "food") String food, @ModelAttribute(value = "drink") String drink) {
    String originalFood = foxClub.findTheFox(name).getFavoriteFood();
    String originalDrink = foxClub.findTheFox(name).getFavoriteDrink();
    foxClub.findTheFox(name).setFavoriteFood(food);
    foxClub.findTheFox(name).addAction("Food changed from: " + originalFood + " to : " + foxClub.findTheFox(name).getFavoriteFood());
    foxClub.findTheFox(name).setFavoriteDrink(drink);
    foxClub.findTheFox(name).addAction("Drink changed from: " + originalDrink + " to : " + foxClub.findTheFox(name).getFavoriteDrink());
    return "redirect:/?name=" + name;
  }

  @GetMapping("/nutritionStore")
  public String catering(@RequestParam(value = "name", required = false) String foxNameInput, Model model) {
    if (foxNameInput != null) {
      model.addAttribute("fox", foxClub.findTheFox(foxNameInput));
      model.addAttribute("catering", catering);
      return "nutritionStore";
    } else {
      return "redirect:/login";
    }
  }

  @GetMapping("/actionHistory")
  public String actionHistory(@RequestParam(value = "name", required = false) String foxNameInput, Model model) {
    if (foxNameInput != null) {
      model.addAttribute("fox", foxClub.findTheFox(foxNameInput));
      model.addAttribute("actions", foxClub.findTheFox(foxNameInput).getAllActions());
      return "actionHistory";
    } else {
      return "redirect:/login";
    }
  }
}