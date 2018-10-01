package com.greenfoxacademy.week09day1.controllers;

import com.greenfoxacademy.week09day1.models.*;
import com.greenfoxacademy.week09day1.models.Appendable;
import com.greenfoxacademy.week09day1.services.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class MainRestController {

  private MainService mainService;

  @Autowired
  public MainRestController(MainService mainService) {
    this.mainService = mainService;
  }

  @GetMapping("/doubling")
  public Object giveBackDoubledNumber(@RequestParam(value = "input", required = false) Integer input) {
    if (input == null) {
      ErrorResponse error = new ErrorResponse("Please provide an input!");
      return error;
    }
    DoubledNumber doubledNumber = mainService.doubleTheInput(input);
    mainService.createLog("/doubling", doubledNumber);
    return doubledNumber;
  }

  @GetMapping("/greeter")
  public Object greetBack(@RequestParam(value = "name", required = false) String name, @RequestParam(value = "title", required = false) String title) {
    ErrorResponse errorResponse = new ErrorResponse();
    if (name == null) {
      errorResponse.setError("Please provide a name!");
      return errorResponse;
    } else if (title == null) {
      errorResponse.setError("Please provide a title!");
      return errorResponse;
    }
    Message message = new Message();
    mainService.createLog("/greeter", message);
    message.setWelcomeMessage(name, title);
    return message;
  }

  @GetMapping("/appenda/{appendable}")
  public Appendable appendALetter(@PathVariable(value = "appendable") String appendable) {
    Appendable appendableObj = new Appendable(appendable);
    mainService.createLog("/doubling/" + appendable, appendableObj);
    return appendableObj;
  }

  @PostMapping("/dountil/{action}")
  public Object getAction(@PathVariable(value = "action") String action, @RequestBody(required = false) Until until) {
    if (until == null) {
      ErrorResponse errorResponse = new ErrorResponse("Please provide a number!");
      return errorResponse;
    }
    Result result = new Result();
    if (action.equals("sum")) {
      result = mainService.sumTheUntil(until);
      mainService.createLog("/dountil/sum", result);
    } else if (action.equals("factor")) {
      result = mainService.factorTheUntil(until);
      mainService.createLog("/dountil/factor", result);
    }
    return result;
  }

  @PostMapping("/arrays")
  public Object getResultFromArrayWithType(@RequestBody ArrayWithType arrayWithType) {
    if (arrayWithType.getNumbers() == null || arrayWithType.getWhat() == null) {
      ErrorResponse error = new ErrorResponse("Please provide what to do with the numbers!");
      return error;
    }
    Result result = mainService.countResultFromArrayWithType(arrayWithType);
    mainService.createLog("/arrays", result);
    return result;
  }

  @GetMapping("/log")
  public Entries showAllLogs() {
    return mainService.showEntries();
  }
}