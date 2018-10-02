package com.greenfoxacademy.space.controllers;

import com.greenfoxacademy.space.models.Clothes;
import com.greenfoxacademy.space.models.StoreCheck;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainRestController {


  @GetMapping("/storeTrial")
  public StoreCheck getStoreCheck() {
    Clothes clothes = new Clothes(21L, "Strecth Steamed Pencil Skirt", "Calvin Klein", "skirts", "s", 39.0);
    Clothes clothes1 = new Clothes(24L, "Strecth Steamed Pencil Skirt", "Calvin Klein", "skirts", "m", 39.0);
    StoreCheck storeCheck = new StoreCheck();
    storeCheck.setResult("ok");
    storeCheck.addToClothes(clothes);
    storeCheck.addToClothes(clothes1);
    return storeCheck;
  }
}
