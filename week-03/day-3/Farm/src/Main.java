public class Main {
  public static void main(String[] args) {
    Farm farm = new Farm("Southfork Ranch", 5);
    Animal piggy = new Animal("Ms. Rofi", "pig");
    Animal dog = new Animal("Csonti", "dog");
    Animal parrot = new Animal("Pirate", "parrot");

    farm.getAnimal(dog);
    farm.getAnimal(piggy);
    farm.getAnimal(parrot);

    farm.breed("Cathy", "cat");
    farm.animalsInFarm();

    dog.run();
    parrot.eat();
    farm.slaughter();
  }
}