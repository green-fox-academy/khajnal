public class SubStr {
  public static void main(String[] args) {
    System.out.println(subStr("I need the starting index of THIS", "this"));
  }

  private static int subStr(String input, String searching) {
    String inputTemp = input.toLowerCase();
    String searchingTemp = searching.toLowerCase();
    if (inputTemp.contains(searchingTemp)) {
      return inputTemp.indexOf(searchingTemp);
    } else  {
      return -1;
    }
  }
}