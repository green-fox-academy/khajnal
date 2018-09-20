package com.greenfoxacademy.tamagochi.model;

import java.util.Arrays;
import java.util.List;

public class Catering {

  List<String> drink;
  List<String> food;

  public Catering() {
    drink = Arrays.asList("Coca Cola", "Fanta", "Water", "Lemonade");
    food = Arrays.asList("sausage", "finomfozelek", "pizza", "salad", "hamburger");
  }

  public List<String> getDrink() {
    return drink;
  }

  public List<String> getFood() {
    return food;
  }

  public void setDrink(List<String> drink) {
    this.drink = drink;
  }

  public void setFood(List<String> food) {
    this.food = food;
  }
}