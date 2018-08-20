public class Main {
  public static void main(String[] args) {
    Ship mariaShip = new Ship("Maria");
    mariaShip.fillship("John a Pocahontasbol");
    System.out.println(mariaShip.checkMembers());
    Ship santaShip = new Ship("Santa");
    santaShip.fillship("Cristoforo Colombo");
    System.out.println(santaShip.checkMembers());

  }
}
