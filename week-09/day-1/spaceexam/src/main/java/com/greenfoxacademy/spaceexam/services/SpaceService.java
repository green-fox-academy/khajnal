package com.greenfoxacademy.spaceexam.services;

import com.greenfoxacademy.spaceexam.models.Planet;
import com.greenfoxacademy.spaceexam.models.Spaceship;

import java.util.List;

public interface SpaceService {

  List<Planet> getAllPlanets();
  Spaceship getSpaceShipById(long id);
}