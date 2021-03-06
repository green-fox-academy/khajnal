package com.greenfoxacademy.spaceexam.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Spaceship {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private int maxCapacity;
  private String planet;
  private int utilization;

  public Spaceship() {
  }

  public Spaceship(int maxCapacity, String planet, int utilization) {
    this.maxCapacity = maxCapacity;
    this.planet = planet;
    this.utilization = utilization;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public int getMaxCapacity() {
    return maxCapacity;
  }

  public void setMaxCapacity(int maxCapacity) {
    this.maxCapacity = maxCapacity;
  }

  public String getPlanet() {
    return planet;
  }

  public void setPlanet(String planet) {
    this.planet = planet;
  }

  public int getUtilization() {
    return utilization;
  }

  public void setUtilization(int utilization) {
    this.utilization = utilization;
  }

  public void increaseUtilization(int valueToAdd) {
    utilization += valueToAdd;
  }
}