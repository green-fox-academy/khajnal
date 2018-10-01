package com.greenfoxacademy.week09day1.services;

import com.greenfoxacademy.week09day1.models.*;

public interface MainService {

  DoubledNumber doubleTheInput(int input);

  Result sumTheUntil(Until until);

  Result factorTheUntil(Until until);

  Result countResultFromArrayWithType(ArrayWithType arrayWithType);

  void createLog(String endPoint, Object object);

  Entries showEntries();

  Object translateToTeveLanguage(TextToTranslate textToTranslate);
}
