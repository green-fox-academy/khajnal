package com.greenfoxacademy.week07day03.service;

import org.springframework.stereotype.Service;

@Service
public class BlueColor implements MyColor {
  @Override
  public String printColor() {
    return "This is blue";
  }
}