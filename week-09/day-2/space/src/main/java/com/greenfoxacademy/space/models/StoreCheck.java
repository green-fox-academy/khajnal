package com.greenfoxacademy.space.models;

import java.util.ArrayList;
import java.util.List;

public class StoreCheck {
  private String result;
  private List<Clothes> clothes = new ArrayList<>();

  public StoreCheck() {
  }

  public StoreCheck(String result, List<Clothes> clothes) {
    this.result = result;
    this.clothes = clothes;
  }

  public String getResult() {
    return result;
  }

  public void setResult(String result) {
    this.result = result;
  }

  public List<Clothes> getClothes() {
    return clothes;
  }

  public void setClothes(List<Clothes> clothes) {
    this.clothes = clothes;
  }

  public void addToClothes(Clothes skirt) {
    clothes.add(skirt);
  }
}
