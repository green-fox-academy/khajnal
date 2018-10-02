package com.greenfoxacademy.space.services;

import com.greenfoxacademy.space.models.Planet;
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
}