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
    return mainService.doubleTheInput(input);
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
    message.setWelcomeMessage(name, title);
    return message;
  }

  @GetMapping("/appenda/{appendable}")
  public Appendable appendALetter(@PathVariable(value = "appendable") String appendable) {
    Appendable appendableObj = new Appendable(appendable);
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
    } else if (action.equals("factor")) {
      result = mainService.factorTheUntil(until);
    }
    return result;
  }

  @PostMapping("/arrays")
  public Result getResultFromArrayWithType(@RequestBody ArrayWithType arrayWithType) {
    Result result = mainService.countResultFromArrayWithType(arrayWithType);
    return result;
  }
}