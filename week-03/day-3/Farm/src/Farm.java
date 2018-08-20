import java.util.ArrayList;
import java.util.List;

public class Farm {
  List<Animal> list = new ArrayList<>();
  String name;
  int capacity;

  public Farm(String name, int capacity) {
    this.capacity = capacity;
    this.name = name;
  }
  public void getAnimal(Animal animal) {
    list.add(animal);
  }
  public Animal breed(String name, String type) {
    Animal newAnimal = new Animal(name, type);
    if (list.size() < capacity) {
      list.add(newAnimal);
      System.out.println("Welcome " + name + ", you little " + type + ". ");
    } else {
      System.out.println("No place for more animals!");
    }
    return newAnimal;
  }
  public void animalsInFarm() {
    System.out.println("This is the " + name + " farm!");
    for (int i = 0; i < list.size(); i++) {
      System.out.println("Our " + (i + 1) + " animal is " + list.get(i).name);
    }
  }
  public void slaughter() {
    int leastHungriest = 0;
    for (int i = 0; i < list.size(); i++) {
      if (list.get(i).hunger < list.get(leastHungriest).hunger) {
        leastHungriest = i;
      }
    }
    System.out.println("We will eat " + list.get(leastHungriest).name);
    list.remove(list.get(leastHungriest));
  }
}