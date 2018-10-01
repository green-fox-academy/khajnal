package com.greenfoxacademy.week09day1.models;

public class ErrorResponse {

  String error;

  public ErrorResponse() {
  }

  public ErrorResponse(String error) {
    this.error = error;
  }

  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }
}