public class Sharpie {
  String color;
  double width;
  double inkAmount;

  public Sharpie(String color, double width) {
    inkAmount = 100;
    this.width = width;
    this.color = color;
  }

  public void use() {
    inkAmount -= 100;
  }
}
