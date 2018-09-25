package com.greenfoxacademy.todoembeddeddata.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Todo {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;
  private String title;
  private boolean isUrgent;
  private boolean isDone;

  public Todo() {

  }

  public Todo(String title) {
    this.title = title;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public void setUrgent(Boolean urgent) {
    isUrgent = urgent;
  }

  public void setDone(boolean done) {
    isDone = done;
  }

  public Long getId() {
    return id;
  }

  public String getTitle() {
    return title;
  }

  public Boolean getUrgent() {
    return isUrgent;
  }

  public boolean isDone() {
    return isDone;
  }
}
