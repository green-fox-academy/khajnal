package main.java.animals;

public class Bird extends Animal {

  public Bird(String name) {
    super(name);
    super.breedMethod = "laying eggs";
  }
  
  public String breed() {
    return breedMethod;
  }
}
