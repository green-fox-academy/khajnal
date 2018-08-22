package main.java.animals;

public class Mammal extends Animal {

  public Mammal(String name) {
    super(name);
    super.breedMethod = "pushing miniature versions out";
  }

  public String breed() {
    return breedMethod;
  }
}
