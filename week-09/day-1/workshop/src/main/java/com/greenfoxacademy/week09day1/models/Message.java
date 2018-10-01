package com.greenfoxacademy.week09day1.models;

public class Message {

  String welcome_message;

  public Message() {
  }

  public Message(String welcome_message) {
    this.welcome_message = welcome_message;
  }

  public String getWelcome_message() {
    return welcome_message;
  }

  public void setWelcomeMessage(String name, String title) {
//    String nameOfmember = name.substring(0,1).toUpperCase() + name.substring(1).toLowerCase();
    this.welcome_message = "Oh, hi there " + name + ", my dear " + title + "!";
  }
}