package com.greenfoxacademy.spaceexam.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Spaceship {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  Long id;
  int maxCapacity;
  String planet;
  int utilization;
}
