package com.greenfoxacademy.spaceexam.services;

import com.greenfoxacademy.spaceexam.repositories.PlanetRepository;
import com.greenfoxacademy.spaceexam.repositories.SpaceshipRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SpaceServiceImpl implements SpaceService {

  PlanetRepository planetRepository;
  SpaceshipRepository spaceshipRepository;

  @Autowired
  public SpaceServiceImpl(PlanetRepository planetRepository, SpaceshipRepository spaceshipRepository) {
    this.planetRepository = planetRepository;
    this.spaceshipRepository = spaceshipRepository;
  }
}