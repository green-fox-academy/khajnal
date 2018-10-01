package com.greenfoxacademy.week09day1.services;

import com.greenfoxacademy.week09day1.models.DoubledNumber;
import com.greenfoxacademy.week09day1.models.Result;
import com.greenfoxacademy.week09day1.models.Until;
import org.springframework.stereotype.Service;

@Service
public class MainServiceImpl implements MainService {

  @Override
  public DoubledNumber doubleTheInput(int input) {
    return new DoubledNumber(input);
  }

  @Override
  public Result sumTheUntil(Until until) {
    int untilNumber = until.getUntil();
    int sumedNumber = 0;
    for (int i = 1; i <= untilNumber; i++) {
      sumedNumber += i;
    }
    Result resultObj = new Result(sumedNumber);
    return resultObj;
  }

  @Override
  public Result factorTheUntil(Until until) {
    int untilNumber = until.getUntil();
    int factoredNumber = 1;
    for (int i = 1; i <= untilNumber; i++) {
      factoredNumber *= i;
    }
    Result resultObj = new Result(factoredNumber);
    return resultObj;
  }
}
