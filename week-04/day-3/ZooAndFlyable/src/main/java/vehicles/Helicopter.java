package main.java.vehicles;

import main.java.animals.Flyable;

public class Helicopter extends Vehicle implements Flyable {
  @Override
  public String land() {
    return null;
  }

  @Override
  public String takeOff() {
    return null;
  }

  @Override
  public String fly() {
    return null;
  }
}