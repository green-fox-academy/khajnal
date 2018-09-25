package com.greenfoxacademy.todoembeddeddata.model;

public class Todo {

  private Long id;
  private String title;
  private Boolean isUrgent;
  private boolean isDone;

  public Todo(String title) {
    this.title = title;
    this.isUrgent = false;
    this.isDone = false;
  }
}
