package com.greenfoxacademy.todomysql.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Entity
public class Todo {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String title;
  private boolean urgent;
  private boolean done;
  private String dateOfCreation;

  public Todo() {

  }

  public Todo(String title) {
    this.title = title;
    LocalDateTime now = LocalDateTime.now();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy.MMMM dd. HH:mm:ss");
    this.dateOfCreation = now.format(formatter);
  }

  public Todo(String title, boolean urgent, boolean done) {
    this.title = title;
    this.urgent = urgent;
    this.done = done;
    LocalDateTime now = LocalDateTime.now();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy.MMMM dd. HH:mm:ss");
    this.dateOfCreation = now.format(formatter);
  }

  public Long getId() {
    return id;
  }

  public String getTitle() {
    return title;
  }

  public boolean isUrgent() {
    return urgent;
  }

  public boolean isDone() {
    return done;
  }

  public String getDateOfCreation() {
    return dateOfCreation;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public void setUrgent(boolean urgent) {
    this.urgent = urgent;
  }

  public void setDone(boolean done) {
    this.done = done;
  }

  public void setDateOfCreation(String dateOfCreation) {
    this.dateOfCreation = dateOfCreation;
  }
}
