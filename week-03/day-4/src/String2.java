public class String2 {
  public static void main(String[] args) {
    String text = "x is my favorite letter, because X is great, xXx.";
    System.out.println(removeSmallX(text));
  }
  private static String removeSmallX(String text) {
    if (text.length() == 0) {
      return text;
    } else if (text.charAt(0) == 'x') {
      return "" + removeSmallX(text.substring(1));
    } else {
      return text.charAt(0) + removeSmallX(text.substring(1));
    }
  }
}
