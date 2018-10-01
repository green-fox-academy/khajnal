package com.greenfoxacademy.week09day1.models;

import java.util.List;

public class ArrayWithType {

  String what;
  List<Integer> numbers;

  public ArrayWithType() {
  }

  public ArrayWithType(String what) {
    this.what = what;
  }

  public String getWhat() {
    return what;
  }

  public void setWhat(String what) {
    this.what = what;
  }
}
