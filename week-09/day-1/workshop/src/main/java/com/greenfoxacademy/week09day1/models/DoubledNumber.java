package com.greenfoxacademy.week09day1.models;

public class DoubledNumber {
  private int received;
  private int result;

  public DoubledNumber() {
  }

  public DoubledNumber(int received) {
    this.received = received;
    result = received * 2;
  }

  public int getReceived() {
    return received;
  }

  public void setReceived(int received) {
    this.received = received;
  }

  public int getResult() {
    return result;
  }

  public void setResult(int result) {
    this.result = result;
  }

  @Override
  public String toString() {
    return "DoubledNumber{" +
            "received=" + received +
            ", result=" + result +
            '}';
  }
}
