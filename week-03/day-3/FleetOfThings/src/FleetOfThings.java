public class FleetOfThings {

  public static void main(String[] args) {
    Thing milk = new Thing("Get milk");
    Thing remove = new Thing("Remove the obstacles");
    Thing stand = new Thing("Stand up");
    Thing eat = new Thing ("Eat lunch");
    stand.complete();
    eat.complete();
    Fleet fleet = new Fleet();

    fleet.add(milk);
    fleet.add(remove);
    fleet.add(stand);
    fleet.add(eat);
    System.out.println(fleet);
  }
}