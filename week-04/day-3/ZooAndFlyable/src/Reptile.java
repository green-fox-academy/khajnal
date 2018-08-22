package main.java.animals;

public class Reptile extends Animal {

  public Reptile(String name) {
    super(name);
    super.breedMethod = "laying eggs";
  }

  public String breed() {
    return breedMethod;
  }
}
