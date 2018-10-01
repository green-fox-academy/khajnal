package com.greenfoxacademy.week09day1.services;

import com.greenfoxacademy.week09day1.models.*;
import com.greenfoxacademy.week09day1.repositories.LogRepository;
import javafx.scene.transform.Translate;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MainServiceImpl implements MainService {

  private LogRepository logRepository;

  public MainServiceImpl(LogRepository logRepository) {
    this.logRepository = logRepository;
  }

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

  public void createLog(String endpoint, Object object) {
    Log log = new Log(endpoint, object.toString());
    logRepository.save(log);
  }

  public Entries showEntries() {
    Entries entries = new Entries();
    entries.setEntries(logRepository.findAll());
    entries.setEntryCount(logRepository.findAll().size());
    return entries;
  }

  @Override
  public Object translateToTeveLanguage(TextToTranslate textToTranslate) {
    if (textToTranslate.getLang().equals("hun")) {
      TranslatedText translatedText = translateHungarianToTeve(textToTranslate);
      return translatedText;
    } else {
      ErrorResponse error = new ErrorResponse("Sorry I do not know this language.");
      return error;
    }
  }

  private TranslatedText translateHungarianToTeve(TextToTranslate textToTranslate) {
    String vowels = "aáoóuúeéiíöőüűAEUÚIÍOÓÉÁÜŰÖŐ";
    String[] splittedTextToTranslate = textToTranslate.getText().split("");
    String translatedText = "";
    for (int i = 0; i < splittedTextToTranslate.length; i++) {
      if (vowels.contains(splittedTextToTranslate[i])) {
        translatedText += splittedTextToTranslate[i] + "v" + splittedTextToTranslate[i].toLowerCase();
      } else {
        translatedText += splittedTextToTranslate[i];
      }
    }
    TranslatedText translatedtextObj = new TranslatedText(translatedText, "teve");
    return translatedtextObj;
  }
}