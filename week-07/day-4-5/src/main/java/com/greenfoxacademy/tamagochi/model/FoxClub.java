package com.greenfoxacademy.tamagochi.model;

import java.util.ArrayList;
import java.util.List;

public class FoxClub {
  List<Fox> foxClub = new ArrayList<>();

  public FoxClub() {
    foxClub.add(new Fox("Vuk"));
    foxClub.add(new Fox("Bela"));
    foxClub.add(new Fox("Kutyuska"));
    foxClub.add(new Fox("Mr. Green", "salad", "water"));
  }


  public Fox findTheFox(String name) {
    for (Fox oneFox : foxClub) {
      if (oneFox.getName().equals(name)) {
        return oneFox;
      }
    }
    return null;
  }

  public boolean isMember(String name) {
    for (Fox oneFox : foxClub) {
      if (oneFox.getName().equals(name)) {
        return true;
      }
    }
    return false;
  }

  public void addMember(String name) {
    foxClub.add(new Fox(name));
  }
}