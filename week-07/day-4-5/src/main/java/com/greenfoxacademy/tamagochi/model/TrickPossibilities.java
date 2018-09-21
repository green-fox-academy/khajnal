package com.greenfoxacademy.tamagochi.model;

import java.util.ArrayList;
import java.util.List;

public class TrickPossibilities {
  private List<String> allTrickPossibilities = new ArrayList<>();

  public TrickPossibilities() {
    allTrickPossibilities.add("Professional CSS usage");
    allTrickPossibilities.add("Ability to eat 100 chocolate");
    allTrickPossibilities.add("Just being cool");
    allTrickPossibilities.add("Coding for 48 hours");
    allTrickPossibilities.add("Understanding videos with 2x speed");
  }

  public List<String> getAllTrickPossibilities() {
    return allTrickPossibilities;
  }

  public void setAllTrickPossibilities(List<String> allTrickPossibilities) {
    this.allTrickPossibilities = allTrickPossibilities;
  }
}