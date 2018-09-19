package com.greenfoxacademy.week07day03.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Random;

@Service
public class Utility {
  ArrayList<String> colors;
  Random random;

  public Utility() {
    colors = new ArrayList<>();
    colors.add("red");
    colors.add("blue");
    colors.add("lime");
    colors.add("orange");
    colors.add("magenta");
    random = new Random();
  }

  public String randomColor() {
    return colors.get(random.nextInt(colors.size()));
  }

  public ArrayList<String> getUtilities() {
    return colors;
  }

  public boolean isValidEmail(String email) {
    if (email.contains("@") && email.contains("."))
      return true;
    return false;
  }
}