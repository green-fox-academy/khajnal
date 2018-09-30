package com.greenfoxacademy.week09day1.services;

import com.greenfoxacademy.week09day1.models.DoubledNumber;
import org.springframework.stereotype.Service;

@Service
public class MainServiceImpl implements MainService {

  @Override
  public DoubledNumber doubleTheInput(int input) {
    return new DoubledNumber(input);
  }
}
