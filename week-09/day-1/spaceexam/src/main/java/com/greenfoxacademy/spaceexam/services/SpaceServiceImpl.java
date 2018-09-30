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
}