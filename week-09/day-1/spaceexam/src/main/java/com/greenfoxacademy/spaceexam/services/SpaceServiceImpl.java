package com.greenfoxacademy.spaceexam.services;

import com.greenfoxacademy.spaceexam.models.Planet;
import com.greenfoxacademy.spaceexam.models.Spaceship;
import com.greenfoxacademy.spaceexam.repositories.PlanetRepository;
import com.greenfoxacademy.spaceexam.repositories.SpaceshipRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SpaceServiceImpl implements SpaceService {

  private PlanetRepository planetRepository;
  private SpaceshipRepository spaceshipRepository;

  @Autowired
  public SpaceServiceImpl(PlanetRepository planetRepository, SpaceshipRepository spaceshipRepository) {
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
  public void movePeopleToShip(long shipId, long planetId) {
    Spaceship spaceship = spaceshipRepository.findById(shipId).get();
    Planet planet = planetRepository.findById(planetId).get();
    int freeSpaceOnShip = spaceship.getMaxCapacity() - spaceship.getUtilization();
    long planetPopulation = planet.getPopulation();
    if (freeSpaceOnShip == 0) {
      return;
    }
    if (planetPopulation < freeSpaceOnShip) {
      spaceship.increaseUtilization((int) planetPopulation);
      planet.setPopulation(0);
    } else {
      spaceship.setUtilization(spaceship.getMaxCapacity());
      planet.decreasePopulation(freeSpaceOnShip);
    }
    spaceshipRepository.save(spaceship);
    planetRepository.save(planet);
  }

  @Override
  public void movePeopleToPlanet(long shipId, long planetId) {
    Spaceship spaceship = spaceshipRepository.findById(shipId).get();
    Planet planet = planetRepository.findById(planetId).get();
    planet.decreasePopulation(-spaceship.getUtilization());
    spaceship.setUtilization(0);
    planetRepository.save(planet);
    spaceshipRepository.save(spaceship);
  }

  @Override
  public void moveShipToPlanet(long shipId, long planetId) {
    Spaceship spaceship = spaceshipRepository.findById(shipId).get();
    Planet planet = planetRepository.findById(planetId).get();
    String planetName = planet.getName();

    if (spaceship.getPlanet().equals(planetName)) {
      return;
    }
    spaceship.setPlanet(planetName);
    spaceshipRepository.save(spaceship);
  }
}