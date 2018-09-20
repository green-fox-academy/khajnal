package com.greenfoxacademy.tamagochi.service;

import com.greenfoxacademy.tamagochi.model.Fox;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FoxService {

  Fox fox = new Fox("Vuk");

  List<String> learnTrick(String trick) {
    fox.getAllTricks().add(trick);
    return fox.getAllTricks();
  }
}