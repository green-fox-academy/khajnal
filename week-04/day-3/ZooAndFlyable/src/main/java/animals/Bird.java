package main.java.animals;

public class Bird extends Animal implements Flyable{

  public Bird(String name) {
    super(name);
    super.breedMethod = "laying eggs";
  }

  public String breed() {
    return breedMethod;
  }

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
