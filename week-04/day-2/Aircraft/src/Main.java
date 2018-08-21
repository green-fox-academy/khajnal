public class Main {
  public static void main(String[] args) {
    Aircraft f16 = new F16();
    Aircraft f35 = new F35();

    Carrier myarmy = new Carrier(10, 500);
    myarmy.add(f16);
    myarmy.add(f35);
    myarmy.fill();

    System.out.println(f16.getStatus());
    System.out.println(f35.getStatus());

  }
}
