package main.java.animals;

public abstract class Animal implements Breedable {
  String name;
  protected String breedMethod;
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

  public abstract String breed();
}
