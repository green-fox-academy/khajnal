package com.greenfoxacademy.week09day1.models;

public class Appendable {

  private String appended;

  public Appendable() {
  }

  public Appendable(String appended) {
    this.appended = appended + "a";
  }

  public String getAppended() {
    return appended;
  }

  public void setAppended(String appended) {
    this.appended = appended;
  }

  @Override
  public String toString() {
    return "Appendable{" +
            "appended='" + appended + '\'' +
            '}';
  }
}