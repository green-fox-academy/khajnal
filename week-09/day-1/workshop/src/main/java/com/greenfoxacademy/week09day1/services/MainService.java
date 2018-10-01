package com.greenfoxacademy.week09day1.services;

import com.greenfoxacademy.week09day1.models.ArrayWithType;
import com.greenfoxacademy.week09day1.models.DoubledNumber;
import com.greenfoxacademy.week09day1.models.Result;
import com.greenfoxacademy.week09day1.models.Until;

public interface MainService {

  DoubledNumber doubleTheInput(int input);

  Result sumTheUntil(Until until);

  Result factorTheUntil(Until until);

  Result countResultFromArrayWithType(ArrayWithType arrayWithType);
}
