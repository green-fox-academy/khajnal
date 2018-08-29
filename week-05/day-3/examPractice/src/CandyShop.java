public class CandyShop {
  double grammOfSugar;
  int income;
  int price;

  public CandyShop(double grammOfSugar) {
    this.grammOfSugar = grammOfSugar;
  }

  public CandyShop(double grammOfSugar, int price) {
    this.grammOfSugar = grammOfSugar;
    this.price = price;
  }

  public String candyShop() {
    String storage = "Inventory: 3 candies, 2 lollipops, Income: 100, Sugar: " + grammOfSugar + "gr.";
    return storage;
  }
}
