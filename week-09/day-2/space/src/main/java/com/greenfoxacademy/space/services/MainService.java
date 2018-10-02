package com.greenfoxacademy.space.services;

import com.greenfoxacademy.space.models.Planet;
import com.greenfoxacademy.space.models.Spaceship;

import java.util.List;

public interface MainService {
  List<Planet> getAllPlanets();

  Spaceship getSpaceShipById(long id);

  void moveShipToOtherPlanet(long planetId, long spaceShipId);

  void movePeopleToShipFromPlanet(long planetId, long spaceShipId);

  void peopleToPlanet(long planetId, long spaceShipId);
}