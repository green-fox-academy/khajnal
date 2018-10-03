package com.greenfoxacademy.peertopeerchat.models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {

  @Id
  String id;

  public User() {
  }

  public User(String id) {
    this.id = id;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }
}