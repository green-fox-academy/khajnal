package com.greenfoxacademy.week09day1.models;

public class Result {

  private Object result;

  public Result() {
  }

  public Result(Object result) {
    this.result = result;
  }

  public Object getResult() {
    return result;
  }

  public void setResult(Object result) {
    this.result = result;
  }

  @Override
  public String toString() {
    return "Result{" +
            "result=" + result +
            '}';
  }
}
