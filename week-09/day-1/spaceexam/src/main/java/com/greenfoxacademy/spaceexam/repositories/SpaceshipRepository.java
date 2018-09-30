package com.greenfoxacademy.spaceexam.repositories;

import com.greenfoxacademy.spaceexam.models.Spaceship;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpaceshipRepository extends CrudRepository<Spaceship, Long> {
}