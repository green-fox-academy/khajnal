package com.greenfoxacademy.tamagochi.model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Fox {
  private String name;
  private List<String> allTricks = new ArrayList<>();
  private String favoriteFood;
  private String favoriteDrink;
  private List<String> allActions = new ArrayList<>();

  public Fox(String name) {
    this.name = name;
    favoriteDrink = "coke";
    favoriteFood = "pizza";
  }

  public Fox(String name, String favoriteDrink, String favoriteFood) {
    this.name = name;
    this.favoriteDrink = favoriteDrink;
    this.favoriteFood = favoriteFood;
  }

  public void addAction(String action) {
    LocalDateTime now = LocalDateTime.now();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy.MMMM dd. HH:mm:ss : ");
    String formattedDateTime = now.format(formatter);
    allActions.add(formattedDateTime + " " + action);
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setAllTricks(List<String> allTricks) {
    this.allTricks = allTricks;
  }

  public void setAllActions() {
    this.allActions = allActions;
  }

  public void setFavoriteFood(String favoriteFood) {
    this.favoriteFood = favoriteFood;
  }

  public void setFavoriteDrink(String favoriteDrink) {
    this.favoriteDrink = favoriteDrink;
  }

  public String getName() {
    return name;
  }


  public List<String> getAllTricks() {
    return allTricks;
  }

  public List<String> getAllActions() {
    return allActions;
  }

  public String getFavoriteFood() {
    return favoriteFood;
  }

  public String getFavoriteDrink() {
    return favoriteDrink;
  }

  public Integer getNumberOfLearntTricks() {
    return getAllTricks().size();
  }
}