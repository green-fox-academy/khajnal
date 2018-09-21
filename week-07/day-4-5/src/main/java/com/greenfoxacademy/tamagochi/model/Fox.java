package com.greenfoxacademy.tamagochi.model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Fox {
  private String name;
  private String favoriteFood;
  private String favoriteDrink;
  private List<String> allActions = new ArrayList<>();
  private List<String> learntTricks = new ArrayList<>();

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
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy.MMMM dd. HH:mm:ss");
    String formattedDateTime = now.format(formatter);
    allActions.add(formattedDateTime + " : " + action);
  }

  public void learnTrick(String trick) {
    learntTricks.add(trick);
  }

  public void setName(String name) {
    this.name = name;
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

  public List<String> getAllActions() {
    return allActions;
  }

  public List<String> getLearntTricks() {
    return learntTricks;
  }

  public String getFavoriteFood() {
    return favoriteFood;
  }

  public String getFavoriteDrink() {
    return favoriteDrink;
  }

  public Integer getNumberOfLearntTricks() {
    return getLearntTricks().size();
  }
}