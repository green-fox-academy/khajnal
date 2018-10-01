package com.greenfoxacademy.week09day1.services;

import com.greenfoxacademy.week09day1.models.ArrayWithType;
import com.greenfoxacademy.week09day1.models.DoubledNumber;
import com.greenfoxacademy.week09day1.models.Result;
import com.greenfoxacademy.week09day1.models.Until;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

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

  @Override
  public Result countResultFromArrayWithType(ArrayWithType arrayWithType) {
    Result result = new Result();
    String method = arrayWithType.getWhat();
    if (method.equals("sum")) {
      result = sumArrayWithType(arrayWithType);
    } else if (method.equals("multiply")) {
      result = multiplyArrayWithType(arrayWithType);
    } else if (method.equals("double")) {
      result = doubleArrayWithType(arrayWithType);
    }
    return result;
  }

  private Result sumArrayWithType(ArrayWithType arrayWithType) {
    int sum = 0;
    for (int i = 0; i < arrayWithType.getNumbers().size(); i++) {
     sum += arrayWithType.getNumbers().get(i);
    }
    Result result = new Result(sum);
    return result;
  }

  private Result multiplyArrayWithType(ArrayWithType arrayWithType) {
    int sum = 1;
    for (int i = 0; i < arrayWithType.getNumbers().size(); i++) {
      sum *= arrayWithType.getNumbers().get(i);
    }
    Result result = new Result(sum);
    return result;
  }

  private Result doubleArrayWithType(ArrayWithType arrayWithType) {
    List<Integer> doubledList = new ArrayList<>();
    for (int i = 0; i < arrayWithType.getNumbers().size(); i++) {
      int currentNumber = arrayWithType.getNumbers().get(i);
      doubledList.add(currentNumber + currentNumber);
    }
    Result result = new Result(doubledList);
    return result;
  }

}
