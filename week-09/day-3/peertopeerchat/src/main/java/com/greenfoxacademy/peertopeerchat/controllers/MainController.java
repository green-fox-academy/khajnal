package com.greenfoxacademy.peertopeerchat.controllers;

import com.greenfoxacademy.peertopeerchat.services.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MainController {

  MainService mainService;

  @Autowired
  public MainController(MainService mainService) {
    this.mainService = mainService;
  }
}
