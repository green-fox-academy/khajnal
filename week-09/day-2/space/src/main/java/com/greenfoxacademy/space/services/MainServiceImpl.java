package com.greenfoxacademy.space.services;

import com.greenfoxacademy.space.models.Planet;
import com.greenfoxacademy.space.models.Spaceship;
import com.greenfoxacademy.space.repositories.PlanetRepository;
import com.greenfoxacademy.space.repositories.SpaceshipRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MainServiceImpl implements MainService {

  PlanetRepository planetRepository;
  SpaceshipRepository spaceshipRepository;

  @Autowired
  public MainServiceImpl(PlanetRepository planetRepository, SpaceshipRepository spaceshipRepository) {
    this.planetRepository = planetRepository;
    this.spaceshipRepository = spaceshipRepository;
  }

  @Override
  public List<Planet> getAllPlanets() {
    return planetRepository.findAll();
  }

  @Override
  public Spaceship getSpaceShipById(long id) {
    return spaceshipRepository.findById(id).get();
  }

  @Override
  public void moveShipToOtherPlanet(long planetId, long spaceShipId) {
    Planet planet = planetRepository.findById(planetId).get();
    Spaceship spaceship = spaceshipRepository.findById(spaceShipId).get();
    String planetName = planet.getName();
    if (planetName.equals(spaceship.getPlanet())) {
      return;
    }
    spaceship.setPlanet(planetName);
    spaceshipRepository.save(spaceship);
  }

  @Override
  public void movePeopleToShipFromPlanet(long planetId, long spaceShipId) {
    Planet planet = planetRepository.findById(planetId).get();
    Spaceship spaceship = spaceshipRepository.findById(spaceShipId).get();
    int freeSpace = spaceship.getMaxCapacity() - spaceship.getUtilization();
    long population = planet.getPopulation();
    if (population < freeSpace) {
      spaceship.changeUtilization((int)population);
      planet.setPopulation(0);
    } else {
      spaceship.changeUtilization(freeSpace);
      planet.changePopulation(-freeSpace);
    }
    spaceshipRepository.save(spaceship);
    planetRepository.save(planet);
  }

  @Override
  public void peopleToPlanet(long planetId, long spaceShipId) {
    Planet planet = planetRepository.findById(planetId).get();
    Spaceship spaceship = spaceshipRepository.findById(spaceShipId).get();
    planet.changePopulation(spaceship.getUtilization());
    spaceship.setUtilization(0);
    spaceshipRepository.save(spaceship);
    planetRepository.save(planet);
  }
}