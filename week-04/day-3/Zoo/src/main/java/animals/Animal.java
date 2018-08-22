package main.java.animals;

public abstract class Animal {
  String name;
  private String breedType;
  String gender;
  int hunger;

  public Animal(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void eat() {
    hunger--;
  }

  public abstract void breed();
}
