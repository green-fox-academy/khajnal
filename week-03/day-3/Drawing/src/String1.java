public class String1 {
  public static void main(String[] args) {
    String vinDiesel = "xXx";
    System.out.println(changeXtoY(vinDiesel));
  }
  private static String changeXtoY(String vinDiesel) {
    if (vinDiesel.length() == 0) {
      return vinDiesel;
    } else if (vinDiesel.charAt(0) == 'x'){
          return 'y' + changeXtoY(vinDiesel.substring(1));
      }
        else {
         return vinDiesel.charAt(0) + changeXtoY(vinDiesel.substring(1));
        }
  }
}
