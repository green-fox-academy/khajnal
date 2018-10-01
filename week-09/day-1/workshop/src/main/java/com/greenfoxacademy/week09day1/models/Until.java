package com.greenfoxacademy.week09day1.models;

public class Until {

  private Integer until;

  public Until() {
  }

  public Until(Integer until) {
    this.until = until;
  }

  public Integer getUntil() {
    return until;
  }

  public void setUntil(Integer until) {
    this.until = until;
  }

  @Override
  public String toString() {
    return "Until{" +
            "until=" + until +
            '}';
  }
}
